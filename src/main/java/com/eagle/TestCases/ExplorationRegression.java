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
import com.eagle.pages.ExplorationPage;
import com.eagle.pages.BasePage;

public class ExplorationRegression extends BaseTestRegression{

	ExplorationPage objExplorationPage;

	Date dt = new Date();
	DateFormat dtFrmt = new SimpleDateFormat("_HHmmss");
	String dtText = dtFrmt.format(dt);

	@BeforeClass
	public void beforeClass() throws AWTException, InterruptedException  {	
		objExplorationPage = new ExplorationPage();		
	}

	@Test(priority = 0, description = "Create Exploration From Search")
	public void CreateExplorationFromSearch_Test() throws Throwable {
		try {
			String successMessage = "Exploration is Created Successfully From Search";

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] expParameters =value.split(",");
			String ExpName = expParameters[0].trim()+dtText;
			String entity = expParameters[1].trim();
			String searchText = expParameters[2].trim();

			/* Creates an Exploration From Search */		
			objExplorationPage.createExplorationFromSearch(ExpName, entity, searchText);
			//			objExplorationPage.createExplorationFromSearch("ExSearch 1", "Disease", "kera");
			//onSuccessMeassage("Exploration is Created Successfully From Search");
			BasePage.screenshotOnPass("Exploration is Created Successfully From Search");
		    BasePage.onSuccessMeassage(successMessage, "Exploration is Created Successfully From Search","Module - EXPLORATION , Description of the test executed : Exploration is Created Successfully From Search"); 

		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("createExplorationFromSearchFail");
			BasePage.onFailreMeassage(ex.getMessage(),"createExplorationFromSearchFail","Module - EXPLORATION , Description of the test executed : Exploration is not Created Successfully From Search"); 

		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("createExplorationFromSearchFail");
			BasePage.onFailreMeassage(ex.getMessage(),"createExplorationFromSearchFail","Module - EXPLORATION , Description of the test executed : Exploration is not Created Successfully From Search"); 
}
	}	

	@Test(priority = 1, description = "Create Exploration From Set Initally")
	public void CreateExplorationFromSetInitally_Test() throws Throwable {
		try {
			String successMessage = "Exploration is Created Successfully From Set Initally";

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] expParameters =value.split(",");
			String BaseSetName = expParameters[0].trim()+dtText;
			String entity = expParameters[1].trim();
			String searchTextInSet = expParameters[2].trim();
			String ExpName = expParameters[3].trim()+dtText;


			/* Creates an Exploration From Search - Initial */		
			objExplorationPage.createExplorationInitallyFromSet(BaseSetName, entity, searchTextInSet, ExpName);
			//			objExplorationPage.createExplorationInitallyFromSet("SetAdd 1", "Disease", "kera", "ExDirect From Set 1");
			//onSuccessMeassage("Exploration is Created Successfully From Set Initally");
			BasePage.screenshotOnPass("Exploration is Created Successfully From Set Initally");
		    BasePage.onSuccessMeassage(successMessage, "Exploration is Created Successfully From Set Initally","Module - EXPLORATION , Description of the test executed : Exploration is Created Successfully From Set Initally"); 

			
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("createExplorationFromSetInitalFail");
			BasePage.onFailreMeassage(ex.getMessage(),"createExplorationFromSetInitalFail","Module - EXPLORATION , Description of the test executed : Exploration is not Created Successfully From Set Initally");
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("createExplorationFromSetInitalFail");
			BasePage.onFailreMeassage(ex.getMessage(),"createExplorationFromSetInitalFail","Module - EXPLORATION , Description of the test executed : Exploration is not Created Successfully From Set Initally");
			}
	}

	@Test(priority = 2, description = "Create Exploration From Set After clicking From Search")
	public void CreateExplorationFromSet_Test() throws Throwable {
		try {
			String successMessage = "Exploration is Created Successfully From Set";

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] expParameters =value.split(",");
			String BaseSetName = expParameters[0].trim()+dtText;
			String entity = expParameters[1].trim();
			String searchTextInSet = expParameters[2].trim();
			String ExpName = expParameters[3].trim()+dtText;

			/* Creates an Exploration From Set - After Search */
			objExplorationPage.CreateExplorationFromSet(BaseSetName,entity,searchTextInSet, ExpName);
			//			objExplorationPage.CreateExplorationFromSet("SetAdd 2", "Disease", "kera", "ExFrom Set 2");
			//onSuccessMeassage("Exploration is Created Successfully From Set");
			BasePage.screenshotOnPass("Exploration is Created Successfully From Set");
		    BasePage.onSuccessMeassage(successMessage, "Exploration is Created Successfully From Set","Module - EXPLORATION , Description of the test executed : Exploration is Created Successfully From Set"); 

			
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("createExplorationFromSetInitalFail");
			BasePage.onFailreMeassage(ex.getMessage(),"createExplorationFromSetInitalFail","Module - EXPLORATION , Description of the test executed : Exploration is not Created Successfully From Set");
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("createExplorationFromSetInitalFail");
			BasePage.onFailreMeassage(ex.getMessage(),"createExplorationFromSetInitalFail","Module - EXPLORATION , Description of the test executed : Exploration is not Created Successfully From Set");
			}
	}

	@Test(priority = 3, description = "Create Exploration From File After clicking From Search")
	public void CreateExplorationFromFile_Test() throws Throwable {
		try {
			String successMessage = "Exploration is Created Successfully From File";

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] expParameters =value.split(",");
			String ExpName = expParameters[0].trim()+dtText;
			String entity = expParameters[1].trim();
			String fileLocation = expParameters[2].trim();


			/* Creates an Exploration From File - After Search */
			objExplorationPage.CreateExplorationFromFile(ExpName, entity,fileLocation);
			//			objExplorationPage.CreateExplorationFromFile("ExFileUpload", "Disease", "C:\\Users\\MugunthRaman\\git\\EagleAutomation\\Resources\\Q4 - Upload file - 1 (2).xlsx");
			//onSuccessMeassage("Exploration is Created Successfully From File");
			BasePage.screenshotOnPass("Exploration is Created Successfully From File");
		    BasePage.onSuccessMeassage(successMessage, "Exploration is Created Successfully From File","Module - EXPLORATION , Description of the test executed : Exploration is Created Successfully From File"); 

			
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("createExplorationFromFileInitalFail");
			BasePage.onFailreMeassage(ex.getMessage(),"createExplorationFromFileInitalFail","Module - EXPLORATION , Description of the test executed : Exploration is not Created Successfully From File");
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("createExplorationFromFileInitalFail");
			BasePage.onFailreMeassage(ex.getMessage(),"createExplorationFromFileInitalFail","Module - EXPLORATION , Description of the test executed : Exploration is not Created Successfully From File");
			}
	}

	@Test(priority = 4, description = "Search A Text In Exploration Expand")
	public void SearchInExplorationExpand_Test() throws Throwable  {
		try {
			String successMessage = "Search successful in Set Expand";

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] expParameters =value.split(",");
			String ExpName = expParameters[0].trim()+dtText;
			String entity = expParameters[1].trim();
			String searchText = expParameters[2].trim();
			String searchInExpand = expParameters[3].trim();


			/* To Search a Text in Expanded Exploration */
			objExplorationPage.searchInExplorationExpand(ExpName,entity,searchText,searchInExpand);
			//onSuccessMeassage("Search successful in Set Expand");
			BasePage.screenshotOnPass("Search successful in Set Expand");
		    BasePage.onSuccessMeassage(successMessage, "Search successful in Set Expand","Module - EXPLORATION , Description of the test executed : Search successful in Set Expand"); 

			
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("Search not successful in Set Expand");
			BasePage.onFailreMeassage(ex.getMessage(),"Search not successful in Set Expand","Module - EXPLORATION , Description of the test executed : Search not successful in Set Expand");
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("Search not successful in Set Expand");
			BasePage.onFailreMeassage(ex.getMessage(),"Search not successful in Set Expand","Module - EXPLORATION , Description of the test executed : Search not successful in Set Expand");
			}
	}

	@Test(priority = 5, description = "Delete Card in Exploration Expand")
	public void DeleteCardInExplorationExpand_Test() throws Throwable  {
		try {
			String successMessage = "Delete Card from Expanded Exploration";

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] expParameters =value.split(",");
			String ExpName = expParameters[0].trim()+dtText;
			String entity = expParameters[1].trim();
			String searchText = expParameters[2].trim();

			/* Delete Set from Expanded Set */
			objExplorationPage.DeleteExploraionInExpand(ExpName, entity, searchText);
			//			objExplorationPage.DeleteExploraionInExpand("DExploration2", "Disease", "kera");
			//onSuccessMeassage("Delete Card from Expanded Exploration");
			BasePage.screenshotOnPass("Delete Card from Expanded Exploration");
		    BasePage.onSuccessMeassage(successMessage, "Delete Card from Expanded Exploration","Module - EXPLORATION , Description of the test executed : Delete Card from Expanded Exploration"); 

			
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("DeleteExplorationInExpandFail");
			BasePage.onFailreMeassage(ex.getMessage(),"DeleteExplorationInExpandFail","Module - EXPLORATION , Description of the test executed : Delete Card from Expanded Exploration failed");
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("DeleteExplorationInExpandFail");
			BasePage.onFailreMeassage(ex.getMessage(),"DeleteExplorationInExpandFail","Module - EXPLORATION , Description of the test executed : Delete Card from Expanded Exploration failed");
			}	
	}

	@Test(priority = 6, description = "Delete The first Card in Exploration")
	public void DeleteExplorationFirstCard_Test() throws Throwable  {
		try {
			String successMessage = "Deleted The first Card in Exploration Successfully";

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] expParameters =value.split(",");
			String ExpName = expParameters[0].trim()+dtText;
			String entity = expParameters[1].trim();
			String searchText = expParameters[2].trim();

			/* Delete The first Card in Exploration */
			objExplorationPage.deleteExplorationInFirstCard(ExpName, entity, searchText);
			//			objExplorationPage.deleteExplorationInFirstCard("DExploration1Card", "Disease", "kera");
			//onSuccessMeassage("Deleted The first Card in Exploration Successfully");
			BasePage.screenshotOnPass("Deleted The first Card in Exploration Successfully");
		    BasePage.onSuccessMeassage(successMessage, "Deleted The first Card in Exploration Successfully","Module - EXPLORATION , Description of the test executed : Deleted The first Card in Exploration Successfully"); 

			
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("ExplorationFirstCardDeleteFail");
			BasePage.onFailreMeassage(ex.getMessage(),"DExplorationFirstCardDeleteFail","Module - EXPLORATION , Description of the test executed : Deleted The first Card in Exploration failed");
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("ExplorationFirstCardDeleteFail");
			BasePage.onFailreMeassage(ex.getMessage(),"DExplorationFirstCardDeleteFail","Module - EXPLORATION , Description of the test executed : Deleted The first Card in Exploration failed");
			}	
	}

	@Test(priority = 7, description = "Delete The Second Card in Exploration")
	public void DeleteExplorationSecondCard_Test() throws Throwable  {
		try {
			String successMessage = "Deleted The second Card in Exploration Successfully";

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] expParameters =value.split(",");
			String ExpName = expParameters[0].trim()+dtText;
			String entity = expParameters[1].trim();
			String searchText = expParameters[2].trim();
			String relationCardEntity = expParameters[3].trim();

			/* Delete The Second Card in Exploration */
			objExplorationPage.deleteExplorationInLaterCard(ExpName,entity,searchText,relationCardEntity);
			//			objExplorationPage.deleteExplorationInLaterCard("DExploration2Card", "Disease", "kera","Gene");
			//onSuccessMeassage("Deleted The first Card in Exploration Successfully");
			
			BasePage.screenshotOnPass("Deleted The second Card in Exploration Successfully");
		    BasePage.onSuccessMeassage(successMessage, "Deleted The second Card in Exploration Successfully","Module - EXPLORATION , Description of the test executed : Deleted The second Card in Exploration Successfully"); 

			
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("ExplorationSecondCardDeleteFail");
			BasePage.onFailreMeassage(ex.getMessage(),"ExplorationSecondCardDeleteFail","Module - EXPLORATION , Description of the test executed : Deletion of The second Card in Exploration failed");
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("ExplorationSecondCardDeleteFail");
			BasePage.onFailreMeassage(ex.getMessage(),"ExplorationSecondCardDeleteFail","Module - EXPLORATION , Description of the test executed : Deletion of The second Card in Exploration failed");
			}	
	}

	@Test(priority = 8, description = "Exploration - Expand and add items from Catalog")
	public void ExplorationExpandAddFromCatalog_Test() throws Throwable  {
		try {
			String successMessage = "Items Added from Catalog into Exploration successfully";
		

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] expParameters =value.split(",");
			String ExpName = expParameters[0].trim()+dtText;
			String entity = expParameters[1].trim();
			String searchText = expParameters[2].trim();
			String searchTextInCatalog = expParameters[3].trim();

			/* Set - Expand and add items from Catalog */
			objExplorationPage.ExpandAddFromCatalog(ExpName, entity, searchText,searchTextInCatalog);
			//			objExplorationPage.ExpandAddFromCatalog("ExpAddFromCatalog", "Disease", "aber", "dengue");
			objExplorationPage.saveChanges();
			BasePage.screenshotOnPass("Items Added from Catalog into Exploration successfully");
		    BasePage.onSuccessMeassage(successMessage, "Items Added from Catalog into Exploration successfully","Module - EXPLORATION , Description of the test executed : Items Added from Catalog into Exploration successfully"); 

			
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("ExplorationExpandAddFromCatalogFail");
			BasePage.onFailreMeassage(ex.getMessage(),"ExplorationExpandAddFromCatalogFail","Module - EXPLORATION , Description of the test executed : Items did not Add from Catalog into Exploration");
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("ExplorationExpandAddFromCatalogFail");
			BasePage.onFailreMeassage(ex.getMessage(),"ExplorationExpandAddFromCatalogFail","Module - EXPLORATION , Description of the test executed : Items did not Add from Catalog into Exploration");
			}	

	}

	@Test(priority = 9, description = "Exploration - Expand and add items from Set")
	public void ExplorationExpandAddFromSet_Test() throws Throwable  {
		try {

			String successMessage = "Items Added from Set into Exploration successfully";
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] expParameters =value.split(",");
			String BasesetName = expParameters[0].trim()+dtText;
			String entity = expParameters[1].trim();
			String searchTextInSet = expParameters[2].trim();
			String ExpName = expParameters[3].trim()+dtText;
			String searchTextInExp = expParameters[4].trim();


			/* Exploration - Expand and add items from Set */
			objExplorationPage.ExpandAddFromSet(BasesetName, entity,searchTextInSet, ExpName, searchTextInExp); 
			//			objExplorationPage.ExpandAddFromSet("SetAdd 1", "Disease", "leukocytes", "ExpAddFromSet", "aber" ); 
			objExplorationPage.saveChanges();
			//onSuccessMeassage("Items Added from Set into Exploration successfully");
			BasePage.screenshotOnPass("Items Added from Set into Exploration successfully");
		    BasePage.onSuccessMeassage(successMessage, "Items Added from Set into Exploration successfully","Module - EXPLORATION , Description of the test executed : Items Added from Set into Exploration successfully"); 

			
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("ExplorationExpandAddFromSetFail");
			BasePage.onFailreMeassage(ex.getMessage(),"ExplorationExpandAddFromSetFail","Module - EXPLORATION , Description of the test executed : Items did not Add from Set into Exploration");
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("ExplorationExpandAddFromSetFail");
			BasePage.onFailreMeassage(ex.getMessage(),"ExplorationExpandAddFromSetFail","Module - EXPLORATION , Description of the test executed : Items did not Add from Set into Exploration");
			}	
	}

	@Test(priority = 10, description = "Exploration - Expand and add items from File")
	public void ExplorationExpandAddFromFile_Test() throws Throwable  {
		try {
			String successMessage = "Items Added from File into Exploration successfully";
		

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] expParameters =value.split(",");
			String ExpName = expParameters[0].trim()+dtText;
			String entity = expParameters[1].trim();
			String searchText = expParameters[2].trim();
			String fileUploadEntity = expParameters[3].trim();
			String fileLocation = expParameters[4].trim();
			String fileName = expParameters[5].trim();

			/* Exploration - Expand and add items from File */
			objExplorationPage.ExpandAddFromFile(ExpName,entity,searchText,fileUploadEntity, fileLocation,fileName);
			//			objExplorationPage.ExpandAddFromFile("ExpAddfromFile 1","Disease","kera","Disease", "C:\\Users\\MugunthRaman\\git\\EagleAutomation\\Resources\\Q4 - Upload file - 1 (2).xlsx", "Q4 - Upload file - 1 (2).xlsx");
			objExplorationPage.saveChanges();
			//onSuccessMeassage("Items Added from File into Exploration successfully");
			BasePage.screenshotOnPass("Items Added from File into Exploration successfully");
		    BasePage.onSuccessMeassage(successMessage, "Items Added from File into Exploration successfully","Module - EXPLORATION , Description of the test executed : Items Added from File into Exploration successfully"); 

			
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("ExplorationExpandAddFromFileFail");
			BasePage.onFailreMeassage(ex.getMessage(),"ExplorationExpandAddFromFileFail","Module - EXPLORATION , Description of the test executed : Items did not Add from File into Exploration");
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("ExplorationExpandAddFromFileFail");
			BasePage.onFailreMeassage(ex.getMessage(),"ExplorationExpandAddFromFileFail","Module - EXPLORATION , Description of the test executed : Items did not Add from File into Exploration");
			}	
	}

	@Test(priority = 11, description = "Exploration - Create with one additional relation Card")
	public void ExplorationCreateARelationCard_Test() throws Throwable  {
		try {
			
			String successMessage = "Exploration Created and added with a relation Card Successfully";
			
		

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] expParameters =value.split(",");
			String ExpName = expParameters[0].trim()+dtText;
			String entity = expParameters[1].trim();
			String searchText = expParameters[2].trim();
			String RelationCardEntity = expParameters[3].trim();

			/* Exploration - Create with one additional relation Card */
			objExplorationPage.createRelationCardFirst(ExpName,entity,searchText,RelationCardEntity);
			//			objExplorationPage.createRelationCardFirst("ExpRela 1", "Disease", "kera", "Gene");
			//onSuccessMeassage("Exploration Created and added with a relation Card Successfully");
			BasePage.screenshotOnPass("Exploration Created and added with a relation Card Successfully");
		    BasePage.onSuccessMeassage(successMessage, "Exploration Created and added with a relation Card Successfully","Module - EXPLORATION , Description of the test executed : Exploration Created and added with a relation Card Successfully"); 

			
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("ExplorationAddARelationFail");
			BasePage.onFailreMeassage(ex.getMessage(),"ExplorationAddARelationFail","Module - EXPLORATION , Description of the test executed : Relation card could not be added to the exploration");
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("ExplorationAddARelationFail");
			BasePage.onFailreMeassage(ex.getMessage(),"ExplorationAddARelationFail","Module - EXPLORATION , Description of the test executed : Relation card could not be added to the exploration");
			}	
	}

	@Test(priority = 12, description = "Exploration - Create with 2 additional relation Card")
	public void ExplorationCreateTwoRelationCard_Test() throws Throwable  {
		try {
			String successMessage = "Exploration Created and added with 2 relation Cards Successfully";
		

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] expParameters =value.split(",");
			String ExpName = expParameters[0].trim()+dtText;
			String entity = expParameters[1].trim();
			String searchText = expParameters[2].trim();
			String Relation1CardEntity = expParameters[3].trim();
			String Relation2CardEntity = expParameters[4].trim();
			String NoOfItemsToSelectInRelation1card = expParameters[5].trim();

			/* Exploration - Create with 2 additional relation Cards */
			objExplorationPage.createRelationCardMulti(ExpName, entity,searchText,Relation1CardEntity,Relation2CardEntity,NoOfItemsToSelectInRelation1card);
			//			objExplorationPage.createRelationCardMulti("ExpRela 2", "Disease", "kera", "Gene","SNP","5");
			//onSuccessMeassage("Exploration Created and added with 2 relation Cards Successfully");
			BasePage.screenshotOnPass("Exploration Created and added with 2 relation Cards Successfully");
		    BasePage.onSuccessMeassage(successMessage, "Exploration Created and added with 2 relation Cards Successfully","Module - EXPLORATION , Description of the test executed : Exploration Created and added with 2 relation Cards Successfully"); 

			
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("ExplorationAdd2RelationFail");
			BasePage.onFailreMeassage(ex.getMessage(),"ExplorationAdd2RelationFail","Module - EXPLORATION , Description of the test executed : 2 relation cards not added to the exploration");
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("ExplorationAdd2RelationFail");
			BasePage.onFailreMeassage(ex.getMessage(),"ExplorationAdd2RelationFail","Module - EXPLORATION , Description of the test executed : 2 relation cards not added to the exploration");
			}	
	}

	@Test(priority = 13, description = "Create And Delete An Exploration")
	public void CreateAndDeleteExploration_Test() throws Throwable  {
		try {
			String successMessage = "Created And Deleted An Exploration Successfully";
		

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] expParameters =value.split(",");
			String ExpName = expParameters[0].trim()+dtText;
			String entity = expParameters[1].trim();
			String searchText = expParameters[2].trim();

			/* Create And Delete An Exploration */
			objExplorationPage.createAndDeleteExploration(ExpName,entity,searchText);
			Thread.sleep(3000);
			BasePage.screenshotOnPass("Created And Deleted An Exploration Successfully");
		    BasePage.onSuccessMeassage(successMessage, "Created And Deleted An Exploration Successfully","Module - EXPLORATION , Description of the test executed : Created And Deleted An Exploration Successfully"); 

			
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("CreateAndDeleteExplorationFail");
			BasePage.onFailreMeassage(ex.getMessage(),"CreateAndDeleteExplorationFail","Module - EXPLORATION , Description of the test executed : Created And Deleted An Exploration - failed");
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("CreateAndDeleteExplorationFail");
			BasePage.onFailreMeassage(ex.getMessage(),"CreateAndDeleteExplorationFail","Module - EXPLORATION , Description of the test executed : Created And Deleted An Exploration - failed");
			}	
	}

	@Test(priority = 14, description = "Create And Share An Exploration")
	public void CreateAndShareExploration_Test() throws Throwable  {
		try {
			String successMessage = "Created And Shared An Exploration Successfullyy";
		

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] expParameters =value.split(",");
			String ExpName = expParameters[0].trim()+dtText;
			String entity = expParameters[1].trim();
			String searchText = expParameters[2].trim();
			String mailIDtoShareto = expParameters[3].trim();

			/* Create And Share An Exploration */
			objExplorationPage.createAndShareExploration(ExpName,entity,searchText,mailIDtoShareto);
			//			objExplorationPage.createAndShareExploration("Share Exp1","Disease","kera","mugunth.raman@eaglegenomics.com");
			//onSuccessMeassage("Created And Shared An Exploration Successfully");
			BasePage.screenshotOnPass("Created And Shared An Exploration Successfully");
		    BasePage.onSuccessMeassage(successMessage, "Created And Shared An Exploration Successfully","Module - EXPLORATION , Description of the test executed : Created And Shared An Exploration Successfully"); 

			
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("CreateAndShareExplorationFail");
			BasePage.onFailreMeassage(ex.getMessage(),"CreateAndShareExplorationFail","Module - EXPLORATION , Description of the test executed : Created And Shared An Exploration - failed");
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("CreateAndShareExplorationFail");
			BasePage.onFailreMeassage(ex.getMessage(),"CreateAndShareExplorationFail","Module - EXPLORATION , Description of the test executed : Created And Shared An Exploration - failed");
			}	
	}

	@Test(priority = 15, description = "Delete An Exploration")
	public void DeleteExploration_Test() throws Throwable  {
		try {
			String successMessage = "Deleted An Exploration Successfully";
		

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] expParameters =value.split(",");
			String ExpName = expParameters[0].trim();

			/* Delete An Exploration */
			objExplorationPage.DeleteExploration(ExpName);
			//			objExplorationPage.DeleteExploration("ExpAddFromSet");
			//onSuccessMeassage("Deleted An Exploration Successfully");
			BasePage.screenshotOnPass("Deleted An Exploration Successfully");
		    BasePage.onSuccessMeassage(successMessage, "Deleted An Exploration Successfully","Module - EXPLORATION , Description of the test executed : Deleted An Exploration Successfully"); 

			
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("DeleteExplorationFail");
			BasePage.onFailreMeassage(ex.getMessage(),"DeleteExplorationFail","Module - EXPLORATION , Description of the test executed : Exploration not deleted");
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("DeleteExplorationFail");
			BasePage.onFailreMeassage(ex.getMessage(),"DeleteExplorationFail","Module - EXPLORATION , Description of the test executed : Exploration not deleted");
			}	
	}

	@Test(priority = 16, description = "Sharing An Exploration")
	public void ShareExploration_Test() throws Throwable  {
		try {

			String successMessage = "Shared An Exploration Successfully";
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] expParameters =value.split(",");
			String ExpName = expParameters[0].trim();
			String mailIDtoShareto = expParameters[1].trim();

			/* Share An Exploration */
			objExplorationPage.ShareExploration(ExpName,mailIDtoShareto);
			//			objExplorationPage.ShareExploration("ExSearch 1","mugunth.raman@eaglegenomics.com");
			//onSuccessMeassage("Shared An Exploration Successfully");
			BasePage.screenshotOnPass("Shared An Exploration Successfully");
		    BasePage.onSuccessMeassage(successMessage, "Shared An Exploration Successfully","Module - EXPLORATION , Description of the test executed : Shared An Exploration Successfully"); 

			
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("ShareExplorationFail");
			BasePage.onFailreMeassage(ex.getMessage(),"ShareExplorationFail","Module - EXPLORATION , Description of the test executed : Sharing An Exploration UnSuccessfull");
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("ShareExplorationFail");
			BasePage.onFailreMeassage(ex.getMessage(),"ShareExplorationFail","Module - EXPLORATION , Description of the test executed : Sharing An Exploration UnSuccessfull");
			}	
	}

	@Test(priority = 17, description = "Remove items from Exploration Expand")
	public void RemoveItemsfromExploration_Test() throws Throwable  {
		try {

			String successMessage = "Items removed successfully in Exploration Expand";
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] expParameters =value.split(",");
			String ExpName = expParameters[0].trim()+dtText;
			String entity = expParameters[1].trim();
			String searchText = expParameters[2].trim();
			String removeItems1 = expParameters[3].trim();
			String removeItems2 = expParameters[4].trim();
			String removeItems3 = expParameters[5].trim();

			/* Remove items in Expanded Set */
			objExplorationPage.RemoveItemsfromExploration(ExpName,entity,searchText,removeItems1,removeItems2,removeItems3);
			//			objExplorationPage.RemoveItemsfromExploration("Remove Item Exploration","RNA","asb","AL160411.1","AC060814.4","AL022100.1");
			//onSuccessMeassage("Items removed successfully in Exploration Expand");
			BasePage.screenshotOnPass("Items removed successfully in Exploration Expand");
		    BasePage.onSuccessMeassage(successMessage, "Items removed successfully in Exploration Expand","Module - EXPLORATION , Description of the test executed : Items removed successfully in Exploration Expand"); 

			
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("ExplorationItemsRemoveFail");
			BasePage.onFailreMeassage(ex.getMessage(),"ExplorationItemsRemoveFail","Module - EXPLORATION , Description of the test executed : Failed : Removing items from exploration after expanding it");
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("ExplorationItemsRemoveFail");
			BasePage.onFailreMeassage(ex.getMessage(),"ExplorationItemsRemoveFail","Module - EXPLORATION , Description of the test executed : Failed: Removing items from exploration after expanding it");
			}	
	}

	@Test(priority = 18, description = "Sorting a column in an Exploration")
	public void SortColumnExploration_Test() throws Throwable  {
		try {

			String successMessage = "Column in Exploration Sorted Successfully";
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] expParameters =value.split(",");
			String ExpName = expParameters[0].trim()+dtText;
			String entity = expParameters[1].trim();
			String searchText = expParameters[2].trim();
			String sortColumn = expParameters[3].trim();

			/* Sorting column in a Exploration */
			objExplorationPage.SortColumnInExploration(ExpName, entity, searchText,sortColumn);
			//			objExplorationPage.SortColumnInExploration("SortExploration", "Disease", "Kera", "EFO Name");
			//onSuccessMeassage("Column in Exploration Sorted Successfully");
			BasePage.screenshotOnPass("Column in Exploration Sorted Successfully");
		    BasePage.onSuccessMeassage(successMessage, "Column in Exploration Sorted Successfully","Module - EXPLORATION , Description of the test executed : Column in Exploration Sorted Successfully"); 

			
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("SortColumnExplorationFail");
			BasePage.onFailreMeassage(ex.getMessage(),"SortColumnExplorationFail","Module - EXPLORATION , Description of the test executed : Column in Exploration Sorted - failed");
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("SortColumnExplorationFail");
			BasePage.onFailreMeassage(ex.getMessage(),"SortColumnExplorationFail","Module - EXPLORATION , Description of the test executed : Column in Exploration Sorted - failed");
			}	
	}

	@Test(priority = 19, description = "Filtering an Exploration with one filter")
	public void FilterExploration_Test() throws Throwable  {
		try {

			String successMessage = "Filtering done in Exploration Successfully for 1 filter";
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] expParameters =value.split(",");
			String ExpName = expParameters[0].trim()+dtText;
			String entity = expParameters[1].trim();
			String searchText = expParameters[2].trim();
			String filterAttribute = expParameters[3].trim();
			String filterType = expParameters[4].trim();
			String filterValue = expParameters[5].trim();

			/* Filtering in an Exploration */
			objExplorationPage.FilterExploration(ExpName,entity,searchText,filterAttribute,filterType,filterValue);
			//			objExplorationPage.FilterExploration("Filter Exploration1","Disease","kera", "EFO Name","contains","vul");
			//onSuccessMeassage("Filtering done in Exploration Successfully for 1 filter");
			BasePage.screenshotOnPass("Filtering done in Exploration Successfully for 1 filter");
		    BasePage.onSuccessMeassage(successMessage, "Filtering done in Exploration Successfully for 1 filter","Module - EXPLORATION , Description of the test executed : Filtering done in Exploration Successfully for 1 filter"); 

			
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("FilterExplorationFail");
			BasePage.onFailreMeassage(ex.getMessage(),"FilterExplorationFail","Module - EXPLORATION , Description of the test executed : Filtering done in Exploration UnSuccessfull for 1 filter");
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("FilterExplorationFail");
			BasePage.onFailreMeassage(ex.getMessage(),"FilterExplorationFail","Module - EXPLORATION , Description of the test executed : Filtering done in Exploration UnSuccessfull for 1 filter");
			}	
	}

	@Test(priority = 20, description = "Filtering an Exploration with 2 filters")
	public void FilterMultiExploration_Test() throws Throwable  {
		try {

			String successMessage = "Filtering done in Exploration Successfully for multiple filters";
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] expParameters =value.split(",");
			String ExpName = expParameters[0].trim()+dtText;
			String entity = expParameters[1].trim();
			String searchText = expParameters[2].trim();
			String filterAttribute1 = expParameters[3].trim();
			String filterType1 = expParameters[4].trim();
			String filterValue1 = expParameters[5].trim();
			String filterAttribute2 = expParameters[6].trim();
			String filterType2 = expParameters[7].trim();
			String filterValue2 = expParameters[8].trim();

			/* Filtering in an Exploration with multiple filter */
			objExplorationPage.FilterExplorationMulti(ExpName,entity,searchText,filterAttribute1,filterType1,filterValue1, filterAttribute2,filterType2,filterValue2);
			//			objExplorationPage.FilterExplorationMulti("Filter Exploration Multi 1","Disease","kera", "EFO Name","contains","vul", "EFO ID", "equals","EFO_1000778");
			//onSuccessMeassage("Filtering done in Exploration Successfully for multiple filters");
			BasePage.screenshotOnPass("FilterExplorationMulltiPass");
		    BasePage.onSuccessMeassage(successMessage, "FilterExplorationMulltiPass","Module - EXPLORATION , Description of the test executed : Filtering done in Exploration Successfully for multiple filters"); 

			
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("FilterExplorationMulltiFail");
			BasePage.onFailreMeassage(ex.getMessage(),"FilterExplorationMulltiFail","Module - EXPLORATION , Description of the test executed : Filtering not done in Exploration for multiple filters");
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("FilterExplorationMulltiFail");
			BasePage.onFailreMeassage(ex.getMessage(),"FilterExplorationMulltiFail","Module - EXPLORATION , Description of the test executed : Filtering not done in Exploration for multiple filters");
			}	
	}




}	   
