package com.pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.objectrepository.ObjectRepository;

public class ProgressBarPage {
	public WebDriver driver;
	public ProgressBarPage(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(xpath=ObjectRepository.startButtonXpath)
	@CacheLookup
	WebElement startButton;
	
	@FindBy(xpath=ObjectRepository.completionMessageXpath)
	@CacheLookup
	WebElement completionText;
	
	public void clickOnProgressBar() {
		startButton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		String text = completionText.getText();
		System.out.println(text);
	}
}
