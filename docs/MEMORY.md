# Architecture & Memory

This project ports Apophysis (a fractal flame editor written for Windows) to Java using the Thinlet UI framework.
It utilizes Java's ScriptEngine (Rhino) for scripting interactions and features an extensive plugin architecture (see `src/org/apophysis/XForm.java`).
Many legacy AWT/Applet features have been replaced or flagged for modernization in recent versions.

## Headless Rendering Capabilities
- Explored the `Renderer` and `ScriptRenderer` classes. The actual backend relies heavily on `Thinlet` lifecycle events and `flam3` subprocesses.
- Moving to a fully headless Java renderer natively without C++ `flam3` would require rewriting the core loop in `Renderer.java` and decoupling `ThreadTarget` implementations from `MyThinlet` GUI roots.
