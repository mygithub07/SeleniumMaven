
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
public class LoginPageTest {

	//@Inject
     // WebDriver driver;
	
	public useDriver usedriver, ud;
	public static List<WebElement> webelementlist;
	//public  static  firsttestngpackage.PageObjectOne pgo1;	
	/*
	 public WebDriver LoginPageTest(){
             driver =  PageObjectOne.driver;
	      return driver;
         } */
	 
         public  LoginPageTest(){
        Inj i =  Inj.getInstance();
	useDriver ud = i.injector();
	//Inj i = new Inj();	
	//Injector inj = i.injector();
      //  Injector inj = Inj.injector();
	// usedriver = inj.getInstance(useDriver.class);	
	//System.out.println("****usedriver value LoginPageTest****"+ usedriver);

        }
	
        @Test(groups={"smoke"})
	 public void LoginPageTestDriver()throws InterruptedException{
		//PageObjectOne.goTo(); 
		
		System.out.println("driver from LoginPageTestDriver method " + ud.getTheDriver());
	 }	
	
	@Test(groups={"sanity"})
    public void validLoginTest(){
        System.out.println("validLoginTest");
    }


    @Test(groups={"regression"})
    public void valiadteUsernameField(){
        System.out.println("User name field present");
    }

    @Test(groups={"regression"})
    public void valiadtePasswordField(){
        System.out.println("Password field present");
    }

    @Test(groups={"regression"})
    public void validateLoginBUttonField(){
        System.out.println("Login button present");
    }

    @Test(groups={"smoke"})
    public void validateForgetPassowrdField(){
	    
        System.out.println("forgot passowrd field present");
	    Assert.assertEquals(1,2);
    }

    @Test(groups={"smoke"})
    public void validateRememberPasswordChrckboxField(){
        System.out.println("Remember passowrd checkbox present");
	    
    }
	
	/*
	  @Test(groups={"smoke"})
	 public void signin(){
		 webelementlist = new ArrayList<WebElement>();
		webelementlist=PageObjectOne.SignIn();
	 }
	 */
	 
} 
