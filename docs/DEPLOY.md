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
java -jar target/apophysis-j-*.jar
```

## Releases
Release artifacts are automatically built by the Maven pipeline and the `package` lifecycle step.
