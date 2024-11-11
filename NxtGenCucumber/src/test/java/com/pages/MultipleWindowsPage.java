package com.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.objectrepository.ObjectRepository;

public class MultipleWindowsPage {
	public  WebDriver driver;
	public MultipleWindowsPage(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(xpath=ObjectRepository.newBrowserWindowXpath)
	@CacheLookup
	WebElement newBrowserWindow;

	@FindBy(xpath = ObjectRepository.newMessageWindowXpath)
	@CacheLookup
	WebElement newMessageWindow;

	@FindBy(xpath= ObjectRepository.newBrowserTabXpath)
	@CacheLookup
	WebElement newBrowserTab;
	
	@FindBy(xpath = ObjectRepository.freeYoutubeCoursesXpath)
	@CacheLookup
	WebElement freeYoutubeCourses;
	
	@FindBy(xpath = ObjectRepository.homePageXapth)
	@CacheLookup
	WebElement homePage;
	
	public void handleNewBrowserWindow() {
		newBrowserWindow.click();
		Set<String> windowID = driver.getWindowHandles();
		Iterator<String> iterator = windowID.iterator();
		String parentId =iterator.next();
		String childId = iterator.next();
		driver.switchTo().window(childId);
		driver.manage().window().maximize();
		freeYoutubeCourses.click();
		driver.close();
		driver.switchTo().window(parentId);
		//homePage.click();
	}
	public void handleNewMessageWindow() {
		newMessageWindow.click();
		Set<String> windowID = driver.getWindowHandles();
		Iterator<String> iterator = windowID.iterator();
		String parentId =iterator.next();
		String childId = iterator.next();
		driver.switchTo().window(childId);
		driver.close();
		driver.switchTo().window(parentId);
		//homePage.click();
	}
	public void handleNewBrowserTab() {
		newBrowserTab.click();
		Set<String> windowID = driver.getWindowHandles();
		Iterator<String> iterator = windowID.iterator();
		String parentId =iterator.next();
		String childId = iterator.next();
		driver.switchTo().window(childId);
		driver.manage().window().maximize();
		freeYoutubeCourses.click();
		driver.close();
		driver.switchTo().window(parentId);
		homePage.click();
	}
}
