package firsttestngpackage;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import firsttestngpackage.PageObjectOne;

public class LoginPageTest {

	public  static WebDriver driver;
		
	 public WebDriver LoginPageTest(){
             driver =  PageObjectOne.driver;
		 return driver;
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
	     System.out.println("driver from validateRememberPasswordChrckboxField method " + driver);
    }
	
      @Test(groups={"smoke"})
	 public void goto(){
		 PageObjectOne.goto();
	 }
	
	  @Test(groups={"smoke"})
	 public void signin(){
		 PageObjectOne.signin();
	 }
}
