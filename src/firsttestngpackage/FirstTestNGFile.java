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
//import firsttestngpackage.PageObjectOne;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.log4testng.Logger;
import org.testng.annotations.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import firsttestngpackage.Inj;

//import firsttestngpackage.CustomReport;
//@Guice(modules = {DriverInitiate.class})

public class FirstTestNGFile {	
  
 // @Inject  WebDriver driver;
	
public void FirstTestNGFile(){
 public static Injector inj = Inj.injector;
 public useDriver usedriver = inj.getInstance(useDriver.class);	
}
   @Test(groups={"smoke"})
	public void FirstTestNGFileTest(){
    //    System.out.println("driver from FirstTestNGFileTest method " + driver);
       System.out.println("driver from FirstTestNGFileTest method " + usedriver.getTheDriver());
	} 
  /*
  @Test(groups={"sanity"}) 
  public void Suite2Test1() throws InterruptedException{	
    
    // LOGGER.debug("entering gotoURL()");	 
    // pageObjOne.goTo();	 System.out.println("test1 in suite2");
  }
  
  
  private static final Logger LOGGER = Logger.getLogger(FirstTestNGFile.class);	
  WebDriver driver;
  String baseUrl, nodeURL;	
  
  PageObjectOne pageObjOne = new PageObjectOne();	 
  SelectorRepo selectors = new SelectorRepo();
  */
  
 /*
  @BeforeTest 
  public void setUp() throws MalformedURLException {	 
  driver=pageObjOne.driver;	 
    System.out.println(driver);
  }  */
  /*
   @BeforeTest 
  public void setUp()  {	 
     Inj inject = new Inj();
  } */
  /*
  @AfterTest
  public void afterTest(){
  driver.quit();
  
  } */
  
  
  /* 
  //@Test (priority=1)
  @Test(groups={"sanity"}) 
  public void gotoURL() throws InterruptedException{
  // LOGGER.debug("entering gotoURL()");	
  // pageObjOne.goTo();	
  System.out.println("went to URL");
  }
  */
  
  /*
  //@Test(priority=2)
  @Test(groups={"sanity"}) 
  public void SignIn() throws InterruptedException{
  // LOGGER.debug("entering SignIn()");	
  System.out.println("completed signing In");
  List<WebElement> SignInHandler = pageObjOne.SignIn();
  SignInHandler.get(0).click();
  System.out.println(SignInHandler.get(0));	
  SignInHandler.get(0).sendKeys("matt@");	
  SignInHandler.get(1).click();	
  SignInHandler.get(1).sendKeys("not");
  SignInHandler.get(2).click();	
  Thread.sleep(3000);	 
  WebElement emailOnError = driver.findElement(By.cssSelector("#adobeid_username.error"));
  WebElement passwordOnError = driver.findElement(By.cssSelector("#adobeid_password.text-center.error"));	
  WebElement ErrorEmailText=driver.findElement(By.cssSelector("#adobeid_signin > fieldset:nth-child(16) > span > label"));
  WebElement ErrorPasswordText=driver.findElement(By.cssSelector("#adobeid_signin > fieldset:nth-child(17) > span > label")); 
  //check borders for red color	
  Assert.assertEquals("rgb(255, 0, 0)", emailOnError.getCssValue("border-top-color"));
  Assert.assertEquals("rgb(255, 0, 0)", passwordOnError.getCssValue("border-top-color"));	 
  //check error texts for each field	
  Assert.assertEquals("Enter a valid email address", ErrorEmailText.getText());
  Assert.assertEquals("The password is too short", ErrorPasswordText.getText());	 	
  emailOnError.click();	 emailOnError.sendKeys("matt@adobe.com");
  Assert.assertEquals("display: none;", ErrorEmailText.getAttribute("style"));	
  passwordOnError.click();	
  passwordOnError.sendKeys("notnotnot");
  Assert.assertEquals("display: none;", ErrorPasswordText.getAttribute("style")); 
  }
  
  */
  
  } 
