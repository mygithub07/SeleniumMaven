
package firsttestngpackage;
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
import firsttestngpackage.initiateDriverImpl;
import firsttestngpackage.useDriver;


 public class Inj {
	 
	 public  Injector injector;
	 public useDriver ud;
	 private static Inj sSoleInstance;
  
	  private Inj(){}  //private constructor.
	 
	 
	  public static Inj getInstance(){
        if (sSoleInstance == null){ //if there is no instance available... create new one
            sSoleInstance = new Inj();
        }

        return sSoleInstance;
    }
	 
	public  useDriver injector(){
        injector = Guice.createInjector(new useDriverModule());
        initiateDriver initD = new initiateDriverImpl();
        injector.injectMembers(initD);
	ud = injector.getInstance(useDriver.class);	
	return ud;	
	}
	/* 
	  public static Injector getInjector() { 
          return injector;
        }*/
 }

/*

interface initiateDriver {
   public WebDriver getDriver();
}

@Singleton
class initiateDriverImpl implements initiateDriver {
   WebDriver d; 
    public static String url;
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
	System.out.println("******DRIVER***** from Inj" + d);
   }
   
   @Override
   public WebDriver getDriver() { 
      return d;
   }
   
}
*/

/*
//Binding Module
class useDriverModule extends AbstractModule {
   
   @Override
   protected void configure() {   
      bind(initiateDriver.class).to(initiateDriverImpl.class);
   } 
}
*/

/*
class useDriver {
   private initiateDriver initDriver;

   @Inject
   public void setDriver(initiateDriver initDriver) {
      this.initDriver = initDriver;
   }
   public useDriver() { }

   public WebDriver getTheDriver() {
      return initDriver.getDriver();
   }
} */


