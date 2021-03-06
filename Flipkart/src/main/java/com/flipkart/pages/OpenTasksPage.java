package com.flipkart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.genericLib.BaseTest;


public class OpenTasksPage {
	@FindBy(xpath="//a[text()='Projects & Customers ']") private WebElement projectsandcustomers;
	@FindBy(xpath="//a[text()='Users']") private WebElement userTab;
	
	public OpenTasksPage()
	{
		PageFactory.initElements(BaseTest.driver,this);
	}
	
	public void clickonprojandcustomers()
	{
		projectsandcustomers.click();
	}
	
	
	
	
	public void clickUserTab()
	{
		userTab.click();
	}

}


