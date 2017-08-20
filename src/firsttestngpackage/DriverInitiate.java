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
	      
	      DesiredCapabilities capability =  DesiredCapabilities.firefox();
	     
	      capability.setBrowserName("firefox");
	      capability.setPlatform(Platform.WINDOWS);
	      capability.setVersion("");
	      WebDriver = new RemoteWebDriver (new URL(nodeURL), capability);
	      return WebDriver;
	      
	  }
}