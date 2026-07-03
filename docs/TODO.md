# Actionable Tasks

- [x] Address deprecated usages of `Toolkit.getMenuShortcutKeyMask()`, `InputEvent.ALT_MASK`, and `Class.newInstance()`.
- [x] Address `ScriptConverter` TODOs related to parsing elements.
- [x] Migrate `java.applet.Applet` to modern window management if needed (removed AppletLauncher).
- [x] Improve `Thinlet.java` to support list, table, tree elements.
- [x] Implement correct scrolling for panels.
- [x] Hide tooltip in certain circumstances.
- [x] Initialize unit testing framework and initial tests.

## Future / Pending Migration Tasks
- [x] Remove legacy Ant build scripts (`build.xml`, `build.properties`) now that Maven migration is fully validated.
- [x] Implement headless rendering CLI options (e.g. `--headless`, `--in`, `--out`) to bypass Thinlet GUI initialization for batch processing on servers.
- [ ] Implement advanced plugin configuration options and dynamically expose variation formulas via GUI components.
