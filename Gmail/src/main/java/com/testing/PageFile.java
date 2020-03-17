package com.testing;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import org.junit.Assert;
import org.junit.rules.ErrorCollector;

public class PageFile extends LocatorsFile {
	
	public WebDriver driver;
	public ErrorCollector errCol = new ErrorCollector();

	public void openBrowser() throws IOException, InterruptedException {
		
		//Opening Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:/Users/pkish/git/Gmail-Final-Project/Gmail/chromedriver.exe");
		driver = new ChromeDriver();	
		
		//Setup Driver Property
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	
		
		PageFactory.initElements(driver, this);	

	}
	
	public void closeBrowser() {		
		driver.quit();
	}
	
	public void openURL() throws Exception {	
		driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");	//opening any URL
		Thread.sleep(2000);
	}
	
    public void invalidUser() throws InterruptedException {
		
		//Try to login with Invalid Credential(s) and verify the Error message
    	
		//Enter invalid user name and check error message
    	UserTextBox.sendKeys("ddkkkdkdkdk@gmail.com");
    	UserTextBox.sendKeys(Keys.ENTER);
    	Thread.sleep(2000);
    	
    	//Verify error message
    	String userErrorMsg= UserErrorMsg.getText();
    	String expectedMsg = "Couldn't find your Google Account";
    	
    	try {
    		Assert.assertEquals(userErrorMsg, expectedMsg);
    		System.out.println("TEST-PASS - USERID Error message is correct");
    	}
    	catch(Throwable t){
    		System.out.println("TEST-FAIL - USERID Error message is wrong");
    		errCol.addError(t);
    		System.out.println(t);
    	}
    	
    	Thread.sleep(2000);
    	
	}
    
    public void invalidPwd() throws InterruptedException {
		
		//Enter valid userid but wrong password and verify error message
    	
		//Enter valid user name
		UserTextBox.sendKeys("vrajkhan576@gmail.com");
		UserTextBox.sendKeys(Keys.ENTER);
    	Thread.sleep(2000);
    	
    	//Enter invalid password
    	PwdTextBox.sendKeys("vraj1994");
    	PwdTextBox.sendKeys(Keys.ENTER);
    	Thread.sleep(2000);
    	
    	String pwdErrorMsg = PwdErrorMsg.getText();
    	String expectedMsg = "Wrong password. Try again or click Forgot password to reset it.";
    	
    	try {
    		Assert.assertEquals(pwdErrorMsg, expectedMsg);
    		System.out.println("TEST-PASS - PASSWORD Error message is correct");
    	}
    	catch(Throwable t){
    		System.out.println("TEST-FAIL - PASSWORD Error message is wrong");
    		errCol.addError(t);
    		System.out.println(t);
    	}
    	
    	Thread.sleep(2000);
		
	}
    
    public void login() throws InterruptedException {
		
		//Enter valid user name
		UserTextBox.sendKeys("vrajkhan576@gmail.com");
		UserTextBox.sendKeys(Keys.ENTER);
    	Thread.sleep(2000);
    	
    	//Enter valid user password
    	PwdTextBox.sendKeys("Vraj1994");
    	PwdTextBox.sendKeys(Keys.ENTER);
    	Thread.sleep(15000);
		
	}
    
    public void countEmail() throws InterruptedException {
		
		//Count how many emails on your first page of your Inbox and print the count on console.
				
		List<WebElement> numOfMsg = NumOfMsg;
		System.out.println("Total emails on the page = "+numOfMsg.size());    	
				
		Thread.sleep(2000);
		
	}
    
    public void inboxEmails() {
		
		//Print total number of emails in your Inbox
		WebElement ttlEmail = TtlEmail;
		System.out.println("Total emails = "+ttlEmail.getText());		
		
	}
    
    public void moveToTrash() throws InterruptedException {
		
		//Select any one email from the list of your Inbox and move to Trash and print total number of emails in your Inbox
		
    	Actions builder = new Actions(driver);
    	
		//select email
		WebElement select = Select;
		builder.moveToElement(select).build().perform();
		select.click();
		Thread.sleep(2000);
		
		//click delete button
		WebElement delete = Delete;
		builder.moveToElement(delete).build().perform();
		delete.click();
		Thread.sleep(2000);
		
		//print total numbers of emails in your inbox
		WebElement ttlEmail1 = TtlEmail;
		System.out.println("Total emails after moving one email to the trash = "+ttlEmail1.getText());
		
	}
    
    public void moveBackToInbox() throws InterruptedException {
		
		//Selected email move back to Inbox and print total number of emails in your Inbox
		
    	Actions builder = new Actions(driver);
    	
		//click on more
		WebElement more = More;
		builder.moveToElement(more).build().perform();
		more.click();
		Thread.sleep(5000);
		
		//click on bin
		WebElement bin = Bin;
		builder.moveToElement(bin).build().perform();
		bin.click();
		Thread.sleep(2000);
		
		//select deleted email
		WebElement select2 = Select2;
		builder.moveToElement(select2).build().perform();
		select2.click();
		Thread.sleep(2000);
		
		//click move to
		WebElement moveTo = MoveTo;
		builder.moveToElement(moveTo).build().perform();
		moveTo.click();
		Thread.sleep(2000);
		
		//select inbox and click
		MtTextBox.sendKeys("Inbox");
		Thread.sleep(2000);
		MtTextBox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		
		//back to main inbox page
		WebElement inboxPage = InboxPage;
		builder.moveToElement(inboxPage).build().perform();
		inboxPage.click();
		Thread.sleep(2000);
		
		
		//print total numbers of emails in your inbox
		WebElement ttlEmail2 = TtlEmail2;
		System.out.println("Total emails after moving one email back to the inbox = "+ttlEmail2.getText());
		Thread.sleep(2000);
		
	}
    
    public void markAsUnread() throws InterruptedException {
		
		//Marked any Read email to Unread email and verify it
    	
    	Actions builder = new Actions(driver);
    	
    	//select one read email
    	WebElement selectRead = SelectRead;
    	builder.moveToElement(selectRead).build().perform();
    	selectRead.click();
    	Thread.sleep(2000);
    	
    	//click on move icon button(Three dot)
    	WebElement moveIcon = MoveIcon;
    	builder.moveToElement(moveIcon).build().perform();
    	moveIcon.click();
    	Thread.sleep(2000);
    	
    	//mark that selected email as UNREAD
    	WebElement unread = Unread;
    	builder.moveToElement(unread).build().perform();
    	unread.click();
    	Thread.sleep(1000);
    	
    	//verify that the email is marked as UNREAD
    	String verifyUnread = VerifyUnread.getText();
    	String expectedMsg = "Conversation marked as unread.";
    	
    	try {
    		Assert.assertEquals(verifyUnread, expectedMsg);
    		System.out.println("TEST-PASS - email marked as unread");
    	}
    	catch(Throwable t){
    		System.out.println("TEST-FAIL");
    		errCol.addError(t);
    		System.out.println(t);
    	}
    	
    	Thread.sleep(2000);
    	
    	//deselect email
    	WebElement deselect = Deselect;
    	builder.moveToElement(deselect).build().perform();
    	deselect.click();
    	Thread.sleep(2000);
		
	}
    
    public void markAsRead() throws InterruptedException {
		
		//Now, that Unread email marked to Read email and verify it
    	
    	Actions builder = new Actions(driver);
    	
		//select unread email
    	WebElement selectUnread = SelectUnread;
    	builder.moveToElement(selectUnread).build().perform();
    	selectUnread.click();
    	Thread.sleep(2000);
    	
    	//click on move icon button(Three dot)
    	WebElement moveIcon1 = MoveIcon1;
    	builder.moveToElement(moveIcon1).build().perform();
    	moveIcon1.click();
    	Thread.sleep(2000);
    	
    	//mark that selected email as READ
    	WebElement read = Read;
    	builder.moveToElement(read).build().perform();
    	read.click();
    	Thread.sleep(1000);
    	
    	//verify that the email is marked as READ
    	String verifyRead = VerifyRead.getText();
    	String expectedMsg = "Conversation marked as read.";
    	
    	try {
    		Assert.assertEquals(verifyRead, expectedMsg);
    		System.out.println("TEST-PASS - email marked as read");
    	}
    	catch(Throwable t){
    		System.out.println("TEST-FAIL");
    		errCol.addError(t);
    		System.out.println(t);
    	}
    	
    	Thread.sleep(2000);
    	
    	//deselect email
    	WebElement deselect1 = Deselect1;
    	builder.moveToElement(deselect1).build().perform();
    	deselect1.click();
    	Thread.sleep(2000);
		
	}

}
