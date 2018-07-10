# Sonarqube tool for generating analysis report

---

### Sonarqube Setup

* Download Sonarqube server, runner( running it from command prompt here instead of gradle, mave etc. ).
* Setup environment variable for sonar-scanner, for running it anywhere from command prompt.
* Modify conf file sonar-scanner in the following way.

```
#----- adding source code files to be analyzed
sonar.projectKey=SonarqubeDemo
sonar.projectName=SonarqubeDemo
sonar.projectVersion=1.0
sonar.sources=C:/Users/212703870/Desktop/StaticToolsCaseStudy/Sonarqube/EclipseDemoProject/SonarqubeDemo/src/com/sonarqube/test/MyFile.java (or directory specification)
```

* Run sonar-server file for the specific OS architecture, in Windows run it as administrator in cmd.
  * command used `sonar-scanner.bat -X`
* Then analyze report and again follow up, in case of any issues that are raised.
---
__Note:__
* Refer to [presentation](StaticCodeAnalysis.pdf) for analysis of different code analysis tools. Open the _'pptx'_ version in
latest version PowerPoint.  
* Demo for using added custom rules & syncing multiple sonarlint's for code standardization will be added soon.
