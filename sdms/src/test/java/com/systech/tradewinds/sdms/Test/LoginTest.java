package com.systech.tradewinds.sdms.Test;

import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.common.BasePage;
import com.systech.tradewinds.sdms.pageobject.LoginPage;

import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class LoginTest extends BasePage{

	LoginPage login ; 
	

	@Test(groups= {"login"} )

	public void login() throws InterruptedException, IOException {
		login = new LoginPage();
       		
				txtData(login.getUserName(),"admin");
		impWait(5000);
		
		txtData(login.getPassword(),"Admin@123");
		enter(login.getLogin());
		currntUrl();

		enter(login.getSubmit());




	}


	//	@DataProvider(name="loginTest")
	//	public  Object[][] loginData() throws IOException, BiffException  {
	//
	//
	//		Object[][] testdata = getExcel("C:\\Users\\Systech\\Desktop\\Data\\LoginData.xls",0);
	//		return testdata ;
	//
	//
	//	}















	@BeforeTest
	public void beforeTest() {

		login = new LoginPage();
		invokeBrowser("chrome");
		loadUrl(login.getPageUrl());	
		maxmize();

	}



	@AfterTest
	public void afterTest() {
		btnClick(login.getempIcon());
		btnClick(login.getLogout());


		quitBrowser();



	}

}
