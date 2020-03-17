package com.testing;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFile {
	
PageFile pf = new PageFile();
	
	@BeforeMethod
	public void beforeMethod() throws Exception {
		pf.openBrowser();
		pf.openURL();
	
	}
    
    @AfterMethod
    public void afterMethod(ITestResult result) {
    	pf.closeBrowser();
    }
    
    //Try to login with Invalid Credential(s) and verify the Error message.
    @Test (priority = 1)
    public void invalidUser() throws InterruptedException{
    	pf.invalidUser();
    }
    
    @Test (priority = 2)
    public void invalidPwd() throws InterruptedException{
    	pf.invalidPwd();
    }
    
    //Login with Valid Credentials.
    @Test (priority = 3)
    public void login() throws InterruptedException{
    	pf.login();
    }
    
    //Count how many emails on your first page of your Inbox and print the count on console.
    @Test (priority = 4)
    public void countEmail() throws InterruptedException{
    	pf.login();
    	pf.countEmail();
    }
    
    //Print total number of emails in your Inbox.
    @Test (priority = 5)
    public void inboxEmails() throws InterruptedException{
    	pf.login();
    	pf.inboxEmails();
    }
    
    //Select any one email from the list of your Inbox and move to Trash and print total number of emails in your Inbox.
    @Test (priority = 6)
    public void moveToTrash() throws InterruptedException{
    	pf.login();
    	pf.moveToTrash();
    }
    
    //Selected email move back to Inbox and print total number of emails in your Inbox.
    @Test (priority = 7)
    public void moveBackToInbox() throws InterruptedException{
    	pf.login();
    	pf.moveBackToInbox();
    }
   
    //Marked any Read email to Unread email and verify it.
    @Test (priority = 8)
    public void markAsUnread() throws InterruptedException{
    	pf.login();
    	pf.markAsUnread();
    }
    
    //Now, that Unread email marked to Read email and verify it.
    @Test (priority = 9)
    public void markAsRead() throws InterruptedException{
    	pf.login();
    	pf.markAsRead();
    }

}
