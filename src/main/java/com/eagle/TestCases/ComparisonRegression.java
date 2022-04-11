package com.eagle.TestCases;

import java.awt.AWTException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import com.eagle.Reports.ExtentTestManager;
import com.eagle.pages.BasePage;
import com.eagle.pages.ComparisonPage;
import com.eagle.pages.BasePage;

public class ComparisonRegression extends BaseTestRegression{

	ComparisonPage objComparisonPage; 

	Date dt = new Date();
	DateFormat dtFrmt = new SimpleDateFormat("_HHmmss");
	String dtText = dtFrmt.format(dt);

	@BeforeClass
	public void beforeClass() throws AWTException, InterruptedException  {	
		objComparisonPage = new ComparisonPage();		
	}

	@Test(priority = 11, description = "Comparison - Expand and add items from Set")
	public void ComparisonExpandAddFromSet_Test() throws Throwable  {
		try {

			String successMessage = "Items Added from Set into Comparison successfully";
			
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();
			System.out.println("FUNCTION NAME : "+functionName);
			System.out.println();
			System.out.println();

		
			String value = this.getConfiguration().get(functionName);
			System.out.println("VALUE NAME : "+value);
			System.out.println();
			System.out.println();
			
			String[] ComParameters =value.split(",");
			String BaseSetName = ComParameters[0].trim()+dtText;
			String entity = ComParameters[1].trim();
			String searchTextInSet = ComParameters[2].trim();
			String ComName = ComParameters[3].trim()+dtText;
			String ControlSetName = ComParameters[4].trim();
			String searchTextInControl = ComParameters[5].trim();

			/* Comparison - Expand and add items from Set */
			objComparisonPage.ExpandAddFromSet(BaseSetName,entity, searchTextInSet, ComName,ControlSetName,searchTextInControl); 
			//			objComparisonPage.ExpandAddFromSet("SetAdd 1", "Disease", "aber", "ComAddFromSet",  "Control Card", "dol"); 
			objComparisonPage.saveChanges();
			Thread.sleep(30000);
		
			//onSuccessMeassage("Items Added from Set into Comparison successfully");
		
			BasePage.screenshotOnPass("ComparisonExpandAddFromSetPass");
		    BasePage.onSuccessMeassage(successMessage, "ComparisonExpandAddFromSetPass","Module - COMPARISON , Description of the test executed : Comparison - Expand and add items from Set"); 

		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("ComparisonExpandAddFromSetFail");
			BasePage.onFailreMeassage(ex.getMessage(),"ComparisonExpandAddFromSetFail","Module - COMPARISON , Description of the test executed : Comparison - Expand and add items from Set"); 

		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("ComparisonExpandAddFromSetFail");
			BasePage.onFailreMeassage(ex.getMessage(),"ComparisonExpandAddFromSetFail","Module - COMPARISON , Description of the test executed : Comparison - Expand and add items from Set"); 
        }
		
		
		
	/*	}
		catch(Exception | AssertionError ex)
		{
			objComparisonPage.captureScreenshot("ComparisonExpandAddFromSetFail");
			onFailureMeassage(ex.getMessage(),"ComparisonExpandAddFromSetFail","ComparisonExpandAddFromSetFail");
		}*/
	}
	   
}