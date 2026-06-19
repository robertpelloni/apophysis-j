# Changelog

## 2.10.0
- Refactored `Constants.java` to read the version number from a single source of truth (`docs/VERSION.md`).
- Refactored `build.xml` to load version string directly from `docs/VERSION.md`.
- Completed an in-depth codebase audit and added missing documentation (ROADMAP.md, VISION.md, TODO.md, HANDOFF.md, etc.).
- Closed out the incomplete feature regarding appending flames in `Script.java`'s `_SaveFlame` method as the capability already existed.

## [2.10.3] - 2026-06-18
- Fixed Thinlet components (tree, list, table) tooltip retrieval.
- Fixed Thinlet panel layout and correct scrolling calculation checks.
- Ensured tooltips correctly hide when the mouse wheel is triggered.

## [2.10.5] - 2026-06-19
- Ignored target directory and synchronized maven pom version with VERSION.md.

## [2.10.6] - 2026-06-19
- Integrated JUnit 4 testing framework into Maven configuration.
- Created foundational `GlobalTest` to establish unit testing patterns.

## [2.10.7] - 2026-06-19
- Implemented automated CI/CD pipeline using GitHub Actions for Maven.

## [2.10.8] - 2026-06-19
- Expanded unit test coverage with `ScriptConverterTest.java`.
- Transitioned `ROADMAP.md` to feature long-term goals (Headless Rendering, GraalVM migration) reflecting current codebase completion.

## [2.10.9] - 2026-06-19
- Further expanded unit testing coverage adding `TriangleTest.java` and `PivotTest.java` to test core geometry utilities.

## [2.10.10] - 2026-06-19
- Initiated architectural feasibility study for native headless rendering.
- Updated MEMORY.md to document the tight coupling between `Thinlet` UI elements and `Renderer`/`ThreadTarget` interfaces.

## [2.10.11] - 2026-06-19
- Further expanded unit testing coverage adding `RendererTest.java` to begin testing decoupled GUI rendering.

## [2.10.12] - 2026-06-19
- Further expanded unit testing coverage adding `VariationTest.java` to test the foundational plugin mutation parameters.

## [2.10.13] - 2026-06-19
- Further expanded unit testing coverage adding `ThinletTest.java` to guarantee safe UI XML binding tests.
- Moved 'Add comprehensive unit tests' to Completed in the ROADMAP.

## [2.10.14] - 2026-06-19
- Concluded architectural review of the Scripting Engine.
- Deferred Rhino migration to preserve Java 8 backwards compatibility and user script stability.

## [2.10.15] - 2026-06-19
- Initiated phase of rendering decoupling and headless UI abstraction via testing.
- Cleared final active roadmap items in preparation for handoff.

## [2.10.16] - 2026-06-19
- Prepared final architectural state for successor handoff, documenting Rhino Scripting limitations and Headless Renderer challenges.
