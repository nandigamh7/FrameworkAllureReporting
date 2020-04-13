package test.java.testscripts;

import org.testng.annotations.Test;

import main.java.base.BaseClass;
import main.java.pages.AccountsPage;
import main.java.pages.ContactsPage;
import main.java.pages.HomePage;
import main.java.pages.LoginPage;
import main.java.utility.TestUtil;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AccountsPageTest extends BaseClass{
	
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	AccountsPage accountsPage;
	
	String sheetName = "Accounts";
	
	@DataProvider
	public Object[][] getAccountTestData() throws Exception{
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority = 1, dataProvider = "getAccountTestData")
	public void accountCreation(String accountName, String street, String city, String state, String country, String zip) throws Exception {
		accountsPage.createAccount(accountName, street, city, state, country, zip);
	}
  
	  @Test(priority = 2)
	  public void verifyAccountCreated() {
		  String expectedAcntName = "Test Account";
		  String actualAcntName = accountsPage.verifyAcntName();
			Assert.assertEquals(expectedAcntName, actualAcntName);
	  }
	  
	  @BeforeTest
	  public void beforeTest() throws Exception {
		  
		  initialisation();
		  loginPage = new LoginPage();
		  homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		  System.out.println("Before Accounts tab navigation");
		  accountsPage = homePage.clickOnAccountsTab();
		  
		  System.out.println("After Accounts tab navigation");
		  Thread.sleep(8000);
		  
	//	  driver.findElement(By.id("//a[@id='tryLexDialogX']")).click();
	  }
	
	  @AfterTest
	  public void afterTest() {
		  driver.quit();
	  }
	
}
