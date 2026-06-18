# Ideas & Expansions

1. **Refactor UI**: Move away from the custom, aging `Thinlet` UI framework to something more modern like JavaFX or at least fully modernize the AWT/Swing bridging. `Thinlet.java` is massive and a bottleneck.
2. **Headless Renderer**: Build a purely headless `flam3` integration capable of running massive distributed batch renders in modern cloud environments without relying on native binaries if possible (or strictly containerized C++ native invocations).
3. **Modern Scripting Engine**: Rhino is quite old. Explore integrating GraalVM polyglot capabilities for scripting or at least updating the bundled Mozilla Rhino version to Nashorn/GraalJS.
4. **Web Port**: Port the entire logic or the rendering engine to WebAssembly or a JS framework using tools like CheerpJ to run it entirely in the browser.
