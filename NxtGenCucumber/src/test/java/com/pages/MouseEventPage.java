package com.pages;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.objectrepository.ObjectRepository;

import junit.framework.Assert;

public class MouseEventPage {
	public WebDriver driver;
	public MouseEventPage(WebDriver driver) {
		this.driver= driver;
	}
	
	Actions action;
	
	@FindBy(xpath=ObjectRepository.textFieldXpath)
	@CacheLookup
	WebElement textField;

	@FindBy(xpath=ObjectRepository.doubleClickXpath)
	@CacheLookup
	WebElement doubleClick;

	@FindBy(xpath=ObjectRepository.rightClickXpath)
	@CacheLookup
	WebElement rightClick;
	
	@FindBy(id=ObjectRepository.dragMeId)
	@CacheLookup
	WebElement dragMeBtn;
	
	@FindBy(id=ObjectRepository.dropHereId)
	@CacheLookup
	WebElement dropHere;
	
	@FindBy(xpath=ObjectRepository.draggedOrNotXpath)
	@CacheLookup
	WebElement draggedOrNot;

	public void enterTextBox() {
		action = new Actions(driver);
		action.moveToElement(textField).perform();
		String toolTipMessage = textField.getAttribute("title");
		System.out.println(toolTipMessage);
		action.moveToElement(textField)
		.keyDown(textField, Keys.SHIFT)
		.sendKeys(textField, "saireddy")
		.keyUp(textField, Keys.SHIFT)
		.pause(3000)
		.sendKeys(Keys.ENTER)
		.perform();
	}
	public void handleDoubleClick() {
		action = new Actions(driver);
		action.moveToElement(doubleClick).doubleClick().perform();
	}
	public void handleRightClick() {
		action = new Actions(driver);
		action.contextClick(rightClick).perform();
	}
	public boolean dragAndDrop() {
		action = new Actions(driver);
		action.dragAndDrop(dragMeBtn, dropHere).perform();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(draggedOrNot));
		boolean isDragged = draggedOrNot.isDisplayed();
		return isDragged;
	}

}