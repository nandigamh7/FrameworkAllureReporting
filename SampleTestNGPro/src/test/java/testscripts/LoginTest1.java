package test.java.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import main.java.baseScript.SuperTestScript;
import main.java.pages.*;
import main.java.utility.ExcelUtils;
import main.java.utility.Screenshot;



public class LoginTest1 extends SuperTestScript {
	public static WebDriver driver;

	@Test(dataProvider = "ListView")
	public void Verify_the_listviews_in_Accounts_Test(String SystemAdminUserName,
			String SystemAdminPassword, String TestUser, String Salutation, String	FirstName,	String LastName,String	SecondLastName,	String Title,String	AccountOwner,
			String	Initials,String	PreferredLanguage,String Birthdate,String PreferredContactChannel,String	XVersionTimestamp,String CDMUCID,
			String	ClaimingOrganization,String	IsMBMeAccount,String	MobilePhone, String Email, String HomePhone,String	Fax,String	BusinessPhone,String	MOCChannelMail,String	MOCChannelPhone,String	MOCChannelElectronicMail,String	EcosystemMail,
			 String EcosystemPhone,String	EcosystemElectronicMail,String	Datasharing) throws Exception {
		try {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\nandigam.kumar\\Desktop\\selenium framework\\SampleTestNGPro\\SampleTestNGPro\\drivers");
			driver = new ChromeDriver();		
			Thread.sleep(2000);
			driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			LoginPage1 login = new LoginPage1(driver);
			driver.quit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Screenshot s = new Screenshot(driver);
			s.getscreenshot1(Thread.currentThread().getStackTrace()[1].getMethodName(),"ListView");
				
		}

	}

	@DataProvider(name = "TestDataSheetname")
	public static Object[][] loginUser() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(LoginPage, "TestDataSheetname");
		return testObjArray;
	}
	
}