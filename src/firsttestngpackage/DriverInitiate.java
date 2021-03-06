/*
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
import com.google.inject.AbstractModule;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.inject.Singleton;

public class DriverInitiate implements Module{
	
	WebDriver driver;
	String baseUrl, nodeURL;
	public static String url;
	
	

   private static DriverInitiate driverInstance = new DriverInitiate( );

	
   /* A private Constructor prevents any other
    * class from instantiating.
    */
  // private DriverInitiate() { }

   /* Static 'instance' method */
/*	
   public static DriverInitiate getInstance( ) {
      return driverInstance;
   }

*/
   /* Other methods protected by singleton-ness */
	/*
   public  WebDriver InitiateDriver() throws MalformedURLException { 
	
	     baseUrl= "http://newtours.demoaut.com/" ;
	      nodeURL= "http://localhost:4444/wd/hub" ;
	      
	      DesiredCapabilities capability =  DesiredCapabilities.chrome();
	     
	      capability.setBrowserName("chrome");
	      capability.setPlatform(Platform.LINUX);
	      capability.setVersion("");
	    //  WebDriver = new RemoteWebDriver (new URL(nodeURL), capability);
	     WebDriver = new RemoteWebDriver (capability);
	     
	   
	   url= "http://hp.com";
	   DesiredCapabilities desiredCapabilities =  DesiredCapabilities.chrome();
	   final ChromeOptions chromeOptions = new ChromeOptions();
           chromeOptions.setBinary("/usr/bin/google-chrome-stable");
           chromeOptions.addArguments("--headless");
           desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
           WebDriver driver = new RemoteWebDriver(new URL(url), desiredCapabilities);
	   //WebDriver driver = new RemoteWebDriver(desiredCapabilities);
	      return driver;
	      
	  } 
	*/
	
/*
	public  static WebDriver InitiateDriver() throws MalformedURLException { 
	        DesiredCapabilities capability =  DesiredCapabilities.chrome();
	     
	      capability.setBrowserName("chrome");
	      capability.setPlatform(Platform.LINUX);
	    //  capability.setVersion("latest");
		 url= "https://www.google.com";
	   DesiredCapabilities desiredCapabilities =  DesiredCapabilities.chrome();
	   final ChromeOptions chromeOptions = new ChromeOptions();
           chromeOptions.setBinary("/usr/bin/google-chrome-stable");
           //chromeOptions.addArguments("--headless");  
	   chromeOptions.addArguments("--no-sandbox");
	   chromeOptions.merge(desiredCapabilities);
          // desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
        //   WebDriver d = new RemoteWebDriver(new URL(url), desiredCapabilities);
	   WebDriver d = new ChromeDriver(chromeOptions);
		System.out.println("******DRIVER-from DriverInitiate*****" + d);
		return d;
		
	 }
	
	@Override
	public  void configure(Binder binder) { 
		    
	try{
		driver = DriverInitiate.InitiateDriver();
		 binder.bind(WebDriver.class).toInstance(driver);
		// binder.bind(WebDriver.class).toInstance(driver).in(Singleton.class);
	}
		catch (MalformedURLException e){
		     System.out.println("error " + e);
		}
	}
	
} 
*/

