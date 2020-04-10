package main.java.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class LoginPage1 {
	By loginId = By.xpath("//label[@for='username']//following::input[1]");
	By passWord = By.xpath("//label[@for='password']//following::input[1]");
	By loginId_Dealer= By.xpath("//input[@placeholder='Username']");
	
	By passWord_Dealer = By.xpath("//input[@placeholder='Password']");
	By submitButton_Dealer = By.xpath("//span[text()='Log in']");
	By submitButton = By.xpath("//input[@name='Login']");
	By remeberMe = By.xpath("//label[text()='Remember me']//preceding::input[1]");

	By logoutSection = By.xpath("(//span[text()='Notifications']/following::span[@class='uiImage'])[1]");

	By logout = By.xpath("//a[text()='Log Out' or text()='Logout']");
	WebDriver driver;
	
	
	
	public LoginPage1(WebDriver driver) {
		
		this.driver=driver;
		}
	
	/**
	 ********************************************************************** 
	 * Method Name  : logOut
	 * 
	 * @Description : Click on logout button
	 * @Author      :Anbalagan
	 *********************************************************************** 
	*/

	public void logOut(WebDriver driver) {
		

		try {
			WebDriverWait waitUser = new WebDriverWait(driver, 60);
			waitUser.until(ExpectedConditions.visibilityOfElementLocated(logoutSection));
			driver.findElement(logoutSection).click();
	 		Thread.sleep(2000);
			driver.findElement(logout).click();
			Thread.sleep(5000);
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		

	}
 
	/**
	 ********************************************************************** 
	 * Method Name: enterLoginDetails
	 * 
	 * @Description : Function for login Page of Portal
	 * @Author : Pooja
	 *********************************************************************** 
	 */
	
	public void enterLoginDetails(WebDriver driver, String id, String pass) {
		
		try {
			Thread.sleep(300);
			WebDriverWait waitUser = new WebDriverWait(driver, 60);
			waitUser.until(ExpectedConditions.visibilityOfElementLocated(loginId));
			driver.findElement(loginId).sendKeys(id);

			waitUser.until(ExpectedConditions.visibilityOfElementLocated(passWord));
			driver.findElement(passWord).sendKeys(pass);

			/*
			 * waitUser.until(ExpectedConditions.visibilityOfElementLocated(
			 * remeberMe)); dr.findElement(remeberMe).click();
			 */

			waitUser.until(ExpectedConditions.visibilityOfElementLocated(submitButton));
			driver.findElement(submitButton).click();

			System.out.println("Login successfully");
			Reporter.log("Login successfully");
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}

	/**
	 ********************************************************************** 
	 * Method Name  : loginDetails
	 * 
	 * @Description : Function for login Page of Portal
	 * @Author      : Anbalagan Krishnan
	 *********************************************************************** 
	 */
	
	public void loginDetails(WebDriver driver,String loginCommunity, String id, String pass) {
		    
		try {
			if(loginCommunity.equalsIgnoreCase("WS"))
			{
				driver.get("https://test.salesforce.com");
				Reporter.log("opened WS Url",true);
			}
			else if(loginCommunity.equalsIgnoreCase("Dealer"))
			{
				driver.get("https://uat-daimlerasia.cs5.force.com/MBAustralia");	
				Reporter.log("opened Dealer Community Url",true);
			}
			else
			{
			Reporter.log("enter valid login Community",true);	
			
			}
			
		
			Thread.sleep(2000);
			driver.findElement(loginId).sendKeys(id);

			
			driver.findElement(passWord).sendKeys(pass);

			/*
			 * waitUser.until(ExpectedConditions.visibilityOfElementLocated(
			 * remeberMe)); dr.findElement(remeberMe).click();
			 */

			
			driver.findElement(submitButton).click();

			//System.out.println("Login successfully");
			Reporter.log("Login successfully as "+id,true);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}	
	
	
	/**
	 ********************************************************************** 
	 * Method Name  : loginDetails
	 * 
	 * @Description : Function for login Page of Portal
	 * @Author      : Anbalagan Krishnan
	 *********************************************************************** 
	 */
	
	public void loginDealer(WebDriver driver,String loginCommunity, String id, String pass) {
		    
		try {
			if(loginCommunity.equalsIgnoreCase("WS"))
			{
				driver.get("https://test.salesforce.com");
				Reporter.log("opened WS Url",true);
			}
			else if(loginCommunity.equalsIgnoreCase("Dealer"))
			{
				driver.get("https://uat-daimlerasia.cs5.force.com/MBAustralia");	
				Reporter.log("opened Dealer Community Url",true);
			}
			else if(loginCommunity.equalsIgnoreCase("DealerNZ"))
			{
				driver.get("https://uat-daimlerasia.cs5.force.com/MBNewZealand");
			Reporter.log("enter valid login Community",true);	
			
			}
			
		
			Thread.sleep(2000);
			driver.findElement(loginId_Dealer).sendKeys(id);

			
			driver.findElement(passWord_Dealer).sendKeys(pass);

			/*
			 * waitUser.until(ExpectedConditions.visibilityOfElementLocated(
			 * remeberMe)); dr.findElement(remeberMe).click();
			 */

			
			driver.findElement(submitButton_Dealer).click();

			//System.out.println("Login successfully");
			Reporter.log("Login successfully as "+id,true);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}		
	
}

