package main.java.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import main.java.base.BaseClass;

public class HomePage extends BaseClass{
	
	//Page Factory or Object Repository
				
		@FindBy(xpath="//span[contains(text(),'Hemanth Kumar')]")
		WebElement userNameLbl;
		
//		@FindBy(xpath="//div[@id=\"tsid-menuItems\"]/a[text()='Sales']")
//		WebElement salesAppLbl;
		
		@FindBy(xpath="//ul[@id=\"tabBar\"]/li[@id='Account_Tab']/a[text()='Accounts']")
		WebElement accountsTab;
		
		@FindBy(xpath="//ul[@id=\"tabBar\"]/li[@id='Contact_Tab']/a[text()='Contacts']")
		WebElement contactsTab;
		
		@FindBy(xpath="//ul[@id=\"tabBar\"]/li[@id='Opportunity_Tab']/a[text()='Opportunities']")
		WebElement opportunitiesTab;
		
		@FindBy(xpath="//ul[@id=\"tabBar\"]/li[@id='Lead_Tab']/a[text()='Leads']")
		WebElement leadsTab;
		
		@FindBy(xpath="//ul[@id=\"tabBar\"]/li[@id='Campaign_Tab']/a[text()='Campaigns']")
		WebElement campaignsTab;
		
		public HomePage(){
			PageFactory.initElements(driver, this);
		}
		
		public String verifyHomePageTtl(){
			String homePageTtl = driver.getTitle();
			return homePageTtl;
		}
		
		public ContactsPage clickOnContactsTab(){
			contactsTab.click();
			return new ContactsPage();
		}
		
		public AccountsPage clickOnAccountsTab(){
			accountsTab.click();
			return new AccountsPage();
		}
		
		public LeadsPage clickOnLeadsTab(){
			leadsTab.click();
			return new LeadsPage();
		}
		
}
