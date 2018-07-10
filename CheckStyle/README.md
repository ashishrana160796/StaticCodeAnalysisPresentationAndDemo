# Demo CheckStyle

Basic demonstration of CheckStyle tool with its CLI option and Eclipse plugin.  

---

## Command line option's steps elaborated :  

* Reach working directory with CheckStyle _jar_ file & source code files in terminal/command-line.  
* To check with any of default files against standard check files, run following commands:  
  * java -jar checkstyle-8.11-all.jar -c /sun_checks.xml MyClass.java, whole directory can also be specified.  
  * java -jar checkstyle-8.11-all.jar -c /google_checks.xml MyClass.java  
* Last step is to remove those errors & run java command again.  

Also,  
* for viewing the source code in AST form :  
  * java -cp checkstyle-8.11-all.jar com.puppycrawl.tools.checkstyle.gui.Main MyClass.java  

---

## Eclipse Plugin Demo shown

* Eclipse plugin is also available in Eclipse market place.
* After installation, right click on project -> CheckStyle, for CheckStyle related options.
* Windows -> Preferences -> CheckStyle, to customize checkstyle rules & create new check systems, not rules.
* Open the demo project in Eclipse & test plus improve yourself. Eclipse Oxygen is used for this demo.
---

__Note:__
* CheckStyle allows creation of new rules.
