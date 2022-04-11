package com.eagle.pages;

import static org.testng.Assert.assertEquals;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.aventstack.extentreports.Status;
import com.eagle.Reports.ExtentTestManager;

public class HomePage extends BasePage{

	//Web Elements in page

	@FindBy(xpath = "//i[@data-icon-name='Home']")
	public WebElement homeIcon;

	@FindBy(xpath = "//i[@data-icon-name='Search']")
	public WebElement searchIcon;

	@FindBy(xpath = "//button[contains(@class,'AppHeader__logoButton')]//img")
	public WebElement homeLogo;

	@FindBy(xpath = "//button//span[contains(text(),'Exploration')]")
	public WebElement explorationButton;

	@FindBy(xpath = "//button//span[contains(text(),'Comparison')]")
	public WebElement comparisonButton;

	@FindBy(xpath = "//button//span[contains(text(),'Set')]")
	public WebElement setButton;

	//@FindBy(xpath = "//div[contains(@class,'RecentActivity__recentActivity')]//label[contains(text(),'MY RECENT ACTIVITY')]")
	//public WebElement recentActivityHeader;	
	
	@FindBy(xpath = "//label[text()='MY RECENT ACTIVITY']")
	public WebElement recentActivityHeader;	

	@FindBy(xpath = "//div[contains(@class,'RecentActivity__recentActivity')]//div[contains(@class,'Carousel__carouselContainer')]")
	public WebElement recentActivityContainer;	

	@FindBy(xpath = "//div[contains(@class,'UserControls__userControls')]//button")
	public WebElement userControl;

	@FindBy(xpath = "//div[contains(@class,'AppFooter__footer')]//label[1]")
	public WebElement copyRights;	

	@FindBy(xpath = "//div[contains(@class,'AppFooter__footer')]//a[contains(text(),'Privacy')]")
	public WebElement privacy;	

	@FindBy(xpath = "//div[contains(@class,'AppFooter__footer')]//a[contains(text(),'Terms of Use')]")
	public WebElement termOfUse;	

	@FindBy(xpath = "//span[contains(text(),'Log Out')]")
	public WebElement logOut;		

	@FindBy(xpath = "//span[contains(text(),'Profile & Settings')]")
	public WebElement profileSettings;	

	@FindBy(xpath = "//span[contains(text(),'Back')]")
	public WebElement profileBack;	

	@FindBy(xpath = "//input[@role='searchbox']")
	public WebElement searchBox;

	@FindBy(xpath = "//div[contains(@class,'ms-Dropdown-container')]")
	public WebElement searchFiter;	
	
	
	//WebElement myDataBtn = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/nav/button[6]"));
	
	@FindBy(xpath = "//i[@data-icon-name='DocumentSet']")
	public WebElement myDataBtn;
	
	//@FindBy(xpath = "//div[contains(@class,'MyData__title___3ZcME')]")
	//public WebElement titleOnScreen;
	
	@FindBy(xpath = "//h5[@class='MyData__title___3ZcME']")
	public WebElement titleOnScreen;
	
	@FindBy(xpath = "//h6[@class='MyData__title___3ZcME']")
	public WebElement subTitleOnScreen;
	
	
	
	
	
	

	@FindBy(xpath = "//label[text()='Saved searches']")
	public WebElement savedSearchesLabel;	

	@FindBy(xpath = "//label[text()='Saved searches']//parent::div//*[@data-icon-name='Cancel']")
	public WebElement savedSearchCancelButton;	

	@FindBy(xpath = "//div[@role='columnheader']")
	public WebElement columnHeader;

	@FindBy(xpath = "//h6")
	public WebElement profileNameactual;

	@FindBy(xpath = "//*[@role='button' and @aria-haspopup='listbox']/span/div/span")
	public WebElement filterCount;	

	@FindBy(xpath = "//*[@data-icon-name='CalculatorMultiply']/parent::li")
	public WebElement filterName;	

	@FindBy(xpath = "//*[text()='Save Search']")
	public WebElement saveSearch;	

	@FindBy(xpath = "//*[text()='Save']")
	public WebElement saveButton;	

	@FindBy(xpath = "//button//span[text()='View saved searches']")
	public WebElement viewSavedSearches;

	@FindBy(xpath = "//i[@data-icon-name='Forward']")
	public WebElement forward;

	@FindBy(xpath = "//div[@class='ms-List']//div[@role='rowheader' and @aria-colindex='1']")
	public List<WebElement> searchGridItems;

	@FindBy(xpath = "//i[@data-icon-name='LifeSaver']")
	public WebElement lifeSaverIcon;

	@FindBy(xpath = "//span[text()='Contact Help Desk']")
	public WebElement contactHelpDesk;

	@FindBy(xpath = "//span[text()='User Manual']")
	public WebElement userManual;

	@FindBy(xpath = "//span[text()='FAQ']")
	public WebElement FAQ;

	@FindBy(xpath = "//span[text()='Eagle Genomics Support']")
	public WebElement EaglegenomicsSupportText;

	@FindBy(xpath = "//h1[text()='Help Desk']")
	public WebElement HelpDesk;

	@FindBy(xpath = "//h1[text()='FAQ']")
	public WebElement FAQtext;

	@FindBy(xpath = "//div[@scraper-tag='UserManual']//iframe[contains(@class,'UserManual__userManualPDF')]")
	public WebElement userManualPDF;	

	@FindBy(xpath = "//*[text()='Terms of Use']")
	public WebElement TermsOfUse;
	
	@FindBy(xpath = "//span[text()='NAME']")
	public WebElement nameColumn;
	
	@FindBy(xpath = "//*[text()='NAME']//parent::div//parent::div/following-sibling::div")
	public WebElement nameColumn1;
	
	@FindBy(xpath = "//span[text()='LAST MODIFIED']")
	public WebElement lastModifiedColumn;
	

	@FindBy(xpath = "//span[text()='OWNER']")
	public WebElement ownerColumn;
	
	@FindBy(xpath = "//span[text()='CATEGORY']")
	public WebElement categoryColumn;
	
/*	@FindBy(xpath = "//div[@class='ms-List-cell']"
			+ "//div[@class='ms-FocusZone css-130 ms-DetailsRow is-contentUnselectable WorkspaceResourceList__tableRow___pCag- root-149' and @data-selection-index='1']"
			+ "//div[@class='ms-DetailsRow-fields fields-156']"
			+ "//div[@aria-colindex='5' and @class='ms-DetailsRow-cell cell-152 cellUnpadded-150']"
			+ "//button[@class='ms-Button ms-Button--action ms-Button--command ms-Button--hasMenu ActionsButton__actionsButton___23I0E undefined SetSelector__itemOptionsButton___2USS1 root-61']"
			+ "//span[@class='ms-Button-flexContainer flexContainer-62']"
			+ "//i[@data-icon-name='MoreVertical' and @class='ms-Icon root-37 css-60 ms-Button-icon icon-64']")
	public WebElement actionMenu1; */
	
	
/*	@FindBy(xpath = "//div[@class='ms-DetailsRow-cell cell-152 cellUnpadded-150']"
			+ "//button[@class='ms-Button ms-Button--action ms-Button--command ms-Button--hasMenu ActionsButton__actionsButton___23I0E undefined SetSelector__itemOptionsButton___2USS1 root-61']"
			+ "//span[@class='ms-Button-flexContainer flexContainer-62']"
			+ "//i[@class='ms-Icon root-37 css-60 ms-Button-icon icon-64']")
	
			
			
	public WebElement actionMenu1;*/
	
	//working
	//@FindBy(xpath = "//div[@class='ms-List']//div[@role='gridcell' and @aria-colindex='5']")
	//public WebElement threeDots;
	
	
	@FindBy(xpath = "//div[@class='ms-List']//div[@role='gridcell' and @aria-colindex='5']")
	public List<WebElement> threeDots;
	 
	
	
	
	
    @FindBy(xpath = "//span[text()='View']")
	public WebElement viewMenu;
    
    @FindBy(xpath = "//span[text()='Start exploration']")
	public WebElement startExpMenu;
    
    @FindBy(xpath = "//span[text()='Delete']")
	public WebElement deleteMenu;
    
    @FindBy(xpath = "//span[text()='Share']")
	public WebElement shareMenu;

    @FindBy(xpath = "//button//span[contains(text(),'Delete')]")
	public WebElement deleteIcon;
    
    @FindBy(xpath = "//div[text()='Delete Set?']")
   	public WebElement popup;
    
    
    
    
    
    //Methods

	Actions action = new Actions(driver);

	public HomePage(){ 		 
		PageFactory.initElements(driver, this); 
	}

	//Click Home icon
	public void Home() throws Throwable{ 	
		BasePage.waitforAnElement(homeIcon);
		BasePage.click(homeIcon);
		action.moveToElement(TermsOfUse).perform();
	}
	
	//perform mouse hover
	public void mouseHover()
	{
		action.moveToElement(lastModifiedColumn).perform();
	}

	//Open a particular item (Search) from list
	public void openItemFromList(String inv) throws Throwable
	{
		try {	
			outloop:
				do{ 
					for (WebElement element : searchGridItems) {
						if(element.isDisplayed() == false)  {scrollIntoView(element);}	    				
						String textFromGrid = element.getText();	    				
						if(inv.equals(textFromGrid)) {		    					
							BasePage.click(element);
							break outloop;
						}		    				
					}
					try {
						Thread.sleep(3000);
						System.out.println("check before forward click");
						forward.click();
					}
					catch(Exception e){
						break outloop;
					}
				}
				while(forward.isEnabled());  
		}	    	
		catch(Exception ex) {throw ex;}
	}

	//Verify the visibility of logo
	public void verifyLogoVisibility() throws Exception
	{
		try {
			waitforAnElement(homeLogo);
			boolean logoPresent = homeLogo.isDisplayed();
			Assert.assertTrue(logoPresent);
			if (logoPresent){		            
				System.out.println("Logo is displayed.");
				ExtentTestManager.getTest().log(Status.PASS, "Logo is displayed");
			}
		}catch(Exception ex) {
			throw ex;	
		}    
	}

	//Verify the components in Dashboard
	public void verifyDashboardComponents() throws Throwable
	{
		try {
			boolean btnMyData = myDataBtn.isDisplayed();
			Thread.sleep(15000);
			if(btnMyData==true) {
				ExtentTestManager.getTest().log(Status.PASS, "myDataButton is displayed");
				Thread.sleep(2000);
				myDataBtn.click();
			}
			else {
				ExtentTestManager.getTest().log(Status.FAIL, "myDataButton is not displayed");
			}
			
			
			boolean btnExploration = explorationButton.isDisplayed();
			Thread.sleep(15000);
			if(btnExploration==true) {
				ExtentTestManager.getTest().log(Status.PASS, "explorationButton is displayed");
			}
			else {
				ExtentTestManager.getTest().log(Status.FAIL, "explorationButton is not displayed");
			}
			boolean btnComparison = comparisonButton.isDisplayed();
			Thread.sleep(3000);
			if(btnComparison==true) {
				ExtentTestManager.getTest().log(Status.PASS, "comparisonButton is displayed");
			}
			else {
				ExtentTestManager.getTest().log(Status.FAIL, "comparisonButton is not displayed");	
			}
			boolean btnSet = setButton.isDisplayed();
			Thread.sleep(3000);
			if(btnSet==true) {
				ExtentTestManager.getTest().log(Status.PASS, "setButton is displayed");
			}
			else {
				ExtentTestManager.getTest().log(Status.FAIL, "setButton is not displayed");	
			}
			boolean headerRecent = recentActivityHeader.isDisplayed();	
			Thread.sleep(3000);
			if(headerRecent==true) {
				ExtentTestManager.getTest().log(Status.PASS, "recentActivityHeader is displayed");
			}
			else {
				ExtentTestManager.getTest().log(Status.FAIL, "recentActivityHeader is not displayed");	
			}
			boolean containerRecent = recentActivityContainer.isDisplayed();
			Thread.sleep(3000);
			if(containerRecent==true) {
				ExtentTestManager.getTest().log(Status.PASS, "recentActivityContainer is displayed");
			}
			else {
				ExtentTestManager.getTest().log(Status.FAIL, "recentActivityContainer is not displayed");	
			}

		}catch(Exception ex) {
			throw ex;	
		}    
	} 
	
	//Verify components after clicking on MyData button
	public void VerifyMyDataComponents() throws InterruptedException
	{
		myDataBtn.click();
		Thread.sleep(3000);
		if(titleOnScreen.isDisplayed())
		System.out.println("Title on screen displayed : "+titleOnScreen.getText());
		
		if(subTitleOnScreen.isDisplayed())
		System.out.println("Sub-Title on screen displayed : "+subTitleOnScreen.getText());
		
		
		
		
	}
	
	
	//Verify columns : Name and Last Modified for MyData
	public void VerifyNameAndLastModified_MyData() throws InterruptedException
	{
		myDataBtn.click();
		Thread.sleep(2000);
		BasePage.VerifyNameAndLastModified_Global(nameColumn,lastModifiedColumn);
		
	}
	
	//Verify presence of column : Owner
	public void VerifyOwnerColumn_MyData() throws InterruptedException
	{
		myDataBtn.click();
		Thread.sleep(2000);
		BasePage.VerifyOwnerColumn_Global(ownerColumn);
	}
	
	//Verify presence of column : Category [this column is present only in My Data]
	public void VerifyCategoryColumn_MyData() throws InterruptedException
	{
		myDataBtn.click();
		Thread.sleep(2000);
		if(categoryColumn.isDisplayed())
			System.out.println("categoryColumn is present : "+categoryColumn.getText());
	}
	

	
	//Presence of action menu against each row
	public void actionMenuPresent_MyData() throws InterruptedException
		{
		
		    int count = 0;
			myDataBtn.click();
			Thread.sleep(2000);
		try {	    	
		      while(forward.isEnabled())  
		      {
		    	 
					for (WebElement element : threeDots) 
					{
						System.out.println("SIZE : "+threeDots.size());
						System.out.println("element : "+element);
						if(element.isDisplayed() == false)  {scrollIntoView(element);}	
				
						BasePage.click(element); //first click on 3 dots opens the box
					
						Thread.sleep(2000);
						BasePage.click(element); //second click on 3 dots closes the box
					}
					count++;
					BasePage.click(forward); 
					Thread.sleep(3000);
              
		      }
		      System.out.println("Count is : "+count);
		    }	    	
		catch(Exception ex) {
 
		      }
	    }
	
	
	//Verify presence of items inside action menu
	//For quick checking purpose the loops are commented out (as loops would take time)
	//But if items are to be checked in every action button against each row in each page, loops can be uncommented 
	public void ItemsInActionMenu_MyData() throws InterruptedException
	{
		    //int count = 0;
			myDataBtn.click();
			Thread.sleep(2000);
		try {	    	
	//	      while(forward.isEnabled())  
	//	      {
					for (WebElement element : threeDots) 
					{
						if(element.isDisplayed() == false)  {scrollIntoView(element);}	
				
						BasePage.click(element); //first click on 3 dots opens the box
						Thread.sleep(2000);
						
						if(viewMenu.isDisplayed())
							System.out.println("View option is present in Action button : "+viewMenu.getText());
						
						if(startExpMenu.isDisplayed())
							System.out.println("Start exploration option is present in Action button : "+startExpMenu.getText());
						
						if(deleteMenu.isDisplayed())
							System.out.println("Delete option is present in Action button : "+deleteMenu.getText());
						
						if(shareMenu.isDisplayed())
							System.out.println("Share option is present in Action button : "+shareMenu.getText());
						
						break;
						
						//BasePage.click(element); //second click on 3 dots closes the box
					}
	//				count++;
	//				BasePage.click(forward); 
	//				Thread.sleep(3000);
    //       }
	//	      System.out.println("Count is : "+count);
		    }	    	
		catch(Exception ex) {

		      }
	}
	

	public void ClearExistingData() throws InterruptedException
	{
		   
			myDataBtn.click();
			Thread.sleep(2000);
		try {	    
			 while(forward.isEnabled())  
		      {

					for (WebElement element : threeDots) 
					{
						if(element.isDisplayed() == false)  {scrollIntoView(element);}	
				
						BasePage.click(element); //first click on 3 dots opens the box
						Thread.sleep(2000);
						
					
						
						if(deleteMenu.isDisplayed())
							deleteMenu.click();
						Thread.sleep(2000);
						
						if(popup.isDisplayed())
							deleteMenu.click();
						Thread.sleep(2000);
						//WebElement parent = (WebElement) ((JavascriptExecutor) driver).executeScript(
						//		"return arguments[0].parentNode;", element);
						//WebElement deleteOption = parent.findElement(By.tagName("button"));	    					
					//	deleteOption.click();
					
						//BasePage.click(deleteIcon);
						//String DeleteConfirm =  driver.findElement(By.xpath("//*[@role='heading']")).getText();
						//Assert.assertEquals(DeleteConfirm, "Delete Set?");
						//BasePage.click(deleteIcon);	
					
						
						
					}
					BasePage.click(forward); 
					Thread.sleep(3000);

		      }
		    }	    	
		catch(Exception ex) {

		      }
	}
	


	//Verify the components in Dashboard
	public void verifyUserProfiles(String ProfileName) throws Throwable
	{		
		try {
			BasePage.click(userControl);
			BasePage.click(profileSettings);
			//			ReadObject object = new ReadObject();										//remove these comments if user mail ID is displayed in Dashboard and comment the ones with Profile name
			//			Properties configObject = object.getObjectRepositoty();	 
			//			String expected = configObject.getProperty("Username");						
			String expected = ProfileName;															//comment this if  user mail ID is displayed in Dashboard and comment the ones with Profile name
			String actual = profileNameactual.getText();
			BasePage.click(profileBack);
			assertEquals(actual, expected);
		}catch(Exception | AssertionError ex) {
			throw ex;	
		}    
	}

	//Verify the Copyrights and the text within it
	public void verifyCopyRights() throws Throwable
	{
		try {
			String copyRightsText = copyRights.getText();    	
			int year = Calendar.getInstance().get(Calendar.YEAR);
			String currentYear = String.valueOf(year);  
			Assert.assertEquals(copyRightsText, "Copyright © "+ currentYear +" Eagle Genomics. All rights reserved");
			Assert.assertTrue(privacy.isDisplayed());
			Assert.assertTrue(termOfUse.isDisplayed());
			ExtentTestManager.getTest().log(Status.PASS, "Copyright is verified");
		}
		catch(Exception | AssertionError ex) {
			throw ex;	
		} 
	}

	//Select a particular entity as filter for search
	public WebElement selectFilter(String entityName) {
		return BasePage.driver.findElement(By.xpath("//div[@title='"+ entityName +"']"));   
		//return BasePage.driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div/div[4]/label/span"));
	}	

	//Verify the Copyrights and the text within it
	public void createGlobalSearch() throws Throwable
	{
		try {
			BasePage.click(searchIcon);
			BasePage.click(searchFiter);
			WebElement filtr = this.selectFilter("Cell Type");
			WebElement filtr1 = this.selectFilter("Gene");
			filtr.click();
			Thread.sleep(3000);
			filtr1.click();
			Thread.sleep(3000);
			
			//BasePage.click(filtr);
			//BasePage.click(filtr1);
		
			
			    		
			BasePage.enterText(searchBox, "pax");
			Thread.sleep(3000);
			searchBox.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			System.out.println();
			assertEquals(filterCount.getText(), "2 selected");
			Thread.sleep(3000);
			ExtentTestManager.getTest().log(Status.PASS, "2 filters are verified");
			assertEquals(filterName.getText(), "pax");
			Thread.sleep(3000);
			ExtentTestManager.getTest().log(Status.PASS, "Search is verified");
			BasePage.click(saveSearch);
			Thread.sleep(3000);
			BasePage.click(saveButton);  
			ExtentTestManager.getTest().log(Status.PASS, "Search is saved");
			Thread.sleep(5000);
		}
		catch(Exception |AssertionError ex) 	{
			throw ex;
		}
	}

	//Open a saved search and verify if it is saved properly
	public void verifySavedSearches() throws Throwable
	{
		try {
			BasePage.click(searchIcon);
			BasePage.click(viewSavedSearches);
			BasePage.waitforAnElement(savedSearchesLabel);
			BasePage.waitforAnElement(columnHeader);
			this.openItemFromList("pax");
			ExtentTestManager.getTest().log(Status.PASS, "Saved search is verified and opened");
			System.out.println("VALUE IS  "+filterCount.getText());
			assertEquals(filterCount.getText(), "2 selected"); 
			ExtentTestManager.getTest().log(Status.PASS, "2 filters are present");
		}
		catch(Exception ex)    	{
			BasePage.click(savedSearchCancelButton);
			ExtentTestManager.getTest().log(Status.FAIL, "Some probelm with Saved Search");
			throw ex;
		}

	}    

	//Click and verify Contact Help Desk
	public void VerifyContactHelpDesk() throws Throwable
	{
		Date dt = new Date();
		DateFormat dtFrmt = new SimpleDateFormat("_HHmmss");
		String dtText = dtFrmt.format(dt);
		try {
			BasePage.click(lifeSaverIcon);
			BasePage.click(contactHelpDesk);
			ExtentTestManager.getTest().log(Status.PASS, "Contact Help Desk is clicked");

			ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());			//Get all the tabs currently available	
			assertEquals(tabs.size(),2); 														//Assert if the number of tabs is 2 (i.e a new tab has been opened)
			ExtentTestManager.getTest().log(Status.PASS, "2 tabs are present and the link is openend in new tab");
			driver.switchTo().window(tabs.get(1));                                            	//Switch to the recent tab

			try {
				BasePage.waitforAnElement(EaglegenomicsSupportText);

				assertEquals(EaglegenomicsSupportText.getText(), "Eagle Genomics Support");  		
				assertEquals(HelpDesk.getText(), "Help Desk");  									

				driver.close();																	//close the recent tab
				driver.switchTo().window(tabs.get(0));											//Switch to the original tab

				this.Home();	
			}
			catch(Exception|AssertionError er){
				this.captureScreenshot("ContactHelpDesk1"+dtText);
				ExtentTestManager.getTest().addScreenCaptureFromPath(System.getProperty("user.dir")+"/Resources/ErrorScreenshots/ContactHelpDesk1"+dtText+".png");

				ExtentTestManager.getTest().log(Status.FAIL, "Contact Help Desk verification failed in new tab");
				driver.close();																	//close the recent tab
				driver.switchTo().window(tabs.get(0));											//Switch to the original tab

				this.Home();	
				throw er;
			}
		}
		catch(Exception| AssertionError ex)    	{
			ExtentTestManager.getTest().log(Status.FAIL, "Unable to verify Help Desk");
			throw ex;
		}
	}  

	//Click and verify user manual
	public void VerifyUserManual() throws Throwable
	{
		try {
			BasePage.click(lifeSaverIcon);
			BasePage.click(userManual);
			ExtentTestManager.getTest().log(Status.PASS, "User manual is clicked");
			BasePage.waitforAnElement(userManualPDF);
			ExtentTestManager.getTest().log(Status.PASS, "Presence of user manual is verified");
			this.Home();
		}
		catch(Exception ex)    	{
			ExtentTestManager.getTest().log(Status.FAIL, "User manual is not present");
			throw ex;
		}
	}  

	//Click and verify FAQ
	public void VerifyFAQ() throws Throwable
	{
		Date dt = new Date();
		DateFormat dtFrmt = new SimpleDateFormat("_HHmmss");
		String dtText = dtFrmt.format(dt);
		try {
			BasePage.click(lifeSaverIcon);
			BasePage.click(FAQ);
			ExtentTestManager.getTest().log(Status.PASS, "FAQ is clicked");

			ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());			//Get all the tabs currently available	
			assertEquals(tabs.size(),2); 														//Assert if the number of tabs is 2 (i.e a new tab has been opened)
			ExtentTestManager.getTest().log(Status.PASS, "2 tabs are present and the link is openend in new tab");
			driver.switchTo().window(tabs.get(1));                                            	//Switch to the recent tab

			try {                                        	
				BasePage.waitforAnElement(EaglegenomicsSupportText);
				assertEquals(EaglegenomicsSupportText.getText(), "Eagle Genomics Support");  
				assertEquals(FAQtext.getText(), "FAQ");  

				driver.close();																	//close the recent tab
				driver.switchTo().window(tabs.get(0));											//Switch to the original tab

				this.Home();													
			}
			catch(Exception| AssertionError er)    	{
				this.captureScreenshot("VerifyFAQ1"+dtText);
				ExtentTestManager.getTest().addScreenCaptureFromPath(System.getProperty("user.dir")+"/Resources/ErrorScreenshots/VerifyFAQ1"+dtText+".png");
				ExtentTestManager.getTest().log(Status.FAIL, "FAQ verification failed in new tab");

				driver.close();																	//close the recent tab
				driver.switchTo().window(tabs.get(0));											//Switch to the original tab
				this.Home();
				throw er;
			}
		}
		catch(Exception| AssertionError ex)    	{
			ExtentTestManager.getTest().log(Status.FAIL, "Unable to verify FAQ");
			throw ex;
		}
	}

	//Logout of the system
	public void logout() throws Throwable
	{
		try {
			BasePage.click(userControl);
			BasePage.click(logOut);

		}catch(Exception ex) {
			throw ex;	
		}    
	}  



}
