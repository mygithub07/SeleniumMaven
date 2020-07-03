
package firsttestngpackage;
import org.openqa.selenium.*;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import java.net.MalformedURLException;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.List;
import firsttestngpackage.SelectorRepo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.log4testng.Logger;
import org.testng.annotations.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import firsttestngpackage.Inj;
import firsttestngpackage.useDriver;


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
