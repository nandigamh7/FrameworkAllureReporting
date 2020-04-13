package main.java.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import main.java.base.BaseClass;

public class ContactsPage extends BaseClass{
	
	@FindBy(xpath="//input[@name='new']")
	WebElement newBtn;
	
	@FindBy(xpath="//input[@id='name_firstcon2']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='name_lastcon2']")
	WebElement lastName;
	
	@FindBy(xpath="//img[@alt='Account Name Lookup (New Window)']")
	WebElement acntLookUpIcon;

	@FindBy(xpath="//input[@id='con10']")
	WebElement phone;

	@FindBy(xpath="//textarea[@id='con19street']")
	WebElement mailingStreet;

	@FindBy(xpath="//input[@id='con19city']")
	WebElement mailingCity;

	@FindBy(xpath="//input[@id='con19state']")
	WebElement mailingState;
	
	@FindBy(xpath="//input[@id='con19zip']")
	WebElement mailingZip;

	@FindBy(xpath="//input[@id='con19country']")
	WebElement mailingCountry;

	@FindBy(xpath="//input[@name='save']")
	WebElement saveBtn;

	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void createContact(String firstNme, String lastNme, String phne, String mailStrt, String mailCty, String mailStat, String mailZip, String mailCntry) {
	
		System.out.println("====Contact Creation method====");
		firstName.sendKeys(firstNme);
		lastName.sendKeys(lastNme);
		phone.sendKeys(phne);
		mailingState.sendKeys(mailStrt);
		mailingCity.sendKeys(mailCty);
		mailingState.sendKeys(mailStat);
		mailingCountry.sendKeys(mailCntry);
		mailingZip.sendKeys(mailZip);
		acntLookUpIcon.click();
		
	}
	
}
