package com.systech.tradewinds.sdms.Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.common.BasePage;
import com.systech.tradewinds.sdms.pageobject.ProfiletypeMaster;

import jxl.read.biff.BiffException;

public class ProfileTypeTest extends BasePage{
	
	ProfiletypeMaster profileType;
	
	@Test(groups= {"ProfiletypeMaster"},dependsOnGroups= {"login"},dataProvider="ProfleTypeData")
	public void insertprofileTypeMaster(String prfTypeName,String Type,String Remarks)  {
		profileType = new ProfiletypeMaster();
		loadUrl(profileType.getPageUrl());
		txtData(profileType.getprofiletype(),prfTypeName);
		
		selectBytext(profileType.gettype(),Type);
		txtData(profileType.getRemarks(), Remarks);
		btnClick(profileType.getSubmit()); 
		
	}
	@DataProvider(name="ProfleTypeData")	
	public Object[][] ProfleTypeData() throws BiffException, IOException{
		 Object[][] testData = null;
		try {
			testData = getExcel("C:\\Users\\Systech\\Desktop\\Data\\ProfleTypeData.xls",0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return testData;
		
	}


}
