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
import firsttestngpackage.Driver;

 public class injector {
	 
	 public static Injector injector;
	 
	public injector(){
        injector = Guice.createInjector(new useDriverModule());
        initiateDriver initD = new initiateDriverImpl();
        injector.injectMembers(initD);
	}
	 
	  public static Injector getInjector() { 
          return injector;
   }
 }
