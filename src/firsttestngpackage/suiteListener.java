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
			     System.out.println("getName context...."+ context.getName());
			     System.out.println("number of failed tests..."+ context.getFailedTests().getAllResults().size());
			    Iterator<ITestResult> failedTestCases =context.getFailedTests().getAllResults().iterator();
			    while (failedTestCases.hasNext()) {
                            System.out.println("failedTestCases...");
                            ITestResult failedTestCase = failedTestCases.next();
                            ITestNGMethod method = failedTestCase.getMethod();
			 	string testName =    failedTestCase.getName();
			  System.out.println("failed method.."+ method);   
		           System.out.println("failed testName.."+ testName);   
			    }
		    }
	    
	    
	    
	    
	    
            
	   //  System.out.println("number of failed tests..."+ context.getFailedTests().getAllResults().size());
	     java.util.Set<ITestResult> failedTests = context.getFailedTests().getAllResults() ;
	     java.util.Set<ITestResult> passedTests = context.getPassedTests().getAllResults() ;
	    // List list = new ArrayList();
	   
	    
	     for (ITestResult tempP : passedTests) {
            ITestNGMethod methodP = tempP.getMethod();
              System.out.println("passed method...."+ context.getPassedTests().getResults(methodP));
                }
              for (ITestResult tempF : failedTests) {
            ITestNGMethod methodF = tempF.getMethod();
              System.out.println("passed method...."+ context.getFailedTests().getResults(methodF));
                }
		     
	/*     
             java.util.Collection<ITestNGMethod> f = failedTests.getAllMethods();
	    List<ITestNGMethod> listf = new ArrayList<ITestNGMethod>(f );
	    
	     java.util.Collection<ITestNGMethod> p = passedTests.getAllMethods();
	    List<ITestNGMethod> listp = new ArrayList<ITestNGMethod>(p );
	    
	     //System.out.println(Arrays.toString(arr));
	   System.out.println("printing methods....");
	    listf.forEach(System.out::println);
	    listp.forEach(System.out::println);
	    System.out.println("done printing....");
	    
	    /*final Set<ITestResult> failedTests = context.getFailedTests().getAllResults();
                 for (ITestResult result : failedTests) {
					 
					 System.out.println("failed method...." + result.getMethod() ) ;
					 
				 } */

		
	}
}
