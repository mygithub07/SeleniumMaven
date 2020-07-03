
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
public class PageObjectOne {
	
	//static WebDriver WDriver;
	//@Inject
      //  WebDriver driver;
	
	//public static Injector inj = Inj.injector;
	
	//public useDriver usedriver = inj.getInstance(useDriver.class);
	public useDriver usedriver;
	public  PageObjectOne()
	{
	Inj i = new Inj();	
	Injector inj = i.injector();
	usedriver = inj.getInstance(useDriver.class);	
	System.out.println("****usedriver value PageObjectOne****"+ usedriver);

       }
	@Test(groups={"smoke"})
	public void pageObjOneTestDriver(){
		
	        System.out.println("driver from pageObjOneTestDriver method " + usedriver.getTheDriver());
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
