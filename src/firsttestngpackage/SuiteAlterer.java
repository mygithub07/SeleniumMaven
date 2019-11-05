package firsttestngpackage;

import org.testng.IAlterSuiteListener;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlInclude;
import org.testng.xml.XmlPackage;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SuiteAlterer implements IAlterSuiteListener {
	
	Random random = new Random();
    @Override
    public void alter(java.util.List<XmlSuite> suites) {
        XmlSuite suite = suites.get(0);
        System.out.println("suite name..." +suite.getName());
        
        XmlTest xmlTest = new XmlTest(suite);
        int n = random.nextInt(1000);
        xmlTest.setName("newTest_"+n);
        System.out.println("newTest_"+suiteListener.failedMethodName+n);
        List<XmlClass> classes = new ArrayList<XmlClass>();
        
        XmlClass xmlClass = new XmlClass("firsttestngpackage.RerunFailedTests");
        List<XmlInclude> includeMethods = new ArrayList<XmlInclude>();        
        includeMethods.add(new XmlInclude(suiteListener.failedMethodName));
        // includeMethods.add(new XmlInclude("your_method2"));
         //add more methods dynamically from your other listener        
         xmlClass.setIncludedMethods(includeMethods);
         classes.add(xmlClass);
         xmlTest.setXmlClasses(classes) ;
         
         TestNG tng = new TestNG();
         tng.setXmlSuites(suites);
         tng.run();
        
    }
}  