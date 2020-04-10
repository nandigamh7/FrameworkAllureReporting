package test.java.testscripts;

import org.testng.annotations.Test;

import main.java.base.BaseClass;
import main.java.pages.HomePage;
import main.java.pages.LoginPage;

import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class LoginPageTest extends BaseClass{
	
	LoginPage loginPage;
	HomePage homePage;
	String loginTitle = "Login | Salesforce";
	String homeTitle = "Home Page ~ Salesforce - Developer Edition";
	
	@BeforeTest
	public void beforeTest() {
		initialisation();
		loginPage = new LoginPage();
	
	}
	
	@Test(priority = 1, groups="Group1")
	public void loginPageTitleTest(){
		String loginPageTitle = loginPage.validateLoginPage();
		Assert.assertEquals(loginPageTitle, loginTitle);
		system.out.println("Assertion Passed");
	}
	
	@Test(priority =2, groups="Group2")
	public void loginTest() throws Exception {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(5000);
	}
	
	@Test(priority = 3)
	public void verifyHomePageTitleTest(){
		String homePageTitle = homePage.verifyHomePageTtl();
		Assert.assertEquals(homePageTitle, homeTitle);
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
