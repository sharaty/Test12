package com.Automation.Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.Automation_PomScripts.Login_page;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Base_Class  implements FrameWork_Constants
{
	public static WebDriver driver;
	public ExtentHtmlReporter reporter;
	public ExtentReports reports;
	public ExtentTest Test;
	
	@BeforeTest
	public void repconfig()
	{
		reporter= new ExtentHtmlReporter(EXTENT_PATH);
		reports = new ExtentReports();
		reports.attachReporter(reporter);
		Test = reports.createTest(REPORT_HEADING);
	}
	@BeforeClass
	public void openBrowser() 
	{
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TIME_UNIT,TimeUnit.SECONDS);
	}
	@BeforeMethod
	public void openapp() throws InterruptedException 
	{
		driver.get(Test_DataByPropertyFile.getdata("URL"));
		Thread.sleep(2000);
		//driver.get("https://demowebshop.tricentis.com/");
		Login_page p=new Login_page(driver);
		p.loginbutton().click();
	}
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}


}

