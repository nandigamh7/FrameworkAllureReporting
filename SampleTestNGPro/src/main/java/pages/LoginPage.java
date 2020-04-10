package main.java.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import main.java.base.BaseClass;


public class LoginPage extends BaseClass{
	
	@FindBy(id = "username")
	WebElement userName;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(id = "Login")
	WebElement loginBtn;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPage(){
		return driver.getTitle();
	}
	
	public HomePage login(String un, String pwd) throws Exception{

		Thread.sleep(3000);
		
		userName.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();
	}
	
}
