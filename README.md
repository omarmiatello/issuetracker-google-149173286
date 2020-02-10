# issuetracker-google-149173286
Android Studio does not understand ViewBinding classes generated in another module https://issuetracker.google.com/issues/149173286

```
Android Studio 4.0 Canary 9
Build #AI-193.5233.102.40.6137316, built on January 15, 2020
Runtime version: 1.8.0_212-release-1586-b4-5784211 x86_64
VM: OpenJDK 64-Bit Server VM by JetBrains s.r.o
macOS 10.15.3
GC: ParNew, ConcurrentMarkSweep
Memory: 3987M
Cores: 16
Registry: ide.new.welcome.screen.force=true
Non-Bundled Plugins: Gradle View, com.vladsch.idea.multimarkdown, de.netnexus.camelcaseplugin
```

opt 1 - Steps to Reproduce: clone this repo https://github.com/omarmiatello/issuetracker-google-149173286

opt 2 - Steps to Reproduce:
1. Create a new project (this create the module `app`)
2. Create a new module, android library (ex: `ui-lib`)
3. Enable viewbinding (or databinding) in both: `app`, `ui-lib` --- docs: https://developer.android.com/topic/libraries/view-binding
4. Create a layout in `ui-lib` module (ex: `layout_text.xml`)
5. Include that layout in the `activity_main.xml` (in the module `app`)
6. Try to use the ViewBinding generated class from the `MainActivity`

What's happen?
- Android Studio shows the message: "Cannot access class 'com.example.issue.databinding.LayoutTextBinding'. Check your module classpath for missing or conflicting dependencies"
- The project compiles and runs correctly.
