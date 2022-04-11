package com.eagle.TestCases;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import com.eagle.Reports.ExtentTestManager;
import com.eagle.pages.HomePage;
import com.eagle.pages.SetPage;
import com.eagle.pages.BasePage;

public class ClearMyData extends BaseTestRegression{

	HomePage objHome;
	SetPage sp;

	Date dt = new Date();
	DateFormat dtFrmt = new SimpleDateFormat("_HHmmss");
	String dtText = dtFrmt.format(dt);

	@BeforeClass
	public void beforeClass()  {	
		objHome = new HomePage();	
	}
	
	

	
	@Test(priority = 0, description = "Verify items inside action menu")
	public void ClearExistingData_Test() throws Throwable{
		try{
			objHome.ClearExistingData();
			Thread.sleep(5000);
			BasePage.screenshotOnPass("ItemsActionMenuPass");
		    BasePage.onSuccessMeassage("ItemsActionMenuPass", "ItemsActionMenuPass", "Module - HOME , Description of the test executed : Verify items inside action menu");
    	
			
		}
		catch(Exception | AssertionError ex){
			BasePage.captureScreenshot("ItemsActionMenuFail");
			BasePage.onFailreMeassage(ex.getMessage(),"ItemsActionMenuFail","Module - HOME , Description of the test executed : Verify items inside action menu");					
		}
	} 
	
	
	
	
	
	
	
	
}
