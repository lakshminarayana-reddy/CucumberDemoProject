package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.objectrepository.ObjectRepository;

public class WebTablePage {
	public WebDriver driver;
	public WebTablePage(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(xpath=ObjectRepository.firstNameKeyXpath)
	@CacheLookup
	WebElement firstNameKey;
	
	@FindBy(xpath=ObjectRepository.firsNameValueXpath)
	@CacheLookup
	WebElement firstNameValue;
	
	@FindBy(xpath=ObjectRepository.emailIdKeyXpath)
	@ CacheLookup
	WebElement emailIdKey;
	
	@FindBy(xpath=ObjectRepository.emailValueXpath)
	@CacheLookup
	WebElement emailIdValue;
	
	@FindBy(xpath=ObjectRepository.mulSelDDXpath)
	@CacheLookup
	WebElement mulSelDD;
	
	@FindBy(xpath=ObjectRepository.javaDDValueXpath)
	@CacheLookup
	WebElement javaVal;
	
	@FindBy(xpath=ObjectRepository.javaScriptDDValueXpath)
	@CacheLookup
	WebElement javaScriptVal;
	
	@FindBy(xpath=ObjectRepository.phpDDValueXpath)
	@CacheLookup
	WebElement phpVal;
	
	@FindBy(xpath=ObjectRepository.pythonDDValueXpath)
	@CacheLookup
	WebElement pythonVal;
	
	public void retriveWebTableData() {
		String firstName = firstNameKey.getText();
		String firstNameVal = firstNameValue.getText();
		String emailId = emailIdKey.getText();
		String emailVal = emailIdValue.getText();
		System.out.println(firstName+" and its value is"+ firstNameVal);
		System.out.println(emailId+" and its value is"+ emailVal);
	}
	
	public void selectMultipleValDD() {
		
		
		Select sel = new Select(mulSelDD);
		sel.selectByValue("JAVA");
		sel.selectByVisibleText("Python");
	}

}
