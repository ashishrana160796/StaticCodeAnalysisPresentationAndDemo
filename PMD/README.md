# Demo of Tool PMD

Basic demonstration of PMD tool with its CLI option and Eclipse plugin.  

---

## CLI Option

Command line option's steps elaborated :  

* Reach bin directory of PMD in terminal/command-line.  
* To run PMD, run following command:  
  * .\pmd.bat -d ..\..\src\main\java\ -f text -R rulesets/java/basic.xml
* To run CPD, run following command:  
  * .\cpd.bat --minimum-tokens 100 --files c:\temp\src  
* Last step is to remove those errors & run these commands again.  

---

## Eclipse Integration

* Eclipse plugin is also available, download it from Help->Install New Software, enter name "PMD" & download url copied from internet. Click OK, installation will start.
* Right Click on Project -> PMD select, then perform PMD analysis on code.

---  

__Note__
* Many in-built rules, can also be suppressed.
* Also, new custom rules can also be written in java.
* Recommendations are also given with a sample code.
