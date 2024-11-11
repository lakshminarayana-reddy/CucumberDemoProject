package com.objectrepository;

public class ObjectRepository {
	public static final String homePageXapth ="//div[@class='collapse navbar-collapse pull-right']//a[text()='Home']";
	public static final String demoSitesXpath ="//div[@class='collapse navbar-collapse pull-right']//a[text()='Demo Sites']";
	public static final String practiceAutomationXpath ="//div[@class='collapse navbar-collapse pull-right']//a[text()='Practice Automation']";
	public static final String registerDemoXpath ="//div[@class='collapse navbar-collapse pull-right']//a[text()='Registration Form']";
	public static final String firstNameXpath="//input[@id='vfb-5']";
	public static final String lastNameXpath ="//input[@id='vfb-7']";
	public static final String genderXpath ="//input[@id='vfb-31-1']";
	public static final String streetAddressXpath ="//input[@id='vfb-13-address']";
	public static final String buildingNameXpath ="//input[@id='vfb-13-address-2']";
	public static final String cityXpath="//input[@id='vfb-13-city']";
	public static final String stateXpath="//input[@id='vfb-13-state']";
	public static final String zipcodeXpath ="//input[@id='vfb-13-zip']";
	public static final String countryXpath="//select[@id='vfb-13-country']";
	public static final String countryValueXpath="//select[@id='vfb-13-country']//option[text()='India']";
	public static final String emailXpath="//input[@id='vfb-14']";
	public static final String dateOfDemoXpath="//input[@id='vfb-18']";
	public static final String hourXpath ="//select[@id='vfb-16-hour']";
	public static final String minXpath="//select[@id='vfb-16-min']";
	public static final String mobNumXpath="//input[@id='vfb-19']";
	public static final String seleniumWebDriverXpath = "//input[@id='vfb-20-0']";
	public static final String testNGXpath ="//input[@id='vfb-20-2']";
	public static final String coreJavaXpath="//input[@id='vfb-20-3']";
	public static final String funTestingXpath ="//input[@id='vfb-20-4']";
	public static final String queryXpath="//textarea[@id='vfb-23']";
	public static final String verNumTextXapth ="//label[text()='Example: 99']";
	public static final String verNumXpath="//input[@id='vfb-3']";
	public static final String submitXpath ="//input[@id='vfb-4']";
	
	//Alert Popup Page
	public static final String alertPopupXpath="//div[@data-text='Menu']//parent::div//ul[@class='sub-menu']//a[text()='Alert and Popup']";
	public static final String alertBoxXpath = "//button[@name='alertbox']";
	public static final String confirmAlertBoxXpath="//button[@name='confirmalertbox']";
	public static final String promptAlertBoxXpath="//button[@name='promptalertbox1234']";
	
	//Dynamic transaction Page
	public static final String dynamicTransactionPage="//div[@data-text='Menu']//parent::div//ul[@class='sub-menu']//a[text()='Transaction Details']";
	public static final String dynamicTransactionXpath="//*[contains(text(),'Registration Form is Successfully Submitted. The Transaction ID')]";
	
	//iFrames Page
	public static final String iFramesPageXpath="//div[@data-text='Menu']//parent::div//ul[@class='sub-menu']//a[text()='iFrames']";
	public static final String iFrameTextOneXpath ="//p[text()='Watch your grammar.']";
	public static final String iFrameFirstNameXpath ="//input[@id='vfb-5']";
	public static final String iFrameTextTwo="//p[text()='Close on a positive, enthusiastic note.']";
	
	//Mouse Event Page
	public static final String mouseEventPageXpath ="//div[@data-text='Menu']//parent::div//ul[@class='sub-menu']//a[text()='Mouse Event']";
	public static final String textFieldXpath="//input[@id='textbox']";
	public static final String doubleClickXpath ="//button[@id='dblclick']";
	public static final String rightClickXpath="//button[@id='rightclick']";
	public static final String dragMeId ="draggableElement";
	public static final String dropHereId="droppableElement";
	public static final String draggedOrNotXpath ="//div[@id='droppableElement']//div[@id='draggableElement']";
	
	//ProgressBar Page
	public static final String progressBarPageXpath ="//div[@class='col-md-9 col-sm-9 col-sm-offset-0 hidden-xs hidden-sm']//a[text()='Demo Site – Progress Bar']";
	public static final String startButtonXpath="//button[@id='start']";
	public static final String completionMessageXpath="//div[@id='content']";
	
	//WebTable
	public static final String webTablePageXpath ="//div[@data-text='Menu']//parent::div//ul[@class='sub-menu']//a[text()='WebTable']";
	public static final String firstNameKeyXpath="//b[text()='First Name']";
	public static final String firsNameValueXpath = "//td[text()='Sundar']";
	public static final String emailIdKeyXpath="//b[text()='Email id']";
	public static final String emailValueXpath="//td[text()='sundarpichai@gmail.com']";
	public static final String mulSelDDXpath="//select[@class='select2-hidden-accessible']";
	public static final String javaDDValueXpath="//li[@id='select2-programming-zp-result-0s5w-JAVA']";
	public static final String javaScriptDDValueXpath="//ul[@id='select2-programming-rk-results']//li[text()='JavaScript']";
	public static final String phpDDValueXpath="//ul[@id='select2-programming-rk-results']//li[text()='PHP']";
	public static final String pythonDDValueXpath="//ul[@id='select2-programming-rk-results']//li[text()='Python']";
	
	//Multiple Windows
	public static final String multipleWindowsPageXpath= "//div[@data-text='Menu']//parent::div//ul[@class='sub-menu']//a[text()='Multiple Windows']";
	public static final String newBrowserWindowXpath ="//div[@data-id='d5cad06']";
	public static final String newMessageWindowXpath ="//div[@data-id='d94c712']";
	public static final String newBrowserTabXpath ="//div[@data-id='f5f0e8d']";
	public static final String freeYoutubeCoursesXpath ="//div[@class='collapse navbar-collapse pull-right']//a[text()='Free YouTube Courses']";
	
	//iFrames Updates
	public static final String homePageiFrameXpath = "//iframe[@name='homepage']";
	public static final String ellipsesXpath ="//span[text()='Toggle navigation']//parent::button[@type='button']";
	public static final String searchFeildXPath ="//form[@id='searchform-mobile']//input[@placeholder='Search...']";
	public static final String searchButtonIconXpath="//form[@id='searchform-mobile']//button[@class='search-submit']";
	public static final String popupPageiFrameXpath ="//iframe[@name='popuppage']";
	public static final String alertBoxiFrameXpath="//button[@name='alertbox']";
	public static final String confirmAlertBoxiFrameXpath="//button[@name='confirmalertbox']";
	public static final String confirmAlertBoxTextXpath="//p[@id='demo']";
	public static final String promptAlertBoxiFrameXpath="//button[@name='promptalertbox1234']";
	public static final String promptAlertBoxTextXpath="//p[@id='demoone']";
	public static final String formPageiFrameXpath="//iframe[@name='formpage']";
	public static final String firstNameiFrameXpath ="//input[@id='vfb-5']";
	
	//Calendar
	public static final String currentMonthXapth="//span[@class='ui-datepicker-month']";
	public static final String currentYearXpath="//span[@class='ui-datepicker-year']";
	public static final String nextBtnInCalendarXapth="//span[text()='Next']";
	public static final String dateXpath="//td[@data-handler='selectDay']//a[text()='%S']";

	
}
