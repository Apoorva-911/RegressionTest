package com.eagle.TestCases;

import java.awt.AWTException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import com.eagle.Reports.ExtentTestManager;
import com.eagle.pages.BasePage;
import com.eagle.pages.SetPage;
import com.eagle.pages.BasePage;

public class SetRegression extends BaseTestRegression{

	//	LoginPage objLogin;
	SetPage objSetPage; 

	Date dt = new Date();
	DateFormat dtFrmt = new SimpleDateFormat("_HHmmss");
	String dtText = dtFrmt.format(dt);


	@BeforeClass
	public void beforeClass() throws InterruptedException, IOException, AWTException  {	
		objSetPage = new SetPage();	
		//		objLogin = new LoginPage();
		//		objLogin.loginTo();
	}

	//	public void main() throws InterruptedException, IOException  {	
	//		objSetPage = new SetPage();	
	//		objLogin = new LoginPage();
	//		objLogin.loginTo();
	//		objSetPage.RemoveItemsfromSet("Remove Item Set","Disease","Kera");
	//	}

/*	@Test(priority = 0, description = "Create Set")
	public void CreateSet_Test() throws Throwable {
		try {

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String searchText = setParameters[2].trim();

		
			objSetPage.createSet(setName,entity,searchText);	
			//			objSetPage.createSet("Create Set1","Disease","kera");	
			//onSuccessMeassage("Set is successfully created");
			BasePage.screenshotOnPass("setCreated");
		    BasePage.onSuccessMeassage("Set is created", "setCreated", "Module - SET , Description of the test executed : Creation of set is successful");
    	
		
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("createSetFail");
			BasePage.onFailreMeassage(ex.getMessage(),"createSetFail","Module - SET , Description of the test executed : Creation of set is successful");
			
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("createSetFail");
			BasePage.onFailreMeassage(ex.getMessage(),"createSetFail","Module - SET , Description of the test executed : Creation of set is successful");
			
		}
	}

	@Test(priority = 1, description = "View Set")
	public void ViewSet_Test() throws InterruptedException, IOException  {
		try {

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;

		
			objSetPage.viewSet(setName);
			//			objSetPage.viewSet("Share Set1");
			//onSuccessMeassage("Set is successfully opened");
			BasePage.screenshotOnPass("setOpened");
		    BasePage.onSuccessMeassage("Set is opened", "setOpened", "Module - SET , Description of the test executed : Able to view set");
    
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("viewSetFail");
			BasePage.onFailreMeassage(ex.getMessage(),"viewSetFail","Module - SET , Description of the test executed : Not Able to view set");
			
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("viewSetFail");
			BasePage.onFailreMeassage(ex.getMessage(),"viewSetFail","Module - SET , Description of the test executed : Not Able to view set");
			
		}
	} 

@Test(priority = 2, description = "Create Set From File")
	public void CreateSetFromFile_Test() throws Throwable  {
		try {

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String fileLocation = setParameters[2].trim();

			
			objSetPage.CreateSetFromFile(setName,entity,fileLocation);
			//			objSetPage.CreateSetFromFile("Set From File 1","Disease", "C:\\Users\\MugunthRaman\\git\\EagleAutomation\\Resources\\Q4 - Upload file - 1 (2).xlsx");
			//onSuccessMeassage("Set is successfully Created from File");
			BasePage.screenshotOnPass("setCreatedFromFile");
			BasePage.onSuccessMeassage("Set is created from file", "setCreatedFromFile", "Module - SET , Description of the test executed : Create Set From File");
		     
		}
		catch(Exception ecf)
		{
			BasePage.captureScreenshot("createSetFromFileFail");
			BasePage.onFailreMeassage(ecf.getMessage(),"createSetFromFileFail","Module - SET , Description of the test executed : Set created successfully from file");
			
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("createSetFromFileFail");
			BasePage.onFailreMeassage(ex.getMessage(),"createSetFromFileFail","Module - SET , Description of the test executed : Set created successfully from file");
			
		}
	} 

	@Test(priority = 3, description = "Create Set From Another Set")
	public void CreateSetFromSet_Test() throws Throwable  {
		try {

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String BasesetName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String searchText = setParameters[2].trim();
			String setToBeCreated = setParameters[3].trim()+dtText;

	
			objSetPage.CreateSetFromSet(BasesetName,entity,searchText,setToBeCreated); 
			//			objSetPage.CreateSetFromSet("Base Set 1","Disease","Kera","Set From Set 1"); 
			//onSuccessMeassage("Set is successfully Created from Another Set");
			BasePage.screenshotOnPass("setCreatedFromOtherSet");
		    BasePage.onSuccessMeassage("Set is created from other set", "setCreatedFromOtherSet", "Module - SET , Description of the test executed : Set created successfully from other set");
    
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("createSetFromSetFail");
			BasePage.onFailreMeassage(ex.getMessage(),"createSetFromSetFail","Module - SET , Description of the test executed : Set created successfully from other set");
			
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("createSetFromSetFail");
			BasePage.onFailreMeassage(ex.getMessage(),"createSetFromSetFail","Module - SET , Description of the test executed : Set created successfully from other set");
			
		}
	}

	@Test(priority = 4, description = "Search A Text In Set Expand")
	public void SearchInSetExpand_Test() throws Throwable  {
		try {

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String searchText = setParameters[2].trim();
			String searchTextInExpand = setParameters[3].trim();


		
			objSetPage.searchInSetExpand(setName,entity,searchText,searchTextInExpand);
			//			objSetPage.searchInSetExpand("Search Set 1","Disease","Kera","le");
			//onSuccessMeassage("Search successful in Set Expand");
			BasePage.screenshotOnPass("Search successful in Set Expand");
		    BasePage.onSuccessMeassage("Search successful in Set Expand", "Search successful in Set Expand", "Module - SET , Description of the test executed : Search is successful in set in expanded mode");
    
		}
		catch(Exception es)
		{
			BasePage.captureScreenshot("SearchInSetExpandFail");
			BasePage.onFailreMeassage(es.getMessage(),"SearchInSetExpandFail","Module - SET , Description of the test executed : Search failed in set in expanded mode");
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("SearchInSetExpandFail");
			BasePage.onFailreMeassage(ex.getMessage(),"SearchInSetExpandFail","Module - SET , Description of the test executed : Search failed in set in expanded mode");
		}
	}

	@Test(priority = 5, description = "Set - Expand and add items from Catalog")
	public void SetExpandAddFromCatalog_Test() throws Throwable  {
		try {

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String searchText = setParameters[2].trim();
			String searchTextInCatalog = setParameters[3].trim();

			
			objSetPage.ExpandAddFromCatalog(setName,entity,searchText,searchTextInCatalog);
			//			objSetPage.ExpandAddFromCatalog("Set From Catalog 1","Disease","Kera","migraine");
			objSetPage.saveChanges();
			//onSuccessMeassage("Items Added from Catalog into Set successfully");
			BasePage.screenshotOnPass("Items Added from Catalog into Set successfully");
		    BasePage.onSuccessMeassage("Items Added from Catalog into Set successfully", "Items Added from Catalog into Set successfully", "Module - SET , Description of the test executed : Items Added from Catalog into Set successfully");
    
			
		}
		catch(Exception ex)
		{
			BasePage.scrollToTop();
			BasePage.captureScreenshot("SetExpandAddFromCatalogFail");
			BasePage.onFailreMeassage(ex.getMessage(),"SetExpandAddFromCatalogFail","Module - SET , Description of the test executed : Items Not Added from Catalog into Set");
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("SetExpandAddFromCatalogFail");
			BasePage.onFailreMeassage(ex.getMessage(),"SetExpandAddFromCatalogFail","Module - SET , Description of the test executed : Items Not Added from Catalog into Set");
		}
	}

	@Test(priority = 6, description = "Set - Expand and add items from Set")
	public void SetExpandAddFromSet_Test() throws Throwable  {
		try {

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String BasesetName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String searchTextBase = setParameters[2].trim();
			String setToBeCreated = setParameters[3].trim()+dtText;
			String searchTextSet = setParameters[4].trim();


			objSetPage.ExpandAddFromSet(BasesetName,entity,searchTextBase,setToBeCreated, searchTextSet);
			//			objSetPage.ExpandAddFromSet("Base Set 2","Disease","leukocytes","Set Add Set expand 1", "Kera");
			objSetPage.saveChanges();
			//onSuccessMeassage("Items Added from Set into another Set successfully");
			BasePage.screenshotOnPass("Items Added from Set into another Set successfully");
		    BasePage.onSuccessMeassage("Items Added from Set into another Set successfully", "Items Added from Set into another Set successfully", "Module - SET , Description of the test executed : Items Added from Set into another Set successfully");
    
			
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("SetExpandAddFromSetFail");
			BasePage.onFailreMeassage(ex.getMessage(),"SetExpandAddFromSetFail","Module - SET , Description of the test executed : Items not Added from Set into another Set");
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("SetExpandAddFromSetFail");
			BasePage.onFailreMeassage(ex.getMessage(),"SetExpandAddFromSetFail","Module - SET , Description of the test executed : Items not Added from Set into another Set");
		}
	}

	@Test(priority = 7, description = "Set - Expand and add items from File")
	public void SetExpandAddFromFile_Test() throws Throwable  {
		try {

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String searchText = setParameters[2].trim();
			String fileUploadEntity = setParameters[3].trim();
			String fileLocation = setParameters[4].trim();
			String fileName = setParameters[5].trim();

	
			objSetPage.ExpandAddFromFile(setName,entity,searchText,fileUploadEntity,fileLocation,fileName);
			//			objSetPage.ExpandAddFromFile("ESFile 1","Disease","kera","Disease", "C:\\Users\\MugunthRaman\\git\\EagleAutomation\\Resources\\Q4 - Upload file - 1 (2).xlsx", "Q4 - Upload file - 1 (2).xlsx");
			objSetPage.saveChanges();
			//onSuccessMeassage("Items Added from File into Set successfully");
			BasePage.screenshotOnPass("Items Added from File into Set successfully");
		    BasePage.onSuccessMeassage("Items Added from File into Set successfully", "Items Added from File into Set successfully", "Module - SET , Description of the test executed : Items Added from File into Set successfully");
    
			
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("SetExpandAddFromFileFail");
			BasePage.onFailreMeassage(ex.getMessage(),"SetExpandAddFromFileFail","Module - SET , Description of the test executed : Items not Added from File into Set successfully");
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("SetExpandAddFromFileFail");
			BasePage.onFailreMeassage(ex.getMessage(),"SetExpandAddFromFileFail","Module - SET , Description of the test executed : Items not Added from File into Set successfully");
		}
	}

	@Test(priority = 8, description = "Delete Card in Set Expand")
	public void DeleteCardInSetExpand_Test() throws Throwable  {
		try {

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String searchText = setParameters[2].trim();

	
			objSetPage.DeleteCardInExpand(setName,entity,searchText);
			//			objSetPage.DeleteCardInExpand("DeleteCard 1","Disease","kera");
			//onSuccessMeassage("Delete Card from Expanded Set");
			BasePage.screenshotOnPass("Delete Card from Expanded Set");
		    BasePage.onSuccessMeassage("Delete Card from Expanded Set", "Delete Card from Expanded Set", "Module - SET , Description of the test executed : Deleted Card from Expanded Set");
    
			
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("DeleteSetInExpandFail");
			BasePage.onFailreMeassage(ex.getMessage(),"DeleteSetInExpandFail","Could not Delete Card from Expanded Set");
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("DeleteSetInExpandFail");
			BasePage.onFailreMeassage(ex.getMessage(),"DeleteSetInExpandFail","Could not Delete Card from Expanded Set");
		}
	} 

	@Test(priority = 9, description = "Remove items from Set Expand")
	public void RemoveItemsfromSet_Test() throws Throwable  {
		try {

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String searchText = setParameters[2].trim();
			String removeItem1 = setParameters[3].trim();
			String removeItem2 = setParameters[4].trim();
			String removeItem3 = setParameters[5].trim();

	
			objSetPage.RemoveItemsfromSet(setName,entity,searchText,removeItem1,removeItem2,removeItem3);
		
			Thread.sleep(3000);
			BasePage.screenshotOnPass("Items removed successfully in Set Expand");
		    BasePage.onSuccessMeassage("Items removed successfully in Set Expand", "Items removed successfully in Set Expand", "Module - SET , Description of the test executed : Items removed successfully in Set Expand");
    
			
		}
		catch(Exception | AssertionError ex)
		{
			BasePage.captureScreenshot("SetItemsRemoveFail");
			BasePage.onFailreMeassage(ex.getMessage(),"SetItemsRemoveFail", "Items not removed successfully in Set Expand");
		}
	}

	@Test(priority = 10, description = "Modify Grid Settings in Set Expand")
	public void GridChangesInSet_Test() throws Throwable  {
		try {

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String searchText = setParameters[2].trim();
			String gridNoOfRows = setParameters[3].trim();
			String gridPrimaryColumn = setParameters[4].trim();
			String gridSecondaryColumn = setParameters[5].trim();

		
			objSetPage.GridChanges(setName, entity, searchText, gridNoOfRows, gridPrimaryColumn, gridSecondaryColumn);
			//			objSetPage.GridChanges("GridSet", "Disease", "Kera", "10", "Definition", "Identifier");
			//onSuccessMeassage("Grid Settings are Modified Successfully in Set Expand");
			BasePage.screenshotOnPass("Grid Settings are Modified Successfully in Set Expand");
		    BasePage.onSuccessMeassage("Grid Settings are Modified Successfully in Set Expand", "Grid Settings are Modified Successfully in Set Expand", "Module - SET , Description of the test executed : Grid Settings are Modified Successfully in Set Expand");
    
			
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("GridChangesInSetFail");
			BasePage.onFailreMeassage(ex.getMessage(),"GridChangesInSetFail","Module - SET , Description of the test executed : Grid Settings are not Modified Successfully in Set Expand");
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("GridChangesInSetFail");
			BasePage.onFailreMeassage(ex.getMessage(),"GridChangesInSetFail","Module - SET , Description of the test executed : Grid Settings are not Modified Successfully in Set Expand");
		}
	}

	@Test(priority = 11, description = "Create And Delete A Set")
	public void CreateAndDeleteSet_Test() throws Throwable  {
		try {

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String searchText = setParameters[2].trim();


	
			objSetPage.createAndDeleteSet(setName,entity,searchText);
			//			objSetPage.createAndDeleteSet("Delete Set1","Disease","kera");
			//onSuccessMeassage("Created And Deleted A Set Successfully");
			BasePage.screenshotOnPass("Created And Deleted A Set Successfully");
		    BasePage.onSuccessMeassage("Created And Deleted A Set Successfully", "Created And Deleted A Set Successfully", "Module - SET , Description of the test executed : Created And Deleted A Set Successfully");
    
			
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("CreateAndDeleteSetFail");
			BasePage.onFailreMeassage(ex.getMessage(),"CreateAndDeleteSetFail","Module - SET , Description of the test executed : Not able to create and delete set");
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("CreateAndDeleteSetFail");
			BasePage.onFailreMeassage(ex.getMessage(),"CreateAndDeleteSetFail","Module - SET , Description of the test executed : Not able to create and delete set");
		}
	}

	@Test(priority = 12, description = "Create And Share A Set")
	public void CreateAndShareSet_Test() throws Throwable  {
		try {

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String searchText = setParameters[2].trim();
			String mailIDtoShare = setParameters[3].trim();

		
			objSetPage.createAndShareSet(setName,entity,searchText,mailIDtoShare);
			//			objSetPage.createAndShareSet("Share Set1","Disease","kera","mugunth.raman@eaglegenomics.com");
			//onSuccessMeassage("Created And Shared A Set Successfully");
			BasePage.screenshotOnPass("Created And Shared A Set Successfully");
		    BasePage.onSuccessMeassage("Created And Shared A Set Successfully", "Created And Shared A Set Successfully", "Module - SET , Description of the test executed : Created And Shared A Set Successfully");
    
			
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("CreateAndShareSetFail");
			BasePage.onFailreMeassage(ex.getMessage(),"CreateAndShareSetFail","Module - SET , Description of the test executed : Not able to create and share set");
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("CreateAndShareSetFail");
			BasePage.onFailreMeassage(ex.getMessage(),"CreateAndShareSetFail","Module - SET , Description of the test executed : Not able to create and share set");
		}
	}

	@Test(priority = 13, description = "Deleting A Set")
	public void DeleteSet_Test() throws InterruptedException, IOException  {
		try {

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setNameToDelete = setParameters[0].trim();


			objSetPage.DeleteSet(setNameToDelete);
			//			objSetPage.DeleteSet("Create Set1");
			//onSuccessMeassage("Deleted A Set Successfully");
			BasePage.screenshotOnPass("Deleted A Set Successfully");
		    BasePage.onSuccessMeassage("Deleted A Set Successfully", "Deleted A Set Successfully", "Module - SET , Description of the test executed : Deleted A Set Successfully");
    
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("DeleteSetFail");
			BasePage.onFailreMeassage(ex.getMessage(),"DeleteSetFail","Module - SET , Description of the test executed : not able to Delete A Set");
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("DeleteSetFail");
			BasePage.onFailreMeassage(ex.getMessage(),"DeleteSetFail","Module - SET , Description of the test executed : not able to Delet A Set");
		}
	}

	@Test(priority = 14, description = "Sharing A Set")
	public void ShareSet_Test() throws Throwable  {
		try {

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setNameToShare = setParameters[0].trim();
			String mailIDtoShare = setParameters[1].trim();

	
			objSetPage.ShareSet(setNameToShare,mailIDtoShare);
			//			objSetPage.ShareSet("GridSet","mugunth.raman@eaglegenomics.com");
			//onSuccessMeassage("Shared A Set Successfully");
			BasePage.screenshotOnPass("ShareSetPass");
		    BasePage.onSuccessMeassage("ShareSetPass", "ShareSetPass", "Module - SET , Description of the test executed : Deleted A Set Successfully");
    
			
		}
		catch(Exception | AssertionError ex)
		{
			BasePage.captureScreenshot("ShareSetFail");
			BasePage.onFailreMeassage(ex.getMessage(),"ShareSetFail","Module - SET , Description of the test executed : Not Deleted A Set Successfully");
		    
		}
	}


	@Test(priority = 15, description = "Sorting a column in a Set")
	public void SortColumnSet_Test() throws Throwable  {
		try {

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String searchText = setParameters[2].trim();
			String sortColumn = setParameters[3].trim();

			
			objSetPage.SortColumnInSet(setName,entity,searchText,sortColumn);
			//			objSetPage.SortColumnInSet("SortSet", "Disease", "pero", "EFO Name");
			//onSuccessMeassage("Column in Set Sorted Successfully");
			BasePage.screenshotOnPass("Column in Set Sorted Successfully");
		    BasePage.onSuccessMeassage("Column in Set Sorted Successfully", "Column in Set Sorted Successfully", "Module - SET , Description of the test executed : Column in Set Sorted Successfully");
    
			
		}
		catch(Throwable ex)
		{
			BasePage.captureScreenshot("SortColumnSetFail");
			BasePage.onFailreMeassage(ex.getMessage(),"SortColumnSetFail","Module - SET , Description of the test executed : Column in Set not Sorted Successfully");
		}
	}


	@Test(priority = 16, description = "Filtering a set with one filter")
	public void FilterSet_Test() throws Throwable  {
		try {

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String searchText = setParameters[2].trim();
			String filterAttribute = setParameters[3].trim();
			String filterType = setParameters[4].trim();
			String filterValue = setParameters[5].trim();


			objSetPage.FilterSet(setName,entity,searchText, filterAttribute,filterType,filterValue);
			//			objSetPage.FilterSet("Filter Set1","Disease","kera", "EFO Name","contains","vul");
			//onSuccessMeassage("Filtering done in Set Successfully for 1 filter");
			BasePage.screenshotOnPass("Filtering done in Set Successfully for 1 filter");
		    BasePage.onSuccessMeassage("Filtering done in Set Successfully for 1 filter", "Filtering done in Set Successfully for 1 filter", "Module - SET , Description of the test executed : Filtering done in Set Successfully for 1 filter");
    
			
		}
		catch(Throwable ex)
		{
			BasePage.captureScreenshot("FilterSetFail");
			BasePage.onFailreMeassage(ex.getMessage(),"FilterSetFail","Module - SET , Description of the test executed : Filtering done in Set Successfully for 1 filter");

		}
	}

	@Test(priority = 17, description = "Filtering a set with 2 filters")
	public void FilterMultiSet_Test() throws Throwable  {
		try {

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String searchText = setParameters[2].trim();
			String filterAttribute1 = setParameters[3].trim();
			String filterType1 = setParameters[4].trim();
			String filterValue1 = setParameters[5].trim();
			String filterAttribute2 = setParameters[6].trim();
			String filterType2 = setParameters[7].trim();
			String filterValue2 = setParameters[8].trim();

	
			objSetPage.FilterSetMulti(setName,entity,searchText, filterAttribute1,filterType1,filterValue1, filterAttribute2, filterType2,filterValue2);
			//			objSetPage.FilterSetMulti("Filter Set Multi 1","Disease","kera", "EFO Name","contains","vul", "EFO ID", "equals","EFO_1000778");
			//onSuccessMeassage("Filtering done in Set Successfully for multiple filters");
			BasePage.screenshotOnPass("FilterSetMulltiPass");
		    BasePage.onSuccessMeassage("Filtering done in Set Successfully for multiple filters", "FilterSetMulltiPass", "Module - SET , Description of the test executed : Filtering done in Set Successfully for multiple filters");
    
			
		}
		catch(Throwable ex)
		{
			BasePage.captureScreenshot("FilterSetMulltiFail");
			BasePage.onFailreMeassage(ex.getMessage(),"FilterSetMulltiFail","Module - SET , Description of the test executed : Filtering done in Set Successfully for multiple filters");
		}
	}

	
	@Test(priority = 18, description = "Verify features of a set")
	public void VerifyFeaturesInSet_Test() throws Throwable 
	{
		try 
		{

		
			objSetPage.VerifyFeaturesInSet();
			
			Thread.sleep(5000);
			

			BasePage.screenshotOnPass("FeaturesInSetPass");
		    BasePage.onSuccessMeassage("FeaturesInSetPass", "FeaturesInSetPass", "Module - SET , Description of the test executed : Verify features of a set");
    	
		
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("FeaturesInSetFail");
			BasePage.onFailreMeassage(ex.getMessage(),"FeaturesInSetFail","Module - SET , Description of the test executed : Verify features of a set");
			
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("FeaturesInSetFail");
			BasePage.onFailreMeassage(ex.getMessage(),"FeaturesInSetFail","Module - SET , Description of the test executed : Verify features of a set");
			
		}
	}  
	
	
	
	
	
	
	@Test(priority = 19, description = "Verify_Deleted_Set_Is_Not_Listed")
	public void Verify_Deleted_Set_Is_Not_Listed_Test() throws Throwable 
	{
			
			
			objSetPage.myDataBtnSet.click();
			Thread.sleep(10000);
			objSetPage.mouseHoverSet();
			Thread.sleep(5000);
		
		//	WebElement setName = null;
		//	try {
				
		//		for(WebElement element : objSetPage.AllSets)
		//		{
		//			setName=element;
		//			break;
		//		}
				
				
		//		String firstSetName = setName.getText();
				
		//		objSetPage.DeleteSet(firstSetName);
		//	    Thread.sleep(3000);
			    
			    
		//	    objSetPage.openItemFromList_Set(firstSetName); 
			
			
			
			try
			{
				
				String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

				System.out.println(functionName);
				String value = this.getConfiguration().get(functionName);
				String[] setParameters =value.split(",");
				String setName = setParameters[0].trim()+dtText;
				String entity = setParameters[1].trim();
				String searchText = setParameters[2].trim();
				
				objSetPage.Set();
				Thread.sleep(2000);
				objSetPage.addSet();
				objSetPage.verifyEntityType("Uncategorized");
				objSetPage.setTitle(setName);
				objSetPage.selectEntity(entity);
				objSetPage.searchItems(searchText); 
				Thread.sleep(2000);
				objSetPage.AddandAccept(); 	
				BasePage.waitforAnElement(objSetPage.editCardIcon);
				ExtentTestManager.getTest().log(Status.PASS, "Set "+ setName +" is Created");
				objSetPage.createCheck(setName);
			
			
				objSetPage.DeleteSet(setName);
			    Thread.sleep(3000);
			    
			    
			    objSetPage.openItemFromList_Set(setName); 
			
			
			
			
			    Thread.sleep(3000);
			
                BasePage.screenshotOnPass("DeletedSetNotPresentPass");
			    BasePage.onSuccessMeassage("DeletedSetNotPresentPass", "DeletedSetNotPresentPass", "Module - SET , Description of the test executed : Verify_Deleted_Set_Is_Not_Listed");
	    	
			
		
		}
		
		catch(Exception ex)
		{
			BasePage.captureScreenshot("DeletedSetNotPresentFail");
			BasePage.onFailreMeassage(ex.getMessage(),"DeletedSetNotPresentFail","Module - SET , Description of the test executed : Verify_Deleted_Set_Is_Not_Listed");
			
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("DeletedSetNotPresentFail");
			BasePage.onFailreMeassage(ex.getMessage(),"DeletedSetNotPresentFail","Module - SET , Description of the test executed : Verify_Deleted_Set_Is_Not_Listed");
			
		}

	
	
	} 
	
	
	
	@Test(priority = 20, description = "Verify set with same name is not present")
	public void Set_With_Same_Name_Not_Present_Test() throws Throwable 
	{
			
			//WebElement firstListedSet = null;
			objSetPage.myDataBtnSet.click();
			Thread.sleep(10000);
			objSetPage.mouseHoverSet();
			Thread.sleep(5000);

		try
		{
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String searchText = setParameters[2].trim();
			
			objSetPage.Set();
			Thread.sleep(2000);
			objSetPage.addSet();
			objSetPage.verifyEntityType("Uncategorized");
			objSetPage.setTitle(setName);
			objSetPage.selectEntity(entity);
			objSetPage.searchItems(searchText); 
			Thread.sleep(2000);
			objSetPage.AddandAccept(); 	
			BasePage.waitforAnElement(objSetPage.editCardIcon);
			ExtentTestManager.getTest().log(Status.PASS, "Set "+ setName +" is Created");
			objSetPage.createCheck(setName);
			
			Thread.sleep(5000);
			
			//creates second set with same name
			objSetPage.Set();
			objSetPage.addSet();
			objSetPage.setTitle(setName);
			objSetPage.close.click();
			
		
	          
	          
	         //VALIDATION 
	         for (WebElement element : objSetPage.AllSets) {
					if(element.isDisplayed() == false)  {BasePage.scrollIntoView(element);}	    				
					String textFromGrid = element.getText();	    				
					if(setName.equals(textFromGrid))    //this shows duplicacy
					{
						int a = 1;                         //because duplicacy is true, so code is intentionally made to fail
						int b = 0;
						int c;
						c=a/b;
					}
					else
						System.out.println("Duplicate name of set is not present");
					
				} 
	        
	         BasePage.screenshotOnPass("NoDuplicateName");
			 BasePage.onSuccessMeassage("NoDuplicateName", "NoDuplicateName", "Module - SET , Description of the test executed : Verify set with same name is not present");
	    	
			}
		
		catch(Exception ex)
		{
            BasePage.captureScreenshot("DuplicateNamePresent");
			BasePage.onFailreMeassage(ex.getMessage(),"DuplicateNamePresent","Module - SET , Description of the test executed : Verify set with same name is not present");
			
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("DuplicateNamePresent");
			BasePage.onFailreMeassage(ex.getMessage(),"DuplicateNamePresent","Module - SET , Description of the test executed : Verify set with same name is not present");
			
		}

} 
	
	
	@Test(priority = 21, description = "Rename Set Multiple Times")
	public void Rename_Set_Multiple_Times_Test() throws Throwable 
	{
			
			WebElement firstListedSet = null;
			objSetPage.myDataBtnSet.click();
			Thread.sleep(10000);
			objSetPage.mouseHoverSet();
			Thread.sleep(5000);
		try
		{
		
		String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String searchText = setParameters[2].trim();
			
			objSetPage.Set();
			Thread.sleep(2000);
			objSetPage.addSet();
			objSetPage.verifyEntityType("Uncategorized");
			objSetPage.setTitle(setName);
			objSetPage.selectEntity(entity);
			objSetPage.searchItems(searchText); 
			Thread.sleep(2000);
			objSetPage.AddandAccept(); 	
			BasePage.waitforAnElement(objSetPage.editCardIcon);
			ExtentTestManager.getTest().log(Status.PASS, "Set "+ setName +" is Created");
			objSetPage.createCheck(setName);
		
		
		
		
		
		
          for(WebElement element : objSetPage.AllSets)
			{
				firstListedSet=element;
				break;
			}
			
		//	String setName = firstListedSet.getText(); //stores the name of the first listed set
			
			firstListedSet.click(); //opens the same set
			Thread.sleep(5000);
			
			String updatedName = "Updated Name";
			BasePage.enterText(objSetPage.titleSet,updatedName);
			Thread.sleep(3000);
			
		
			//VALIDATION : it checks that the newly renamed set is listed out
			objSetPage.createCheck(updatedName);
			Thread.sleep(3000);
			
	        
	         BasePage.screenshotOnPass("SetRenamePass");
			 BasePage.onSuccessMeassage("SetRenamePass", "SetRenamePass", "Module - SET , Description of the test executed : Rename Set Multiple Times");
	    	
			}
		
		catch(Exception ex)
		{
            BasePage.captureScreenshot("SetRenameFail");
			BasePage.onFailreMeassage(ex.getMessage(),"SetRenameFail","Module - SET , Description of the test executed : Rename Set Multiple Times");
			
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("SetRenameFail");
			BasePage.onFailreMeassage(ex.getMessage(),"SetRenameFail","Module - SET , Description of the test executed : Rename Set Multiple Times");
			
		}

	
	
	} 
	

	
	@Test(priority = 22, description = "Default name")
	public void DefaultName_Test() throws Throwable 
	{
			
			WebElement firstListedSet = null;
			WebElement nowFirstListedSet = null;
			objSetPage.myDataBtnSet.click();
			Thread.sleep(10000);
			objSetPage.mouseHoverSet();
			Thread.sleep(5000);
		try
		{
			
		
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String searchText = setParameters[2].trim();
			
			objSetPage.Set();
			Thread.sleep(2000);
			objSetPage.addSet();
			objSetPage.verifyEntityType("Uncategorized");
			objSetPage.setTitle(setName);
			objSetPage.selectEntity(entity);
			objSetPage.searchItems(searchText); 
			Thread.sleep(2000);
			objSetPage.AddandAccept(); 	
			BasePage.waitforAnElement(objSetPage.editCardIcon);
			ExtentTestManager.getTest().log(Status.PASS, "Set "+ setName +" is Created");
			objSetPage.createCheck(setName);
		
			
          for(WebElement element : objSetPage.AllSets)
			{
				firstListedSet=element;
				break;
			}
			
			
			
			firstListedSet.click(); //opens the same set
			Thread.sleep(5000);
			
			
			BasePage.enterText(objSetPage.titleSet,"");
			Thread.sleep(3000);
			objSetPage.close.click();
			Thread.sleep(5000);
		
			//VALIDATION : it checks that the default name is present
			for(WebElement element : objSetPage.AllSets)
			{
				nowFirstListedSet=element;
				break;
			}
			
			Thread.sleep(5000);
			System.out.println("Default name is : "+nowFirstListedSet.getText());
			
	        
	         BasePage.screenshotOnPass("DefaultNamePass");
			 BasePage.onSuccessMeassage("DefaultNamePass", "DefaultNamePass", "Module - SET , Description of the test executed : Default name");
	    	
			}
		
		catch(Exception ex)
		{
            BasePage.captureScreenshot("DefaultNameFail");
			BasePage.onFailreMeassage(ex.getMessage(),"DefaultNameFail","Module - SET , Description of the test executed : Default name");
			
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("DefaultNameFail");
			BasePage.onFailreMeassage(ex.getMessage(),"DefaultNameFail","Module - SET , Description of the test executed : Default name");
			
		}

	
	
	} 
	
	
	
	@Test(priority = 23, description = "View set from list")
	public void ViewSetFromList_Test() throws Throwable 
	{
			
			WebElement firstListedSet = null;
			objSetPage.myDataBtnSet.click();
			Thread.sleep(10000);
			objSetPage.mouseHoverSet();
			Thread.sleep(5000);
		try
		{
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String searchText = setParameters[2].trim();
			
			objSetPage.Set();
			Thread.sleep(2000);
			objSetPage.addSet();
			objSetPage.verifyEntityType("Uncategorized");
			objSetPage.setTitle(setName);
			objSetPage.selectEntity(entity);
			objSetPage.searchItems(searchText); 
			Thread.sleep(2000);
			objSetPage.AddandAccept(); 	
			BasePage.waitforAnElement(objSetPage.editCardIcon);
			ExtentTestManager.getTest().log(Status.PASS, "Set "+ setName +" is Created");
			objSetPage.createCheck(setName);
			
			
          for(WebElement element : objSetPage.AllSets)
			{
				firstListedSet=element;
				break;
			}
			
			//String setName = firstListedSet.getText(); //stores the name of the first listed set
			
			firstListedSet.click(); //opens the same set
			Thread.sleep(5000);
			
			//VALIDATION : it checks that the chosen set is opened
			if(objSetPage.titleSet.getText().equals(setName))
			System.out.println();
			System.out.println("Chosen set is being viewed");
			System.out.println();
			
			
	         BasePage.screenshotOnPass("ViewSetFromList_Pass");
			 BasePage.onSuccessMeassage("ViewSetFromList_Pass", "ViewSetFromList_Pass", "Module - SET , Description of the test executed : View set from list");
	    	
			}
		
		catch(Exception ex)
		{
            BasePage.captureScreenshot("ViewSetFromList_Fail");
			BasePage.onFailreMeassage(ex.getMessage(),"ViewSetFromList_Fail","Module - SET , Description of the test executed : View set from list");
			
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("ViewSetFromList_Fail");
			BasePage.onFailreMeassage(ex.getMessage(),"ViewSetFromList_Fail","Module - SET , Description of the test executed : View set from list");
			
		}

	
	
	} 
	
	@Test(priority = 24, description = "Features of card")
	public void CardFeatures_Test() throws Throwable 
	{
			
			WebElement firstListedSet = null;
			objSetPage.myDataBtnSet.click();
			Thread.sleep(10000);
			objSetPage.mouseHoverSet();
			Thread.sleep(5000);
		try
		{
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String searchText = setParameters[2].trim();
			
			objSetPage.Set();
			Thread.sleep(2000);
			objSetPage.addSet();
			objSetPage.verifyEntityType("Uncategorized");
			objSetPage.setTitle(setName);
			objSetPage.selectEntity(entity);
			objSetPage.searchItems(searchText); 
			Thread.sleep(2000);
			objSetPage.AddandAccept(); 	
			BasePage.waitforAnElement(objSetPage.editCardIcon);
			ExtentTestManager.getTest().log(Status.PASS, "Set "+ setName +" is Created");
			objSetPage.createCheck(setName);
			
			
			
			
			
          for(WebElement element : objSetPage.AllSets)
			{
				firstListedSet=element;
				break;
			}
			
			
			
			firstListedSet.click(); //opens the same set
			Thread.sleep(5000);
			
			
			//VALIDATION for expand
			if(objSetPage.expand.isDisplayed())
			{
				objSetPage.expand.click();
				Thread.sleep(3000);
				objSetPage.collapse.click();
				System.out.println("Expand on card displayed");
			} 
			
			//VALIDATION for edit
			if(objSetPage.editCardIcon.isDisplayed())
			{
				objSetPage.editCardIcon.click();
				Thread.sleep(3000);
				objSetPage.cancel.click();
				System.out.println("Edit on card displayed");
			} 
			
			
			//VALIDATION for delete card
			if(objSetPage.deleteOptionOnCard.isDisplayed())
			{
				objSetPage.deleteOptionOnCard.click();
				Thread.sleep(3000);
				objSetPage.deletePopUp.click();
				System.out.println("Delete on card displayed");
			} 
			
			
			
			//VALIDATION for presence of filter on card
			if(objSetPage.filterOnCard.isDisplayed())
			{
				objSetPage.filterOnCard.click();
				Thread.sleep(3000);
				System.out.println("Filter on card displayed");
			}
				
			 Thread.sleep(2000);
	         BasePage.screenshotOnPass("CardFeatures_Pass");
			 BasePage.onSuccessMeassage("CardFeatures_Pass", "CardFeatures_Pass", "Module - SET , Description of the test executed : Features of card");
	    	
			}
		
		catch(Exception ex)
		{
            BasePage.captureScreenshot("CardFeatures_Fail");
			BasePage.onFailreMeassage(ex.getMessage(),"CardFeatures_Fail","Module - SET , Description of the test executed : Features of card");
			
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("CardFeatures_Fail");
			BasePage.onFailreMeassage(ex.getMessage(),"CardFeatures_Fail","Module - SET , Description of the test executed : Features of card");
			
		}

	
	
	} 
	
	
	@Test(priority = 25, description = "Click close without accepting items")
	public void CloseWithoutAccept_Test() throws Throwable 
	{
			
		
		objSetPage.myDataBtnSet.click();
		Thread.sleep(10000);
		objSetPage.mouseHoverSet();
		Thread.sleep(5000);
		WebElement firstListedSet = null;
	
		
	try
		
	{
		
		String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

		System.out.println(functionName);
		String value = this.getConfiguration().get(functionName);
		String[] setParameters =value.split(",");
		String setName = setParameters[0].trim()+dtText;
		String entity = setParameters[1].trim();
		String searchText = setParameters[2].trim();
		
		objSetPage.Set();
		Thread.sleep(2000);
		objSetPage.addSet();
		objSetPage.verifyEntityType("Uncategorized");
		objSetPage.setTitle(setName);
		objSetPage.selectEntity(entity);
		objSetPage.searchItems(searchText); 
		Thread.sleep(2000);
		
		
		
		
		BasePage.click(objSetPage.addAll);
		Thread.sleep(3000);
		objSetPage.close.click();
		
		
		
		
		
		
		//objSetPage.Set();
		//objSetPage.addSet();
		//objSetPage.setTitle("MyTestSet");
		//objSetPage.categoryDropDown.click();
		//Thread.sleep(5000);
		//objSetPage.diseaseCategory.click();
		//objSetPage.searchCatalog.click();
		//BasePage.enterText(objSetPage.searchCatalog, "aber");
		
		
		
		
	
	
      for(WebElement element : objSetPage.AllSets)
		{
			firstListedSet=element;
			break;
		}
		
	
      BasePage.click(firstListedSet); //opens the first listed set just created above
	
      
      //VALIDATION:
      if(objSetPage.blankPanel.isDisplayed())
    	  System.out.println("Selection panel is blank, so test passed");
		
      
      Thread.sleep(2000);
      BasePage.screenshotOnPass("CloseWithoutAccept_Pass");
	  BasePage.onSuccessMeassage("CloseWithoutAccept_Pass", "CloseWithoutAccept_Pass", "Module - SET , Description of the test executed : Click close without accepting items");
 	
	}
	
	
	catch(Exception ex)
	{
        BasePage.captureScreenshot("CloseWithoutAccept_Fail");
		BasePage.onFailreMeassage(ex.getMessage(),"CloseWithoutAccept_Fail","Module - SET , Description of the test executed : Click close without accepting items");
		
	}
	catch(AssertionError ex)
	{
		BasePage.captureScreenshot("CloseWithoutAccept_Fail");
		BasePage.onFailreMeassage(ex.getMessage(),"CloseWithoutAccept_Fail","Module - SET , Description of the test executed : Click close without accepting items");
		
	}
	
	
	
	} 
	
	
	@Test(priority = 26, description = "Remove attribute and close without saving")
	public void RemoveAttributeAndClose_Test() throws Throwable 
	{
			
		
		objSetPage.myDataBtnSet.click();
		Thread.sleep(10000);
		objSetPage.mouseHoverSet();
		Thread.sleep(5000);
		WebElement firstListedSet = null;
	
		String attributeDisplayed = null;
		String attributeDisplayed2 = null;
		
		try
		{
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String searchText = setParameters[2].trim();
			
			objSetPage.Set();
			Thread.sleep(2000);
			objSetPage.addSet();
			objSetPage.verifyEntityType("Uncategorized");
			objSetPage.setTitle(setName);
			objSetPage.selectEntity(entity);
			objSetPage.searchItems(searchText); 
			Thread.sleep(2000);
			objSetPage.AddandAccept(); 	
			BasePage.waitforAnElement(objSetPage.editCardIcon);
			ExtentTestManager.getTest().log(Status.PASS, "Set "+ setName +" is Created");
			objSetPage.createCheck(setName);
			
			
			
			
			
			
			
			
          for(WebElement element : objSetPage.AllSets)
			{
				firstListedSet=element;
				break;
			}
			
		//	String setName = firstListedSet.getText(); //stores the name of the first listed set
			
			firstListedSet.click(); //opens the same set
			Thread.sleep(5000);
			
			if(objSetPage.editCardIcon.isDisplayed())		
			objSetPage.editCardIcon.click();
			Thread.sleep(3000);
			
			
			for(WebElement attDisplayed : objSetPage.attributeDisplayed)
			{
				attributeDisplayed = attDisplayed.getText();
				Thread.sleep(2000);
				break;
			}
			
			System.out.println("attributeDisplayed : "+attributeDisplayed);
			
			
			for(WebElement element : objSetPage.threeDotsOnCard)
			{
				element.click();
				Thread.sleep(2000);
				break;
			}
			
			objSetPage.threeDotsOnCard_Remove.click();
			Thread.sleep(2000);
		
			objSetPage.close.click(); 
			Thread.sleep(5000);
			
			
			
			for(WebElement element : objSetPage.AllSets)
			{
				firstListedSet=element;
				break;
			}
			firstListedSet.click(); //again open the set
			Thread.sleep(3000);
			
			for(WebElement element : objSetPage.attributeInFront)
			{
				attributeDisplayed2 = element.getText();
				Thread.sleep(2000);
				break;
			}
			System.out.println("attributeDisplayed2 : "+attributeDisplayed2);
			
		
			if(attributeDisplayed2.equals(attributeDisplayed))
				System.out.println("Attribute still present!!! - Test passed");
	
	
      
      Thread.sleep(2000);
      BasePage.screenshotOnPass("RemoveAttributeAndClose_Pass");
	  BasePage.onSuccessMeassage("RemoveAttributeAndClose_Pass", "RemoveAttributeAndClose_Pass", "Module - SET , Description of the test executed : Remove attribute and close without saving");
 	
	}
	
	
	catch(Exception ex)
	{
        BasePage.captureScreenshot("RemoveAttributeAndClose_Fail");
		BasePage.onFailreMeassage(ex.getMessage(),"RemoveAttributeAndClose_Fail","Module - SET , Description of the test executed : Remove attribute and close without saving");
		
	}
	catch(AssertionError ex)
	{
		BasePage.captureScreenshot("RemoveAttributeAndClose_Fail");
		BasePage.onFailreMeassage(ex.getMessage(),"RemoveAttributeAndClose_Fail","Module - SET , Description of the test executed : Remove attribute and close without saving");
		
	}
	
	
	
	} 
	
	

	
	
	@Test(priority = 27, description = "Delete a set and check it is not listed")
	public void DeleteAndVerify_Test() throws Throwable  {
		try {

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			System.out.println(value);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String searchText = setParameters[2].trim();


		
			objSetPage.createAndDeleteSet(setName,entity,searchText);
			Thread.sleep(10000);
			objSetPage.openItemFromList_Set(setName);
			//			objSetPage.createAndDeleteSet("Delete Set1","Disease","kera");
			//onSuccessMeassage("Created And Deleted A Set Successfully");
			BasePage.screenshotOnPass("DeleteAndVerifyPass");
		    BasePage.onSuccessMeassage("DeleteAndVerifyPass", "DeleteAndVerifyPass", "Module - SET , Description of the test executed : Delete a set and check it is not listed");
    
			
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("DeleteAndVerifyFail");
			BasePage.onFailreMeassage(ex.getMessage(),"DeleteAndVerifyFail","Module - SET , Description of the test executed : Delete a set and check it is not listed");
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("DeleteAndVerifyFail");
			BasePage.onFailreMeassage(ex.getMessage(),"DeleteAndVerifyFail","Module - SET , Description of the test executed : Delete a set and check it is not listed");
		}
	} 
	
	@Test(priority = 28, description = "Checking features of filter")
	public void FilterSet28_Test() throws Throwable  {
		try {

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String searchText = setParameters[2].trim();
			//String filterAttribute = setParameters[3].trim();
			//String filterType = setParameters[4].trim();
			//String filterValue = setParameters[5].trim();

			
			
			objSetPage.createSet(setName, entity, searchText);	
			objSetPage.Set();
			WebElement opn = objSetPage.openSet(setName);
			BasePage.click(opn);
			
			if(objSetPage.filterDropdown.isDisplayed())
			{
				
					objSetPage.filterDropdown.click();
				
				if(objSetPage.SelectAnAttribute.isDisplayed())
					System.out.println("Attribute is displayed");
				if(objSetPage.SelectFilterType.isDisplayed())
					System.out.println("Filter type is displayed");
				if(objSetPage.valueForFilter.isDisplayed())
					System.out.println("Filter value is displayed");
			
				
			}
				
			 Thread.sleep(2000);
			
		
			
			BasePage.screenshotOnPass("CheckFilterFeaturePass");
		    BasePage.onSuccessMeassage("CheckFilterFeaturePass", "CheckFilterFeaturePass", "Module - SET , Description of the test executed : Checking features of filter");
    
			
		}
		catch(Throwable ex)
		{
			BasePage.captureScreenshot("CheckFilterFeatureFail");
			BasePage.onFailreMeassage(ex.getMessage(),"CheckFilterFeatureFail","Module - SET , Description of the test executed : Checking features of filter");

		}
	} 
	
	@Test(priority = 29, description = "Cancel without saving filter")
	public void FilterSet29_Test() throws Throwable  {
		try {

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String searchText = setParameters[2].trim();
			String filterAttribute = setParameters[3].trim();
			String filterType = setParameters[4].trim();
			String filterValue = setParameters[5].trim();

			
			
			objSetPage.createSet(setName, entity, searchText);	
			objSetPage.Set();
			WebElement opn = objSetPage.openSet(setName);
			BasePage.click(opn);
			
			if(objSetPage.filterDropdown.isDisplayed())
			objSetPage.filterDropdown.click();
			
			
			objSetPage.ApplyFilter(filterAttribute, filterType, filterValue);
			Thread.sleep(5000);	
			
			objSetPage.Set();
			WebElement opnAgain = objSetPage.openSet(setName);
			BasePage.click(opnAgain);
			
			//VALIDATION
			objSetPage.filterOnCard.click();
			if(objSetPage.placeHolderFilter.isDisplayed())
				System.out.println("TEST PASSED");
			
				
			
				
			 Thread.sleep(2000);
			
		
			
			BasePage.screenshotOnPass("CancelFilterPass");
		    BasePage.onSuccessMeassage("CancelFilterPass", "CancelFilterPass", "Module - SET , Description of the test executed : Cancel without saving filter");
    
			
		}
		catch(Throwable ex)
		{
			BasePage.captureScreenshot("CancelFilterFail");
			BasePage.onFailreMeassage(ex.getMessage(),"CancelFilterFail","Module - SET , Description of the test executed : Cancel without saving filter");

		}
	} 
	
	
	@Test(priority = 30, description = "Delete filter in collapsed mode")
	public void FilterSet30_Test() throws Throwable  {
		try {

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String searchText = setParameters[2].trim();
			String filterAttribute = setParameters[3].trim();
			String filterType = setParameters[4].trim();
			String filterValue = setParameters[5].trim();

			
			
			objSetPage.createSet(setName, entity, searchText);	
			objSetPage.Set();
			WebElement opn = objSetPage.openSet(setName);
			BasePage.click(opn);
			
			if(objSetPage.filterDropdown.isDisplayed())
			objSetPage.filterDropdown.click();
			
			
			objSetPage.ApplyFilter(filterAttribute, filterType, filterValue);
			Thread.sleep(5000);	
			
			objSetPage.FilterIconInExpand.click();
			Thread.sleep(2000);
	
			objSetPage.deleteFilterCollapsed.click();
			
				
			
				
			 Thread.sleep(2000);
			
		
			
			BasePage.screenshotOnPass("CancelFilterPass");
		    BasePage.onSuccessMeassage("CancelFilterPass", "CancelFilterPass", "Module - SET , Description of the test executed : Cancel without saving filter");
    
			
		}
		catch(Throwable ex)
		{
			BasePage.captureScreenshot("CancelFilterFail");
			BasePage.onFailreMeassage(ex.getMessage(),"CancelFilterFail","Module - SET , Description of the test executed : Cancel without saving filter");

		}
	} 

	@Test(priority = 31, description = "File features")
	public void FileFeatures_Test() throws Throwable  {
		try {

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String fileLocation = setParameters[2].trim();

			
			objSetPage.FeaturesFromFile(setName,entity,fileLocation);
			//			objSetPage.CreateSetFromFile("Set From File 1","Disease", "C:\\Users\\MugunthRaman\\git\\EagleAutomation\\Resources\\Q4 - Upload file - 1 (2).xlsx");
			//onSuccessMeassage("Set is successfully Created from File");
			BasePage.screenshotOnPass("setCreatedFromFile");
			BasePage.onSuccessMeassage("Set is created from file", "setCreatedFromFile", "Module - SET , Description of the test executed : Create Set From File");
		     
		}
		catch(Exception ecf)
		{
			BasePage.captureScreenshot("createSetFromFileFail");
			BasePage.onFailreMeassage(ecf.getMessage(),"createSetFromFileFail","Module - SET , Description of the test executed : Set created successfully from file");
			
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("createSetFromFileFail");
			BasePage.onFailreMeassage(ex.getMessage(),"createSetFromFileFail","Module - SET , Description of the test executed : Set created successfully from file");
			
		}
	} 
	
	@Test(priority = 32, description = "Blank File upload")
	public void BlankFile_Test() throws Throwable  {
		try {

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String fileLocation = setParameters[2].trim();

			
			objSetPage.BlankFile(setName,entity,fileLocation);
			//			objSetPage.CreateSetFromFile("Set From File 1","Disease", "C:\\Users\\MugunthRaman\\git\\EagleAutomation\\Resources\\Q4 - Upload file - 1 (2).xlsx");
			//onSuccessMeassage("Set is successfully Created from File");
			BasePage.screenshotOnPass("BlankFilePass");
			BasePage.onSuccessMeassage("BlankFilePass", "BlankFilePass", "Module - SET , Description of the test executed : Blank File upload");
		     
		}
		catch(Exception ecf)
		{
			BasePage.captureScreenshot("BlankFileFail");
			BasePage.onFailreMeassage(ecf.getMessage(),"BlankFileFail","Module - SET , Description of the test executed : Blank File upload");
			
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("BlankFileFail");
			BasePage.onFailreMeassage(ex.getMessage(),"BlankFileFail","Module - SET , Description of the test executed : Blank File upload");
			
		}
	}  
	
	@Test(priority = 32, description = "No matching element in file")
	public void NoMatchingElement_Test() throws Throwable  {
		try {

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String fileLocation = setParameters[2].trim();

			
			objSetPage.NoMatchingElement(setName,entity,fileLocation);
			//			objSetPage.CreateSetFromFile("Set From File 1","Disease", "C:\\Users\\MugunthRaman\\git\\EagleAutomation\\Resources\\Q4 - Upload file - 1 (2).xlsx");
			//onSuccessMeassage("Set is successfully Created from File");
			BasePage.screenshotOnPass("NoMatchingElementPass");
			BasePage.onSuccessMeassage("NoMatchingElementPass", "NoMatchingElementPass", "Module - SET , Description of the test executed : No matching element in file");
		     
		}
		catch(Exception ecf)
		{
			BasePage.captureScreenshot("NoMatchingElementFail");
			BasePage.onFailreMeassage(ecf.getMessage(),"NoMatchingElementFail","Module - SET , Description of the test executed : No matching element in file");
			
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("NoMatchingElementFail");
			BasePage.onFailreMeassage(ex.getMessage(),"NoMatchingElementFail","Module - SET , Description of the test executed : No matching element in file");
			
		}
	} 


	@Test(priority = 33, description = "Remove file")
	public void RemoveFile_Test() throws Throwable  {
		try {

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String fileLocation = setParameters[2].trim();

			
			objSetPage.RemoveFile(setName,entity,fileLocation);
			//			objSetPage.CreateSetFromFile("Set From File 1","Disease", "C:\\Users\\MugunthRaman\\git\\EagleAutomation\\Resources\\Q4 - Upload file - 1 (2).xlsx");
			//onSuccessMeassage("Set is successfully Created from File");
			BasePage.screenshotOnPass("RemoveFilePass");
			BasePage.onSuccessMeassage("RemoveFilePass", "RemoveFilePass", "Module - SET , Description of the test executed : Remove file");
		     
		}
		catch(Exception ecf)
		{
			BasePage.captureScreenshot("RemoveFileFile");
			BasePage.onFailreMeassage(ecf.getMessage(),"RemoveFileFile","Module - SET , Description of the test executed : Remove file");
			
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("RemoveFileFile");
			BasePage.onFailreMeassage(ex.getMessage(),"RemoveFileFile","Module - SET , Description of the test executed : Remove file");
			
		}
	} 
	
	@Test(priority = 34, description = "Category suggested")
	public void CategorySuggested_Test() throws Throwable  {
		try {

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String fileLocation = setParameters[2].trim();

			
			objSetPage.CategorySuggested(setName,fileLocation);
			//			objSetPage.CreateSetFromFile("Set From File 1","Disease", "C:\\Users\\MugunthRaman\\git\\EagleAutomation\\Resources\\Q4 - Upload file - 1 (2).xlsx");
			//onSuccessMeassage("Set is successfully Created from File");
			BasePage.screenshotOnPass("CategorySuggestedPass");
			BasePage.onSuccessMeassage("CategorySuggestedPass", "CategorySuggestedPass", "Module - SET , Description of the test executed : Category suggested");
		     
		}
		catch(Exception ecf)
		{
			BasePage.captureScreenshot("CategorySuggestedFail");
			BasePage.onFailreMeassage(ecf.getMessage(),"CategorySuggestedFail","Module - SET , Description of the test executed : Category suggested");
			
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("CategorySuggestedFail");
			BasePage.onFailreMeassage(ex.getMessage(),"CategorySuggestedFail","Module - SET , Description of the test executed : Category suggested");
			
		}
	}
	
	@Test(priority = 35, description = "Select entry from search results of the file uploaded")
	public void SelectEntry_Test() throws Throwable  {
		try {

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String fileLocation = setParameters[2].trim();

			
			objSetPage.SelectEntry(setName,entity,fileLocation);
			//			objSetPage.CreateSetFromFile("Set From File 1","Disease", "C:\\Users\\MugunthRaman\\git\\EagleAutomation\\Resources\\Q4 - Upload file - 1 (2).xlsx");
			//onSuccessMeassage("Set is successfully Created from File");
			BasePage.screenshotOnPass("SelectEntryPass");
			BasePage.onSuccessMeassage("SelectEntryPass", "SelectEntryPass", "Module - SET , Description of the test executed : Select entry from search results of the file uploaded");
		     
		}
		catch(Exception ecf)
		{
			BasePage.captureScreenshot("SelectEntryFail");
			BasePage.onFailreMeassage(ecf.getMessage(),"SelectEntryFail","Module - SET , Description of the test executed : Select entry from search results of the file uploaded");
			
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("SelectEntryFail");
			BasePage.onFailreMeassage(ex.getMessage(),"SelectEntryFail","Module - SET , Description of the test executed : Select entry from search results of the file uploaded");
			
		}
	} 
	
	@Test(priority = 36, description = "Verify Name in selection panel")
	public void VerifyName_Test() throws Throwable  {
		try {

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String fileLocation = setParameters[2].trim();

			
			objSetPage.VerifyName(setName,entity,fileLocation);
		
			BasePage.screenshotOnPass("VerifyNamePass");
			BasePage.onSuccessMeassage("VerifyNamePass", "VerifyNamePass", "Module - SET , Description of the test executed : Verify Name in selection panel");
		     
		}
		catch(Exception ecf)
		{
			BasePage.captureScreenshot("VerifyNameFail");
			BasePage.onFailreMeassage(ecf.getMessage(),"VerifyNameFail","Module - SET , Description of the test executed : Verify Name in selection panel");
			
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("VerifyNameFail");
			BasePage.onFailreMeassage(ex.getMessage(),"VerifyNameFail","Module - SET , Description of the test executed : Verify Name in selection panel");
			
		}
	} 
	
	@Test(priority = 37, description = "Verify Number of Entities in selection panel")
	public void VerifyNumberOfEntities_Test() throws Throwable  {
		try {

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String fileLocation = setParameters[2].trim();

			
			objSetPage.VerifyNumberOfEntities(setName,entity,fileLocation);
		
			BasePage.screenshotOnPass("VerifyNumberOfEntities");
			BasePage.onSuccessMeassage("VerifyNumberOfEntities", "VerifyNumberOfEntities", "Module - SET , Description of the test executed : Verify Number of Entities in selection panel");
		     
		}
		catch(Exception ecf)
		{
			BasePage.captureScreenshot("VerifyNumberOfEntitiesFail");
			BasePage.onFailreMeassage(ecf.getMessage(),"VerifyNumberOfEntitiesFail","Module - SET , Description of the test executed : Verify Number of Entities in selection panel");
			
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("VerifyNumberOfEntitiesFail");
			BasePage.onFailreMeassage(ex.getMessage(),"VerifyNumberOfEntitiesFail","Module - SET , Description of the test executed : Verify Number of Entities in selection panel");
			
		}
	} 
	
	
	
	//Verify presence of action menu against each row in card
	@Test(priority = 38, description = "Verify action menu in card")
	public void VerifyCardActionMenu_Test() throws Throwable{
		try{
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String fileLocation = setParameters[2].trim();
			
			objSetPage.actionMenuPresent_MyData(setName,entity,fileLocation);
			Thread.sleep(5000);
			BasePage.screenshotOnPass("ActionMenuPass");
		    BasePage.onSuccessMeassage("ActionMenuPass", "ActionMenuPass", "Module - SET , Description of the test executed : Verify action menu in card");
    	
			
		}
		catch(Exception | AssertionError ex){
			BasePage.captureScreenshot("ActionMenuFail");
			BasePage.onFailreMeassage(ex.getMessage(),"ActionMenuFail","Module - SET , Description of the test executed : Verify action menu in card");					
		}
	} 
	
	@Test(priority = 39, description = "Show detail and remove item")
	public void ShowDetailRemoveItem_Test() throws Throwable{
		try{
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String fileLocation = setParameters[2].trim();
			
			objSetPage.ShowDetailRemoveItem(setName,entity,fileLocation);
			Thread.sleep(5000);
			BasePage.screenshotOnPass("ShowDetailRemoveItem");
		    BasePage.onSuccessMeassage("ShowDetailRemoveItem", "ShowDetailRemoveItem", "Module - SET , Description of the test executed : Show detail and remove item");
    	
			
		}
		catch(Exception | AssertionError ex){
			BasePage.captureScreenshot("ShowDetailRemoveItemFail");
			BasePage.onFailreMeassage(ex.getMessage(),"ShowDetailRemoveItemFail","Module - SET , Description of the test executed : Show detail and remove item");					
		}
	} 
	
	@Test(priority = 40, description = "Show detail expand")
	public void ShowDetailExpand_Test() throws Throwable{
		try{
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String fileLocation = setParameters[2].trim();
			
			objSetPage.ShowDetailExpand(setName,entity,fileLocation);
			Thread.sleep(5000);
			BasePage.screenshotOnPass("ShowDetailExpand");
		    BasePage.onSuccessMeassage("ShowDetailExpand", "ShowDetailExpand", "Module - SET , Description of the test executed : Show detail expand");
    	
			
		}
		catch(Exception | AssertionError ex){
			BasePage.captureScreenshot("ShowDetailExpandFail");
			BasePage.onFailreMeassage(ex.getMessage(),"ShowDetailExpandFail","Module - SET , Description of the test executed : Show detail expand");					
		}
	} 
	
	
	@Test(priority = 41, description = "Confirm that the attribute got removed")
	public void RemoveConfirm_Test() throws Throwable{
		try{
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String fileLocation = setParameters[2].trim();
			
			objSetPage.RemoveConfirm(setName,entity,fileLocation);
			Thread.sleep(5000);
			BasePage.screenshotOnPass("ShowDetailRemoveItem");
		    BasePage.onSuccessMeassage("ShowDetailRemoveItem", "ShowDetailRemoveItem", "Module - SET , Description of the test executed : Show detail and remove item");
    	
			
		}
		catch(Exception | AssertionError ex){
			BasePage.captureScreenshot("ShowDetailRemoveItemFail");
			BasePage.onFailreMeassage(ex.getMessage(),"ShowDetailRemoveItemFail","Module - SET , Description of the test executed : Show detail and remove item");					
		}
	} 
	
	@Test(priority = 42, description = "Update category")
	public void UpdateCategory_Test() throws Throwable{
		try{
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String fileLocation = setParameters[2].trim();
			
			objSetPage.UpdateCategory(setName,entity,fileLocation);
			Thread.sleep(5000);
			BasePage.screenshotOnPass("UpdateCategory");
		    BasePage.onSuccessMeassage("UpdateCategory", "UpdateCategory", "Module - SET , Description of the test executed : Update category");
    	
		    objSetPage.Home();
			
		}
		catch(Exception | AssertionError ex){
			BasePage.captureScreenshot("UpdateCategoryFail");
			BasePage.onFailreMeassage(ex.getMessage(),"UpdateCategoryFail","Module - SET , Description of the test executed : Update category");					
		}
	} 
	
	@Test(priority = 43, description = "No matching keyword")
	public void NoMatchingKeyword_Test() throws Throwable{
		try{
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String searchText = setParameters[2].trim();
			
			objSetPage.NoMatchingKeyword(setName,entity,searchText);
			Thread.sleep(5000);
			BasePage.screenshotOnPass("NoMatchingKeyword");
		    BasePage.onSuccessMeassage("NoMatchingKeyword", "NoMatchingKeyword", "Module - SET , Description of the test executed : No matching keyword");
		    objSetPage.Home();
			
		}
		catch(Exception | AssertionError ex){
			BasePage.captureScreenshot("NoMatchingKeywordFail");
			BasePage.onFailreMeassage(ex.getMessage(),"NoMatchingKeywordFail","Module - SET , Description of the test executed : No matching keyword");					
		}
	} 
	
	
	@Test(priority = 44, description = "Cancel selection")
	public void CancelSelection_Test() throws Throwable{
		try{
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String searchText = setParameters[2].trim();
			
			objSetPage.CancelSelection(setName,entity,searchText);
			Thread.sleep(5000);
			BasePage.screenshotOnPass("CancelSelection");
		    BasePage.onSuccessMeassage("CancelSelection", "CancelSelection", "Module - SET , Description of the test executed : Cancel Selection");
		    objSetPage.Home();
			
		}
		catch(Exception | AssertionError ex){
			BasePage.captureScreenshot("CancelSelectionFail");
			BasePage.onFailreMeassage(ex.getMessage(),"CancelSelectionFail","Module - SET , Description of the test executed : Cancel Selection");					
		}
	} 
	
	
	
	@Test(priority = 45, description = "Cancel popup")
	public void CancelPopUp_Test() throws Throwable{
		try{
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String searchText = setParameters[2].trim();
			
			objSetPage.CancelPopUp(setName,entity,searchText);
			Thread.sleep(5000);
			BasePage.screenshotOnPass("CancelPopUp");
		    BasePage.onSuccessMeassage("CancelPopUp", "CancelPopUp", "Module - SET , Description of the test executed : Cancel popup");
		    objSetPage.Home();
			
		}
		catch(Exception | AssertionError ex){
			BasePage.captureScreenshot("CancelPopUpFail");
			BasePage.onFailreMeassage(ex.getMessage(),"CancelPopUpFail","Module - SET , Description of the test executed : Cancel popup");					
		}
	}
	
	@Test(priority = 46, description = "Primary column present in Set Expand")
	public void PrimaryColumn_Test() throws Throwable  {
		try {

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String searchText = setParameters[2].trim();
			//String gridNoOfRows = setParameters[3].trim();
			//String gridPrimaryColumn = setParameters[4].trim();
			//String gridSecondaryColumn = setParameters[5].trim();

		
			objSetPage.PrimaryColumn(setName, entity, searchText);
			//			objSetPage.GridChanges("GridSet", "Disease", "Kera", "10", "Definition", "Identifier");
			//onSuccessMeassage("Grid Settings are Modified Successfully in Set Expand");
			BasePage.screenshotOnPass("PrimaryColumn");
		    BasePage.onSuccessMeassage("PrimaryColumn", "PrimaryColumn", "Module - SET , Description of the test executed : PrimaryColumn");
		    objSetPage.Home();
			
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("PrimaryColumnFail");
			BasePage.onFailreMeassage(ex.getMessage(),"PrimaryColumnFail","Module - SET , Description of the test executed : PrimaryColumn");
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("PrimaryColumnFail");
			BasePage.onFailreMeassage(ex.getMessage(),"PrimaryColumnFail","Module - SET , Description of the test executed : PrimaryColumn");
		}
	} 
	
	@Test(priority = 47, description = "Rows per page options in Set Expand")
	public void RowsPerPageOptions_Test() throws Throwable  {
		try {

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String searchText = setParameters[2].trim();
			//String gridNoOfRows = setParameters[3].trim();
			//String gridPrimaryColumn = setParameters[4].trim();
			//String gridSecondaryColumn = setParameters[5].trim();

		
			objSetPage.RowsPerPageOptions(setName, entity, searchText);
			//			objSetPage.GridChanges("GridSet", "Disease", "Kera", "10", "Definition", "Identifier");
			//onSuccessMeassage("Grid Settings are Modified Successfully in Set Expand");
			BasePage.screenshotOnPass("RowsPerPageOptions");
		    BasePage.onSuccessMeassage("RowsPerPageOptions", "RowsPerPageOptions", "Module - SET , Description of the test executed : Rows per page options in Set Expand");
		    objSetPage.Home();
			
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("RowsPerPageOptionsFail");
			BasePage.onFailreMeassage(ex.getMessage(),"RowsPerPageOptionsFail","Module - SET , Description of the test executed : Rows per page options in Set Expand");
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("RowsPerPageOptionsFail");
			BasePage.onFailreMeassage(ex.getMessage(),"RowsPerPageOptionsFail","Module - SET , Description of the test executed : Rows per page options in Set Expand");
		}
	} 
	

	@Test(priority = 48, description = "Default value : 100 : Rows per page options in Set Expand")
	public void DefaultValue100_Test() throws Throwable  {
		try {

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String searchText = setParameters[2].trim();
			//String gridNoOfRows = setParameters[3].trim();
			//String gridPrimaryColumn = setParameters[4].trim();
			//String gridSecondaryColumn = setParameters[5].trim();

		
			objSetPage.DefaultValue100(setName, entity, searchText);
			//			objSetPage.GridChanges("GridSet", "Disease", "Kera", "10", "Definition", "Identifier");
			//onSuccessMeassage("Grid Settings are Modified Successfully in Set Expand");
			BasePage.screenshotOnPass("DefaultValue100");
		    BasePage.onSuccessMeassage("DefaultValue100", "DefaultValue100", "Module - SET , Description of the test executed : Default value : 100 : Rows per page options in Set Expand");
		    objSetPage.Home();
			
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("DefaultValue100Fail");
			BasePage.onFailreMeassage(ex.getMessage(),"DefaultValue100Fail","Module - SET , Description of the test executed : Default value : 100 : Rows per page options in Set Expand");
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("DefaultValue100Fail");
			BasePage.onFailreMeassage(ex.getMessage(),"DefaultValue100Fail","Module - SET , Description of the test executed : Default value : 100 : Rows per page options in Set Expand");
		}
	} 
	
	@Test(priority = 49, description = "Primary and Secondary columns are not null")
	public void PrimarySecondaryNotNull_Test() throws Throwable  {
		try {

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String searchText = setParameters[2].trim();
			//String gridNoOfRows = setParameters[3].trim();
			//String gridPrimaryColumn = setParameters[4].trim();
			//String gridSecondaryColumn = setParameters[5].trim();

		
			objSetPage.PrimarySecondaryNotNull(setName, entity, searchText);
			//			objSetPage.GridChanges("GridSet", "Disease", "Kera", "10", "Definition", "Identifier");
			//onSuccessMeassage("Grid Settings are Modified Successfully in Set Expand");
			BasePage.screenshotOnPass("PrimarySecondaryNotNull");
		    BasePage.onSuccessMeassage("PrimarySecondaryNotNull", "PrimarySecondaryNotNull", "Module - SET , Description of the test executed : Primary and Secondary columns are not null");
		    objSetPage.Home();
			
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("PrimarySecondaryNotNullFail");
			BasePage.onFailreMeassage(ex.getMessage(),"PrimarySecondaryNotNullFail","Module - SET , Description of the test executed : Primary and Secondary columns are not null");
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("PrimarySecondaryNotNullFail");
			BasePage.onFailreMeassage(ex.getMessage(),"PrimarySecondaryNotNullFail","Module - SET , Description of the test executed : Primary and Secondary columns are not null");
		}
	} 
	
	@Test(priority = 50, description = "Primary and Secondary columns are not same")
	public void PrimarySecondaryNotSame_Test() throws Throwable  {
		try {

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String searchText = setParameters[2].trim();
			//String gridNoOfRows = setParameters[3].trim();
			//String gridPrimaryColumn = setParameters[4].trim();
			//String gridSecondaryColumn = setParameters[5].trim();

		
			objSetPage.PrimarySecondaryNotSame(setName, entity, searchText);
			//			objSetPage.GridChanges("GridSet", "Disease", "Kera", "10", "Definition", "Identifier");
			//onSuccessMeassage("Grid Settings are Modified Successfully in Set Expand");
			Thread.sleep(2000);
			BasePage.screenshotOnPass("PrimarySecondaryNotSame");
		    BasePage.onSuccessMeassage("PrimarySecondaryNotSame", "PrimarySecondaryNotSame", "Module - SET , Description of the test executed : Primary and Secondary columns are not same");

			if(objSetPage.cancel.isDisplayed())
				objSetPage.cancel.click();
			Thread.sleep(5000);
			
			objSetPage.Home();
			
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("PrimarySecondaryNotSameFail");
			BasePage.onFailreMeassage(ex.getMessage(),"PrimarySecondaryNotSameFail","Module - SET , Description of the test executed : Primary and Secondary columns are not same");
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("PrimarySecondaryNotSameFail");
			BasePage.onFailreMeassage(ex.getMessage(),"PrimarySecondaryNotSameFail","Module - SET , Description of the test executed : Primary and Secondary columns are not same");
		}
	} 
	
	@Test(priority = 51, description = "Minimize expanded card")
	public void MinimizeCard_Test() throws Throwable  {
		try {

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String searchText = setParameters[2].trim();
			//String gridNoOfRows = setParameters[3].trim();
			//String gridPrimaryColumn = setParameters[4].trim();
			//String gridSecondaryColumn = setParameters[5].trim();

		
			objSetPage.MinimizeCard(setName, entity, searchText);
			//			objSetPage.GridChanges("GridSet", "Disease", "Kera", "10", "Definition", "Identifier");
			//onSuccessMeassage("Grid Settings are Modified Successfully in Set Expand");
			BasePage.screenshotOnPass("MinimizeCard");
		    BasePage.onSuccessMeassage("MinimizeCard", "MinimizeCard", "Module - SET , Description of the test executed : Minimize expanded card");
    
		    
		
			
			objSetPage.Home();
			
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("MinimizeCardFail");
			BasePage.onFailreMeassage(ex.getMessage(),"MinimizeCardFail","Module - SET , Description of the test executed : Minimize expanded card");
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("MinimizeCardFail");
			BasePage.onFailreMeassage(ex.getMessage(),"MinimizeCardFail","Module - SET , Description of the test executed : Minimize expanded card");
		}
	} 
	
	@Test(priority = 52, description = "Cancel grid changes")
	public void CancelGridChanges_Test() throws Throwable  {
		try {

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String searchText = setParameters[2].trim();
			//String gridNoOfRows = setParameters[3].trim();
			//String gridPrimaryColumn = setParameters[4].trim();
			//String gridSecondaryColumn = setParameters[5].trim();

		
			objSetPage.CancelGridChanges(setName, entity, searchText);
			//			objSetPage.GridChanges("GridSet", "Disease", "Kera", "10", "Definition", "Identifier");
			//onSuccessMeassage("Grid Settings are Modified Successfully in Set Expand");
			BasePage.screenshotOnPass("CancelGridChanges");
		    BasePage.onSuccessMeassage("CancelGridChanges", "CancelGridChanges", "Module - SET , Description of the test executed : Cancel grid changes");
    
			if(objSetPage.cancel.isDisplayed())
				objSetPage.cancel.click();
			Thread.sleep(5000);
			
			objSetPage.Home();
			
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("CancelGridChangesFail");
			BasePage.onFailreMeassage(ex.getMessage(),"CancelGridChangesFail","Module - SET , Description of the test executed : Cancel grid changes");
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("CancelGridChangesFail");
			BasePage.onFailreMeassage(ex.getMessage(),"CancelGridChangesFail","Module - SET , Description of the test executed : Cancel grid changes");
		}
	} 
	
	@Test(priority = 53, description = "Checking features of filter in expanded mode")
	public void FilterFeatureExpanded_Test() throws Throwable  {
		try {

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String searchText = setParameters[2].trim();
			//String filterAttribute = setParameters[3].trim();
			//String filterType = setParameters[4].trim();
			//String filterValue = setParameters[5].trim();

			
			
			//objSetPage.createSet(setName, entity, searchText);	
			//objSetPage.Set();
			//WebElement opn = objSetPage.openSet(setName);
			//BasePage.click(opn);
			
			
			//objSetPage.expandSet();
			//Thread.sleep(5000);
			
			
			
			objSetPage.Set();
			objSetPage.addSet();
			objSetPage.verifyEntityType("Uncategorized");
			objSetPage.setTitle(setName); //Create a set
			objSetPage.selectEntity(entity);
			objSetPage.searchItems(searchText);
			objSetPage.AddandAccept();
			objSetPage.expandSet();
			Thread.sleep(5000);
			
			
			
			if(objSetPage.FilterIconInExpand.isDisplayed())
				objSetPage.FilterIconInExpand.click();
			Thread.sleep(5000);
			
		
				
				if(objSetPage.expandedFilter1.isDisplayed())
					System.out.println("Attribute is displayed");
				Thread.sleep(3000);
				if(objSetPage.expandedFilter2.isDisplayed())
					System.out.println("Filter type is displayed");
				Thread.sleep(3000);
				if(objSetPage.expandedFilter3.isDisplayed())
					System.out.println("Filter value is displayed");
				Thread.sleep(3000);
				
				if(objSetPage.expandedFilter4.isDisplayed())
					System.out.println("Done button : "+objSetPage.expandedFilter4.getText());
				Thread.sleep(3000);
				
				if(objSetPage.expandedFilter5.isDisplayed())
					System.out.println("Cancel button : "+objSetPage.expandedFilter5.getText());
			
	
			BasePage.screenshotOnPass("FilterFeatureExpanded");
		    BasePage.onSuccessMeassage("FilterFeatureExpanded", "FilterFeatureExpanded", "Module - SET , Description of the test executed : Checking features of filter in expanded mode");
    
		    BasePage.ClickElementUsingActions(objSetPage.expandedFilter5);
			
			 Thread.sleep(2000);
			
			 objSetPage.Home();
			 Thread.sleep(2000);
			
		}
		catch(Throwable ex)
		{
			BasePage.captureScreenshot("FilterFeatureExpandedFail");
			BasePage.onFailreMeassage(ex.getMessage(),"FilterFeatureExpandedFail","Module - SET , Description of the test executed : Checking features of filter in expanded mode");

		}
	} 
	
	@Test(priority = 54, description = "PopUp_Clicks")
	public void PopUpClicks_Test() throws Throwable{
		try{
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String searchText = setParameters[2].trim();
			
			objSetPage.PopUpClicks(setName,entity,searchText);
			Thread.sleep(5000);
			BasePage.screenshotOnPass("PopUpClicks");
		    BasePage.onSuccessMeassage("PopUpClicks", "PopUpClicks", "Module - SET , Description of the test executed : PopUp_Clicks");
    	
		    objSetPage.Home();
		    Thread.sleep(3000);
			
		}
		catch(Exception | AssertionError ex){
			BasePage.captureScreenshot("PopUpClicksFail");
			BasePage.onFailreMeassage(ex.getMessage(),"PopUpClicksFail","Module - SET , Description of the test executed : PopUp_Clicks");					
		}
	} 
	
	@Test(priority = 55, description = "Validates no. of rows based on value selected")
	public void RowsPerPageOptions69_Test() throws Throwable  {
		try {

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String searchText = setParameters[2].trim();
			//String gridNoOfRows = setParameters[3].trim();
			//String gridPrimaryColumn = setParameters[4].trim();
			//String gridSecondaryColumn = setParameters[5].trim();

		
			objSetPage.RowsPerPageOptions69(setName, entity, searchText);
			//			objSetPage.GridChanges("GridSet", "Disease", "Kera", "10", "Definition", "Identifier");
			//onSuccessMeassage("Grid Settings are Modified Successfully in Set Expand");
			BasePage.screenshotOnPass("RowsPerPageOptions69");
		    BasePage.onSuccessMeassage("RowsPerPageOptions69", "RowsPerPageOptions69", "Module - SET , Description of the test executed : Validates no. of rows based on value selected");
		    objSetPage.Home();
		    Thread.sleep(3000);
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("RowsPerPageOptions69Fail");
			BasePage.onFailreMeassage(ex.getMessage(),"RowsPerPageOptions69Fail","Module - SET , Description of the test executed : Validates no. of rows based on value selected");
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("RowsPerPageOptions69Fail");
			BasePage.onFailreMeassage(ex.getMessage(),"RowsPerPageOptions69Fail","Module - SET , Description of the test executed : Validates no. of rows based on value selected");
		}
	} 
	
	@Test(priority = 56, description = "Validates no. of rows based on value selected")
	public void RowsPerPageOptions70_Test() throws Throwable  {
		try {

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String searchText = setParameters[2].trim();
			//String gridNoOfRows = setParameters[3].trim();
			//String gridPrimaryColumn = setParameters[4].trim();
			//String gridSecondaryColumn = setParameters[5].trim();

		
			objSetPage.RowsPerPageOptions70(setName, entity, searchText);
			//			objSetPage.GridChanges("GridSet", "Disease", "Kera", "10", "Definition", "Identifier");
			//onSuccessMeassage("Grid Settings are Modified Successfully in Set Expand");
			BasePage.screenshotOnPass("RowsPerPageOptions70");
		    BasePage.onSuccessMeassage("RowsPerPageOptions70", "RowsPerPageOptions70", "Module - SET , Description of the test executed : Validates no. of rows based on value selected");
		    objSetPage.Home();
		    Thread.sleep(3000);
			
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("RowsPerPageOptions70Fail");
			BasePage.onFailreMeassage(ex.getMessage(),"RowsPerPageOptions70Fail","Module - SET , Description of the test executed : Validates no. of rows based on value selected");
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("RowsPerPageOptions70Fail");
			BasePage.onFailreMeassage(ex.getMessage(),"RowsPerPageOptions70Fail","Module - SET , Description of the test executed : Validates no. of rows based on value selected");
		}
	} 
	

	
	
	@Test(priority = 57, description = "Primary column reverts to default value on clicking cancel")
	public void PrimaryColumnRevertsToDefault_Test() throws Throwable  {
		try {

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String searchText = setParameters[2].trim();
			//String gridNoOfRows = setParameters[3].trim();
			//String gridPrimaryColumn = setParameters[4].trim();
			//String gridSecondaryColumn = setParameters[5].trim();

		
			objSetPage.PrimaryColumnRevertsToDefault(setName, entity, searchText);
			//			objSetPage.GridChanges("GridSet", "Disease", "Kera", "10", "Definition", "Identifier");
			//onSuccessMeassage("Grid Settings are Modified Successfully in Set Expand");
			BasePage.screenshotOnPass("PrimaryColumnRevertsToDefault");
		    BasePage.onSuccessMeassage("PrimaryColumnRevertsToDefault", "PrimaryColumnRevertsToDefault", "Module - SET , Description of the test executed : Primary column reverts to default value on clicking cancel");
		    objSetPage.Home();
		    Thread.sleep(2000);
			
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("PrimaryColumnRevertsToDefaultFail");
			BasePage.onFailreMeassage(ex.getMessage(),"PrimaryColumnRevertsToDefaultFail","Module - SET , Description of the test executed : Primary column reverts to default value on clicking cancel");
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("DefaultValue100Fail");
			BasePage.onFailreMeassage(ex.getMessage(),"DefaultValue100Fail","Module - SET , Description of the test executed : Primary column reverts to default value on clicking cancel");
		}
	} 
	
	@Test(priority = 58, description = "Numeral at the bottom of My Data page")
	public void NumeralDisplayed_Test() throws Throwable 
	{
			
			
			objSetPage.myDataBtnSet.click();
			Thread.sleep(10000);
			objSetPage.mouseHoverSet();
			Thread.sleep(5000);
		
			
			try
			{
				
				
				
				if(objSetPage.ItemsInSet.size()>=10)
				{
			
				System.out.println("Number of items : "+objSetPage.NoOfItems.getText());
				System.out.println();
				System.out.println("Number of items : "+objSetPage.NoOfPages.getText());
				
               }
				
				BasePage.screenshotOnPass("NumeralDisplayed");
			    BasePage.onSuccessMeassage("NumeralDisplayed", "NumeralDisplayed", "Module - SET , Description of the test executed : NumeralDisplayed");
	    
		
		}
		
		catch(Exception ex)
		{
			BasePage.captureScreenshot("NumeralDisplayedFail");
			BasePage.onFailreMeassage(ex.getMessage(),"NumeralDisplayedFail","Module - SET , Description of the test executed : NumeralDisplayed");
			
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("NumeralDisplayedFail");
			BasePage.onFailreMeassage(ex.getMessage(),"NumeralDisplayedFail","Module - SET , Description of the test executed : NumeralDisplayed");
			
		}

	
	
	} */
	
	
/*	@Test(priority = 59, description = "Expanded mode - Cancelling filter does not delete card")
	public void CardNotDeletedOnCancelFilter_Test() throws Throwable  {
		try {

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String searchText = setParameters[2].trim();
			String filterAttribute = setParameters[3].trim();
			String filterType = setParameters[4].trim();
			String filterValue = setParameters[5].trim();
			

			

			objSetPage.Set();
			objSetPage.addSet();
			objSetPage.verifyEntityType("Uncategorized");
			objSetPage.setTitle(setName); //Create a set
			objSetPage.selectEntity(entity);
			objSetPage.searchItems(searchText);
			objSetPage.AddandAccept();
			objSetPage.expandSet();
			Thread.sleep(5000);
			
			
			
			objSetPage.ApplyFilter2(filterAttribute, filterType, filterValue);

			
			
		
		
			Thread.sleep(5000);
			
		
			
				
				if(objSetPage.expandedFilter5.isDisplayed())
					System.out.println("Cancel button : "+objSetPage.expandedFilter5.getText());
				objSetPage.expandedFilter5.click();
				
				Thread.sleep(3000);
				
				if(objSetPage.viewDetailsWord.isDisplayed())
					System.out.println("CARD NOT DELETED; ONLY FILTER CANCELLED");
				
			
				
			 Thread.sleep(2000);
			
		
			
			BasePage.screenshotOnPass("NotDeletedOnFilterCancel");
		    BasePage.onSuccessMeassage("NotDeletedOnFilterCancel", "NotDeletedOnFilterCancel", "Module - SET , Description of the test executed : Expanded mode - Cancelling filter does not delete card");
		    objSetPage.Home();
			
		}
		catch(Throwable ex)
		{
			BasePage.captureScreenshot("NotDeletedOnFilterCancelFail");
			BasePage.onFailreMeassage(ex.getMessage(),"NotDeletedOnFilterCancelFail","Module - SET , Description of the test executed : Expanded mode - Cancelling filter does not delete card");

		}
	} */
	
	
/*	@Test(priority = 60, description = "Non-owner cannot delete or share set")
	public void NonOwner_Test() throws Throwable  {
		try {

			String text=null;
			String ownerName=null;
			int count=0;
			int actionCount=0;
			
			objSetPage.myDataBtn.click();
			
			for(WebElement element : objSetPage.ownerList)
			{
				count++;
				text=element.getText();
				if(text.equals("Me"))
				{
					System.out.println("move forward");
				}
				else
				{
					ownerName = element.getText();
					break;
				}
			
			}
			
			System.out.println("Count value is : "+count);
			System.out.println("ownerName is : "+ownerName);
			
	
			for(WebElement element : objSetPage.actionButton)
			{
				
				actionCount++;
	
				if(actionCount==count)
				{
					
				element.click();
				
			
				
				 if(objSetPage.deleteMenu.isEnabled())
						System.out.println(objSetPage.deleteMenu.getText());
					else
						System.out.println("delete icon disabled , owner is someone else - OK");
					
		
					
					if(objSetPage.shareMenu.isDisplayed())
						//System.out.println("share icon enabled , but owner is someone else - ERROR");
						objSetPage.shareMenu.click();
					else
						System.out.println("share icon disabled , owner is someone else - OK");  

					BasePage.screenshotOnPass("nonOwner");
				    BasePage.onSuccessMeassage("nonOwner", "nonOwner", "Module - SET , Description of the test executed : Non-owner cannot delete or share set");
					
				
		
				
				}
				
				   
			
			}
			
			
			
		
		}
		catch(Throwable ex)
		{
			BasePage.captureScreenshot("nonOwnerFail");
			BasePage.onFailreMeassage(ex.getMessage(),"nonOwnerFail","Module - SET , Description of the test executed : Non-owner cannot delete or share set");

		}
	} */

	
	@Test(priority = 61, description = "Set stands deleted in Non-owner's list, if deleted by the owner")
	public void DeletedSetSearch_NonOwner_Test() throws Throwable  {
		
		String text=null;
		int count=0;
		int number=0;
		double num;
		double c;

		try {
			
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim();
			

			System.out.println("setName : "+setName);
			
			objSetPage.myDataBtn.click();
			Thread.sleep(10000);
			objSetPage.mouseHoverSet();
			Thread.sleep(5000);
			
			//System.out.println("Number of items : "+objSetPage.NoOfPages.getText());
			System.out.println("Number of items : "+objSetPage.NoOfItems.getText());
			text=objSetPage.NoOfItems.getText(); 
			String[] pageValue =text.split(" ");
			String pageValueCount = pageValue[5].trim();
			
			System.out.println("pageValueCount : "+pageValueCount);
			number = Integer.parseInt(pageValueCount);
			System.out.println(number); 
			num=number/10;
			System.out.println(num); 
			c=Math.ceil(num);
			System.out.println(Math.ceil(num)); 
		

	      
			
	            while(count<=c)  
			      {
			    	
			         for(WebElement element : objSetPage.setList)
			           {
				
				          text=element.getText();
				          if(text.equals(setName))
				          {
					      System.out.println("Deleted by owner found here!! - ERROR");
				          }
				          else
				          {
					
				          }
                       }
			    
			    //if(objSetPage.forward.isEnabled())
			    if(count<c)
				objSetPage.forward.click(); 
				Thread.sleep(3000);
				count++;
          
	               } 
		    
                BasePage.screenshotOnPass("DeletedSetSearch_NonOwner");
			    BasePage.onSuccessMeassage("DeletedSetSearch_NonOwner", "DeletedSetSearch_NonOwner", "Module - SET , Description of the test executed : Non-owner cannot delete or share set");
			    objSetPage.Home();
		      

				    
	        }
		
		
	
		catch(Exception ex) {
			 
	      }
	} 
	
	
	@Test(priority = 62, description = "Verify entries of set")
	public void VerifyEntries_Test() throws Throwable {
		try {

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			String searchText = setParameters[2].trim();

		
			
			
			objSetPage.Set();
			Thread.sleep(2000);
			objSetPage.addSet();
			objSetPage.verifyEntityType("Uncategorized");
			objSetPage.setTitle(setName);
			objSetPage.selectEntity(entity);
			objSetPage.searchItems(searchText); 
			Thread.sleep(2000);
			objSetPage.AddandAccept(); 	
			BasePage.waitforAnElement(objSetPage.editCardIcon);
			ExtentTestManager.getTest().log(Status.PASS, "Set "+ setName +" is Created");
			
			
		


			//List <String> setItems1 = objSetPage.getItemsWhileCreatingSet(); 
			
		   // System.out.println("First list size : "+setItems1.size());
			
			
			System.out.println("First data size : "+objSetPage.dataList1.size());
			
			List <String> StringList1 = new ArrayList<String>() ;
		
			
			for(WebElement element : objSetPage.dataList1)
			{
				String SetItemLCase = element.getText().toLowerCase();
				StringList1.add(SetItemLCase);
			}
			
			System.out.println("First list size : "+StringList1.size());
			
			
			
			//objSetPage.createCheck(setName);
			objSetPage.Home();
		
			
			
			//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
			//Start with second set
			
			objSetPage.Set();
			objSetPage.addSet();
			objSetPage.verifyEntityType("Uncategorized");
			objSetPage.setTitle("SecondSet"); 
			objSetPage.selectEntity(entity);
			objSetPage.addItemsFromSet(setName); 
			objSetPage.accept();
			BasePage.waitforAnElement(objSetPage.editCardIcon);
			//ExtentTestManager.getTest().log(Status.PASS, "Set "+ setToCreate +" Created from Set " + existingSetName);
			//objSetPage.createCheck("SecondSet");
			
			//List <String> setItems2 = objSetPage.getItemsWhileCreatingSet(); 
			// System.out.println("First list size : "+setItems2.size());
			
	System.out.println("Second data size : "+objSetPage.dataList1.size());
			
			List <String> StringList2 = new ArrayList<String>() ;
		
			
			for(WebElement element : objSetPage.dataList1)
			{
				String SetItemLCase = element.getText().toLowerCase();
				StringList2.add(SetItemLCase);
			}
			
			System.out.println("Second list size : "+StringList2.size());
			
			
			if(StringList1.equals(StringList2))
				System.out.println("MATCH");
			
			
			
			BasePage.screenshotOnPass("VerifyEntries");
		    BasePage.onSuccessMeassage("VerifyEntries", "VerifyEntries", "Module - SET , Description of the test executed : Verify entries of set");
		    objSetPage.Home();
		
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("VerifyEntriesFail");
			BasePage.onFailreMeassage(ex.getMessage(),"VerifyEntriesFail","Module - SET , Description of the test executed : Verify entries of set");
			
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("VerifyEntriesFail");
			BasePage.onFailreMeassage(ex.getMessage(),"VerifyEntriesFail","Module - SET , Description of the test executed : Verify entries of set");
			
		}
	}
	
	@Test(priority = 63, description = "Drag and drop a file")
	public void DragAndDrop_Test() throws Throwable {
		try {

			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] setParameters =value.split(",");
			String setName = setParameters[0].trim()+dtText;
			String entity = setParameters[1].trim();
			

		
			
			
			objSetPage.Set();
			Thread.sleep(2000);
			objSetPage.addSet();
			objSetPage.verifyEntityType("Uncategorized");
			objSetPage.setTitle(setName);
			objSetPage.selectEntity(entity);
			Thread.sleep(2000);
			
			
			objSetPage.DragAndDrop();
			
			
			
			objSetPage.AddandAccept(); 	
			BasePage.waitforAnElement(objSetPage.editCardIcon);
			ExtentTestManager.getTest().log(Status.PASS, "Set "+ setName +" is Created");
			
			
		


		
			
			
			
			BasePage.screenshotOnPass("VerifyEntries");
		    BasePage.onSuccessMeassage("VerifyEntries", "VerifyEntries", "Module - SET , Description of the test executed : Verify entries of set");
		    objSetPage.Home();
		
		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("VerifyEntriesFail");
			BasePage.onFailreMeassage(ex.getMessage(),"VerifyEntriesFail","Module - SET , Description of the test executed : Verify entries of set");
			
		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("VerifyEntriesFail");
			BasePage.onFailreMeassage(ex.getMessage(),"VerifyEntriesFail","Module - SET , Description of the test executed : Verify entries of set");
			
		}
	}



}

