package com.eagle.Reports;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.eagle.ConfigUtils.ReadObject;

public class ExtentManager {
	
public static ExtentReports extent;

	
	static Date dt = new Date();
	static DateFormat dtFrmt = new SimpleDateFormat("dd-MMM-YY_HHmmss");
	static String dtText = dtFrmt.format(dt);

	
     public static String fileSeperator ;
	 public static String reportFilepath;
	 public static String reportFileName;
	 public static String reportFileLocation;


	public static String EnvNameCall() throws IOException {
		
		ReadObject object = new ReadObject();
		Properties configObject = object.getObjectRepositoty();	     
		String EnvName = configObject.getProperty("EnvironmentName");
		System.out.println("----!!!----"+EnvName+"---!!!---");
	    return(EnvName);
		}
	
	
   @BeforeClass
	public static ExtentReports getInstance() {
		
		try {
			String EnvNameHere = EnvNameCall();
			
			
			 fileSeperator = System.getProperty("file.separator");
			 reportFilepath = "./Resources" +fileSeperator+ "Regression Reports";
			 reportFileName = "Test-Automaton-Report"+"("+EnvNameHere+")"+dtText+".html";
			 reportFileLocation =  reportFilepath +fileSeperator+ reportFileName;
			 
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		if (extent == null)
			try {
				createInstance();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return extent;
	}
	
	
	
	
	
	//Create an extent report instance
	public static ExtentReports createInstance() throws IOException {
		
		
	
		
		
		
		
		String fileName = getReportPath(reportFilepath);

		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
		htmlReporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);        
		htmlReporter.config().setChartVisibilityOnOpen(true);        
		htmlReporter.config().setTheme(Theme.DARK);  
		htmlReporter.config().setDocumentTitle(reportFileName);
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setReportName(reportFileName);
		htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		//Set environment details
		//extent.setSystemInfo("OS", "Windows");
		//extent.setSystemInfo("AUT", "QA");
		

		return extent;
	}    


	//Create the report path
	private static String getReportPath (String path) {
		File testDirectory = new File(path);
		if (!testDirectory.exists()) {
			if (testDirectory.mkdir()) 
			{
				System.out.println("Directory: " + path + " is created!" );
				return reportFileLocation;
			} 
			else 
			{
				System.out.println("Failed to create directory: " + path);
				return System.getProperty("user.dir");
			}
		} 
		else 
		{
			System.out.println("Directory already exists: " + path);
		}
		return reportFileLocation;
	}
}
