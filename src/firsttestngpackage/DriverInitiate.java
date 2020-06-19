package firsttestngpackage;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.google.inject.Binder;
import com.google.inject.Module;
import org.testng.annotations.Guice;
import com.google.inject.Inject;

public class DriverInitiate implements Module{
	
	WebDriver WebDriver;
	String baseUrl, nodeURL, url;

  // private static DriverInitiate driverInstance = new DriverInitiate( );

   /* A private Constructor prevents any other
    * class from instantiating.
    */
 //  private DriverInitiate() { }

   /* Static 'instance' method */
	/*
   public static DriverInitiate getInstance( ) {
      return driverInstance;
   }
*/
	
   /* Other methods protected by singleton-ness */
/*	
   public  WebDriver InitiateDriver() throws MalformedURLException { */
	
	   /*  baseUrl= "http://newtours.demoaut.com/" ;
	      nodeURL= "http://localhost:4444/wd/hub" ;
	      
	      DesiredCapabilities capability =  DesiredCapabilities.chrome();
	     
	      capability.setBrowserName("chrome");
	      capability.setPlatform(Platform.LINUX);
	      capability.setVersion("");
	    //  WebDriver = new RemoteWebDriver (new URL(nodeURL), capability);
	     WebDriver = new RemoteWebDriver (capability);
	     */
	   /*
	   url= "http://hp.com";
	   DesiredCapabilities desiredCapabilities =  DesiredCapabilities.chrome();
	   final ChromeOptions chromeOptions = new ChromeOptions();
           chromeOptions.setBinary("/usr/bin/google-chrome-stable");
           chromeOptions.addArguments("--headless");
           desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
           WebDriver driver = new RemoteWebDriver(new URL(url), desiredCapabilities);
	   //WebDriver driver = new RemoteWebDriver(desiredCapabilities);
	      return driver;
	      
	  } */
	
	
	 @Override
	public  void configure(Binder binder) throw MalformedURLException { 
	        DesiredCapabilities capability =  DesiredCapabilities.chrome();
	     
	      capability.setBrowserName("chrome");
	      capability.setPlatform(Platform.LINUX);
	      capability.setVersion("");
		 url= "http://hp.com";
	   DesiredCapabilities desiredCapabilities =  DesiredCapabilities.chrome();
	   final ChromeOptions chromeOptions = new ChromeOptions();
           chromeOptions.setBinary("/usr/bin/google-chrome-stable");
           chromeOptions.addArguments("--headless");
           desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
           WebDriver driver = new RemoteWebDriver(new URL(url), desiredCapabilities);
		  binder.bind(WebDriver.class).toInstance(driver);
	 }
	
	
	
}
