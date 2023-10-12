package com.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.objectrepository.ObjectRepository;

public class MouseEventPage {
	public WebDriver driver;
	public MouseEventPage(WebDriver driver) {
		this.driver= driver;
	}
	@FindBy(xpath=ObjectRepository.textFieldXpath)
	@CacheLookup
	WebElement textField;

	@FindBy(xpath=ObjectRepository.doubleClickXpath)
	@CacheLookup
	WebElement doubleClick;

	@FindBy(xpath=ObjectRepository.rightClickXpath)
	@CacheLookup
	WebElement rightClick;

	public void enterTextBox() {
		Actions action = new Actions(driver);
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
		Actions action = new Actions(driver);
		action.moveToElement(doubleClick).doubleClick().perform();
	}
	public void handleRightClick() {
		Actions action = new Actions(driver);
		action.contextClick(rightClick).perform();
	}

}