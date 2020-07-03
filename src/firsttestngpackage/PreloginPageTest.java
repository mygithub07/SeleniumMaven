
package firsttestngpackage;

import org.testng.annotations.Test;
import org.testng.annotations.Guice;
import com.google.inject.Inject;
import org.openqa.selenium.WebDriver;

//@Guice(modules = {DriverInitiate.class})
public class PreloginPageTest {
	
	//@Inject
     // WebDriver driver;
	public useDriver usedriver;
	
	public  PreloginPageTest(){
	Inj i = new Inj();	
	Injector inj = i.injector();
	usedriver = inj.getInstance(useDriver.class);	
	System.out.println("****usedriver value PreloginPageTest****"+ usedriver);

        }
	
	@Test(groups={"smoke"})
	public void preloginPageTestDriver(){
	   // System.out.println("PreloginPageTest");
	   System.out.println("driver from preloginPageTestDriver method " + usedriver.getTheDriver());
	}
	@Test(groups={"sanity","regression"})
	public void validateLogo(){
	    System.out.println("Logo present");
	}
	@Test(groups={"sanity","regression"})
	public void validateUrl(){
	    System.out.println("Correct URL present");
	}
	@Test(groups={"sanity","regression"})
	public void validateTabs(){
	    System.out.println("all four tabs present");
	}
	@Test(groups="sanity")
	public void validateHeaderFooter(){
	    System.out.println("Header Footer Present");
	}

} 
