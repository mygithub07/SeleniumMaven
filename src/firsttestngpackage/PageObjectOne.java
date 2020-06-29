package firsttestngpackage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import firsttestngpackage.DriverInitiate;
import org.testng.annotations.Test;
import org.testng.Assert;
import com.google.inject.Binder;
import com.google.inject.Module;
import org.testng.annotations.Guice;
import com.google.inject.Inject;
import firsttestngpackage.Inj;

@Guice(modules = {DriverInitiate.class})
public class PageObjectOne {
	
	static WebDriver WDriver;
	@Inject
        WebDriver driver;
	
	//public static Injector inj = Inj.injector;
	
	//public useDriver usedriver = inj.getInstance(useDriver.class);
	
	@Test(groups={"smoke"})
	public void pageObjOneTestDriver(){
		 System.out.println("***pageObjOneTestDriver***");
		// System.out.println("driver from FirstTestNGFileTest method " + usedriver.getTheDriver());
	
	    System.out.println("driver from pageObjOneTestDriver method " + driver);
	}
	//public  static WebDriver driver;
       /*
	  public  void  configure(Binder binder){
	         driver = getWebDriver() ;
		 binder.bind(WebDriver.class).toInstance(driver);
		  
	  }
*/
	/*
	public  static WebDriver getWebDriver()  {
		try{
		DriverInitiate getDriver  =  DriverInitiate.getInstance();
		WDriver = getDriver.InitiateDriver();
	      }
		catch(Exception e){
			
			System.err.println(  e.getMessage());
		}
		return WDriver;
	  }
	
	*/
	
	
	
	/*
	public static void goTo() throws InterruptedException{
		 System.out.println("DRIVER from PageObjectOne class " + driver); 
		 driver.get(SelectorRepo.url);
		 Thread.sleep(3000);
		
	}
	  
	  public static List<WebElement> SignIn(){
		  
		  WebElement email = driver.findElement(By.cssSelector(SelectorRepo.emailAddress));
		  WebElement password = driver.findElement(By.cssSelector(SelectorRepo.password));
	
		  WebElement ButtonSignIn = driver.findElement(By.cssSelector(SelectorRepo.SignInButton));
		
		  List<WebElement> SignInFunction = new ArrayList<WebElement>();
		  SignInFunction.add(email);
		  SignInFunction.add(password);
		  
		  SignInFunction.add(ButtonSignIn);
		 
		  return SignInFunction;
		 
	  }
	  */
	  
}
