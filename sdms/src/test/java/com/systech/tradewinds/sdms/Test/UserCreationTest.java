package com.systech.tradewinds.sdms.Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.common.BasePage;
import com.systech.tradewinds.sdms.pageobject.Usercreation;

import jxl.read.biff.BiffException;

public class UserCreationTest extends BasePage {
	
	Usercreation user;
	
	@Test(dataProvider="Usercreation",groups= {"UsercreationTest"},dependsOnGroups= {"login"})
	public void insertUsercreation(String Company,String Branch,String Employee,String Userid,String Password) throws InterruptedException {
		user = new Usercreation();
		impWait(1000);
		loadUrl(user.getPageUrl());
		
		selectBytext(user.getCompany(),Company);
		
		selectBytext(user.getBranch(),Branch);
		selectBytext(user.getEmployee(),Employee);
		txtData(user.getUserid(),Userid);
		txtData(user.getPassword(),Password);
		
		
		btnClick(user.getSubmit());
		btnClick(user.getok());
		//btnClick(user.getReset());
		refresh(); 
		navigateTo(user.getPageUrl());
	}
	
	@DataProvider(name="Usercreation")
	public  Object[][] UserData() throws BiffException, IOException{


		
	Object[][] 	testdata = getExcel("C:\\Users\\Systech\\Desktop\\Data\\UserData.xls",0);
	
	return testdata ;


	}

		
	

}
