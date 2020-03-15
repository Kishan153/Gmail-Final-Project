package com.testing;


import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFile {
	
PageFile pf = new PageFile();
    
    @BeforeMethod
    public void beforeMethod() throws Exception{
    	pf.openBrowser();
    	pf.openURL();
    }
    
    @AfterMethod
    public void afterMethod(ITestResult result) {
    	pf.closeBrowser();
    }
    
    @Test
    public void invalidUserTest() throws InterruptedException{
    	pf.invalidUser();
    }
    
	

}
