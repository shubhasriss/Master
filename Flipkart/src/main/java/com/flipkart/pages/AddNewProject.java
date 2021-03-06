package com.flipkart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.flipkart.genericLib.BaseTest;

public class AddNewProject {
	@FindBy(xpath="//select[@name='customerId']") private WebElement custdropdown;
	@FindBy(xpath="//input[@name='name']") private WebElement projectname;
	@FindBy(xpath="//input[@name='createProjectSubmit']") private WebElement submitbtn;
	
	public AddNewProject()
	
	
	{
		PageFactory.initElements(BaseTest.driver,this);
	}
	public void customerdropdown(String text)
	{
		Select s1=new Select(custdropdown);
		s1.selectByVisibleText(text);
	}
	public void enterprojectname(String projname)
	{
		projectname.sendKeys(projname);	
	}
	public void clicksubmitbtn()
	{
		submitbtn.click();
	}
	
	
	
	
	
}
