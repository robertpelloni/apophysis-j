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
