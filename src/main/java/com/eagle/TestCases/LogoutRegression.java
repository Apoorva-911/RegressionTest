package com.eagle.TestCases;

import java.io.IOException;
import com.eagle.pages.BasePage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.eagle.Reports.ExtentTestManager;
import com.eagle.pages.HomePage;

public class LogoutRegression extends BaseTestRegression{

	HomePage objHome;
	
	@BeforeClass
	public void beforeClass()  {	
		objHome = new HomePage();	
	}
	
	@Test(priority = 0, description = "Logout functionality verification")
	public void VerifyLogout_Test() throws Throwable{
      try{
    	  	objHome.logout();
		    //onSuccessMeassage("Logout is successfully verified");
    	  	BasePage.screenshotOnPass("logoutSuccessful");
		    BasePage.onSuccessMeassage("Logout is successful", "logoutSuccessful", "Module - Logout , Description of the test executed : Logout functionality verification");
    	
    	}
      	catch(Exception ex){
      		BasePage.captureScreenshot("logoutFail");
      		BasePage.onFailreMeassage(ex.getMessage(),"logoutFail", "Module - Logout , Description of the test executed : Logout functionality verification");					
    						
		}
    }	
		

	
//	@AfterClass
//	public void afterClass()  {	
//		closeBroswer();
//	}
}
