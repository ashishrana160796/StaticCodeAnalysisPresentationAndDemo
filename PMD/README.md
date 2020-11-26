## Demo of Tool PMD

Basic demonstration of PMD tool with its CLI option and Eclipse plugin.

### CLI Option

The command line tool steps are stated below:  

* Reach `bin/` directory of PMD in your terminal or command line tool.
* To run a PMD process instance, run following command stated below:
```
$ .\pmd.bat -d ..\..\src\main\java\ -f text -R rulesets/java/basic.xml
```
* To run CPD process instance , run following command stated below:
```
$ .\cpd.bat --minimum-tokens 100 --files c:\temp\src  
```
* Last step is to remove those errors & run these commands again.  

### Eclipse Integration

* Eclipse plugin is also available, download it from `Help->Install New Software`. Enter the name "PMD" & download url copied from internet. After that Click `OK` and post that installation will start.
* Right Click on `Project -> PMD select` then perform the PMD analysis on code.

__Note__
* Many in-built rules can also be suppressed.
* Also, new custom rules can also be written in java.
* Suitable recommendations are also given with a sample code.
