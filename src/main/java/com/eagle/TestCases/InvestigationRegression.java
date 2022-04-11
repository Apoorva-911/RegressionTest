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
import com.eagle.pages.ComparisonPage;
import com.eagle.pages.ExplorationPage;
import com.eagle.pages.InvestigationPage;
import com.eagle.pages.SetPage;
import com.eagle.pages.BasePage;

public class InvestigationRegression extends BaseTestRegression {
	
	InvestigationPage objInvestigationPage;	
	SetPage objSetPage;
	ExplorationPage objExplorationPage; 
	ComparisonPage objComparisonPage;
	String investigationName, functionName, value; 
	String[] invParameters;
	String entity = "Disease"; 
	String searchText = "fever";
	String compSetName = "setName";
	
	
	Date dt = new Date();
	DateFormat dtFrmt = new SimpleDateFormat("_HHmmss");
	String dtText = dtFrmt.format(dt);

	@BeforeClass
	public void beforeClass() throws InterruptedException, AWTException  {	
			objInvestigationPage = new InvestigationPage();	
	}
	
	@Test(priority = 0, description = "Create Investigation")
	public void CreateInvestigation_Test() throws InterruptedException, IOException {
		
		try {
			
			String successMessage = "Investigation is successfully created";
			/* To initiate the creation of Investigation */		
			functionName = new Object(){}.getClass().getEnclosingMethod().getName();				
			
			value = this.getConfiguration().get(functionName);
			invParameters = value.split(",");
//			investigationName = invParameters[0].trim() + this.getDateTime();
			investigationName = invParameters[0].trim() + dtText;
			String invDescription = invParameters[1].trim();
			
			objInvestigationPage.createInvestigation(investigationName,invDescription);
			//onSuccessMeassage("Investigation is successfully created");
			BasePage.screenshotOnPass("Investigation is successfully created");
		    BasePage.onSuccessMeassage(successMessage, "Investigation is successfully created","Module - INVESTIGATION , Description of the test executed : Investigation is successfully created"); 

    
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("createInvFail");
			BasePage.onFailreMeassage(ex.getMessage(),"createInvFail","Module - INVESTIGATION , Description of the test executed : Investigation not created");
			
		}
	}
	
	@Test(priority = 1, description = "View Investigation")
	public void ViewInvestigation_Test() throws Throwable  {
		try {
			String successMessage = "Investigation is successfully opened";
			 /* To view the Investigation */
			functionName = new Object(){}.getClass().getEnclosingMethod().getName();		
			value = this.getConfiguration().get(functionName);			
//			investigationName = invParameters[0].trim() + this.getDateTime();
			investigationName = invParameters[0].trim();
			
			objInvestigationPage.viewInvestigation(investigationName);
			//onSuccessMeassage("Investigation is successfully opened");
			BasePage.screenshotOnPass("Investigation is successfully opened");
		    BasePage.onSuccessMeassage(successMessage, "Investigation is successfully opened","Module - INVESTIGATION , Description of the test executed : Investigation is successfully opened"); 

			
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("viewInvFail");
			BasePage.onFailreMeassage(ex.getMessage(),"viewInvFail","Module - INVESTIGATION , Description of the test executed : Investigation did not open");
		}
	}
		 
	@Test(priority = 2, description = "Edit Investigation")
	public void EditInvestigation_Test() throws InterruptedException, IOException  {
		try {
			String successMessage = "Investigation is successfully modified";
			 /* To edit the Investigation */
			functionName = new Object(){}.getClass().getEnclosingMethod().getName();		
			value = this.getConfiguration().get(functionName);
			invParameters =value.split(",");
//			investigationName = invParameters[0].trim() + this.getDateTime();
//			String newInvName = invParameters[1].trim() + this.getDateTime();
			investigationName = invParameters[0].trim() + dtText;
			String newInvName = invParameters[1].trim() + dtText;
			String invDescription = invParameters[2].trim();
			
			objInvestigationPage.createInvestigation(investigationName,investigationName);
			objInvestigationPage.editInvestigation(investigationName,newInvName,invDescription);
			//onSuccessMeassage("Investigation is successfully modified");
			BasePage.screenshotOnPass("Investigation is successfully modified");
		    BasePage.onSuccessMeassage(successMessage, "Investigation is successfully modified","Module - INVESTIGATION , Description of the test executed : Investigation is successfully modified"); 

			
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("editInvFail");
			BasePage.onFailreMeassage(ex.getMessage(),"editInvFail","Module - INVESTIGATION , Description of the test executed : Investigation is not modified");
		}
	}
	
	@Test(priority = 3, description = "Link Set With Investigation")
	public void LinkSetWithInvestigation_Test() throws Throwable  {
		try {    
			String successMessage = "Investigation is successfully linked with set";
			/* To Link set to an Investigation */		
			functionName = new Object(){}.getClass().getEnclosingMethod().getName();		
			value = this.getConfiguration().get(functionName);
			invParameters =value.split(",");
//			investigationName = invParameters[0].trim() + this.getDateTime();
//			String setTobeLinked = invParameters[1].trim()+ this.getDateTime();
			investigationName = invParameters[0].trim() + dtText;
			String setTobeLinked = invParameters[1].trim()+ dtText;
			
			objInvestigationPage.createInvestigation(investigationName,investigationName);
			objSetPage = new SetPage();					
			objSetPage.createSet(setTobeLinked,entity,searchText);	
			objInvestigationPage.linkSettoInvestigation(investigationName ,setTobeLinked);
			//onSuccessMeassage("Investigation is successfully linked with set");
			BasePage.screenshotOnPass("Investigation is successfully linked with set");
		    BasePage.onSuccessMeassage(successMessage, "Investigation is successfully linked with set","Module - INVESTIGATION , Description of the test executed : Investigation is successfully linked with set"); 

			
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("linkSetInvFail");
			BasePage.onFailreMeassage(ex.getMessage(),"linkSetInvFail","Module - INVESTIGATION , Description of the test executed : Investigation did not link with the set");
		}
	}
	
	
	@Test(priority = 4, description = "Link Exploration With Investigation")
	public void LinkExplorationWithInvestigation_Test() throws Throwable  {                                                   
		try {
			String successMessage = "Investigation is successfully linked with Exploration";
			/* To Link exploration to an Investigation */
			functionName = new Object(){}.getClass().getEnclosingMethod().getName();		
			value = this.getConfiguration().get(functionName);
			invParameters =value.split(",");				
//			investigationName = invParameters[0].trim() + this.getDateTime();
//			String expTobeLinked = invParameters[1].trim()+ this.getDateTime();
			investigationName = invParameters[0].trim() + dtText;
			String expTobeLinked = invParameters[1].trim()+ dtText;
			   //ERROR //
			objInvestigationPage.createInvestigation(investigationName,investigationName);
			objExplorationPage = new ExplorationPage();				
			objExplorationPage.createExploration(expTobeLinked, entity, searchText);
			 objInvestigationPage.linkExplorationtoInvestigation(investigationName,expTobeLinked);
			  //onSuccessMeassage("Investigation is successfully linked with Exploration");
			 BasePage.screenshotOnPass("Investigation is successfully linked with Exploration");
			 BasePage.onSuccessMeassage(successMessage, "Investigation is successfully linked with Exploration","Module - INVESTIGATION , Description of the test executed : Investigation is successfully linked with Exploration"); 

			 
			}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("linkExpInvFail");
			BasePage.onFailreMeassage(ex.getMessage(),"linkExpInvFail","Module - INVESTIGATION , Description of the test executed : Investigation did not link with the Exploration");
		}
	}
	
	@Test(priority = 5, description = "Link Comparison With Investigation")
	public void LinkComparisonWithInvestigation_Test() throws Throwable  {
		try {
			String successMessage = "Investigation is successfully linked with Comparison";
		   /* To Link Comparison to an Investigation */
			functionName = new Object(){}.getClass().getEnclosingMethod().getName();		
			value = this.getConfiguration().get(functionName);
			invParameters =value.split(",");
//			String invName = invParameters[0].trim();
//			investigationName = invParameters[0].trim() + this.getDateTime();
//			String compTobeLinked = invParameters[1].trim()+ this.getDateTime();
			investigationName = invParameters[0].trim() +dtText;
			String compTobeLinked = invParameters[1].trim()+dtText;
			
			objInvestigationPage.createInvestigation(investigationName,investigationName);
			objComparisonPage = new ComparisonPage();	
			objComparisonPage.createComparisonControl(compTobeLinked, compSetName, entity, searchText);
			objInvestigationPage.linkComparisontoInvestigation(investigationName,compTobeLinked);  
			//onSuccessMeassage("Investigation is successfully linked with Comparison");
			BasePage.screenshotOnPass("Investigation is successfully linked with Comparison");
			BasePage.onSuccessMeassage(successMessage, "Investigation is successfully linked with Comparison","Module - INVESTIGATION , Description of the test executed : Investigation is successfully linked with Comparison"); 

			
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("linkCompInvFail");
			BasePage.onFailreMeassage(ex.getMessage(),"linkCompInvFail","Module - INVESTIGATION , Description of the test executed : Investigation did not link with the Comparison");
		}

	}
	

	@Test(priority = 6, description = "Share Investigation")
	public void ShareInvestigation_Test() throws InterruptedException, IOException  {
		try {
			String successMessage = "Investigation is successfully shared with user";
			/* To share the Investigation */
			functionName = new Object(){}.getClass().getEnclosingMethod().getName();		
			value = this.getConfiguration().get(functionName);
			invParameters =value.split(",");
//			investigationName = invParameters[0].trim() + this.getDateTime();
			investigationName = invParameters[0].trim() + dtText;
			String toBeSharedWith = invParameters[1].trim();
			
			objInvestigationPage.createInvestigation(investigationName,investigationName);
			objInvestigationPage.shareInvestigation(investigationName,toBeSharedWith);
			//onSuccessMeassage("Investigation is successfully shared with user");
			BasePage.screenshotOnPass("Investigation is successfully shared with user");
			BasePage.onSuccessMeassage(successMessage, "Investigation is successfully shared with user","Module - INVESTIGATION , Description of the test executed : Investigation is successfully shared with user"); 

			
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("shareInvFail");
			BasePage.onFailreMeassage(ex.getMessage(),"shareInvFail","Module - INVESTIGATION , Description of the test executed : Investigation did not get shared with the user");			
		}

	}
	
	@Test(priority = 7, description = "Delete Investigation")
	public void DeleteInvestigation_Test() throws InterruptedException, IOException  {
		try 
	  	{
			String successMessage = "Investigation is successfully deleted from the list";
			/* To delete the Investigation */
			functionName = new Object(){}.getClass().getEnclosingMethod().getName();		
			value = this.getConfiguration().get(functionName);			
//			investigationName =value + this.getDateTime();
			investigationName = invParameters[0].trim() + dtText;
			
			objInvestigationPage.createInvestigation(investigationName,investigationName);
			objInvestigationPage.deleteInvestigation(investigationName);	
			//onSuccessMeassage("Investigation is successfully deleted from the list");
			BasePage.screenshotOnPass("Investigation is successfully deleted from the list");
			BasePage.onSuccessMeassage(successMessage, "Investigation is successfully deleted from the list","Module - INVESTIGATION , Description of the test executed : Investigation is successfully deleted from the list"); 

			
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("deleteInvFail");
			BasePage.onFailreMeassage(ex.getMessage(),"deleteInvFail","Module - INVESTIGATION , Description of the test executed : Investigation is not deleted from the list");			
		}
	}  
	

	
		 
}

