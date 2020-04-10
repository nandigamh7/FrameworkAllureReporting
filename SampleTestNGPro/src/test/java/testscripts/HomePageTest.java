package test.java.testscripts;

import org.testng.annotations.Test;

import main.java.base.BaseClass;
import main.java.pages.ContactsPage;
import main.java.pages.HomePage;
import main.java.pages.LoginPage;

import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class HomePageTest extends BaseClass{
	
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	
	String homeTitle = "Home Page ~ Salesforce - Developer Edition";
	
	public HomePageTest(){
		super();
	}
	
	@Test
	public void verifyHomePageTitleTest(){
		String homePageTitle = homePage.verifyHomePageTtl();
		Assert.assertEquals(homePageTitle, homeTitle);
	}
	
	@BeforeTest
	public void beforeTest() throws Exception {
		
		initialisation();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		contactsPage = new ContactsPage();
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
