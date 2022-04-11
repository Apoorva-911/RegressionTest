package com.eagle.TestCases;

import java.io.IOException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import com.eagle.pages.LoginPage;
import com.eagle.Reports.ExtentTestManager;
import com.eagle.pages.BasePage;


public class LoginRegression extends BaseTestRegression{  
	   	 
		LoginPage objLogin;
	
		@BeforeClass
		public void beforeClass()  {	
			objLogin = new LoginPage();	
		}

		@Test(priority = 0, description = "Login with valid credentials")
		public void VerifyLoginPage_Test() throws Throwable{
	      try{
	    	    String successMessage = "Login is successfully verified";
			    objLogin.loginTo(); 	
			    //onSuccessMeassage("Login is successfully verified");
			    Thread.sleep(40000);
			    BasePage.screenshotOnPass("loginPassed");
			    BasePage.onSuccessMeassage(successMessage, "loginPassed","Module - Login , Description of the test executed : Login with valid credentials"); 

	    	}
	      	catch(Exception ex){
	      		BasePage.captureScreenshot("loginFail");
	      		BasePage.onFailreMeassage(ex.getMessage(),"loginFail","Module - Login , Description of the test executed : Login with valid credentials");								
											
			}
	    }
		
	
		
}


