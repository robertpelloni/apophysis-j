# Project Architecture & Patterns (Apophysis-j)

## 1. Core Purpose and Domain
*   **The Goal:** `apophysis-j` is a Java port of the legendary Windows fractal flame editor, Apophysis. It brings fractal flame creation, manipulation, and rendering to Mac and Linux platforms. The project is configured to run on Java 1.8+.
*   **Omni-Workspace Context:** This repository operates under strict "Omni-Workspace Root" directives, meaning it is part of a larger ecosystem of submodules and requires rigorous documentation governance, continuous autonomous execution, and clean git history management.

## 2. UI Framework (Thinlet)
*   **Custom Framework:** The project uses an aging, XML-driven UI framework called **Thinlet** (`com.thinlet.Thinlet`). 
*   **Monolithic Design:** The UI engine is largely implemented as a massive, monolithic class (over 7,000 lines of code) that manually handles AWT/Swing bridging, event dispatching, layout bounds calculations, scroll behaviors, and rendering.
*   **Reflection-based Binding:** It parses XML UI descriptors and dynamically binds UI events to method calls via Java reflection.
*   **Recent Enhancements:** We recently patched native Thinlet bugs, specifically adding tooltip rendering support for complex datatypes (trees, lists, tables), resolving scrollbar calculation bounds based on explicit "scrollable" attributes, and ensuring tooltips cleanly hide during mouse wheel scroll events.

## 3. Rendering and Extensibility
*   **Flam3 Integration:** The backend rendering logic relies heavily on the `flam3` mathematical algorithm (created by Scott Draves). Apophysis-j bridges its internal logic out to native executions or batch scripts, invoking native `flam3` binaries via `ProcessBuilder` for final rendering and exports.
*   **Headless Feasibility:** A recent architectural review revealed that migrating to a pure headless Java renderer without native `flam3` binaries is a significant undertaking. The core `Renderer` class and its `ThreadTarget` interfaces are tightly coupled with the `Thinlet` GUI roots, requiring substantial decoupling before headless scaling can be achieved. We have begun decoupling this by successfully mocking `ThreadTarget` interfaces inside JUnit tests.
*   **Plugin Architecture (`XForm.java` & `Variation.java`):** The application features a robust mathematical plugin architecture. It uses a `URLClassLoader` to dynamically load `.jar` files and instantiate implementations of the `Variation` class via reflection. `Variation.java` forms the core mathematical blueprint that specific plugins (e.g. `BlobVariation`, `LinearVariation`) implement to apply geometry mutations.

## 4. Scripting Engine (Rhino)
*   **Rhino Integration:** The application exposes a Javascript API to automate fractal generation, mutation, and batch rendering. It relies on Mozilla's **Rhino** engine, which has been modernized to pull cleanly from Maven Central (version `1.7.14`).
*   **Migration Scope:** A feasibility study into migrating to a newer engine (like Nashorn or GraalVM) concluded it would be overly destructive. The `Context.enter()` setup and `ScriptableObject` mappings are deeply embedded across multiple classes (like `JSTransform` and `JSFlame`). Migrating away from Rhino would break backward compatibility with thousands of older user fractal scripts, so Rhino was cemented as the optimal runtime choice for this JDK 8 target.

## 5. Codebase Modernization Efforts
The repository has undergone significant refactoring to shed legacy technical debt and conform to modern Java environments:
*   **AWT/Swing Deprecations:** Migrated legacy input masks (e.g., `InputEvent.ALT_MASK`) and modifier text retrievals (`getModifiers()`) to their modern equivalents (`ALT_DOWN_MASK`, `getModifiersExText()`).
*   **Applet Removal:** The `AppletLauncher.java` class was removed entirely since `java.applet.Applet` is defunct in modern Java.
*   **Security Manager Fixes:** Legacy `AccessController.doPrivileged()` blocks have been removed in favor of standard `URLClassLoader` instantiations, aligning with the deprecation of the Java Security Manager in recent JDKs.
*   **Process Execution:** Replaced legacy `Runtime.exec()` invocations with robust `ProcessBuilder` patterns for external command execution.
*   **Constructors:** Replaced deprecated `Class.newInstance()` and `new Boolean()` calls with `.getDeclaredConstructor().newInstance()` and `Boolean.valueOf()` respectively.

## 6. Build System, Testing, and CI/CD
*   **Build System Transition (Maven):** The project was historically compiled using **Ant** (`build.xml`). It has now been transitioned to use **Maven** (`pom.xml`) to better align with modern CI/CD patterns and robust dependency resolution. 
*   **Directory Structure Preservation:** To prevent massive git history disruption, the Maven `pom.xml` was explicitly configured to compile from the legacy `src/` directory layout for the main sources rather than forcing a move to `src/main/java`.
*   **Unit Testing Setup:** Initialized a comprehensive testing suite using **JUnit 4**. The Maven configuration correctly delineates `src/test/java/` for test sources. Foundational tests (`GlobalTest.java`, `ScriptConverterTest.java`, `TriangleTest.java`, `PivotTest.java`, `RendererTest.java`, `VariationTest.java`, `ThinletTest.java`) ensure core engine dependencies, mathematical geometry, text-formatting, plugin variations, GUI parsing nodes, and dummy rendering thread isolation execute correctly.
*   **Automated CI/CD:** A GitHub Actions workflow (`.github/workflows/maven.yml`) has been established to automatically trigger `mvn -B package` on pushes and pull requests against the `master` branch.

## 7. Documentation and Versioning Governance
*   **Strict Documentation Requirements:** The repository maintains continuous, global documentation. Files like `VERSION.md`, `CHANGELOG.md`, `ROADMAP.md`, `TODO.md`, `MEMORY.md`, `VISION.md`, `IDEAS.md`, `DEPLOY.md`, and `HANDOFF.md` are centrally managed and dynamically updated after every significant feature shift. All initial roadmap items have been explicitly completed.
*   **Versioning Protocol:** The application adheres to a single source of truth for versioning found in `docs/VERSION.md` (currently `2.10.14`). Version bumps are systematically propagated to the changelog, the Maven `pom.xml` manifest, and commit messages.