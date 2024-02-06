package com.Automation_PomScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page 
{
	@FindBy(xpath="//a[.='Log in']")
	private WebElement login_link;



	public Login_page(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement  loginbutton() 
	{
		return login_link;
	}

}
