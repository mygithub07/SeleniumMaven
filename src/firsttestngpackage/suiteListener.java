package firsttestngpackage;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;

public class suiteListener implements ISuiteListener {
	
	Map<java.lang.String,ISuiteResult> res = new HashMap<java.lang.String,ISuiteResult>() ;
    @Override
    public void onStart(ISuite suite) {
      /*  try (PrintStream out = new PrintStream(new FileOutputStream("/tmp/test-list.txt"))) {
                suite.getAllMethods().stream()
                .map(m -> m.getTestClass().getName() + "." + m.getMethodName())
                .forEach(out::println);
        } catch (IOException e) {
            System.err.println("FAILED TO WRITE TO FILE!");
            throw new RuntimeException(e);
        }  */
    }
    @Override
    public void onFinish(ISuite suite) {
		final Map<java.lang.String,ISuiteResult>  res = suite.getResults();
          
	            for (ISuiteResult r : res.values()) {
 
	                   ITestContext  context =  r.getTestContext()  ;
		    }
	    
         final Set<ITestResult> failedTests = context.getFailedTests().getAllResults();
                 for (ITestResult result : failedTests) {
					 
					 System.out.println("failed method...." + result.getMethod() ) ;
					 
				 }

		
	}
}
