package com.stepdefinition;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.driverscript.BaseClass;
import com.objectrepository.ObjectRepository;
import com.pages.AlertPopupPage;
import com.pages.DynamicTransactionPage;
import com.pages.MouseEventPage;
import com.pages.MultipleWindowsPage;
import com.pages.ProgressBarPage;
import com.pages.RegisterDemoPage;
import com.pages.WebTablePage;
import com.pages.iFramesPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;

public class StepDefinition extends BaseClass {
	@Given("user launches the application")
	public void user_launches_the_application() throws IOException {
		launchBrowser();
	}

	@When("user navigate to Demo sites")
	public void user_navigate_to_demo_sites() {
		WebElement demoSites =driver.findElement(By.xpath(ObjectRepository.demoSitesXpath));
		Actions action = new Actions(driver);
		action.moveToElement(demoSites).perform();
		System.out.println("Navigated to Demo Sites");
	}

	@And("naviagte to Practice Automation")
	public void naviagte_to_practice_automation() {
		WebElement practiceAutomation = driver.findElement(By.xpath(ObjectRepository.practiceAutomationXpath));
		Actions action = new Actions(driver);
		action.moveToElement(practiceAutomation).perform();
		System.out.println("Navigated to Practice Automation");
	}

	@And("navigate to Demo Site Registration Form")
	public void navigate_to_demo_site_registration_form() {
		WebElement registerDemoPage = driver.findElement(By.xpath(ObjectRepository.registerDemoXpath));
		registerDemoPage.click();
		System.out.println("Registration Demo page load successfully");
	}

	@And("enter FirstName as {string},LastName as {string} and select Gender as {string}")
	public void enter_first_name_as_last_name_as_and_select_gender_as(String firstNameValue, String lastNameValue, String gender) {
		WebElement firstName = driver.findElement(By.xpath(ObjectRepository.firstNameXpath));
		firstName.sendKeys(firstNameValue);
		WebElement lastName = driver.findElement(By.xpath(ObjectRepository.lastNameXpath));
		lastName.sendKeys(lastNameValue);
		WebElement maleGender = driver.findElement(By.xpath(ObjectRepository.genderXpath));
		if(gender.equalsIgnoreCase("Male"))
			maleGender.click();
		System.out.println("Person details filled");
	}

	@And("enter StreetAddress as {string},BuildingName as {string}, City as {string}, State as {string}, Zipcode as {string} and select country as {string}")
	public void enter_street_address_as_building_name_as_city_as_state_as_zipcode_as_and_select_country_as(String streetAddressValue, String buildingNameValue, String cityValue, String stateValue, String zipcodeValue, String countryValue) {
		WebElement streetAddress = driver.findElement(By.xpath(ObjectRepository.streetAddressXpath));
		streetAddress.sendKeys(streetAddressValue);
		WebElement buildingName = driver.findElement(By.xpath(ObjectRepository.buildingNameXpath));
		buildingName.sendKeys(buildingNameValue);
		WebElement city = driver.findElement(By.xpath(ObjectRepository.cityXpath));
		city.sendKeys(cityValue);
		WebElement state = driver.findElement(By.xpath(ObjectRepository.stateXpath));
		state.sendKeys(stateValue);
		WebElement zipcode = driver.findElement(By.xpath(ObjectRepository.zipcodeXpath));
		zipcode.sendKeys(zipcodeValue);
		WebElement country = driver.findElement(By.xpath(ObjectRepository.countryXpath));
		//country.click();
		Select countryName = new Select(country);
		countryName.selectByVisibleText(countryValue);
		System.out.println("Address details are entered");
	}
	@And("email as {string}, Date as {string}, Month as {string}, Year as {string} ConvinientTimeHour as {string}, ConvinientTimeMin as {string} and MobileNumber as {string}")
	public void email_as_date_as_month_as_year_as_convinient_time_hour_as_convinient_time_min_as_and_mobile_number_as(String emailValue, String date, String month, String year, String hourValue, String minValue, String mobNumValue) {
		WebElement email = driver.findElement(By.xpath(ObjectRepository.emailXpath));
		email.sendKeys(emailValue);
		WebElement dateOfDemo = driver.findElement(By.xpath(ObjectRepository.dateOfDemoXpath));
		dateOfDemo.click();
		RegisterDemoPage page = PageFactory.initElements(driver, RegisterDemoPage.class);
		page.selectDateOfDemo(year, month, date);
		WebElement hour = driver.findElement(By.xpath(ObjectRepository.hourXpath));
		Select hours = new Select(hour);
		hours.selectByVisibleText(hourValue);
		WebElement min = driver.findElement(By.xpath(ObjectRepository.minXpath));
		Select mins = new Select(min);
		mins.selectByVisibleText(minValue);
		WebElement mobNum = driver.findElement(By.xpath(ObjectRepository.mobNumXpath));
		mobNum.sendKeys(mobNumValue);
		System.out.println("Contact Details entered");
	}

	@And("Select course1 as {string}, Course2 as {string} and Course3 as {string}")
	public void select_course1_as_course2_as_and_course3_as(String courseOneVal, String courseTwoVal, String courseThreeVal) {
		WebElement courseOne = driver.findElement(By.xpath(ObjectRepository.seleniumWebDriverXpath));
		if(courseOneVal.equalsIgnoreCase("Selenium WebDriver"))
			courseOne.click();
		WebElement courseTwo = driver.findElement(By.xpath(ObjectRepository.testNGXpath));
		if(courseTwoVal.equalsIgnoreCase("TestNG"))
			courseTwo.click();
		WebElement courseThree = driver.findElement(By.xpath(ObjectRepository.coreJavaXpath));
		WebElement courseFour = driver.findElement(By.xpath(ObjectRepository.funTestingXpath));
		if(courseThreeVal.equalsIgnoreCase("Core Java"))
			courseThree.click();
		else
			courseFour.click();
		System.out.println("Courses selected");
	}

	@And("enter Query as {string}, Verification Number as {string} and click on submit")
	public void enter_query_as_verification_number_as_and_click_on_submit(String queryVal, String verNumVal) {
		WebElement query = driver.findElement(By.xpath(ObjectRepository.queryXpath));
		query.sendKeys(queryVal);
		WebElement verNumText = driver.findElement(By.xpath(ObjectRepository.verNumTextXapth));
		String verNumtext =verNumText.getText();
		String num[] =verNumtext.split(":");
		String vernum = num[1].trim();
		WebElement verNum = driver.findElement(By.xpath(ObjectRepository.verNumXpath));
		if(verNumVal.equalsIgnoreCase(vernum))
			verNum.sendKeys(verNumVal);
		System.out.println("Test");
	}

	@Then("Registration is successful")
	public void registration_is_successful() {
		WebElement submitButton = driver.findElement(By.xpath(ObjectRepository.submitXpath));
		submitButton.click();
		System.out.println("Test");
	}

	@And("validate Registration Number")
	public void validate_registration_number() {
		System.out.println("Test");
	}
	@And("close the application")
	public void close_the_application() {
		if(driver!= null)
			driver.quit();	
	}
	@When("navigate to AlertPopUp page")
	public void navigate_to_alert_pop_up_page() {
		WebElement alertPopUp = driver.findElement(By.xpath(ObjectRepository.alertPopupXpath));
		alertPopUp.click();
		System.out.println("Navigated to Alert Pop up page");
	}

	@When("click on AlertBox and Handle it")
	public void click_on_alert_box_and_handle_it() {
		AlertPopupPage alertPage = PageFactory.initElements(driver, AlertPopupPage.class);
		alertPage.handlingAlertBox();
	}
	@When("click on ConfirmAlertBox and Handle it")
	public void click_on_confirm_alert_box_and_handle_it() {
		AlertPopupPage alertPage = PageFactory.initElements(driver, AlertPopupPage.class);
		alertPage.handlingConfirmAlertBox();
	}

	@When("click on PromptAlertBox and Handle it")
	public void click_on_prompt_alert_box_and_handle_it() {
		AlertPopupPage alertPage = PageFactory.initElements(driver, AlertPopupPage.class);
		alertPage.handlingPromptAlertBox();
	}
	@When("navigate to Dynamic transaction page")
	public void navigate_to_dynamic_transaction_page() {
		WebElement dynamicTranPage =driver.findElement(By.xpath(ObjectRepository.dynamicTransactionPage));
		dynamicTranPage.click();
	}

	@When("handle Dynamic transaction")
	public void handle_dynamic_transaction() {
		DynamicTransactionPage page = PageFactory.initElements(driver, DynamicTransactionPage.class);
		page.handleDyanmiTransaction();
	}
	@When("navigate to iFrames Page")
	public void navigate_to_i_frames_page() {
		WebElement iFramePage = driver.findElement(By.xpath(ObjectRepository.iFramesPageXpath));
		iFramePage.click();
	}
	@When("handle homepage iFrame")
	public void handle_homepage_i_frame() {
		driver.switchTo().frame(driver.findElement(By.xpath(ObjectRepository.homePageiFrameXpath)));
		System.out.println("Driver switched");
		iFramesPage page = PageFactory.initElements(driver, iFramesPage.class);
		page.handleHomePageiFrame();
		driver.switchTo().defaultContent();
	}

	@When("handle popuppage iFrame")
	public void handle_popuppage_i_frame() {
		driver.switchTo().frame(driver.findElement(By.xpath(ObjectRepository.popupPageiFrameXpath)));
		iFramesPage page = PageFactory.initElements(driver, iFramesPage.class);
		page.handlePopUpPageiFrame();
		driver.switchTo().defaultContent();
	}

	@When("handle formpage iFrame")
	public void handle_formpage_i_frame() {
		driver.switchTo().frame("formpage");
		iFramesPage page = PageFactory.initElements(driver, iFramesPage.class);
		page.handleFormPageiFrame();

	}

	@When("navigate to Mouse event page")
	public void navigate_to_mouse_event_page() {
		WebElement mouseEventPage = driver.findElement(By.xpath(ObjectRepository.mouseEventPageXpath));
		mouseEventPage.click();
	}
	@When("perform mouse actions")
	public void perform_mouse_actions() {
		MouseEventPage page = PageFactory.initElements(driver,MouseEventPage.class);
		page.enterTextBox();
		page.handleDoubleClick();
		page.handleRightClick();
	}
	@When("perform dragAndDrop")
	public void perform_drag_and_drop() {
	    MouseEventPage page = PageFactory.initElements(driver, MouseEventPage.class);
	    boolean status=page.dragAndDrop();
	    Assert.assertTrue(status);
	}
	@When("navigate to ProgressBar page")
	public void navigate_to_progress_bar_page() {
		WebElement progressBarPage = driver.findElement(By.xpath(ObjectRepository.progressBarPageXpath));
		progressBarPage.click();
	}

	@When("click on Progress bar")
	public void click_on_progress_bar() {
		ProgressBarPage page = PageFactory.initElements(driver, ProgressBarPage.class);
		page.clickOnProgressBar();
	}
	@When("navigate to webTable page")
	public void navigate_to_web_table_page() {
		WebElement webTablePage = driver.findElement(By.xpath(ObjectRepository.webTablePageXpath));
		webTablePage.click();
	}

	@When("retrive data from webTable")
	public void retrive_data_from_web_table() {
		WebTablePage page = PageFactory.initElements(driver, WebTablePage.class);
		page.retriveWebTableData();
	}

	@When("select multiple dropdown")
	public void select_multiple_dropdown() {
		WebTablePage page = PageFactory.initElements(driver, WebTablePage.class);
		page.selectMultipleValDD();
	}
	@When("navigate to MultipleWindows Page")
	public void navigate_to_multiple_windows_page() {
		WebElement multipleWindowsPage = driver.findElement(By.xpath(ObjectRepository.multipleWindowsPageXpath));
		multipleWindowsPage.click();
	}

	@When("handle Multiple Browser window")
	public void handle_multiple_browser_window() {
		MultipleWindowsPage page = PageFactory.initElements(driver, MultipleWindowsPage.class);
		page.handleNewBrowserWindow();
	}

	@When("handle Multiple Message window")
	public void handle_multiple_message_window() {
		MultipleWindowsPage page = PageFactory.initElements(driver, MultipleWindowsPage.class);
		page.handleNewMessageWindow();
	}

	@When("handle Multiple Browser Tab")
	public void handle_multiple_browser_tab() {
		MultipleWindowsPage page = PageFactory.initElements(driver, MultipleWindowsPage.class);
		page.handleNewBrowserTab();
	}

}
