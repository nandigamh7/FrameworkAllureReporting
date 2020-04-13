package test.java.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	public static WebDriver driver;
	  @Test
	  public void CreateAccount() throws InterruptedException 
	  {
	              System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
	              driver = new ChromeDriver();            
	              driver.manage().window().maximize();
	           driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        driver.get("https://login.salesforce.com");
	           driver.findElement(By.id("username")).sendKeys("kanth1990@yahoo.co.in");
	           driver.findElement(By.id("password")).sendKeys("Ramakanth@1011318");
	           driver.findElement(By.id("Login")).click();
	           Thread.sleep(2000);
	           String ActualUserName = driver.findElement(By.id("userNavLabel")).getText();
	           System.out.println("Acutal UserName : "+ActualUserName);
	           String ExpectedUserName = "Ramakanth Budaraju";
	           if(ActualUserName.equals(ExpectedUserName))
	           {
	              System.out.println("Login Successfull");
	              driver.findElement(By.id("Account_Tab")).click();
	              Thread.sleep(2000);
	              driver.findElement(By.xpath("//*[@class='dialogClose']")).click();
	              driver.findElement(By.xpath("//input[@name='new']")).click();
	              Thread.sleep(2000);
	              driver.findElement(By.id("acc2")).sendKeys("Creating Account for Testing-3");
	              driver.findElement(By.id("acc17street")).sendKeys("Test Street");
	              driver.findElement(By.id("acc17city")).sendKeys("Test City");
	              driver.findElement(By.id("acc17state")).sendKeys("Test State");
	              driver.findElement(By.id("acc17country")).sendKeys("Test Country");
	              driver.findElement(By.id("acc17zip")).sendKeys("Test Zip");
	              driver.findElement(By.xpath("//input[@name='save']")).click();
	              if (driver.findElement(By.xpath("//input[@name='save']")).isDisplayed())
	              {
	                     driver.findElement(By.xpath("//input[@name='save']")).click();
	              }
	              Thread.sleep(2000);
	              String ActualAccountName = driver.findElement(By.xpath("//*[@class='topName']")).getText();
	              System.out.println("Actual Account Name : "+ActualAccountName);
	              String ExpectedAccountName = "Creating Account for Testing-2";
	              if(ActualAccountName.equals(ExpectedAccountName))
	              {
	                     System.out.println("New Account Created Successfully , Account Name : "+ActualAccountName);
	              }
	              else
	              {
	                     System.out.println("Unable to Create New Account");
	              }
	           }
	           else
	           {
	              System.out.println("Login Un Successfull");
	           }
	           driver.close();
	  }

}
