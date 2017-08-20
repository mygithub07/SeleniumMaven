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
import firsttestngpackage.PageObjectOne;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirstTestNGFile {
	WebDriver driver;
	String baseUrl, nodeURL;
	
	
	 PageObjectOne pageObjOne = new PageObjectOne();
	 SelectorRepo selectors = new SelectorRepo();
	
	 
  @BeforeTest
  public void setUp() throws MalformedURLException {
	 
	  driver=pageObjOne.driver;
  }
 
  @AfterTest
	public void afterTest(){
     driver.quit();

  }
  

  @Test (priority=1)
  public void gotoURL() throws InterruptedException{
	  
	  pageObjOne.goTo();
  }
  

  
  @Test (priority=2)
  
  public void SignIn() throws InterruptedException{
	  List<WebElement>  SignInHandler = pageObjOne.SignIn();
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
	  
	  emailOnError.click();
	  emailOnError.sendKeys("matt@adobe.com");
	  Assert.assertEquals("display: none;", ErrorEmailText.getAttribute("style"));
	  passwordOnError.click();
	  passwordOnError.sendKeys("notnotnot");
	  Assert.assertEquals("display: none;", ErrorPasswordText.getAttribute("style"));
  }
  
  

  

}
