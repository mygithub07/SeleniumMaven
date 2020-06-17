package firsttestngpackage;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import firsttestngpackage.PageObjectOne;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

public class LoginPageTest {

	public  static WebDriver driver;
	public static List<WebElement> webelementlist;
	//public  static  firsttestngpackage.PageObjectOne pgo1;	
	/*
	 public WebDriver LoginPageTest(){
             driver =  PageObjectOne.driver;
		 return driver;
         }
	 */
	
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
	
      @Test(groups={"smoke"})
	 public void gotourl()throws InterruptedException{
		//PageObjectOne.goTo();
		 
		System.out.println("driver from gotourl method " + PageObjectOne.driver)
	 }
	
	  @Test(groups={"smoke"})
	 public void signin(){
		 webelementlist = new ArrayList<WebElement>();
		webelementlist=PageObjectOne.SignIn();
	 }
	 
}
