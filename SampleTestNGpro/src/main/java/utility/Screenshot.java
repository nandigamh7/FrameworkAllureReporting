package main.java.utility;



import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Screenshot {
	
	 WebDriver driver;
	 public Screenshot(WebDriver driver)
	{
		
		this.driver=driver;
	}
	

	public void getscreenshot(String functionalityname) throws Exception 
    {
		
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         //The below method will save the screen shot in d drive with name "screenshot.png"
            
            FileUtils.copyFile(scrFile, new File("D:\\screenshotKR\\"+ functionalityname +getDate()+ ".png"));
    }
	
	
	public void getscreenshot1(String tcname,String functionalityname) throws Exception 
    {
		
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         //The below method will save the screen shot in d drive with name "screenshot.png"
            
            FileUtils.copyFile(scrFile, new File("D:\\Daimler_Screenshots\\ANZ\\" + tcname  + "\\"+ functionalityname +getDate()+ ".png"));
    }
	
	public static String getDate()
	{
		 //DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy_HH-mm-ss");
DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy_HH-mm-ss");
Date date = new Date();
return dateFormat.format(date);
	

		
	}	
	
}
