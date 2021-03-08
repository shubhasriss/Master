package com.flipkart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.genericLib.BaseTest;

public class ActiveProjectsandCustomers
{
	@FindBy(xpath="//input[value='Add New Customer']") private WebElement addnewcust;
	@FindBy(xpath="//span[text()='Customer has been successfully registered']") private WebElement successmsg;
	@FindBy(xpath="//input[@value='Add New Project']") private WebElement addnewproject;
	@FindBy(xpath="//span[text()='Customer has been successfully registered']") private WebElement successmsgprojects;
	public ActiveProjectsandCustomers()
	{
		PageFactory.initElements(BaseTest.driver,this);
	}
	
	public void clickonaddnewcust()
	{
		addnewcust.click();
	}
	public String retrievesuccessmsg()
	{
		return successmsg.getText();
	}
	public void clickonaddnewproject()
	{
		addnewproject.click();
	}
	public String retrievesuccessmsgprojects()
	{
		return successmsgprojects.getText();
	}	

}
