# ROADMAP

## Completed
- Identified architecture for Headless Rendering capabilities, began refactoring test-driven ThreadTargets.
- Explored integration of GraalVM/Nashorn. Deferred to preserve JDK 8 compatibility and script backward compatibility.
- Add comprehensive unit tests.
- Improve `Thinlet.java` to support list, table, tree elements.
- Implement correct scrolling for panels.
- Hide tooltip in certain circumstances.
- Address deprecated warnings and `java.applet.Applet` removal.
- Integrate a modern build system like Maven or Gradle.
- Create automated CI/CD pipeline.

## In Progress


## Major Long-Term Plans

### Post-Maven Deployment Validation
* **Status**: Completed.
* **Findings**: The full automated cross-module test suite (9 test files covering math, variation, UI initialization, and headless processing) executes successfully with 0 failures under the `mvn verify` command in the Maven CI pipeline.
* **Follow-up Action Items**:
  * Implement integration tests to run the full headless binary artifact using standard `test.flame` files.
  * Consider expanding code coverage on the Rhino javascript translation layer in `JSTransform`.
