## Rhino Scripting Migration Findings
- Currently, the application heavily relies on Mozilla's Rhino engine (version 1.7.14) for all custom user scripts.
- The `Script.java` context initialization `Context.enter();` and `ScriptableObject.putProperty(...)` patterns are deeply ingrained across Javascript wrapper objects (e.g. `JSTransform.java`, `JSTransformClear.java`, `JSFlame.java`).
- Given that Nashorn is deprecated in JDK 11 and removed in JDK 15, and GraalVM polyglot requires a fundamentally different context builder pattern (`org.graalvm.polyglot.Context`), migrating away from Rhino would be a highly invasive change to the fundamental scripting behavior users expect.
- For now, Rhino 1.7.14 remains standard on Maven, and since the project builds against JDK 8, sticking with Rhino preserves compatibility with existing user fractals. Therefore, a massive Script Engine migration should be deferred until the project targets JDK 17+ exclusively.
