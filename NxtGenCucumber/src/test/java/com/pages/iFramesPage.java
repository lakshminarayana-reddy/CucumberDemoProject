package com.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.objectrepository.ObjectRepository;

public class iFramesPage {
	public WebDriver driver;
	public static WebDriverWait wait;
	public iFramesPage(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(xpath=ObjectRepository.ellipsesXpath)
	@CacheLookup
	WebElement ellipses;
	
	@FindBy(xpath=ObjectRepository.searchFeildXPath)
	@CacheLookup
	WebElement searchFeild;
	
	@FindBy(xpath=ObjectRepository.searchButtonIconXpath)
	@CacheLookup
	WebElement searchButton;
	
	@FindBy(xpath=ObjectRepository.alertBoxiFrameXpath)
	@CacheLookup
	WebElement alertBoxiFrame;
	
	@FindBy(xpath=ObjectRepository.confirmAlertBoxiFrameXpath)
	@CacheLookup
	WebElement confirmAlertBox;
	
	@FindBy(xpath=ObjectRepository.confirmAlertBoxTextXpath)
	@CacheLookup
	WebElement confirmAlertBoxText;
	
	@FindBy(xpath=ObjectRepository.promptAlertBoxiFrameXpath)
	@CacheLookup
	WebElement promptAlertBox;
	
	@FindBy(xpath=ObjectRepository.promptAlertBoxTextXpath)
	@CacheLookup
	WebElement promptAlertBoxText;
	
	@FindBy(xpath=ObjectRepository.firstNameiFrameXpath)
	@CacheLookup
	WebElement firstNameXpath;
	
	public void handleHomePageiFrame() {
		ellipses.click();
		System.out.println("Ellipses clicked");
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(searchFeild));
		searchFeild.sendKeys("test");
		System.out.println("Text feild given");
		searchButton.click();
		System.out.println("Search button clicked");
		
	}
	public void handlePopUpPageiFrame() {
		alertBoxiFrame.click();
		driver.switchTo().alert().accept();
		confirmAlertBox.click();
		driver.switchTo().alert().accept();
		System.out.println("Alert Box accepted");
		System.out.println(confirmAlertBoxText.getText());
		confirmAlertBox.click();
		driver.switchTo().alert().dismiss();
		System.out.println("Alert Box dismissed");
		System.out.println(confirmAlertBoxText.getText());
		promptAlertBox.click();
		driver.switchTo().alert().sendKeys("Yes");
		driver.switchTo().alert().accept();
		System.out.println(promptAlertBoxText.getText());
		
	}
	public void handleFormPageiFrame() {
		firstNameXpath.sendKeys("Sai");
	}

}
