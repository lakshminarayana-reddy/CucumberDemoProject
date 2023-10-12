package com.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import com.objectrepository.ObjectRepository;

public class AlertPopupPage {
	public WebDriver driver;
	public AlertPopupPage(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(xpath=ObjectRepository.alertBoxXpath)
	@CacheLookup
	WebElement alertBox;
	
	@FindBy(xpath=ObjectRepository.confirmAlertBoxXpath)
	@CacheLookup
	WebElement confirmAlertBox;
	
	@FindBy(xpath=ObjectRepository.promptAlertBoxXpath)
	@CacheLookup
	WebElement promptAlertBox;
	
	public void handlingAlertBox() {
		alertBox.click();
		driver.switchTo().alert().accept();
	}
	
	public void handlingConfirmAlertBox() {
		confirmAlertBox.click();
		driver.switchTo().alert().accept();
		confirmAlertBox.click();
		driver.switchTo().alert().dismiss();
	}
	
	public void handlingPromptAlertBox() {
		promptAlertBox.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Yes");
		alert.accept();
		promptAlertBox.click();
		alert.sendKeys("No");
		alert.dismiss();
	}
}
