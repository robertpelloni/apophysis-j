# Deployment Guide

## Prerequisites
- Java JDK 1.8+
- Maven 3.6+

## Building
From the repository root, run:
```
mvn clean install
```

This will compile the `apophysis-j` JAR into the `target/` directory.

## Testing
To run the automated test suite, execute:
```
mvn test
```

## Running
To run the compiled program:
```
java -jar target/apophysis-j-*-jar-with-dependencies.jar
```

### Running in Headless Environments (CI/CD / Servers)
Because the Thinlet UI launcher attempts to initialize AWT windows, running the `.jar` on a headless server without an X11 display requires a virtual framebuffer, even if `java.awt.headless=true` is used. Use `xvfb-run`:
```
xvfb-run java -jar target/apophysis-j-*-jar-with-dependencies.jar
```

## Releases
Release artifacts are automatically built by the Maven pipeline and the `package` lifecycle step.

### Staging Deployment Artifacts
Starting with the validation of the Maven migration, the release candidate artifacts (e.g. `2.10.19-rc1`) are bundled as fat JARs utilizing the `maven-assembly-plugin`.
- Ensure when deploying to the staging server that you reference the `-jar-with-dependencies.jar` explicitly to guarantee script engines like Rhino correctly load at runtime.
