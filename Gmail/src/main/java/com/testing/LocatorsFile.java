package com.testing;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LocatorsFile {
	
	@FindBy (xpath = ".//*[@id='identifierId']\"") public WebElement UserTextBox;
	@FindBy (xpath = "//div[@class=\\\"LXRPh\\\"]/div[2]/div[contains(text(),\\\"Couldn't find your Google Account\\\")]") public WebElement UserErrorMsg;
	@FindBy (xpath = ".//*[@id='password']/div[1]/div/div[1]/input") public WebElement PwdTextBox;
	@FindBy (xpath = "//div[@jsname=\\\"h9d3hd\\\"]/div[2]/span[contains(text(),\\\"Wrong password. Try again or click Forgot password to reset it.\\") public WebElement PwdErrorMsg;
	@FindBy (xpath = "//div [@class='UI']/div/div[1]/div[3]/div/table/tbody/tr") public List<WebElement> NumOfMsg;
	@FindBy (xpath = "//div[@class='aeH']/div/div/div[2]/div/span/div/span/span[2]") public WebElement TtlEmail;
	@FindBy (xpath = "//div[@class='UI']/div/div[1]/div[3]/div/table/tbody/tr/td[2]/div") public WebElement Select;
	@FindBy (xpath = "//div[@class='aeH']/div[1]/div/div/div/div/div[2]/div[3]/div") public WebElement Delete;
	@FindBy (xpath = "//span[@class='CJ']") public WebElement More;
	@FindBy (xpath = "//a[@title=\\\"Bin\\\"]") public WebElement Bin;
	@FindBy (xpath = "//div[@class=\\\"aeF\\\"]/div/div[2]/div[3]/div[2]/div/table/tbody/tr/td[2]/div") public WebElement Select2;
	@FindBy (xpath = "//div[@class=\\\"aeH\\\"]/div[2]/div/div/div/div/div[5]/div/div") public WebElement MoveTo;
	@FindBy (xpath = "//input[@aria-label=\\\"Move-to menu open\\\"]") public WebElement MtTextBox;
	@FindBy (xpath = "//div[@class=\\\"nM\\\"]/div[2]/div/div/div/div/div/div/div/div/div[2]/span/a") public WebElement InboxPage;
	@FindBy (xpath = "//div[@class='aeH']/div/div/div[2]/div/span/div/span/span[2]") public WebElement TtlEmail2;
	@FindBy (xpath = "//div[@class='UI']/div/div[1]/div[3]/div/table/tbody/tr/td[2]/div") public WebElement SelectRead;
	@FindBy (xpath = "//div[@gh=\\\"mtb\\\"]/div/div/div[7]/div/span") public WebElement MoveIcon;
	@FindBy (xpath = "//div[starts-with(@class,\\\"J\\\")]/div[starts-with(@class,\\\"SK\\\")]/div[3]/*[contains(text(),\\\"Mark as unread\\\")]") public WebElement Unread;
	@FindBy (xpath = "//div[@class=\\\"nH\\\"]/div/div/div[@class=\\\"vh\\\"]/span/span[1]") public WebElement VerifyUnread;
	@FindBy (xpath = "//div[@class='UI']/div/div[1]/div[3]/div/table/tbody/tr/td[2]/div") public WebElement Deselect;
	@FindBy (xpath = "//div[@class='UI']/div/div[1]/div[3]/div/table/tbody/tr/td[2]/div") public WebElement SelectUnread;
	@FindBy (xpath = "//div[@gh=\\\"mtb\\\"]/div/div/div[7]/div/span") public WebElement MoveIcon1;
	@FindBy (xpath = "//div[starts-with(@class,\\\"J\\\")]/div[starts-with(@class,\\\"SK\\\")]/div[2]/*[contains(text(),\\\"Mark as read\\\")]") public WebElement Read;
	@FindBy (xpath = "//div[@class=\\\"nH\\\"]/div/div/div[@class=\\\"vh\\\"]/span/span[1]") public WebElement VerifyRead;
	@FindBy (xpath = "//div[@class='UI']/div/div[1]/div[3]/div/table/tbody/tr/td[2]/div") public WebElement Deselect1;
	
}
