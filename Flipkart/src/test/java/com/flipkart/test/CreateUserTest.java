package com.flipkart.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.flipkart.genericLib.BaseTest;
import com.flipkart.genericLib.FileLib;
import com.flipkart.genericLib.WebDriverCommonLib;
import com.flipkart.pages.AddNewUserPage;
import com.flipkart.pages.LoginPage;
import com.flipkart.pages.OpenTasksPage;
import com.flipkart.pages.UserListPage;

public class CreateUserTest extends BaseTest {
	
	@Test
	public void CreateUser() throws Throwable
	{
		LoginPage lp=new LoginPage();
		FileLib flib=new FileLib();
		//Enter valid username & password & click on Login Button
		lp.login(flib.readPropData(PROP_PATH,"username"),flib.readPropData(PROP_PATH,"password"));
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.waitForPageTitle(flib.readPropData(PROP_PATH,"openTaskTitle"));
		wlib.verifyPage(wlib.getPageTitle(),flib.readPropData(PROP_PATH,"openTaskTitle"),"Open Task Page");
		
		//click on Users Tab
		OpenTasksPage otp=new OpenTasksPage();
		otp.clickUserTab();
		
		
		wlib.waitForPageTitle(flib.readPropData(PROP_PATH,"userListTitle"));
		wlib.verifyPage(wlib.getPageTitle(),flib.readPropData(PROP_PATH,"userListTitle"),"User List Page");
		
		
		//click on Add New User button
		UserListPage ulp=new UserListPage();
		ulp.clickAddNewUserBtn();
		wlib.waitForPageTitle(flib.readPropData(PROP_PATH,"addNewUserTitle"));
		wlib.verifyPage(wlib.getPageTitle(),flib.readPropData(PROP_PATH,"addNewUserTitle"),"Add New User Page");
		
		//Fill alk mandatory fields with valid data & click on create user button
		AddNewUserPage anup=new AddNewUserPage();
		anup.createUser(flib.getData(EXCEL_PATH,"Sheet1",0,1),
				flib.getData(EXCEL_PATH,"Sheet1",1,1),
				flib.getData(EXCEL_PATH,"Sheet1",2,1),
				flib.getData(EXCEL_PATH,"Sheet1",3,1),
				flib.getData(EXCEL_PATH,"Sheet1",4,1));
		if(ulp.getsuccessMsg().isDisplayed())
		{
			Reporter.log("user is Created,Success msg is displayed",true);
		}
		else
		{
			Reporter.log("User is not Created,success msg is not displayed",true);
		}
				
		
		
	}
	

}



