package firsttestngpackage;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class LogSuiteListener implements ISuiteListener {
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
		final ISuiteResult res = suite.getResults();
           ITestContext  context =  res.getTestContext()  ;

         final Set<ITestResult> failedTests = context.getFailedTests().getAllResults();
                 for (ITestResult result : failedTests) {
					 
					 log.Info("failed method...." + result.getMethod() )
					 
				 }

		
	}
}
