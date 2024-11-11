package com.driverscript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.objectrepository.ObjectRepository;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	static WebDriverWait wait;
	static Properties prop = new Properties();
	static FileInputStream fis;
	public static void launchBrowser() throws IOException {
		try {
			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\driverscript\\configuration.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		System.out.println("Application has launched successfully");
	}

	public static void handleCalendar(WebElement currentYearLocator, WebElement currentMonthLocator, WebElement nextBtn,
			String expectedYear, String expectedMonth) {
		String currentMonth = currentMonthLocator.getText().trim();
		String currentYear = currentYearLocator.getText().trim();
		String desiredYear = expectedYear;
		String desiredMonth = expectedMonth;
		if (!currentYear.trim().equals(desiredYear.trim())) {
			while (!currentYear.trim().equals(desiredYear.trim())) {
				//JavascriptExecutor js = (JavascriptExecutor)driver;
				//js.executeScript("arguments[0].click();", nextBtn);
				wait = new WebDriverWait(driver, Duration.ofSeconds(5));
				//WebElement nextButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ObjectRepository.nextBtnInCalendarXapth)));
				nextBtn.click();
				//wait.until(ExpectedConditions.visibilityOf(currentYearLocator));
				WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ObjectRepository.currentYearXpath)));
				//js.executeScript("arguments[0].scrollIntoView(true);",currentYearLocator);
				currentYear = element.getText().trim();
				if(currentYear.equals(desiredYear)) {
					break;
				}
			}
		}
		if (!currentMonth.equals(desiredMonth)) {
			while (!currentMonth.equals(desiredMonth)) {
				wait = new WebDriverWait(driver, Duration.ofSeconds(5));
				WebElement nextButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ObjectRepository.nextBtnInCalendarXapth)));
				nextButton.click();
				WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ObjectRepository.currentMonthXapth)));
				currentMonth = element.getText().trim();
				if(currentMonth.equals(desiredMonth)) {
					break;
				}
			}
		}
	}
}
