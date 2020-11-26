# Demo CheckStyle

Basic demonstration of CheckStyle tool with its CLI option and Eclipse plugin.

## Command line option's steps elaborated below:  

* Reach working directory with CheckStyle _jar_ file & source code files in terminal/command-line.
* To check with any of default files against standard check files, run following commands stated below:
```
$ java -jar checkstyle-8.11-all.jar -c /sun_checks.xml MyClass.java // whole directory can also be specified.  
$ java -jar checkstyle-8.11-all.jar -c /google_checks.xml MyClass.java  
```
* Post this step you can remove those errors & run java command again.

* Also, for viewing the source code in AST form use the below stated commands:
```
$ java -cp checkstyle-8.11-all.jar com.puppycrawl.tools.checkstyle.gui.Main MyClass.java
```

## Eclipse Plugin Demo shown

* Eclipse plugin is also available in Eclipse market place.
* After installation `right click on project -> CheckStyle` for CheckStyle related options.
* Click `Windows -> Preferences -> CheckStyle` to customize checkstyle rules & create new check systems _(not rules)_.
* Open the demo project in Eclipse & test. Eclipse Oxygen is used for this demo.

__Note:__
* CheckStyle allows creation of new rules as well.
