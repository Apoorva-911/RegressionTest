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

public class ComparisonRegression extends BaseTest{

	ComparisonPage objComparisonPage; 

	Date dt = new Date();
	DateFormat dtFrmt = new SimpleDateFormat("_HHmmss");
	String dtText = dtFrmt.format(dt);

	@BeforeClass
	public void beforeClass() throws AWTException, InterruptedException  {	
		objComparisonPage = new ComparisonPage();		
	}

	@Test(priority = 0, description = "Create Comparison with a control and Verify")
	public void CreateComparisonWithContol_Test() throws Throwable {
		try {

			String successMessage = "Comparison is Created Successfully with Control Card";
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] ComParameters =value.split(",");
			String ComName = ComParameters[0].trim()+dtText;
			String ControlSetName = ComParameters[1].trim();
			String entity = ComParameters[2].trim();
			String searchTextInControl = ComParameters[3].trim();

			/* Creates an Comparison with control and Verify */	
			objComparisonPage.createComparisonWithControl(ComName,ControlSetName,entity,searchTextInControl);
			//			objComparisonPage.createComparisonWithControl("Comparison Control 1", "Control Set ","Disease", "kera");
			//onSuccessMeassage("Comparison is Created Successfully with Control Card");
		
			BasePage.screenshotOnPass("createComparisonWithControlPass");
		    BasePage.onSuccessMeassage(successMessage, "createComparisonWithControlPass","Module - COMPARISON , Description of the test executed : Comparison is Created Successfully with Control Card"); 

    	}
      	catch(Exception ex){
      		BasePage.captureScreenshot("createComparisonWithControlFail");
      		BasePage.onFailreMeassage(ex.getMessage(),"createComparisonWithControlFail","Module - COMPARISON , Description of the test executed : Comparison is not Created Successfully with Control Card");								
										
		}
			
			
			
			/*}
		catch(Throwable ex)
		{
			objComparisonPage.captureScreenshot("createComparisonWithControlFail");
			onFailureMeassage(ex.getMessage(),"createComparisonWithControlFail","createComparisonWithControlFail");
		}*/
	}	

	@Test(priority = 1, description = "Create Comparison From Set")
	public void CreateComparisonFromSet_Test() throws Throwable {
		try {

			String successMessage = "Comparison is Created Successfully From Set";
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] ComParameters =value.split(",");
			String BaseSetName = ComParameters[0].trim()+dtText;
			String entity = ComParameters[1].trim();
			String searchTextInSet = ComParameters[2].trim();
			String ComName = ComParameters[3].trim()+dtText;
			String searchTextInControl = ComParameters[4].trim();

			/* Creates an Comparison Control Card From Set */	
			objComparisonPage.CreateComparisonFromSet(BaseSetName,entity,searchTextInSet,ComName,searchTextInControl);
			//			objComparisonPage.CreateComparisonFromSet("SetAddC 1", "Disease", "kera", "ComFrom Set 1", "Control Card");
			//onSuccessMeassage("Comparison is Created Successfully From Set");
			BasePage.screenshotOnPass("createComparisonFromSetPass");
		    BasePage.onSuccessMeassage(successMessage, "createComparisonFromSetPass","Module - COMPARISON , Description of the test executed : Comparison is Created Successfully From Set"); 

		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("createComparisonFromSetFail");
			BasePage.onFailreMeassage(ex.getMessage(),"createComparisonFromSetFail","Module - COMPARISON , Description of the test executed : Comparison is Created Successfully From Set"); 

		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("createComparisonFromSetFail");
			BasePage.onFailreMeassage(ex.getMessage(),"createComparisonFromSetFail","Module - COMPARISON , Description of the test executed : Comparison is Created Successfully From Set"); 
}
		
		
		
	/*	}
		catch(Exception ex)
		{
			objComparisonPage.captureScreenshot("createComparisonFromSetFail");
			onFailureMeassage(ex.getMessage(),"createComparisonFromSetFail","createComparisonFromSetFail");
		}
		catch(AssertionError ex)
		{
			objComparisonPage.captureScreenshot("createComparisonFromSetFail");
			onFailureMeassage(ex.getMessage(),"createComparisonFromSetFail","createComparisonFromSetFail");
		}*/
	}

	@Test(priority = 2, description = "Create Comparison From File")
	public void CreateComparisonFromFile_Test() throws Throwable {
		try {

			String successMessage = "Comparison is Created Successfully From File";
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] ComParameters =value.split(",");
			String ComName = ComParameters[0].trim()+dtText;
			String ControlSetName = ComParameters[1].trim();
			String entity = ComParameters[2].trim();
			String fileLocation = ComParameters[3].trim();

			/* Creates an Comparison Control Card From File */	 
			objComparisonPage.CreateComparisonFromFile(ComName,ControlSetName,entity,fileLocation);
			//			objComparisonPage.CreateComparisonFromFile("ComFileUpload", "Control Set", "Disease", "C:\\Users\\MugunthRaman\\git\\EagleAutomation\\Resources\\Q4 - Upload file - 1 (2).xlsx");
			//onSuccessMeassage("Comparison is Created Successfully From File");
			BasePage.screenshotOnPass("createComparisonFromFilePass");
		    BasePage.onSuccessMeassage(successMessage, "createComparisonFromFilePass","Module - COMPARISON , Description of the test executed : Comparison is Created Successfully From File"); 

		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("createComparisonFromFileFail");
			BasePage.onFailreMeassage(ex.getMessage(),"createComparisonFromFileFail","Module - COMPARISON , Description of the test executed : Comparison is Created Successfully From File"); 

		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("createComparisonFromFileFail");
			BasePage.onFailreMeassage(ex.getMessage(),"createComparisonFromFileFail","Module - COMPARISON , Description of the test executed : Comparison is Created Successfully From File"); 
        }
	
		
		/*}
		catch(Exception ex)
		{
			objComparisonPage.captureScreenshot("createComparisonFromFileFail");
			onFailureMeassage(ex.getMessage(),"createComparisonFromFileFail","createComparisonFromFileFail");
		}
		catch(AssertionError ex)
		{
			objComparisonPage.captureScreenshot("createComparisonFromFileFail");
			onFailureMeassage(ex.getMessage(),"createComparisonFromFileFail","createComparisonFromFileFail");
		}*/
	}

	@Test(priority = 3, description = "Create Comparison with Control and Case and Verify")
	public void CreateComparisonWithContolandCase_Test() throws Throwable {
		try {

			String successMessage = "Comparison is Created Successfully with Control and Case Card";
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] ComParameters =value.split(",");
			String ComName = ComParameters[0].trim()+dtText;
			String ControlSetName = ComParameters[1].trim();
			String CaseSetName = ComParameters[2].trim();
			String entity = ComParameters[3].trim();
			String searchTextInControl = ComParameters[4].trim();
			String searchTextInCase = ComParameters[5].trim();

			/* Creates an Comparison with control and Case and Verify */	
			objComparisonPage.createComparisonWithControlandCase(ComName,ControlSetName,CaseSetName,entity, searchTextInControl,searchTextInCase);
			//			objComparisonPage.createComparisonWithControlandCase("Comparison Control and Case 1", "Control Set", "Case Set","Disease", "kera","buy");
			//onSuccessMeassage("Comparison is Created Successfully with Control and Case Card");
			BasePage.screenshotOnPass("createComparisonWithControlandCaseSetPass");
		    BasePage.onSuccessMeassage(successMessage, "createComparisonWithControlandCaseSetPass","Module - COMPARISON , Description of the test executed : Comparison is Created Successfully with Control and Case Card"); 

		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("createComparisonWithControlandCaseSetFail");
			BasePage.onFailreMeassage(ex.getMessage(),"createComparisonWithControlandCaseSetFail","Module - COMPARISON , Description of the test executed : Comparison is Created Successfully with Control and Case Card"); 

		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("createComparisonWithControlandCaseSetFail");
			BasePage.onFailreMeassage(ex.getMessage(),"createComparisonWithControlandCaseSetFail","Module - COMPARISON , Description of the test executed : Comparison is Created Successfully with Control and Case Card"); 
        }
		
		
		
		
	/*	}
		catch(Throwable ex)
		{
			objComparisonPage.captureScreenshot("createComparisonWithControlandCaseSetFail");
			onFailureMeassage(ex.getMessage(),"createComparisonWithControlandCaseSetFail","createComparisonWithControlandCaseSetFail");
		}*/
	}	

	@Test(priority = 4, description = "Create Comparison with Control & Case and Run Comparison")
	public void createComparisonWithControlandCaseRunComparison_Test() throws Throwable {
		try {

			String successMessage = "Comparison is Created Successfully with Control & Case Card - Comaparison Run is done";
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] ComParameters =value.split(",");
			String ComName = ComParameters[0].trim()+dtText;
			String ControlSetName = ComParameters[1].trim();
			String CaseSetName = ComParameters[2].trim();
			String entity = ComParameters[3].trim();
			String searchInControl = ComParameters[4].trim();
			String searchInCase = ComParameters[5].trim();

			/* Creates an Comparison with Control & Case and Run Comparison */		 
			objComparisonPage.createComparisonWithcontrolandCaseRunComparison(ComName,ControlSetName,CaseSetName,entity,searchInControl,searchInCase);
			//			objComparisonPage.createComparisonWithcontrolandCaseRunComparison("Comparison Control and Case 2", "Control Set", "Case Set","Disease", "kera","buy");
			//onSuccessMeassage("Comparison is Created Successfully with Control & Case Card - Comaparison Run is done");
		
			BasePage.screenshotOnPass("createComparisonWithControlandCaseRunPass");
		    BasePage.onSuccessMeassage(successMessage, "createComparisonWithControlandCaseRunPass","Module - COMPARISON , Description of the test executed : Comparison is Created Successfully with Control & Case Card - Comaparison Run is done"); 

		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("createComparisonWithControlandCaseRunFail");
			BasePage.onFailreMeassage(ex.getMessage(),"createComparisonWithControlandCaseRunFail","Module - COMPARISON , Description of the test executed : Comaparison Run not done"); 

		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("createComparisonWithControlandCaseRunFail");
			BasePage.onFailreMeassage(ex.getMessage(),"createComparisonWithControlandCaseRunFail","Module - COMPARISON , Description of the test executed : Comaparison Run not done"); 
        }
		
		
		
	/*	}
		catch(Throwable ex)
		{
			objComparisonPage.captureScreenshot("createComparisonWithControlandCaseRunFail");
			onFailureMeassage(ex.getMessage(),"createComparisonWithControlandCaseRunFail","createComparisonWithControlandCaseRunFail");
		}*/
	}	

	@Test(priority = 5, description = "Update an Existing Comparison with a case Card")
	public void updateComparisonWithCaseCard_Test() throws Throwable {
		try {

			String successMessage = "Comparison is updated Successfully with a Case Card";
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] ComParameters =value.split(",");
			String ComName = ComParameters[0].trim();
			String entity = ComParameters[1].trim();
			String CaseSetName = ComParameters[2].trim();
			String searchTextInCase = ComParameters[3].trim();

			/* Updates an existing Comparison with a Case Card */	
			objComparisonPage.updateComparisonWithCaseCard(ComName,entity,CaseSetName,searchTextInCase);
			//			objComparisonPage.updateComparisonWithCaseCard("Comparison Control and Case 1", "Disease", "Case Set2","soy");
			//onSuccessMeassage("Comparison is updated Successfully with a Case Card");
		
			BasePage.screenshotOnPass("updateComparisonWithCaseCardPass");
		    BasePage.onSuccessMeassage(successMessage, "updateComparisonWithCaseCardPass","Module - COMPARISON , Description of the test executed : Comparison is updated Successfully with a Case Card"); 

		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("updateComparisonWithCaseCardFail");
			BasePage.onFailreMeassage(ex.getMessage(),"updateComparisonWithCaseCardFail","Module - COMPARISON , Description of the test executed : Comparison is not updated Successfully with a Case Card"); 

		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("updateComparisonWithCaseCardFail");
			BasePage.onFailreMeassage(ex.getMessage(),"updateComparisonWithCaseCardFail","Module - COMPARISON , Description of the test executed : Comparison is not updated Successfully with a Case Cardh"); 
        }
		
		
		/*}
		catch(Throwable ex)
		{
			objComparisonPage.captureScreenshot("updateComparisonWithCaseCardFail");
			onFailureMeassage(ex.getMessage(),"updateComparisonWithCaseCardFail","updateComparisonWithCaseCardFail");
		}*/
	}	

	@Test(priority = 6, description = "Search A Text In Comparison Expand")
	public void SearchInComparisonExpand_Test() throws Throwable  {
		try {

			String successMessage = "Search successful in Set Expand";
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] ComParameters =value.split(",");
			String ComName = ComParameters[0].trim()+dtText;
			String ControlSetName = ComParameters[1].trim();
			String entity = ComParameters[2].trim();
			String searchTextInControl = ComParameters[3].trim();
			String searchTextInExpand = ComParameters[4].trim();

			/* To Search a Text in Expanded Comparison */
			objComparisonPage.searchInComparisonExpand(ComName, ControlSetName,entity,searchTextInControl,searchTextInExpand);
			//			objComparisonPage.searchInComparisonExpand("search Comparison","Control Set" ,"Disease", "kera", "le");
			//onSuccessMeassage("Search successful in Set Expand");
		
		
			BasePage.screenshotOnPass("SearchInSetExpandPass");
		    BasePage.onSuccessMeassage(successMessage, "SearchInSetExpandPass","Module - COMPARISON , Description of the test executed : Search successful in Set Expand"); 

		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("SearchInSetExpandFail");
			BasePage.onFailreMeassage(ex.getMessage(),"SearchInSetExpandFail","Module - COMPARISON , Description of the test executed : Search in Set Expand"); 

		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("SearchInSetExpandFail");
			BasePage.onFailreMeassage(ex.getMessage(),"SearchInSetExpandFail","Module - COMPARISON , Description of the test executed : Search in Set Expand"); 
        }
			
			
		
	/*	}
		catch(Exception ex)
		{
			objComparisonPage.captureScreenshot("SearchInSetExpandFail");
			onFailureMeassage(ex.getMessage(),"SearchInSetExpandFail","SearchInSetExpandFail");
		}
		catch(AssertionError ex)
		{
			objComparisonPage.captureScreenshot("SearchInSetExpandFail");
			onFailureMeassage(ex.getMessage(),"SearchInSetExpandFail","SearchInSetExpandFail");
		}*/
	}

	@Test(priority = 7, description = "Delete Card in Comparison Expand")
	public void DeleteCardInComparisonExpand_Test() throws Throwable  {
		try {

			String successMessage = "Delete Card from Expanded Comparison";
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] ComParameters =value.split(",");
			String ComName = ComParameters[0].trim()+dtText;
			String ControlSetName = ComParameters[1].trim();
			String entity = ComParameters[2].trim();
			String searchTextInControl = ComParameters[3].trim();

			/* Delete Set from Expanded Set */
			objComparisonPage.DeleteExploraionInExpand(ComName, ControlSetName,entity,searchTextInControl);
			//			objComparisonPage.DeleteExploraionInExpand("DComparison2", "Control Set","Disease", "kera");
			//onSuccessMeassage("Delete Card from Expanded Comparison");
	
			BasePage.screenshotOnPass("DeleteComparisonInExpandPass");
		    BasePage.onSuccessMeassage(successMessage, "DeleteComparisonInExpandPass","Module - COMPARISON , Description of the test executed : Delete Card in Comparison Expand"); 

		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("DeleteComparisonInExpandFail");
			BasePage.onFailreMeassage(ex.getMessage(),"DeleteComparisonInExpandFail","Module - COMPARISON , Description of the test executed : Delete Card in Comparison Expand"); 

		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("DeleteComparisonInExpandFail");
			BasePage.onFailreMeassage(ex.getMessage(),"DeleteComparisonInExpandFail","Module - COMPARISON , Description of the test executed : Delete Card in Comparison Expand"); 
        }
		
		
		
	/*	}
		catch(Exception ex)
		{
			objComparisonPage.captureScreenshot("DeleteComparisonInExpandFail");
			onFailureMeassage(ex.getMessage(),"DeleteComparisonInExpandFail","DeleteComparisonInExpandFail");
		}
		catch(AssertionError ex)
		{
			objComparisonPage.captureScreenshot("DeleteComparisonInExpandFail");
			onFailureMeassage(ex.getMessage(),"DeleteComparisonInExpandFail","DeleteComparisonInExpandFail");
		}	*/	
	}

	@Test(priority = 8, description = "Delete The first Card in Comparison")
	public void DeleteComparisonFirstCard_Test() throws Throwable  {
		try {

			String successMessage = "Deleted The first Card in Comparison Successfully";
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] ComParameters =value.split(",");
			String ComName = ComParameters[0].trim()+dtText;
			String ControlSetName = ComParameters[1].trim();
			String entity = ComParameters[2].trim();
			String searchTextInControl = ComParameters[3].trim();

			/* Delete The first Card (control) in Comparison */
			objComparisonPage.deleteComparisonInFirstCard(ComName,ControlSetName,entity,searchTextInControl);
			//			objComparisonPage.deleteComparisonInFirstCard("DComparison1Card", "Control Set", "Disease", "kera");
			//onSuccessMeassage("Deleted The first Card in Comparison Successfully");
		
			BasePage.screenshotOnPass("ComparisonFirstCardDeletePass");
		    BasePage.onSuccessMeassage(successMessage, "ComparisonFirstCardDeletePass","Module - COMPARISON , Description of the test executed : Delete The first Card in Comparison"); 

		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("ComparisonFirstCardDeleteFail");
			BasePage.onFailreMeassage(ex.getMessage(),"ComparisonFirstCardDeleteFail","Module - COMPARISON , Description of the test executed : Delete The first Card in Comparison"); 

		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("ComparisonFirstCardDeleteFail");
			BasePage.onFailreMeassage(ex.getMessage(),"ComparisonFirstCardDeleteFail","Module - COMPARISON , Description of the test executed : Delete The first Card in Comparison"); 
        }
		
		
	/*	}
		catch(Exception ex)
		{
			objComparisonPage.captureScreenshot("ComparisonFirstCardDeleteFail");
			onFailureMeassage(ex.getMessage(),"ComparisonFirstCardDeleteFail","ComparisonFirstCardDeleteFail");
		}
		catch(AssertionError ex)
		{
			objComparisonPage.captureScreenshot("ComparisonFirstCardDeleteFail");
			onFailureMeassage(ex.getMessage(),"ComparisonFirstCardDeleteFail","ComparisonFirstCardDeleteFail");
		}*/
	}

	@Test(priority = 9, description = "Delete The Second Card in Comparison")
	public void DeleteComparisonSecondCard_Test() throws Throwable  {
		try {

			String successMessage = "Deleted The first Card in Comparison Successfully";
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] ComParameters =value.split(",");
			String ComName = ComParameters[0].trim()+dtText;
			String ControlSetName = ComParameters[1].trim();
			String CaseSetName = ComParameters[2].trim();
			String entity = ComParameters[3].trim();
			String searchTextInControl = ComParameters[4].trim();
			String searchTextInCase = ComParameters[5].trim();

			/* Delete The Second Card (case) in Comparison */
			objComparisonPage.deleteComparisonInLaterCard(ComName,ControlSetName,CaseSetName,entity,searchTextInControl,searchTextInCase);
			//			objComparisonPage.deleteComparisonInLaterCard("DComparison2Card", "Control Card","Case Card" ,"Disease", "kera","lor");
			//onSuccessMeassage("Deleted The first Card in Comparison Successfully");
		
			BasePage.screenshotOnPass("ComparisonSecondCardDeletePass");
		    BasePage.onSuccessMeassage(successMessage, "ComparisonSecondCardDeletePass","Module - COMPARISON , Description of the test executed : Delete The Second Card in Comparison"); 

		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("ComparisonSecondCardDeleteFail");
			BasePage.onFailreMeassage(ex.getMessage(),"ComparisonSecondCardDeleteFail","Module - COMPARISON , Description of the test executed : Delete The Second Card in Comparison"); 

		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("ComparisonSecondCardDeleteFail");
			BasePage.onFailreMeassage(ex.getMessage(),"ComparisonSecondCardDeleteFail","Module - COMPARISON , Description of the test executed : Delete The Second Card in Comparison"); 
        }
		
		
		
		
		
	/*	}
		catch(Exception ex)
		{
			objComparisonPage.captureScreenshot("ComparisonSecondCardDeleteFail");
			onFailureMeassage(ex.getMessage(),"ComparisonSecondCardDeleteFail","ComparisonSecondCardDeleteFail");
		}
		catch(AssertionError ex)
		{
			objComparisonPage.captureScreenshot("ComparisonSecondCardDeleteFail");
			onFailureMeassage(ex.getMessage(),"ComparisonSecondCardDeleteFail","ComparisonSecondCardDeleteFail");
		} */
	}

	@Test(priority = 10, description = "Comparison - Expand and add items from Catalog")
	public void ComparisonExpandAddFromCatalog_Test() throws Throwable  {
		try {

			String successMessage = "Items Added from Catalog into Comparison successfully";
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] ComParameters =value.split(",");
			String ComName = ComParameters[0].trim()+dtText;
			String ControlSetName = ComParameters[1].trim();
			String entity = ComParameters[2].trim();
			String searchTextInControl = ComParameters[3].trim();
			String searchTextInCatalog = ComParameters[4].trim();

			/* Set - Expand and add items from Catalog */
			objComparisonPage.ExpandAddFromCatalog(ComName,ControlSetName,entity,searchTextInControl,searchTextInCatalog);
			//			objComparisonPage.ExpandAddFromCatalog("ComAddFromCatalog", "Control Card", "Disease", "aber", "worm");
			objComparisonPage.saveChanges();
			//onSuccessMeassage("Items Added from Catalog into Comparison successfully");
		
			BasePage.screenshotOnPass("ComparisonExpandAddFromCatalogPass");
		    BasePage.onSuccessMeassage(successMessage, "ComparisonExpandAddFromCatalogPass","Module - COMPARISON , Description of the test executed : Comparison - Expand and add items from Catalog"); 

		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("ComparisonExpandAddFromCatalogFail");
			BasePage.onFailreMeassage(ex.getMessage(),"ComparisonExpandAddFromCatalogFail","Module - COMPARISON , Description of the test executed : Comparison - Expand and add items from Catalog"); 

		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("ComparisonExpandAddFromCatalogFail");
			BasePage.onFailreMeassage(ex.getMessage(),"ComparisonExpandAddFromCatalogFail","Module - COMPARISON , Description of the test executed : Comparison - Expand and add items from Catalog"); 
        }
		
		
		
	/*	}
		catch(Exception | AssertionError ex)
		{
			BasePage.scrollToTop();
			objComparisonPage.captureScreenshot("ComparisonExpandAddFromCatalogFail");
			onFailureMeassage(ex.getMessage(),"ComparisonExpandAddFromCatalogFail","ComparisonExpandAddFromCatalogFail");
		}*/
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
	   


	@Test(priority = 12, description = "Comparison - Expand and add items from File")
	public void ComparisonExpandAddFromFile_Test() throws Throwable  {
		try {

			String successMessage = "Items Added from File into Comparison successfully";
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] ComParameters = value.split(",");
			String ComName = ComParameters[0].trim()+dtText;
			String ControlSetName = ComParameters[1].trim();
			String entity = ComParameters[2].trim();
			String searchTextInControl = ComParameters[3].trim();
			String fileUploadEntity = ComParameters[4].trim();
			String fileLocation = ComParameters[5].trim();
			String fileName = ComParameters[6].trim();

			/* Comparison - Expand and add items from File */
			objComparisonPage.ExpandAddFromFile(ComName,ControlSetName,entity,searchTextInControl,fileUploadEntity, fileLocation,fileName);
			//			objComparisonPage.ExpandAddFromFile("ComAddfromFile 1","Control Card", "Disease","kera","Disease", "C:\\Users\\MugunthRaman\\git\\EagleAutomation\\Resources\\Q4 - Upload file - 1 (2).xlsx", "Q4 - Upload file - 1 (2).xlsx");
			objComparisonPage.saveChanges();
			//onSuccessMeassage("Items Added from File into Comparison successfully");
		
			BasePage.screenshotOnPass("ComparisonExpandAddFromFilePass");
		    BasePage.onSuccessMeassage(successMessage, "ComparisonExpandAddFromFilePass","Module - COMPARISON , Description of the test executed : Comparison - Expand and add items from File"); 

		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("ComparisonExpandAddFromFileFail");
			BasePage.onFailreMeassage(ex.getMessage(),"ComparisonExpandAddFromFileFail","Module - COMPARISON , Description of the test executed : Comparison - Expand and add items from File"); 

		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("ComparisonExpandAddFromFileFail");
			BasePage.onFailreMeassage(ex.getMessage(),"ComparisonExpandAddFromFileFail","Module - COMPARISON , Description of the test executed : Comparison - Expand and add items from File"); 
        }
		
		
		
		
	/*	}
		catch(Exception ex)
		{
			objComparisonPage.captureScreenshot("ComparisonExpandAddFromFileFail");
			onFailureMeassage(ex.getMessage(),"ComparisonExpandAddFromFileFail","ComparisonExpandAddFromFileFail");
		}
		catch(AssertionError ex)
		{
			objComparisonPage.captureScreenshot("ComparisonExpandAddFromFileFail");
			onFailureMeassage(ex.getMessage(),"ComparisonExpandAddFromFileFail","ComparisonExpandAddFromFileFail");
		}*/
	}

	@Test(priority = 13, description = "Comparison - Create with multiple Case Cards")
	public void ComparisonCreateMultipleCaseCards_Test() throws Throwable  {
		try {

			String successMessage = "Comparison Created and added with multiple Case Cards Successfully";
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] ComParameters = value.split(",");
			String ComName = ComParameters[0].trim()+dtText;
			String ControlSetName = ComParameters[1].trim();
			String entity = ComParameters[2].trim();
			String searchTextInControl = ComParameters[3].trim();
			String NoOfCaseCardstocreate = ComParameters[4].trim();

			/* Comparison - Create with multiple Cards */		
			objComparisonPage.createComparisonWithControlandMultipleCase(ComName, ControlSetName,entity, searchTextInControl, Integer.parseInt(NoOfCaseCardstocreate));
			//			objComparisonPage.createComparisonWithControlandMultipleCase("CompRela 2", "Control Set",  "Disease", "kera", 2);
			//onSuccessMeassage("Comparison Created and added with multiple Case Cards Successfully");
		
			BasePage.screenshotOnPass("ComparisonAdd2RelationPass");
		    BasePage.onSuccessMeassage(successMessage, "ComparisonAdd2RelationPass","Module - COMPARISON , Description of the test executed : Comparison - Create with multiple Case Cards"); 

		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("ComparisonAdd2RelationFail");
			BasePage.onFailreMeassage(ex.getMessage(),"ComparisonAdd2RelationFail","Module - COMPARISON , Description of the test executed : Comparison - Create with multiple Case Cards"); 

		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("ComparisonAdd2RelationFail");
			BasePage.onFailreMeassage(ex.getMessage(),"ComparisonAdd2RelationFail","Module - COMPARISON , Description of the test executed : Comparison - Create with multiple Case Cards"); 
        }
		
		
	/*	}
		catch(Exception | AssertionError ex)
		{
			objComparisonPage.captureScreenshot("ComparisonAdd2RelationFail");
			onFailureMeassage(ex.getMessage(),"ComparisonAdd2RelationFail","ComparisonAdd2RelationFail");
		}*/
	}

	@Test(priority = 14, description = "Comparison - Create with multiple Case Cards and Run Comparison")
	public void ComparisonCreateMultipleCaseCardsRunComparison_Test() throws Throwable  {
		try {

			String successMessage = "Comparison Created and added with multiple Case Cards Run comparison Successfully";
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] ComParameters = value.split(",");
			String ComName = ComParameters[0].trim()+dtText;
			String ControlSetName = ComParameters[1].trim();
			String entity = ComParameters[2].trim();
			String searchTextInControl = ComParameters[3].trim();
			String NoOfCaseCardstocreate = ComParameters[4].trim();

			/* Comparison - Create with multiple Cards with Run Comparison */
			objComparisonPage.createComparisonWithControlandMultipleCaseRunComparison(ComName, ControlSetName,entity,searchTextInControl,Integer.parseInt(NoOfCaseCardstocreate));
			//			objComparisonPage.createComparisonWithControlandMultipleCaseRunComparison("CompRela 3", "Control Set",  "Disease", "kera", 3);
			//onSuccessMeassage("Comparison Created and added with multiple Case Cards Run comparison Successfully");
		
			BasePage.screenshotOnPass("ComparisonAdd2RelationPass");
		    BasePage.onSuccessMeassage(successMessage, "ComparisonAdd2RelationPass","Module - COMPARISON , Description of the test executed : Comparison - Create with multiple Case Cards and Run Comparison"); 

		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("ComparisonAdd2RelationFail");
			BasePage.onFailreMeassage(ex.getMessage(),"ComparisonAdd2RelationFail","Module - COMPARISON , Description of the test executed : Comparison - Create with multiple Case Cards and Run Comparison"); 

		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("ComparisonAdd2RelationFail");
			BasePage.onFailreMeassage(ex.getMessage(),"ComparisonAdd2RelationFail","Module - COMPARISON , Description of the test executed : Comparison - Create with multiple Case Cards and Run Comparison"); 
        }
		
		
		
		
	/*	}
		catch(Exception | AssertionError ex)
		{
			objComparisonPage.captureScreenshot("ComparisonAdd2RelationFail");
			onFailureMeassage(ex.getMessage(),"ComparisonAdd2RelationFail","ComparisonAdd2RelationFail");
		}*/
	}

	@Test(priority = 15, description = "Create And Delete An Comparison")
	public void CreateAndDeleteComparison_Test() throws Throwable  {
		try {

			String successMessage = "Created And Deleted An Comparison Successfully";
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] ComParameters =value.split(",");
			String ComName = ComParameters[0].trim()+dtText;
			String ControlSetName = ComParameters[1].trim();
			String entity = ComParameters[2].trim();
			String searchTextInControl = ComParameters[3].trim();

			/* Create And Delete An Comparison */ 
			objComparisonPage.createAndDeleteComparison(ComName,ControlSetName,entity,searchTextInControl);
			//			objComparisonPage.createAndDeleteComparison("Delete Com1", "Control Set", "Disease","kera");
			//onSuccessMeassage("Created And Deleted An Comparison Successfully");
		
			BasePage.screenshotOnPass("CreateAndDeleteComparisonPass");
		    BasePage.onSuccessMeassage(successMessage, "CreateAndDeleteComparisonPass","Module - COMPARISON , Description of the test executed : Create And Delete An Comparison"); 

		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("CreateAndDeleteComparisonFail");
			BasePage.onFailreMeassage(ex.getMessage(),"CreateAndDeleteComparisonFail","Module - COMPARISON , Description of the test executed : Create And Delete An Comparison"); 

		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("CreateAndDeleteComparisonFail");
			BasePage.onFailreMeassage(ex.getMessage(),"CreateAndDeleteComparisonFail","Module - COMPARISON , Description of the test executed : Create And Delete An Comparison"); 
        }
		
		
	/*	}
		catch(Exception ex)
		{
			objComparisonPage.captureScreenshot("CreateAndDeleteComparisonFail");
			onFailureMeassage(ex.getMessage(),"CreateAndDeleteComparisonFail","CreateAndDeleteComparisonFail");
		}
		catch(AssertionError ex)
		{
			objComparisonPage.captureScreenshot("CreateAndDeleteComparisonFail");
			onFailureMeassage(ex.getMessage(),"CreateAndDeleteComparisonFail","CreateAndDeleteComparisonFail");
		}*/
	}

	@Test(priority = 16, description = "Create And Share An Comparison")
	public void CreateAndShareComparison_Test() throws Throwable  {
		try {

			String successMessage = "Created And Shared An Comparison Successfully";
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] ComParameters =value.split(",");
			String ComName = ComParameters[0].trim()+dtText;
			String ControlSetName = ComParameters[1].trim();
			String entity = ComParameters[2].trim();
			String searchTextInControl = ComParameters[3].trim();
			String mailIDtoShareto = ComParameters[4].trim();

			/* Create And Share An Comparison */ 
			objComparisonPage.createAndShareComparison(ComName, ControlSetName,entity,searchTextInControl,mailIDtoShareto);
			//			objComparisonPage.createAndShareComparison("Share Com1", "Control Set","Disease","kera","mugunth.raman@eaglegenomics.com");
			//onSuccessMeassage("Created And Shared An Comparison Successfully");
		
			BasePage.screenshotOnPass("CreateAndShareComparisonPass");
		    BasePage.onSuccessMeassage(successMessage, "CreateAndShareComparisonPass","Module - COMPARISON , Description of the test executed : Create And Share An Comparison"); 

		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("CreateAndShareComparisonFail");
			BasePage.onFailreMeassage(ex.getMessage(),"CreateAndShareComparisonFail","Module - COMPARISON , Description of the test executed : Create And Share An Comparison"); 

		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("CreateAndShareComparisonFail");
			BasePage.onFailreMeassage(ex.getMessage(),"CreateAndShareComparisonFail","Module - COMPARISON , Description of the test executed : Create And Share An Comparison"); 
        }
		
		
	/*	}
		catch(Exception ex)
		{
			objComparisonPage.captureScreenshot("CreateAndShareComparisonFail");
			onFailureMeassage(ex.getMessage(),"CreateAndShareComparisonFail","CreateAndShareComparisonFail");
		}
		catch(AssertionError ex)
		{
			objComparisonPage.captureScreenshot("CreateAndShareComparisonFail");
			onFailureMeassage(ex.getMessage(),"CreateAndShareComparisonFail","CreateAndShareComparisonFail");
		} */
	}

	@Test(priority = 17, description = "Delete A Comparison")
	public void DeleteComparison_Test() throws Throwable  {
		try {

			String successMessage = "Deleted A Comparison Successfully";
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] ComParameters =value.split(",");
			String ComName = ComParameters[0].trim();

			/* Delete A Comparison */
			objComparisonPage.DeleteComparison(ComName);
			//			objComparisonPage.DeleteComparison("search Comparison");
			//onSuccessMeassage("Deleted A Comparison Successfully");
		
		
			BasePage.screenshotOnPass("DeleteComparisonPass");
		    BasePage.onSuccessMeassage(successMessage, "DeleteComparisonPass","Module - COMPARISON , Description of the test executed : Delete A Comparison"); 

		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("DeleteComparisonFail");
			BasePage.onFailreMeassage(ex.getMessage(),"DeleteComparisonFail","Module - COMPARISON , Description of the test executed : Delete A Comparison"); 

		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("DeleteComparisonFail");
			BasePage.onFailreMeassage(ex.getMessage(),"DeleteComparisonFail","Module - COMPARISON , Description of the test executed : Delete A Comparison"); 
        }
		
		
	/*	}
		catch(Exception | AssertionError ex)
		{
			objComparisonPage.captureScreenshot("DeleteComparisonFail");
			onFailureMeassage(ex.getMessage(),"DeleteComparisonFail","DeleteComparisonFail");
		}*/
	}

	@Test(priority = 18, description = "Sharing A Comparison")
	public void ShareComparison_Test() throws Throwable  {
		try {

			String successMessage = "Shared A Comparison Successfully";
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] ComParameters =value.split(",");
			String ComName = ComParameters[0].trim();
			String mailIDtoShareto = ComParameters[1].trim();

			/* Share A Comparison */
			objComparisonPage.ShareComparison(ComName,mailIDtoShareto);
			//			objComparisonPage.ShareComparison("ComAddfromFile 1","mugunth.raman@eaglegenomics.com");
			//onSuccessMeassage("Shared A Comparison Successfully");
		
			BasePage.screenshotOnPass("ShareComparisonPass");
		    BasePage.onSuccessMeassage(successMessage, "ShareComparisonPass","Module - COMPARISON , Description of the test executed : Sharing A Comparison"); 

		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("ShareComparisonFail");
			BasePage.onFailreMeassage(ex.getMessage(),"ShareComparisonFail","Module - COMPARISON , Description of the test executed : Sharing A Comparison"); 

		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("ShareComparisonFail");
			BasePage.onFailreMeassage(ex.getMessage(),"ShareComparisonFail","Module - COMPARISON , Description of the test executed : Sharing A Comparison"); 
        }
		
		
		
		
	/*	}
		catch(Exception | AssertionError ex)
		{
			objComparisonPage.captureScreenshot("ShareComparisonFail");
			onFailureMeassage(ex.getMessage(),"ShareComparisonFail","ShareComparisonFail");
		}*/
	}


	@Test(priority = 19, description = "Remove items from Comparison Expand")
	public void RemoveItemsfromComparison_Test() throws Throwable  {
		try {

			
			String successMessage = "Items removed successfully in Comparison Expand";
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] ComParameters =value.split(",");
			String ComName = ComParameters[0].trim()+dtText;
			String ControlSetName = ComParameters[1].trim();
			String entity = ComParameters[2].trim();
			String searchTextInControl = ComParameters[3].trim();
			String removeItem1 = ComParameters[4].trim();
			String removeItem2 = ComParameters[5].trim();
			String removeItem3 = ComParameters[6].trim();

			/* Remove items in Expanded Set */
			objComparisonPage.RemoveItemsfromComparison(ComName,ControlSetName ,entity,searchTextInControl,removeItem1,removeItem2,removeItem3);
			//				objComparisonPage.RemoveItemsfromComparison("Remove Item Comparison","Control Set" ,"Gene","asph", "72112780","20981360","147670524");
			//onSuccessMeassage("Items removed successfully in Comparison Expand");
		   Thread.sleep(3000);
			BasePage.screenshotOnPass("ComparisonItemsRemovePass");
		    BasePage.onSuccessMeassage(successMessage, "ComparisonItemsRemovePass","Module - COMPARISON , Description of the test executed : Remove items from Comparison Expand"); 

		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("ComparisonItemsRemoveFail");
			BasePage.onFailreMeassage(ex.getMessage(),"cComparisonItemsRemoveFail","Module - COMPARISON , Description of the test executed : Remove items from Comparison Expand"); 

		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("ComparisonItemsRemoveFail");
			BasePage.onFailreMeassage(ex.getMessage(),"ComparisonItemsRemoveFail","Module - COMPARISON , Description of the test executed : Remove items from Comparison Expand"); 
        }
		
		
		
		
		
	/*	}
		catch(Exception ex)
		{
			objComparisonPage.captureScreenshot("ComparisonItemsRemoveFail");
			onFailureMeassage(ex.getMessage(),"ComparisonItemsRemoveFail","ComparisonItemsRemoveFail");
		}
		catch(AssertionError ex)
		{
			objComparisonPage.captureScreenshot("ComparisonItemsRemoveFail");
			onFailureMeassage(ex.getMessage(),"ComparisonItemsRemoveFail","ComparisonItemsRemoveFail");
		}*/
	}

	@Test(priority = 20, description = "Interchange Control and Case sets in the Comparison")
	public void ChangeControlAndCase_Test() throws Throwable {
		try {

			String successMessage = "Comparison is Created Successfully with Control Card";
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] ComParameters =value.split(",");
			String ComName = ComParameters[0].trim()+dtText;
			String ControlSetName = ComParameters[1].trim();
			String CaseSetName = ComParameters[2].trim();
			String entity = ComParameters[3].trim();
			String searchTextInControl = ComParameters[4].trim();
			String searchTextInCase = ComParameters[5].trim();

			/* Changes the Control and Case in Comparison */	
			objComparisonPage.ChangeControlAndCase(ComName, ControlSetName,CaseSetName ,entity,searchTextInControl,searchTextInCase);
			//			objComparisonPage.ChangeControlAndCase("Control and Case Change", "Control Set ","Case Set" ,"Disease", "kera", "dol");
			//onSuccessMeassage("Comparison is Created Successfully with Control Card");
		
			BasePage.screenshotOnPass("changeControlAndCasePass");
		    BasePage.onSuccessMeassage(successMessage, "changeControlAndCasePass","Module - COMPARISON , Description of the test executed : Interchange Control and Case sets in the Comparison"); 

		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("changeControlAndCaseFail");
			BasePage.onFailreMeassage(ex.getMessage(),"changeControlAndCaseFail","Module - COMPARISON , Description of the test executed : Interchange Control and Case sets in the Comparison"); 

		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("changeControlAndCaseFail");
			BasePage.onFailreMeassage(ex.getMessage(),"changeControlAndCaseFail","Module - COMPARISON , Description of the test executed : Interchange Control and Case sets in the Comparison"); 
        }
		
		
		
		
		
		
	/*	}
		catch(Throwable ex)
		{
			objComparisonPage.captureScreenshot("changeControlAndCaseFail");
			onFailureMeassage(ex.getMessage(),"changeControlAndCaseFail","changeControlAndCaseFail");
		}*/
	}

	@Test(priority = 21, description = "Sorting a column in a Comparison")
	public void SortColumnComparison_Test() throws Throwable  {
		try {

			
			String successMessage = "Column in Comparison Sorted Successfully";
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] ComParameters =value.split(",");
			String ComName = ComParameters[0].trim()+dtText;
			String ControlSetName = ComParameters[1].trim();
			String entity = ComParameters[2].trim();
			String searchText = ComParameters[3].trim();
			String sortColumn = ComParameters[4].trim();

			/* Sorting column in a Exploration */
			objComparisonPage.SortColumnInComparison(ComName,ControlSetName ,entity,searchText,sortColumn);
			//			objComparisonPage.SortColumnInComparison("SortComparison","ControlSet" , "Disease", "Kera", "EFO Name");
			//onSuccessMeassage("Column in Comparison Sorted Successfully");
		
			BasePage.screenshotOnPass("SortColumnComparisonPass");
		    BasePage.onSuccessMeassage(successMessage, "SortColumnComparisonPass","Module - COMPARISON , Description of the test executed : Sorting a column in a Comparison"); 

		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("SortColumnComparisonFail");
			BasePage.onFailreMeassage(ex.getMessage(),"SortColumnComparisonFail","Module - COMPARISON , Description of the test executed : Sorting a column in a Comparison"); 

		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("SortColumnComparisonFail");
			BasePage.onFailreMeassage(ex.getMessage(),"SortColumnComparisonFail","Module - COMPARISON , Description of the test executed : Sorting a column in a Comparison"); 
        }
		
		
	/*	}
		catch(Exception | AssertionError ex)
		{
			objComparisonPage.captureScreenshot("SortColumnComparisonFail");
			onFailureMeassage(ex.getMessage(),"SortColumnComparisonFail","SortColumnComparisonFail");
		}*/
	}

	@Test(priority = 22, description = "Filtering a Comparison with one filter")
	public void FilterComparison_Test() throws Throwable  {
		try {

			String successMessage = "Filtering done in Exploration Successfully for 1 filter";
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] ComParameters =value.split(",");
			String ComName = ComParameters[0].trim()+dtText;
			String ControlSetName = ComParameters[1].trim();
			String entity = ComParameters[2].trim();
			String searchText = ComParameters[3].trim();
			String filterAttribute1 = ComParameters[4].trim();
			String filterType1 = ComParameters[5].trim();
			String filterValue1 = ComParameters[6].trim();

			/* Filtering in a Comparison */
			objComparisonPage.FilterComparison(ComName, ControlSetName, entity,searchText,filterAttribute1,filterType1,filterValue1);
			//			objComparisonPage.FilterComparison("Filter Comparison1", "Control Set", "Disease","kera", "EFO Name","contains","vul");
			//onSuccessMeassage("Filtering done in Exploration Successfully for 1 filter");
	
			BasePage.screenshotOnPass("FilterComaprisonPass");
		    BasePage.onSuccessMeassage(successMessage, "FilterComaprisonPass","Module - COMPARISON , Description of the test executed : Filtering a Comparison with one filter"); 

		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("FilterComaprisonFail");
			BasePage.onFailreMeassage(ex.getMessage(),"FilterComaprisonFail","Module - COMPARISON , Description of the test executed : Filtering a Comparison with one filter"); 

		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("FilterComaprisonFail");
			BasePage.onFailreMeassage(ex.getMessage(),"FilterComaprisonFail","Module - COMPARISON , Description of the test executed : Filtering a Comparison with one filter"); 
        }
		
		
		
		
		
	/*	}
		catch(Throwable ex)
		{
			objComparisonPage.captureScreenshot("FilterComaprisonFail");
			onFailureMeassage(ex.getMessage(),"FilterExplorationFail","FilterExplorationFail");
		}*/
	}

	@Test(priority = 23, description = "Filtering a Comparison with 2 filters")
	public void FilterMultiComparison_Test() throws Throwable  {
		try {

			String successMessage = "Filtering done in Exploration Successfully for multiple filters";
			String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

			System.out.println(functionName);
			String value = this.getConfiguration().get(functionName);
			String[] ComParameters =value.split(",");
			String ComName = ComParameters[0].trim()+dtText;
			String ControlSetName = ComParameters[1].trim();
			String entity = ComParameters[2].trim();
			String searchText = ComParameters[3].trim();
			String filterAttribute1 = ComParameters[4].trim();
			String filterType1 = ComParameters[5].trim();
			String filterValue1 = ComParameters[6].trim();
			String filterAttribute2 = ComParameters[7].trim();
			String filterType2 = ComParameters[8].trim();
			String filterValue2 = ComParameters[9].trim();

			/* Filtering in a Comparison with multiple filter */
			objComparisonPage.FilterComparisonMulti(ComName,ControlSetName,entity,searchText, filterAttribute1,filterType1,filterValue1,filterAttribute2,filterType2,filterValue2);
			//			objComparisonPage.FilterComparisonMulti("Filter Comparison Multi 1","Control Set","Disease","kera", "EFO Name","contains","vul", "EFO ID", "equals","EFO_1000778");
			//onSuccessMeassage("Filtering done in Exploration Successfully for multiple filters");
		
			BasePage.screenshotOnPass("FilterComparisonMulltiPass");
		    BasePage.onSuccessMeassage(successMessage, "FilterComparisonMulltiPass","Module - COMPARISON , Description of the test executed : Filtering a Comparison with 2 filters"); 

		}
		catch(Exception ex)
		{
			BasePage.captureScreenshot("FilterComparisonMulltiFail");
			BasePage.onFailreMeassage(ex.getMessage(),"FilterComparisonMulltiFail","Module - COMPARISON , Description of the test executed : Filtering a Comparison with 2 filters"); 

		}
		catch(AssertionError ex)
		{
			BasePage.captureScreenshot("FilterComparisonMulltiFail");
			BasePage.onFailreMeassage(ex.getMessage(),"FilterComparisonMulltiFail","Module - COMPARISON , Description of the test executed : Filtering a Comparison with 2 filters"); 
        }
		
		
		
	/*	}
		catch(Throwable ex)
		{
			objComparisonPage.captureScreenshot("FilterComparisonMulltiFail");
			onFailureMeassage(ex.getMessage(),"FilterComparisonMulltiFail","FilterComparisonMulltiFail");
		}*/
	}

	

}	   

