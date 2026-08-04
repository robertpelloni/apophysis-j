=== Scripting Engine Architectural Delta Report ===
Targeting Rhino Script Engine dependencies and Context hooks
---
Current State:
Engine: Mozilla Rhino 1.7.14
Integration Points: JSTransform.java, ScriptConverter.java
---
Architectural findings:
src/org/apophysis/Script.java:1156:            cx = Context.enter();
---
Summary: Migrating away from Rhino is currently blocked because Context.enter() is deeply embedded in the execution threads. Replacing this with Nashorn or GraalVM Polyglot would severely break backward compatibility with thousands of legacy user scripts and require a total rewrite of JSTransform's multithreading structure.
