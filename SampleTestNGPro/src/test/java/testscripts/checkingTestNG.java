package test.java.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import org.openqa.selenium.chrome.ChromeDriver; 

public class checkingTestNG {
	public static WebDriver driver; 
	
	String homeTitle = "Home Page ~ Salesforce - Developer Edition";
		
	@BeforeTest
	public void login() {
		
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver1.exe");
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
	}
	
	@Test
	public void f() throws Exception
	{
		
//	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//	    driver.manage().timeouts().setScriptTimeout(3, TimeUnit.SECONDS);
	    driver.get("https://login.salesforce.com/");
	    driver.findElement(By.id("username")).sendKeys("nandigamh7@salesforce.com");
	    driver.findElement(By.id("password")).sendKeys("Salesforce5");
	    driver.findElement(By.id("Login")).click();
	    
	    Thread.sleep(5000);
	    System.out.println("Title of home page: "+driver.getTitle());
	    Assert.assertEquals(driver.getTitle(), homeTitle);
	    System.out.println("Logged in Successfully");
	    
	    driver.findElement(By.xpath("//div[@id=\"tsidButton\"]/span[@id='tsidLabel']")).click();
	    
	    
	    driver.close(); 
	    
	    
  }
}
