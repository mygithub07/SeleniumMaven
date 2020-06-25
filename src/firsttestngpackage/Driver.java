import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Singleton;
import org.openqa.selenium.WebDriver;



interface initiateDriver {
   public WebDriver getDriver();
}

@Singleton
class initiateDriverImpl implements initiateDriver {
   WebDriver d; 
   
   public initiateDriverImpl() {
        DesiredCapabilities capability =  DesiredCapabilities.chrome();
	capability.setBrowserName("chrome");
	capability.setPlatform(Platform.LINUX);
	url= "https://www.google.com";
	DesiredCapabilities desiredCapabilities =  DesiredCapabilities.chrome();
	final ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBinary("/usr/bin/google-chrome-stable");
	chromeOptions.addArguments("--no-sandbox");
	chromeOptions.merge(desiredCapabilities);
	d = new ChromeDriver(chromeOptions);
	System.out.println("******DRIVER*****" + d);
   }
   
   @Override
   public WebDriver getDriver() { 
      return d;
   }
   
}

//Binding Module
class BindDriver extends AbstractModule {
   
   @Override
   protected void configure() {   
      bind(initiateDriver.class).to(initiateDriverImpl.class);
   } 
}

class driverUsage {
   private initiateDriver initDriver;

   @Inject
   public void setDriver(initiateDriver initDriver) {
      this.initDriver = initDriver;
   }
   public driverUsage() { }

   public WebDriver getTheDriver() {
      return initDriver.getDriver();
   }
}
