package firsttestngpackage;

import org.testng.annotations.Test;

public class PreloginPageTest {
	
	@Test(groups={"smoke"})
	public void preloginPageTest(){
	    System.out.println("PreloginPageTest");
	}
	@Test(groups={"sanity","regression"})
	public void validateLogo(){
	    System.out.println("Logo present");
	}
	@Test(groups={"sanity","regression"})
	public void validateUrl(){
	    System.out.println("Correct URL present");
	}
	@Test(groups={"sanity","regression"})
	public void validateTabs(){
	    System.out.println("all four tabs present");
	}
	@Test(groups="sanity")
	public void validateHeaderFooter(){
	    System.out.println("Header Footer Present");
	}

}
