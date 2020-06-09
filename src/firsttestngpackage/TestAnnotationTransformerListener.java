package firsttestngpackage;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.testng.IAnnotationTransformer;

import org.testng.annotations.ITestAnnotation;

public class TestAnnotationTransformerListener implements IAnnotationTransformer {
               
                 List<org.testng.annotations> list = new ArrayList<org.testng.annotations>();
    @Override
    public void transform(ITestAnnotation annotation, Class testClass,
            Constructor testConstructor, Method testMethod) {        
        if (testMethod.getName().equals("validateForgetPassowrdField")) {
            list = annotation.getAttributes();
            System.out.println("attributes for annotation on method" + testMethod.getName()+ ":   "+ Attrarray[0]); 
            
        } 
        /*
        else if (testMethod.getName().equals("testcase2")) {
            System.out.println("set data provider for " + testMethod.getName()); 
            annotation.setDataProviderClass(DataProviderFactory.class);
            annotation.setDataProvider("getDp2");
        } else if (testMethod.getName().equals("testcase3")) {
            System.out.println("Disable " + testMethod.getName()); 
            annotation.setEnabled(false);
        }
        */
    }
}
