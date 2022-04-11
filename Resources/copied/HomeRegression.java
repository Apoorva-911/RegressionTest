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
public class HomeRegression extends BaseTestRegression{

	HomePage objHome;
	SetPage sp;

	Date dt = new Date();
	DateFormat dtFrmt = new SimpleDateFormat("_HHmmss");
	String dtText = dtFrmt.format(dt);

	@BeforeClass
	public void beforeClass()  {	
		objHome = new HomePage();	
	}

		@Test(priority = 0, description = "Check the visibility of Logo")
		public void VerifyLogoVisibility_Test() throws InterruptedException, IOException{
			try{  	  
				objHome.verifyLogoVisibility();	
				
				//onSuccessMeassage("Home logo is successfully verified");
				BasePage.screenshotOnPass("Home logo is successfully verified");
			
			    BasePage.onSuccessMeassage("Home logo is successfully verified", "Home logo is successfully verified", "Module - HOME , Description of the test executed : Home logo is successfully verified");
	    	
			}
			catch(Exception | AssertionError ex){
				BasePage.captureScreenshot("homeLogoFail");
				BasePage.onFailreMeassage(ex.getMessage(),"homeLogoFail","Module - HOME , Description of the test executed : Home logo is not successfully verified");					
			}
		}
	
		@Test(priority = 1, description = "Check if dashBoard displays all the components")
		public void VerifyDashboard_Test() throws Throwable{
			try{
				Thread.sleep(5000);
				objHome.verifyDashboardComponents();
				Thread.sleep(3000);
				//onSuccessMeassage("DashBoard displays all the components");
				BasePage.screenshotOnPass("DashBoard displays all the components");
				Thread.sleep(3000);
			    BasePage.onSuccessMeassage("DashBoard displays all the components", "DashBoard displays all the components", "Module - HOME , Description of the test executed : DashBoard displays all the components");
	    	
			}
			catch(Exception | AssertionError ex){
				BasePage.captureScreenshot("dashboardFail");
				BasePage.onFailreMeassage(ex.getMessage(),"dashboardFail","Module - HOME , Description of the test executed : DashBoard not displays all the components");					
			}
		}
	
		@Test(priority = 2, description = "Check for user information in profile")
		public void VerifyUserProfile() throws Throwable{
			try{
				String functionName = new Object(){}.getClass().getEnclosingMethod().getName();
	
				System.out.println(functionName);
				String value = this.getConfiguration().get(functionName);
				String[] HomParameters =value.split(",");
				String ProfileName = HomParameters[0].trim();
	
				objHome.verifyUserProfiles(ProfileName);
				//onSuccessMeassage("User profile is successfully verified");
				BasePage.screenshotOnPass("User profile is successfully verified");
			    BasePage.onSuccessMeassage("User profile is successfully verified", "User profile is successfully verified", "Module - HOME , Description of the test executed : User profile is successfully verified");
	    	
				
			}
			catch(Exception | AssertionError ex){
				BasePage.captureScreenshot("profileFail");
				BasePage.onFailreMeassage(ex.getMessage(),"profileFail","Module - HOME , Description of the test executed : User profile is not successfully verified");					
			}
		}
	
		@Test(priority = 3, description = "Check for copyright and other links")
		public void VerifyCopyRights() throws Throwable{
			try{
				objHome.verifyCopyRights();
				//onSuccessMeassage("CopyRight details are present");
				BasePage.screenshotOnPass("CopyRight details are present");
			    BasePage.onSuccessMeassage("CopyRight details are present", "CopyRight details are present", "Module - HOME , Description of the test executed : CopyRight details are present");
	    	
				
			}
			catch(Exception | AssertionError ex){
				BasePage.captureScreenshot("CopyRightsFail");
				BasePage.onFailreMeassage(ex.getMessage(),"CopyRightsFail","Module - HOME , Description of the test executed : CopyRight details are not present");					
			}
		}
	
		@Test(priority = 4, description = "Search and Save the Global search")
		public void CreateGlobalSearch_Test() throws Throwable{
			try{
				objHome.createGlobalSearch();
				//onSuccessMeassage("Search is successfully created and saved");
				BasePage.screenshotOnPass("Search is successfully created and saved");
			    BasePage.onSuccessMeassage("Search is successfully created and saved", "Search is successfully created and saved", "Module - HOME , Description of the test executed : Search is successfully created and saved");
	    	
				
			}
			catch(Exception | AssertionError ex){
				BasePage.captureScreenshot("SavesearchFail");
				BasePage.onFailreMeassage(ex.getMessage(),"SavesearchFail","Module - HOME , Description of the test executed : Search is not successfully created and saved");					
			}
		}
	
		@Test(priority = 5, description = "Verify Saved Searches")
		public void VerifySavedSearches_Test() throws Throwable{
			try{
				objHome.verifySavedSearches();
				//onSuccessMeassage("Search is successfully created and saved");
				BasePage.screenshotOnPass("Search is successfully created and saved");
			    BasePage.onSuccessMeassage("Search is successfully created and saved", "Search is successfully created and saved", "Module - HOME , Description of the test executed : Search is successfully created and saved");
	    	
				
			}
			catch(Exception | AssertionError ex){
				BasePage.captureScreenshot("SavesearchFail");
				BasePage.onFailreMeassage(ex.getMessage(),"SavesearchFail","Module - HOME , Description of the test executed : Search is not successfully created and saved");					
			}
		}

	@Test(priority = 6, description = "Verify Contact help Desk")
	public void VerifyContactHelpDesk_Test() throws Throwable{
		try{
			objHome.VerifyContactHelpDesk();
			//onSuccessMeassage("Contact Help Desk is verified");
			BasePage.screenshotOnPass("Contact Help Desk is verified");
		    BasePage.onSuccessMeassage("Contact Help Desk is verified", "Contact Help Desk is verified", "Module - HOME , Description of the test executed : Contact Help Desk is verified");
    	
			
		}
		catch(Exception | AssertionError ex){
			BasePage.captureScreenshot("ContactHelpDeskFail");
			BasePage.onFailreMeassage(ex.getMessage(),"ContactHelpDeskFail","Module - HOME , Description of the test executed : Contact Help Desk is not verified");					
		}
	}

	@Test(priority = 7, description = "Verify User Manual")
	public void VerifyUserManual_Test() throws Throwable{
		try{
			objHome.VerifyUserManual();
			//onSuccessMeassage("User manual is verifiedd");
			BasePage.screenshotOnPass("User manual is verified");
		    BasePage.onSuccessMeassage("User manual is verified", "User manual is verified", "Module - HOME , Description of the test executed : User manual is verified");
    	
			
		}
		catch(Exception | AssertionError ex){
			BasePage.captureScreenshot("UserManualFail");
			BasePage.onFailreMeassage(ex.getMessage(),"UserManualFail","Module - HOME , Description of the test executed : User manual is not verified");					
		}
	}

	@Test(priority = 8, description = "Verify FAQ")
	public void VerifyFAQ_Test() throws Throwable{
		try{
			objHome.VerifyFAQ();
			//onSuccessMeassage("FAQ is verified");
			BasePage.screenshotOnPass("FAQ is verified");
		    BasePage.onSuccessMeassage("FAQ is verified", "FAQ is verified", "Module - HOME , Description of the test executed : FAQ is verified");
    	
			
		}
		catch(Exception | AssertionError ex){
			BasePage.captureScreenshot("FAQFail");
			BasePage.onFailreMeassage(ex.getMessage(),"FAQFail","Module - HOME , Description of the test executed : FAQ is verified");					
		}
	}
	
	
	@Test(priority = 9, description = "Verify MyData Components")
	public void VerifyFMyDataComponents_Test() throws Throwable{
		try{
			objHome.VerifyMyDataComponents();
			//onSuccessMeassage("FAQ is verified");
			BasePage.screenshotOnPass("FAQ is verified");
		    BasePage.onSuccessMeassage("FAQ is verified", "FAQ is verified", "Module - HOME , Description of the test executed : FAQ is verified");
    	
			
		}
		catch(Exception | AssertionError ex){
			BasePage.captureScreenshot("FAQFail");
			BasePage.onFailreMeassage(ex.getMessage(),"FAQFail","Module - HOME , Description of the test executed : FAQ is verified");					
		}
	}
	
	@Test(priority = 10, description = "Verify columns : Name and Last Modified")
	public void VerifyNameAndLastModified_Test() throws Throwable{
		try{
			objHome.VerifyNameAndLastModified_MyData();
			//onSuccessMeassage("FAQ is verified");
			BasePage.screenshotOnPass("Name_LastModified_Verified");
		    BasePage.onSuccessMeassage("Name_LastModified_Verified", "Name_LastModified_Verified", "Module - HOME , Description of the test executed : Verify columns : Name and Last Modified");
    	
			
		}
		catch(Exception | AssertionError ex){
			BasePage.captureScreenshot("Name_LastModified_VerificationFail");
			BasePage.onFailreMeassage(ex.getMessage(),"Name_LastModified_VerificationFail","Module - HOME , Description of the test executed : Verify columns : Name and Last Modified");					
		}
	}  
	
	
	@Test(priority = 11, description = "Verify columns : Owner column is present")
	public void VerifyOwnerColumn_Test() throws Throwable{
		try{
			objHome.VerifyOwnerColumn_MyData();
			//onSuccessMeassage("FAQ is verified");
			BasePage.screenshotOnPass("OwnerColumn_MyDataPass");
		    BasePage.onSuccessMeassage("OwnerColumn_MyDataPass", "OwnerColumn_MyDataPass", "Module - HOME , Description of the test executed : Verify columns : Owner column is present");
    	
			
		}
		catch(Exception | AssertionError ex){
			BasePage.captureScreenshot("OwnerColumn_MyDataFail");
			BasePage.onFailreMeassage(ex.getMessage(),"OwnerColumn_MyDataFail","Module - HOME , Description of the test executed : Verify columns : Owner column is present");					
		}
	} 
	
	@Test(priority = 12, description = "Verify column present in My data : Category")
	public void VerifyCategoryColumn_Test() throws Throwable{
		try{
			objHome.VerifyCategoryColumn_MyData();
			//onSuccessMeassage("CategoryPresentPass");
			BasePage.screenshotOnPass("CategoryPresentPass");
		    BasePage.onSuccessMeassage("CategoryPresentPass", "CategoryPresentPass", "Module - HOME , Description of the test executed : VVerify column present in My data : Category");
    	
			
		}
		catch(Exception | AssertionError ex){
			BasePage.captureScreenshot("CategoryColumnFail");
			BasePage.onFailreMeassage(ex.getMessage(),"CategoryColumnFail","Module - HOME , Description of the test executed : Verify column present in My data : Category");					
		}
	} 
	
/*	@Test(priority = 13, description = "Verify action menu")
	public void VerifyActionMenu_Test() throws Throwable{
		try{
			objHome.VerifyActionMenu_MyData();
			//onSuccessMeassage("FAQ is verified");
			BasePage.screenshotOnPass("ActionMenuPass");
		    BasePage.onSuccessMeassage("ActionMenuPass", "ActionMenuPass", "Module - HOME , Description of the test executed : Verify action menu");
    	
			
		}
		catch(Exception | AssertionError ex){
			BasePage.captureScreenshot("ActionMenuFail");
			BasePage.onFailreMeassage(ex.getMessage(),"ActionMenuFail","Module - HOME , Description of the test executed : Verify action menu");					
		}
	} */
	
	//Verify presence of action menu against each row in My data listing page
	@Test(priority = 13, description = "Verify action menu")
	public void VerifyActionMenu_Test() throws Throwable{
		try{
			objHome.actionMenuPresent_MyData();
			Thread.sleep(5000);
			BasePage.screenshotOnPass("ActionMenuPass");
		    BasePage.onSuccessMeassage("ActionMenuPass", "ActionMenuPass", "Module - HOME , Description of the test executed : Verify action menu");
    	
			
		}
		catch(Exception | AssertionError ex){
			BasePage.captureScreenshot("ActionMenuFail");
			BasePage.onFailreMeassage(ex.getMessage(),"ActionMenuFail","Module - HOME , Description of the test executed : Verify action menu");					
		}
	} 
	
	
	@Test(priority = 14, description = "Verify items inside action menu")
	public void VerifyItemsInActionMenu_Test() throws Throwable{
		try{
			objHome.ItemsInActionMenu_MyData();
			Thread.sleep(5000);
			BasePage.screenshotOnPass("ItemsActionMenuPass");
		    BasePage.onSuccessMeassage("ItemsActionMenuPass", "ItemsActionMenuPass", "Module - HOME , Description of the test executed : Verify items inside action menu");
    	
			
		}
		catch(Exception | AssertionError ex){
			BasePage.captureScreenshot("ItemsActionMenuFail");
			BasePage.onFailreMeassage(ex.getMessage(),"ItemsActionMenuFail","Module - HOME , Description of the test executed : Verify items inside action menu");					
		}
	} 
	

	@Test(priority = 15, description = "Sort name column in My Data list")
	public void Sort_Name_Test() throws Throwable 
	{
		objHome.myDataBtn.click();
	    	
	    objHome.mouseHover();
	    
	    
		try
		{
			WebElement SortColumnname = objHome.nameColumn;
			
			SortColumnname.click();
			Thread.sleep(3000);
			SortColumnname.click();
			
			ExtentTestManager.getTest().log(Status.PASS, "Name column is Sorted Ascending");
			sp.verifySortAscending("NAME");
			
			
			BasePage.screenshotOnPass("Sort_Name_Pass");
		    BasePage.onSuccessMeassage("Sort_Name_Pass", "Sort_Name_Pass", "Module - SET , Description of the test executed : Sort name column in My Data list");
    	
	}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("Sort_Name_Fail");
			BasePage.onFailreMeassage(ex.getMessage(),"Sort_Name_Fail","Module - SET , Description of the test executed : Sort name column in My Data list");
			
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("Sort_Name_Fail");
			BasePage.onFailreMeassage(ex.getMessage(),"Sort_Name_Fail","Module - SET , Description of the test executed : Sort name column in My Data list");
			
		}
	} 
	
	
	@Test(priority = 16, description = "Sort Last Modified column in My Data list")
	public void Sort_LastModified_Test() throws Throwable 
	{
		objHome.myDataBtn.click();
	    	
	    objHome.mouseHover();
	    
	    
		try
		{
			
			WebElement SortColumnname = objHome.lastModifiedColumn;
			
			SortColumnname.click();
			Thread.sleep(3000);
			
			
			ExtentTestManager.getTest().log(Status.PASS, "Last Modified column is Sorted Ascending");
			sp.verifySortAscending("LAST MODIFIED");
			
			
			BasePage.screenshotOnPass("Sort_LastModified_Pass");
		    BasePage.onSuccessMeassage("Sort_LastModified_Pass", "Sort_LastModified_Pass", "Module - SET , Description of the test executed : Sort Last Modified column in My Data list");
    	
	}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("Sort_LastModified_Fail");
			BasePage.onFailreMeassage(ex.getMessage(),"Sort_LastModified_Fail","Module - SET , Description of the test executed : Sort Last Modified column in My Data list");
			
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("Sort_LastModified_Fail");
			BasePage.onFailreMeassage(ex.getMessage(),"Sort_LastModified_Fail","Module - SET , Description of the test executed : Sort Last Modified column in My Data list");
			
		}
	} 


}
