There are two types of browser that we can run our test case
1. Browser Controller such as FirefoxDriver, InternetExplorerDriver, ChromeDriver, SafariDriver, OperaDriver
	-execution goes on the real browser
2. Headless browser Emulator such as PhantomJS, htmlunitDriver
	-execution goes in side the browser and it is very faster execution

In this project I will be discussing about Page Factory features in the Selenium Platform
-Main feature of Page Factory is List of WebElements used By @FindBy annotation in a specific class
-Those WebElements would be initialize by PageFactory creating the object of the class
-Then those WebElements would be invoked by the object name of the class.
- See the project step by step for more details

Note: This same project we will be able to run on the all browser mention above
-for IE, chrome you need DrivderServer.exe
