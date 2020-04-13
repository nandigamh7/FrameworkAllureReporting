package main.java.pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class BasePage1 {

	By tab_Campaign=By.xpath("//span[text()='Campaigns']");
	By btn_new=By.xpath("//div[text()='New']");
	By btn_Next=By.xpath("//button/span[text()='Next']");
	By txtBox_Campaign_name=By.xpath("(//span[text()='Campaign Name']/following::input[1])[2]");
	By txtBox_Start_Date=By.xpath("//span[text()='Start Date']/following::input[1]");
	By txtBox_End_Date=By.xpath("//span[text()='End Date']/following::input[1]");
	By btn_Save=By.xpath("(//button/span[text()='Save'])[2]");
	By btn_Active=By.xpath("//span[text()='Active']/following::input[1]");
/**
 ********************************************************************** 
 * Method Name:  clickOn New Campaign tab
 * @Description : Function for click on New Campaign tab
 * @Author :  Pooja chalamalasetty
 *********************************************************************** 
 */
	public boolean clickOn_New_campaignTab(WebDriver driver)
	{
		boolean flag = false;
		try
		{
			   if(driver.findElements(tab_Campaign).size()>0)
			   {
				   driver.findElement(tab_Campaign).click();
				   flag = true;
			   }
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		return flag;
	}	

/**
 ********************************************************************** 
 * Method Name:  clickOn New button 
 * @Description : Function for click on New button
 * @Author :  Pooja chalamalasetty
 *********************************************************************** 
 */
	public boolean clickOn_New_btn(WebDriver driver)
	{
		boolean flag = false;
		try
		{
			   if(driver.findElements(btn_new).size()>0)
			   {
				   driver.findElement(btn_new).click();
				   flag = true;
			   }
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		return flag;
	}	


/**
 ********************************************************************** 
 * Method Name:  clickOn Next button 
 * @Description : Function for click on New button
 * @Author :  Pooja chalamalasetty
 *********************************************************************** 
 */
	public boolean clickOn_Next_btn(WebDriver driver)
	{
		boolean flag = false;
		try
		{
			   if(driver.findElements(btn_Next).size()>0)
			   {
				   driver.findElement(btn_Next).click();
				   flag = true;
			   }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return flag;
	}	

	
/**
********************************************************************** 
* Method Name:  enter campaign name
* @Description : enter campaign name
* @Author :  Pooja chalamalasetty
*********************************************************************** 
*/
	public boolean Enter_Parent_Campaign_name(WebDriver driver, String par_camname)
	{
	boolean flag = false;
	try
	{
		   if(driver.findElements(txtBox_Campaign_name).size()>0)
		   {
			   driver.findElement(txtBox_Campaign_name).sendKeys(par_camname);
			   flag = true;
		   }
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
	return flag;
	}	

/**
********************************************************************** 
* Method Name:  enter Start Date - parcam
* @Description : enter Start Date - parcam
* @Author :  Pooja chalamalasetty
*********************************************************************** 
*/
	public boolean Enter_Parent_Camp_Start_Date(WebDriver driver, String Start_Date)
	{
	boolean flag = false;
	try
	{
		   if(driver.findElements(txtBox_Start_Date).size()>0)
		   {
			   driver.findElement(txtBox_Start_Date).sendKeys(Start_Date);
			   flag = true;
		   }
		
		
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
	return flag;
	}	


/**
********************************************************************** 
* Method Name:  enter End Date - parcam
* @Description : enter End Date - parcam
* @Author :  Pooja chalamalasetty
*********************************************************************** 
*/
	public boolean Enter_End_Date_Par_Campaign(WebDriver driver, String End_Date)
	{
	boolean flag = false;
	try
	{
		   if(driver.findElements(txtBox_End_Date).size()>0)
		   {
			   driver.findElement(txtBox_End_Date).sendKeys(End_Date);
			   flag = true;
		   }
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
	return flag;
	}	


/**
 ********************************************************************** 
 * Method Name:  clickOn Save button 
 * @Description : Function for click on Save button
 * @Author :  Pooja chalamalasetty
 *********************************************************************** 
 */
	public boolean clickOn_Save_btn(WebDriver driver)
	{
		boolean flag = false;
		try
		{
			   if(driver.findElements(btn_Save).size()>0)
			   {
				   ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(btn_Save));
	          	 //driver.findElement(btnSave).click();
					flag=true;
					Reporter.log("clicked on save button",true);
			   }
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		return flag;
	}	


/**
 ********************************************************************** 
 * Method Name:  clickOn Active btn
 * @Description : Function for click on New Campaign tab
 * @Author :  Pooja chalamalasetty
 *********************************************************************** 
 */
	public boolean clickOn_Active(WebDriver driver)
	{
		boolean flag = false;
		try
		{
			   if(driver.findElements(btn_Active).size()>0)
			   {
				   driver.findElement(btn_Active).click();
				   flag = true;
			   }
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		return flag;
	}	
 
}

