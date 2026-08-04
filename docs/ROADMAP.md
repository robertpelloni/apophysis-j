# ROADMAP

## Completed
- **v2.10.20 Release**: Configured Maven Central (`pom.xml` release profile, GPG signing, javadoc generation, fat jar artifacts).
- **Headless Rendering**: Implemented CLI batch processing (`--headless`, `--in`, `--out`).
- **UI Modernization**: Flattened tabbed panes into scrolling panels; added tooltips.
- **Build Migration**: Migrated from Ant to Maven (`pom.xml`).
- **Scripting Engine**: Audited Rhino dependency (`JSTransform.java`, `Context.enter()`); retained for legacy script compatibility.

## In Progress
- **Plugin Architecture Modernization**

## Major Long-Term Plans

### Phase 1: Advanced Plugin UI Integration
- Dynamically expose variation formulas loaded from `.jar` plugins in the `Thinlet` GUI (`mutate.xml`, `adjust.xml`).
- Implement UI forms to configure advanced parameters for custom plugins loaded via `URLClassLoader` in `XForm.java`.
- **UI Representation Rule Compliance**: Ensure every new backend plugin feature is strictly wired to the frontend with clear labels, detailed tooltips, and interactive forms.

### Phase 2: Integration Testing & Headless Coverage
- Expand the headless batch processing coverage.
- Write robust integration tests that load standard `test.flame` XML files, run the mathematical variations headlessly, and verify the numeric integrity of the resulting coordinate permutations.
- Increase unit test coverage for the Rhino javascript translation layer in `JSTransform`.

### Phase 3: Headless Image Rendering Implementation
- Abstract the `Imager` and `Renderer` classes entirely from the `java.awt.Toolkit` dependencies where possible.
- Currently, `HeadlessRendererTarget` enables processing, but the actual image generation (PNG/JPG exports) still heavily hooks into `BufferedImage` and AWT threads. Decouple these processes to allow scalable native rendering on cloud infrastructure without requiring `xvfb-run`.
