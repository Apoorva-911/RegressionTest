package com.eagle.pages;

import static org.testng.Assert.assertEquals;
import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.Status;
import com.eagle.Reports.ExtentTestManager;


public class BasePage{

	public static WebDriver driver;
	public static String userName;
	public static String passWord;

	public void setWebDriver(WebDriver driver) {
		BasePage.driver = driver;		
	}
	public void setUserName(String email) {
		BasePage.userName = email;		
	}
	public void setPassword(String emailPass) {
		BasePage.passWord = emailPass;		
	}
	
	

	//Enter User name and Password
	public static void enterUserPass(WebElement user, WebElement pass) throws InterruptedException, AWTException {		
		click(user);	
		user.sendKeys(userName);					//enters only user name - case where only mail ID is required
		Thread.sleep(1000);
		try {
			if(pass.isDisplayed()) {
				click(pass);	
				pass.sendKeys(passWord);			//enters password
			}
		}
		catch(Exception r){
			ExtentTestManager.getTest().log(Status.PASS,"Needs to authenticate through Microsoft page");
		}
	}
	
	//Click an element (incorporated internal wait and scroll if element not found)
	public static void click(WebElement element) throws InterruptedException, AWTException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOf(element));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		try {
			element.click();
		} catch (Exception e) {
			scrollIntoView(element);
			element.click();
		}
	}	

	//Assert a particular field text with the given text
	public static void verifyPage(String ItemToVerify, WebElement field) throws InterruptedException, AWTException, AssertionError {		
		try {
			BasePage.waitforAnElement(field);
			String getheadertext = field.getText().trim();
			Assert.assertEquals(getheadertext, ItemToVerify);
		}
		catch (Exception | AssertionError ex) {
			throw ex;
		}
	}

	//Scroll an element into view
	public static void scrollIntoView(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOf(element));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	//Scroll to top
	public static void scrollToTop() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	}
	
	//Click an element using Actions (element is displayed and enabled but not getting clicked)
	public static void ClickElementUsingActions(WebElement element) 
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
	}

	// Enter text into a field of choice
	public static void enterText(WebElement field, String value) throws InterruptedException, AWTException {
		if (!value.equalsIgnoreCase("nil")) {			
			BasePage.click(field);
			field.sendKeys(Keys.COMMAND + "a");		
			field.sendKeys(Keys.DELETE);
			field.sendKeys(value);
		}
	}	
	
	
	//Zoom
	public static void zoom(WebElement field) throws InterruptedException, AWTException {
					
		System.out.println("zoom");
		// To zoom in 3 times
		for(int i=0; i<3; i++){
		field.sendKeys(Keys.chord(Keys.CONTROL,Keys.ADD));
		}
		// To zoom out 3 times
		for(int i=0; i<3; i++){
		field.sendKeys(Keys.chord(Keys.CONTROL,Keys.SUBTRACT));
		}
		
		
		
	}	
	

	//Wait for an element to be visible
	public static void waitforAnElement(WebElement Element) throws InterruptedException, AWTException{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(Element));	
	}

	//Wait for an element to be Clickable
	public static void waitforAnElementtoBeClicked(WebElement Element) throws InterruptedException, AWTException{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(Element));	
	}
	
	//Wait for an element to be Clickable
		public static void waitforAnElementtoBeClicked1(WebElement Element) {
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.elementToBeClickable(Element));	
		}
	
	//Compare a text and an attribute value of an element
	public static void CompareAttributeText(String attribute, String s, WebElement Element) throws InterruptedException, AWTException, AssertionError { 
		try {
			String t = Element.getAttribute(attribute);
			assertEquals(s, t);
		}		
		catch (AssertionError ex) {
			System.out.println("Assertion fail");
			throw ex;
		}
	}
	
	
	
	//Verify "Name" and "Last Modified" columns are present
	public static void VerifyNameAndLastModified_Global(WebElement nameColumn,WebElement lastModifiedColumn)
	{
		if(nameColumn.isDisplayed())
			System.out.println("nameColumn is : "+nameColumn.getText());
		
		if(lastModifiedColumn.isDisplayed())
			System.out.println("lastModifiedColumn is : "+lastModifiedColumn.getText());
	} 
	
	//Verify "Owner" column is present
	public static void VerifyOwnerColumn_Global(WebElement ownerColumn)
	{
		if(ownerColumn.isDisplayed())
			System.out.println("ownerColumn is : "+ownerColumn.getText());
	}
	
	
	
	//Method to capture screenshot
		public static String captureScreenshot(String screenShotName) throws IOException
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			String dest = "./Resources/ErrorScreenshots/"+screenShotName+".png";
			File destination = new File(dest);
			try {
				FileUtils.copyFile(source, destination);
			} catch (IOException e) {
				e.printStackTrace();
			}     

			return dest;
		} 
		
		//Method to capture screenshot
		public static String screenshotOnPass(String screenShotName) throws IOException
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			String dest = "./Resources/PassedScreenshots/"+screenShotName+".png";
			File destination = new File(dest);
			try {
				FileUtils.copyFile(source, destination);
			} catch (IOException e) {
				e.printStackTrace();
			}     

			return dest;
		}
		
		public static void onSuccessMeassage(String successMessage, String screenShotName, String nameOfTest) throws IOException, InterruptedException
		{
			
			
			
			ExtentTestManager.getTest().log(Status.PASS, "Test Passed");
			ExtentTestManager.getTest().log(Status.PASS, successMessage);
			ExtentTestManager.getTest().log(Status.PASS, nameOfTest);
			
			System.out.println(System.getProperty("user.dir") + "/Resources/PassedScreenshots/"+screenShotName+".png");

			ExtentTestManager.getTest().addScreenCaptureFromPath(System.getProperty("user.dir") + "/Resources/PassedScreenshots/"+screenShotName+".png");

		}
				

		public static void onFailreMeassage(String failureMessage,String screenShotName, String nameOfTest) throws IOException
		{
		
			ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");
			ExtentTestManager.getTest().log(Status.FAIL, failureMessage);
			ExtentTestManager.getTest().log(Status.PASS, nameOfTest);
			
			System.out.println(System.getProperty("user.dir") + "/Resources/ErrorScreenshots/"+screenShotName+".png");
			ExtentTestManager.getTest().addScreenCaptureFromPath(System.getProperty("user.dir") + "/Resources/ErrorScreenshots/"+screenShotName+".png");
		}  
		
		

	
	
}
