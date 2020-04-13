package main.java.baseScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import java.io.*;
import java.util.concurrent.TimeUnit;

public class SuperTestScript {

	public static WebDriver driver;
	public static String LoginPage = ("\\testdata\\LoginTestData.xlsx");

	public String caseUrl;
	      
	By logoutSection = By.xpath("(//span[text()='Notifications']/following::span[@class='uiImage'])[1]");

	By logout = By.xpath("//a[text()='Log Out' or text()='Logout']");
   
	@BeforeSuite
	public void preCoder() throws InterruptedException 
	{
		
		
	}
	
	@AfterSuite
	public void postCoder() throws InterruptedException
	{
		
	
		
	}	
	
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
	//	System.setProperty("webdriver.chrome.driver","D:\\DaimlerProject\\DaimlerFinalAutomationProject\\DaimlerEU\\drivers\\chromedriver.exe");
		//create Chrome instance	 
//		driver = new ChromeDriver();		
		Thread.sleep(2000);
//		driver.manage().window().maximize();
//	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	@AfterMethod
	public void terminate() {
	
		//driver.quit();
	
	}
	
	
	
}
