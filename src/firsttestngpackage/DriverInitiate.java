package firsttestngpackage;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverInitiate {
	WebDriver WebDriver;
	String baseUrl, nodeURL;

   private static DriverInitiate driverInstance = new DriverInitiate( );

   /* A private Constructor prevents any other
    * class from instantiating.
    */
   private DriverInitiate() { }

   /* Static 'instance' method */
   public static DriverInitiate getInstance( ) {
      return driverInstance;
   }

   /* Other methods protected by singleton-ness */
   public  WebDriver InitiateDriver() throws MalformedURLException {
		  baseUrl= "http://newtours.demoaut.com/" ;
	      nodeURL= "http://localhost:4444/wd/hub" ;
	      
	      DesiredCapabilities capabilities = new DesiredCapabilities();
	     
	      capabilities.setCapability("BROWSER_NAME", "Android");
	      capabilities.setCapability("VERSION", "4.4.2"); 
	      capabilities.setCapability("deviceName","Emulator");
	      capabilities.setCapability("platformName","Android");
	      capabilities.setCapability("appPackage", "com.android.calculator2");
	      capabilities.setCapability("appActivity","com.android.calculator2.Calculator");
	      WebDriver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	      return WebDriver;
	      
	  }
}