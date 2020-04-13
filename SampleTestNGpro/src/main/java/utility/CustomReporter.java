package main.java.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.testng.ISuite;
import org.testng.Reporter;
import org.testng.reporters.EmailableReporter;
import org.testng.xml.XmlSuite;

import com.google.common.io.Files;

public class CustomReporter extends EmailableReporter{

	

	
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		// TODO Auto-generated method stub
		
		super.generateReport(xmlSuites, suites, outputDirectory);
		
		File f1 = new File("test-output\\emailable-report.html");
		
		if(f1.exists()){
			f1.renameTo(new File("test-output\\result\\emailable-report"+ getDate() +".html"));
		 File f2=new File("D:\\Reportes");
		try
		{
		 Files.move(f1, f2);
		}
		catch(IOException r)
		{
			Reporter.log("report does not exist");
		}
		}else{
			System.out.println("File does not exists ");
			
		}
	}

	public static String getDate()
	{
		 //DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy_HH-mm-ss");
DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy_HH-mm-ss");
Date date = new Date();
return dateFormat.format(date);
	
		
	}
}
