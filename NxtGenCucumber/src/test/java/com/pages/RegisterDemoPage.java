package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.driverscript.BaseClass;
import com.objectrepository.ObjectRepository;

public class RegisterDemoPage extends BaseClass {
	public WebDriver driver;
	public RegisterDemoPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(xpath=ObjectRepository.currentYearXpath)
	@CacheLookup
	WebElement currentYear;
	
	@FindBy(xpath=ObjectRepository.currentMonthXapth)
	@CacheLookup
	WebElement currentMonth;
	
	@FindBy(xpath=ObjectRepository.nextBtnInCalendarXapth)
	@CacheLookup
	WebElement nextBtnInCalendar;
	
	@FindBy(xpath=ObjectRepository.dateXpath)
	@CacheLookup
	WebElement date;
	
	
	public void selectDateOfDemo(String expectedYear, String expectedMonth, String dateValue) {
		handleCalendar(currentYear, currentMonth, nextBtnInCalendar, expectedYear, expectedMonth);
		String formattedXpath = String.format(ObjectRepository.dateXpath, dateValue);
		WebElement dateElement = driver.findElement(By.xpath(formattedXpath));
		dateElement.click();
	}
}
