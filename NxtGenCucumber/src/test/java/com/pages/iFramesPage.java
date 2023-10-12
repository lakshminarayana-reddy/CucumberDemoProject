package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.objectrepository.ObjectRepository;

public class iFramesPage {
	public WebDriver driver;
	public iFramesPage(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(xpath=ObjectRepository.ellipsesXpath)
	@CacheLookup
	WebElement ellipses;
	
	@FindBy(xpath=ObjectRepository.alertBoxiFrameXpath)
	@CacheLookup
	WebElement alertBoxiFrame;
	
	public void handleHomePageiFrame() {
		ellipses.click();
	}
	public void handlePopUpPageiFrame() {
		alertBoxiFrame.click();
	}

}
