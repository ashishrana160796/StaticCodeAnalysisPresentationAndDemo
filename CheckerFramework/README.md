# Demo CheckStyle

Basic demonstration of CheckerFramework tool with its CLI java jar option and
path of javac variable is not set here.  

---

Command line option's steps elaborated :  

* Reach current working directory with checker _jar_ file, with all its dependencies & source code files in terminal/command-line.  
* To check with any of default files against standard check files, run following commands:  
  * java -jar "dist/checker.jar" -processor nullness NullnessDemo.java  
* Last step is to remove those errors & run java command again.  

---
__Note:__
* Other standard way is to replace with current java compiler so that annotation compiler runs with javac command.
