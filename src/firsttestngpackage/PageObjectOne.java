package firsttestngpackage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import firsttestngpackage.DriverInitiate;
import org.testng.annotations.Test;
import org.testng.Assert;
import com.google.inject.Binder;
import com.google.inject.Module;

public class PageObjectOne implements Module{
	
	 static WebDriver WDriver;
	
	public  static WebDriver driver;
       
	  public  void  PageObjectOne(Binder binder){
	         driver = getWebDriver() ;
		 binder.bind(WebDriver.class).toInstance(driver);
		  
	  }

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
	
	
	public static void goTo() throws InterruptedException{
		 System.out.println("DRIVER :  " + PageObjectOne.driver); 
		 PageObjectOne.driver.get(SelectorRepo.url);
		 Thread.sleep(3000);
		
	}
	  
	  public static List<WebElement> SignIn(){
		  
		  WebElement email = PageObjectOne.driver.findElement(By.cssSelector(SelectorRepo.emailAddress));
		  WebElement password = PageObjectOne.driver.findElement(By.cssSelector(SelectorRepo.password));
	
		  WebElement ButtonSignIn = PageObjectOne.driver.findElement(By.cssSelector(SelectorRepo.SignInButton));
		
		  List<WebElement> SignInFunction = new ArrayList<WebElement>();
		  SignInFunction.add(email);
		  SignInFunction.add(password);
		  
		  SignInFunction.add(ButtonSignIn);
		 
		  return SignInFunction;
		 
	  }
	  
}
