package main.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import main.java.base.BaseClass;

public class AccountsPage extends BaseClass{

	@FindBy(xpath="//a[@id='tryLexDialogX']")
	WebElement diagClose;
	
	@FindBy(xpath="//input[@name='new']")
	WebElement clickNewAcntBtn;
	
	@FindBy(id="acc2")
	WebElement acntName;
	
	@FindBy(id="acc17street")
	WebElement street;
	
	@FindBy(id="acc17city")
	WebElement city;
	
	@FindBy(id="acc17state")
	WebElement state;
	
	@FindBy(id="acc17country")
	WebElement country;
	
	@FindBy(id="acc17zip")
	WebElement zip;
	
	@FindBy(xpath="//input[@name='save']")
	WebElement saveBtn;
	
	@FindBy(xpath="//*[@class='topName']")
	WebElement acntNameAfterSave;
	
	public AccountsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void createAccount(String accountName, String stret, String cty, String stat, String cntry, String zipCode) throws Exception, NullPointerException {
	
		System.out.println("Entered Account page");
		
		Thread.sleep(8000);
		//driver.findElement(By.xpath("//div[@id='tryLexDialog']/div[@class='topRight']/div[@class='topLeft']/a[@id='tryLexDialogX']")).click();
		diagClose.click();
		Thread.sleep(2000);
		clickNewAcntBtn.click();
		Thread.sleep(5000);
		acntName.sendKeys(accountName);
		street.sendKeys(stret);
		city.sendKeys(cty);
		state.sendKeys(stat);
		country.sendKeys(cntry);
		zip.sendKeys(zipCode);
		saveBtn.click();
		Thread.sleep(5000);
		if (saveBtn.isDisplayed())
        {
               saveBtn.click();
        }
		Thread.sleep(5000);
	}
	
	public String verifyAcntName(){
		String actualAcntNme = acntNameAfterSave.getText();
		return actualAcntNme ;
	}
	
//	String ExpectedAccountName = "Creating Account for Testing-2";
//    if(ActualAccountName.equals(ExpectedAccountName))
//    {
//           System.out.println("New Account Created Successfully , Account Name : "+ActualAccountName);
//    }
//    else
//    {
//           System.out.println("Unable to Create New Account");
//    }
// }
// else
// {
//    System.out.println("Login Un Successfull");
// }
// driver.close();
	
}
