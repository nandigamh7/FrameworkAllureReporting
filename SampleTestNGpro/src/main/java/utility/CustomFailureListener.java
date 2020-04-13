package main.java.utility;


import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import main.java.baseScript.SuperTestScript;




public  class CustomFailureListener extends SuperTestScript implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub 

		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult m) 
	{
		String mn=m.getName();
		takeScreenShot(mn);
		
	}
    
	// WebDriver driver;

	
	/*
	 public CustomFailureListener(WebDriver driver)
	{
		
		this.driver=driver;
	
	}
	*/
	public void takeScreenShot(String methodName) {
	
		ChromeDriver ch=(ChromeDriver)SuperTestScript.driver;
		File f1=ch.getScreenshotAs(OutputType.FILE);
		File f2= new File("D:\\Daimler Project\\screenshotsKR\\"+methodName+getDate() +".png");
		try {
			org.apache.commons.io.FileUtils.moveFile(f1, f2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			Reporter.log("screeenShot not been taken");
		}
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	

	public static String getDate()
	{
		 //DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy_HH-mm-ss");
DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy_HH-mm-ss");
Date date = new Date();
return dateFormat.format(date);
	
		
	}		

}
