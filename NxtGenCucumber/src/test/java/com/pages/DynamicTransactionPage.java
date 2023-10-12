package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.objectrepository.ObjectRepository;

public class DynamicTransactionPage {
	public WebDriver driver;
	public DynamicTransactionPage(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(xpath=ObjectRepository.dynamicTransactionXpath)
	@CacheLookup
	WebElement dynamicTransaction;
	public void handleDyanmiTransaction() {
		String dynamicText = dynamicTransaction.getText();
		if(dynamicText.contains("Registration Form is Successfully Submitted."))
			System.out.println("Dynamic Transaction number generated");
	}
}
