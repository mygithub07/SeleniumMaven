import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;

import org.testng.annotations.ITestAnnotation;

public class TestAnnotationTransformerListener implements IAnnotationTransformer {

    @Override
    public void transform(ITestAnnotation annotation, Class testClass,
            Constructor testConstructor, Method testMethod) {        
        if (testMethod.getName().equals("testcase1")) {
            System.out.println("set data provider for " + testMethod.getName()); 
            annotation.setDataProviderClass(DataProviderFactory.class);
            annotation.setDataProvider("getDp1");
        } else if (testMethod.getName().equals("testcase2")) {
            System.out.println("set data provider for " + testMethod.getName()); 
            annotation.setDataProviderClass(DataProviderFactory.class);
            annotation.setDataProvider("getDp2");
        } else if (testMethod.getName().equals("testcase3")) {
            System.out.println("Disable " + testMethod.getName()); 
            annotation.setEnabled(false);
        }
    }
}
