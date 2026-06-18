# Deployment Guide

## Prerequisites
- Java JDK 1.8+
- Ant 1.10+

## Building
From the repository root, run:
```
ant build
```

This will compile the `apophysis-j` and `apophysis-j-plugins` JARs into the `target/` directory.

## Running
To run the compiled program:
```
ant run
```

## Releases
If you wish to build a release (including JNLP version), you need a keystore:
```
keytool -genkey -alias apophysis-j -keypass {pass} -keystore apophysis-j.store -storepass {pass}
```
Then run:
```
ant release
```
