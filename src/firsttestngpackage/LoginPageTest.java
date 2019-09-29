package firsttestngpackage;

import org.testng.annotations.Test;

public class LoginPageTest {

	
	@Test(groups={"sanity"})
    public void loginPageTest(){
        System.out.println("LoginPageTest");
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
    }

    @Test(groups={"smoke"})
    public void validateRememberPasswordChrckboxField(){
        System.out.println("Remember passowrd checkbox present");
    }
}
