package com.pro.utils;

import org.openqa.selenium.remote.DesiredCapabilities;

public class TestContext {
	
	
	
	
	public enum BROWSER {
		FIREFOX, ANDROID, GOOGLECHROME, IPAD, IPHONE, IE, CHROME, IEXPLORE, IPOD, HEADLESS , SAFARI, IOSAPP,EDGE
	};

	/**
	 * Constructor of TestContext. webdriver object gets created here
	 */
	public TestContext() {
		
		
		// Create the capability object for remote webdriver
		DesiredCapabilities capability = new DesiredCapabilities();

		String hubUrlString ="http://" + FrameworkProperties.SELENIUM_HOST + ":"
				+ FrameworkProperties.SELENIUM_PORT + "/wd/hub";

		//Display message in console as to which hub the tests were routed to.
		if (FrameworkProperties.SELENIUM_HOST.equalsIgnoreCase("cars0003p.prod.ch3.s.com"))
		{
			System.out.println("Routing to http://cars0003p.prod.ch3.s.com:4444");
		}
		else
		{
			System.out.println ("Route to hub "+ FrameworkProperties.SELENIUM_HOST);
		}

		String bsUrlString = null;

		if (isSauceLabs || isBrowserstack)
			bsUrlString =  "https://" + FrameworkProperties.SELENIUM_HOST + "/wd/hub";

		// Get requested browser from test.properties file. Remove the * if
		// present and convert to upper case for switch case
		String requestedBrowser = FrameworkProperties.SELENIUM_BROWSER.replace("*","").toUpperCase();
		String userAgent=getUserAgent();
		
		// Assign the capability based on requested browser. chrome and
		// googlechrome refer to googlechrome. ie and iexplore refer to internet
		// explorer
		switch (BROWSER.valueOf(requestedBrowser)) {

		case EDGE:
			if (isSauceLabs)
			{
				capability.setCapability("browserName", requestedBrowser);
				capability.setCapability("version", FrameworkProperties.SELENIUM_BROWSER_VERSION);
				capability.setCapability(CapabilityType.PLATFORM, Platform.valueOf(FrameworkProperties.OS_NAME.toUpperCase()));
			}
			if (isBrowserstack)
			{
				capability.setCapability("browserName", requestedBrowser);
				capability.setCapability("browser_version", FrameworkProperties.SELENIUM_BROWSER_VERSION);
				//capability.setCapability(CapabilityType.PLATFORM, Platform.valueOf(FrameworkProperties.OS_NAME.toUpperCase()));
				capability.setCapability("os", FrameworkProperties.OS_NAME);
				capability.setCapability("os_version", FrameworkProperties.OS_VERSION);
				capability.setCapability("resolution", "1024x768");
				capability.setCapability("browserstack.local", FrameworkProperties.BROWSERSTACK_LOCAL);
				capability.setCapability("acceptSslCerts", "true");
			}

			break;

		case FIREFOX:
			capability = DesiredCapabilities.firefox();
			//Adding FirefoxOptions
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			FirefoxProfile profile = new FirefoxProfile();
			profile.setPreference("general.useragent.override",userAgent );
			//Set this to fix the firefox hanging issue. Firefox will hang with an error saying script running for long if this is not set
			//This setting will increase the time that FF allows a JS to run
			//profile.setPreference("dom.max_chrome_script_run_time", 4500);
			//profile.setPreference("dom.max_script_run_time",  3500 );
			profile.setAcceptUntrustedCertificates(true);
			profile.setAssumeUntrustedCertificateIssuer(false);
			firefoxOptions.setProfile(profile);
			System.out.println("Setting moz:firefoxOptions");
			capability.setCapability("moz:firefoxOptions", firefoxOptions);
			capability.setCapability(FirefoxDriver.PROFILE, profile);
			if (isSauceLabs)
				capability.setCapability(CapabilityType.PLATFORM, Platform.valueOf(FrameworkProperties.OS_NAME.toUpperCase()));
			if (isBrowserstack)
			{
				//capability.setCapability(CapabilityType.PLATFORM, Platform.valueOf(FrameworkProperties.OS_NAME.toUpperCase()));
				capability.setCapability("browser_version", FrameworkProperties.SELENIUM_BROWSER_VERSION);
				capability.setCapability("os", FrameworkProperties.OS_NAME);
				capability.setCapability("os_version", FrameworkProperties.OS_VERSION);
				capability.setCapability("resolution", "1024x768");
				capability.setCapability("browserstack.local", FrameworkProperties.BROWSERSTACK_LOCAL);
				capability.setCapability("acceptSslCerts", "true");
			}


			break;

		case ANDROID:

			capability.setCapability("browserName", "Chrome");
			if (FrameworkProperties.IS_APP)
				capability.setCapability("app", FrameworkProperties.TEST_APP);
			
			capability.setCapability("platformName", FrameworkProperties.PLATFORM_NAME);
			capability.setCapability("automationName", FrameworkProperties.AUTOMATION_NAME);
			capability.setCapability("deviceName", FrameworkProperties.DEVICE_NAME);
			
			if (isBrowserstack)
			{
				capability.setCapability("browserName", FrameworkProperties.MOBILE_BROWSER);
				capability.setCapability("device", FrameworkProperties.DEVICE_NAME);
				capability.setCapability("realMobile", FrameworkProperties.IS_DEVICE);
				capability.setCapability("os_version", FrameworkProperties.OS_VERSION);
				capability.setCapability("browserstack.local", FrameworkProperties.BROWSERSTACK_LOCAL);
				capability.setCapability("acceptSslCerts", "true");
			}
			if (FrameworkProperties.IS_APP)
			{
				System.out.println("Setting appPackage and appActivity");
				capability.setCapability("browserName", "Android");
				capability.setCapability("appPackage", FrameworkProperties.APP_PACKAGE);
				capability.setCapability("appActivity", FrameworkProperties.APP_ACTIVITY); }
			try
			{
				this.appiumDriver = new AndroidDriver(new URL(hubUrlString), capability); }
			catch (Exception e){
				System.out.println("Error while trying to initialize Android Driver"); e.printStackTrace(); 
			}
			
			break;

		case GOOGLECHROME:
		case CHROME:
			capability = DesiredCapabilities.chrome();
			ChromeOptions options = new ChromeOptions();
			//** Commented below as latest chrome throws the exception for below argument**/
			options.addArguments("--start-maximized");

			if(userAgent!=null){
				options.addArguments("user-agent="+userAgent);
			}
			
			if (isSauceLabs)
			{
				capability.setCapability("browserName", requestedBrowser);
				capability.setCapability("version", FrameworkProperties.SELENIUM_BROWSER_VERSION);
				capability.setCapability(CapabilityType.PLATFORM, Platform.valueOf(FrameworkProperties.OS_NAME.toUpperCase()));
			}
			if (isBrowserstack)
			{
				//capability.setCapability(CapabilityType.PLATFORM, Platform.valueOf(FrameworkProperties.OS_NAME.toUpperCase()));
				capability.setCapability("browserName", requestedBrowser);
				capability.setCapability("browser_version", FrameworkProperties.SELENIUM_BROWSER_VERSION);
				capability.setCapability("os", FrameworkProperties.OS_NAME);
				capability.setCapability("os_version", FrameworkProperties.OS_VERSION);
				capability.setCapability("resolution", "1024x768");
				capability.setCapability("browserstack.local", FrameworkProperties.BROWSERSTACK_LOCAL);
				capability.setCapability("acceptSslCerts", "true");
			}
			
			if(FrameworkProperties.DEVICE_EMULATION){
				Map<String, String> mobileEmulation = new HashMap();
				mobileEmulation.put("deviceName", FrameworkProperties.DEVICE_NAME);
				Map<String, Object> chromeOptions = new HashMap();
				chromeOptions.put("mobileEmulation", mobileEmulation);
				if (FrameworkProperties.CHROME_SET_DOWNLOAD_PATH)
				{
					HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

					chromePrefs.put("download.default_directory", FrameworkProperties.CHROME_DOWNLOAD_FILE_PATH);

					chromeOptions.put("prefs", chromePrefs);
				}

				options.addArguments(new String[] { "touch-events" });
				options.addArguments(new String[] { "simulate-touch-screen-with-mouse" });
				capability.setCapability("chromeOptions", chromeOptions);
				break;
			}
			capability.setCapability(ChromeOptions.CAPABILITY, options);
			capability.setCapability("chrome.switches", Arrays.asList("--ignore-certificate-errors"));
			capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

			break;

		case IE:
		case IEXPLORE:
			capability = DesiredCapabilities.internetExplorer();
			capability.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
			capability.setCapability("enablePersistentHover", false);
			capability.setVersion(FrameworkProperties.SELENIUM_BROWSER_VERSION);
			//Added for JIRA [CARS-121]
			capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			if (isSauceLabs)
				capability.setCapability(CapabilityType.PLATFORM, Platform.valueOf(FrameworkProperties.OS_NAME.toUpperCase()));
			if (isBrowserstack)
			{
				//capability.setCapability(CapabilityType.PLATFORM, Platform.valueOf(FrameworkProperties.OS_NAME.toUpperCase()));
				capability.setCapability("browserName", requestedBrowser);
				capability.setCapability("browser_version", FrameworkProperties.SELENIUM_BROWSER_VERSION);
				capability.setCapability("os", FrameworkProperties.OS_NAME);
				capability.setCapability("os_version", FrameworkProperties.OS_VERSION);
				capability.setCapability("resolution", "1024x768");
				capability.setCapability("browserstack.local", FrameworkProperties.BROWSERSTACK_LOCAL);
				capability.setCapability("acceptSslCerts", "true");
			}
			break;

		case IPHONE:
			capability = DesiredCapabilities.iphone();
			if(isSauceLabs){
				capability.setCapability("browserName", FrameworkProperties.MOBILE_BROWSER);
				capability.setCapability("deviceName", FrameworkProperties.DEVICE_NAME);
			}
			if (isBrowserstack)
			{
				capability.setCapability("browserName", FrameworkProperties.MOBILE_BROWSER);
				capability.setCapability("device", FrameworkProperties.DEVICE_NAME);
				capability.setCapability("realMobile", FrameworkProperties.IS_DEVICE);
				capability.setCapability("os_version", FrameworkProperties.OS_VERSION);
				
			}
			if (FrameworkProperties.IS_APP){ 
				System.out.println("Setting app Path --" + FrameworkProperties.APP_PACKAGE); 
				capability.setCapability("app", FrameworkProperties.APP_PACKAGE); 
			}
			try{
				appiumDriver= new IOSDriver(new URL(hubUrlString), capability);
			}catch (Exception e) {
				System.out.println("Error while trying to initialize IOS Driver");
				e.printStackTrace();			
			}
			break;

		case IPAD:
			capability.setCapability(CapabilityType.BROWSER_NAME, "iPad");
			if (FrameworkProperties.IS_APP)
				capability.setCapability("app", FrameworkProperties.TEST_APP);
			capability.setCapability("platformName", FrameworkProperties.PLATFORM_NAME);
			capability.setCapability("deviceName", FrameworkProperties.DEVICE_NAME);
			if (isBrowserstack)
			{
				capability.setCapability("browserName", FrameworkProperties.MOBILE_BROWSER);
				capability.setCapability("device", FrameworkProperties.DEVICE_NAME);
				capability.setCapability("realMobile", FrameworkProperties.IS_DEVICE);
				capability.setCapability("os_version", FrameworkProperties.OS_VERSION);
			}
			
			try{
				appiumDriver= new IOSDriver(new URL(hubUrlString), capability);
			}catch (Exception e) {
				System.out.println("Error while trying to initialize IOS Driver");
				e.printStackTrace();			
			}
			break;

		case IPOD:
			capability = DesiredCapabilities.iphone();
			capability.setBrowserName("iPod");
			break;

		case SAFARI:
			SafariOptions safariOptions = new SafariOptions();
			safariOptions.setUseCleanSession(true);

			capability = DesiredCapabilities.safari();
			capability.setCapability(SafariOptions.CAPABILITY, safariOptions);

			break;
		case IOSAPP:
			capability.setCapability("browserName", "");
			capability.setCapability("platformName", "MAC");
			capability.setCapability("deviceName", FrameworkProperties.DEVICE_NAME);

			if (isBrowserstack)
			{
				capability.setCapability("browserName", FrameworkProperties.MOBILE_BROWSER);
				capability.setCapability("device", FrameworkProperties.DEVICE_NAME);
				capability.setCapability("realMobile", FrameworkProperties.IS_DEVICE);
				capability.setCapability("os_version", FrameworkProperties.OS_VERSION);
			}
			
			if (FrameworkProperties.IS_APP){ 
				System.out.println("Setting app Path --" + FrameworkProperties.APP_PACKAGE); 
				capability.setCapability("app", FrameworkProperties.APP_PACKAGE); 
			}
			try
			{
				this.appiumDriver = new IOSDriver(new URL(hubUrlString), (Capabilities)capability); }
			catch (Exception e)
			{
				System.out.println("Error while trying to initialize IOS Driver"); e.printStackTrace();
			}

			break;


		case HEADLESS:
			capability.setBrowserName("phantomjs");
			break;
		default:
			System.out.println("Requested browser "
					+ FrameworkProperties.SELENIUM_BROWSER
					+ " is not supported in framework");
			throw new RuntimeErrorException(new Error(), "Requested browser "
					+ FrameworkProperties.SELENIUM_BROWSER
					+ " is not supported in framework");

		}

		//TODO : To be uncommented when switch to cloud solution
		/*if (isExternalHost) {
			capability.setCapability("name", TestHarnessContext.get().getMethodName());
		}*/
		// Assign the remote webdriver to driver with the capability
		try {
			//ENABLE_WEBANALYTICS flag if enable will capture all the net traffic requests

			if(FrameworkProperties.ENABLE_WEBANALYTICS || FrameworkProperties.ENABLE_TAG_ANALYTICS){
				capability.setCapability(CapabilityType.PROXY, seleniumProxy);
			}
			if(FrameworkProperties.isDevice()){
				driver=appiumDriver;
			}else {
					if (isSauceLabs || isBrowserstack) {
						System.out.println("[Capabilities: ]:" + capability);
						driver = new RemoteWebDriver(new URL(bsUrlString), capability);
					}
					else {
						System.out.println("Creating Remote Webdriver Session...");
						driver = new RemoteWebDriver(new URL(hubUrlString), capability);
					}
			}

			if (FrameworkProperties.JOB_NAME.contains("ShopSears2.5")) {
				System.out.println("Size of the Window ");
				//driver.manage().window().setSize(new Dimension(1152,864));
				System.out.println(driver.manage().window().getSize().getWidth()); // = 1440
				System.out.println(driver.manage().window().getSize().getHeight());
				System.out.println("*******************");
			}
			action = new Action(driver);
			actions = new Actions(driver);
			appAction=new AppAction(appiumDriver);

			isProductionEnvironment = (FrameworkProperties.SELENIUM_BASE_URL
					.startsWith("http://www.mygofer.com")
					|| FrameworkProperties.SELENIUM_BASE_URL
					.startsWith("http://mygofer.com") || FrameworkProperties.SELENIUM_BASE_URL
					.startsWith("http://pilot.mygofer.com"));
		}
		catch(MalformedURLException me)
		{
			throw new RuntimeException(me.getMessage());
			//swallow
		}
		//Workaround for ephemeral port issue. If we get a webdriver exception while remote wd initialization, check whether 
		//its a port binding issue. Unable to bind the port issue denotes that ephemeral ports were not available for FF to start
		//If this happens, we will wait for one and half minute and then retry to initialize remote WD again. If it fails again, then test
		//will fail and other tests will be skipped due to configuration failure. To understand more about ephemeral port issue
		//on WD, google for "Unable to bind Firefox on port 7054" or ephemeral port
		catch (WebDriverException e){
			if(e.getMessage().contains("Unable to bind")){
				try {
					Thread.sleep(90000);
					if(FrameworkProperties.isDevice()){
						driver=appiumDriver;
					}else
					{
						if (isSauceLabs)
							driver = new RemoteWebDriver(new URL(bsUrlString), capability);
						else
							driver = new RemoteWebDriver(new URL(hubUrlString), capability);

					}

				} catch (Exception e1) {
					System.out.println("Error while retrying to initialize webdriver");
					e1.printStackTrace();
				}

			}
			else{
				e.printStackTrace();
				String webDriverStackTrace = TestHarnessUtilities.getThrowableStackTrace(e.getCause());
				System.out.println("Webdriver Exception Cause: " + webDriverStackTrace);


				//TODO : Comment temporarily, need to revisit if needed.
				String pattern = "\\bhost:";

				// Create a Pattern object
				Pattern r = Pattern.compile(pattern);
				if (webDriverStackTrace!=null) {
					// Now create matcher object.
					Matcher m = r.matcher(webDriverStackTrace);
					if (m.find()) {
						String host = webDriverStackTrace.substring(m.end(), webDriverStackTrace.length() - m.end()).trim();
						host =host.substring(1, 27);
						System.out.println("RC that failed the test " + host);
						if (!host.startsWith("atw") && !host.startsWith("atubh")) {
							System.out.println("Putting failed RC in context ");
							TestHarnessContext.get().put("failedRC", host);
						}
					}
				}
				throw e;

			}

		}

		catch (Exception e) {
			System.out.println("Error while intializing webdriver");
			e.printStackTrace();
			throw e;

		}


	}

}
