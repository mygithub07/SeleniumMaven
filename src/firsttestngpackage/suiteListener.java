package firsttestngpackage;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.ITestNGMethod;
import org.testng.IResultMap;



import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;

public class suiteListener implements ISuiteListener {
	
	Map<java.lang.String,ISuiteResult> res = new HashMap<java.lang.String,ISuiteResult>() ;
	 ITestContext  context;
    @Override
    public void onStart(ISuite suite) {
	    
	    System.out.println("suite started executing");
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
	    
	      System.out.println("suite finished");
		final Map<java.lang.String,ISuiteResult>  res = suite.getResults();
          
	            for (ISuiteResult r : res.values()) {
 
	                     context =  r.getTestContext()  ;
			    System.out.println("context...."+ context);
		    }
	    
            IResultMap failedTests = context.getFailedTests();
	   // List list = new ArrayList();
	    
             java.util.Collection<ITestNGMethod> c = failedTests.getAllMethods();
	    List<ITestNGMethod> list = new ArrayList<ITestNGMethod>(c );
	     //System.out.println(Arrays.toString(arr));
	   System.out.println("printing methods....");
	    list.forEach(System.out::println);
	    
	    /*final Set<ITestResult> failedTests = context.getFailedTests().getAllResults();
                 for (ITestResult result : failedTests) {
					 
					 System.out.println("failed method...." + result.getMethod() ) ;
					 
				 } */

		
	}
}
