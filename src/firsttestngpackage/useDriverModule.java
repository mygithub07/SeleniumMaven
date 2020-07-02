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
import firsttestngpackage.initiateDriver;

class useDriverModule extends AbstractModule {
   
   @Override
   protected void configure() {   
      bind(initiateDriver.class).to(initiateDriverImpl.class);
   } 
}
