package firsttestngpackage;

import org.testng.annotations.Test;
import org.testng.annotations.Guice;
import com.google.inject;
import org.openqa.selenium.WebDriver;

@Guice(modules = {PageObjectOne.class})
public class PreloginPageTest {
	
	@Inject
      WebDriver driver;
	
	@Test(groups={"smoke"})
	public void preloginPageTest(){
	    //System.out.println("PreloginPageTest");
	    System.out.println("driver from preloginPageTest method " + driver);
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
