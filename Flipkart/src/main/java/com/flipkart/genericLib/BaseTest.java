package com.flipkart.genericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import com.flipkart.genericLib.IAutoConsts.IAutoConstants;

public class BaseTest implements IAutoConstants {
		public static WebDriver driver;
		@BeforeClass
		public void runBrowser() throws Throwable
		{
			FileLib flib=new FileLib();
			 String browser=flib.readPropData(PROP_PATH,"browser");
			 if(browser.equals("chrome"))
			 {
				 System.setProperty(CHROME_KEY,CHROME_VALUE);
				 driver=new ChromeDriver();
				 driver.manage().window().maximize();
			 }
			 
			 
			 
			 
			 
			 else if(browser.equals("Firefox"))
			 {
				 System.setProperty(GECKO_KEY,GECKO_VALUE);
				 driver=new FirefoxDriver();
			 }
			 else
			 {
				 System.out.println("give correct browser name");
			 }
			 String appurl=flib.readPropData(PROP_PATH,"url");
			 driver.get(appurl);
		}
		public void closeBrowser()
		{
			driver.quit();
			
	
		
		}

	}


