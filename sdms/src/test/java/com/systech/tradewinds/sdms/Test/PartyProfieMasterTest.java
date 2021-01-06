package com.systech.tradewinds.sdms.Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.common.BasePage;
import com.systech.tradewinds.sdms.pageobject.PartyProfileMaster;

import jxl.read.biff.BiffException;

public class PartyProfieMasterTest  extends BasePage{
	PartyProfileMaster partyprofile;
	@Test(groups= {"partyprofile"},dependsOnGroups= {"login"},dataProvider="partyprofiledata") 
	public void insertPartyprofile(String PrfType,String type,String prfName,String remarks)  {
		partyprofile= new PartyProfileMaster();
		
		loadUrl(partyprofile.getPageUrl());
				
		selectByvalue(partyprofile.getprofiletype(),PrfType);
		selectByvalue(partyprofile.gettype(),type);
		txtData(partyprofile.getprofilename(),prfName);
		txtData(partyprofile.getRemarks(),remarks);
		try {
			sleep();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		btnClick(partyprofile.getSubmit());
		try {
			sleep();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		btnClick(partyprofile.getok());
		
		
	}
	@DataProvider(name="partyprofiledata")	
	public Object[][] partyprofiledata() throws BiffException, IOException{
		 Object[][] testData = null;
		try {
			testData = getExcel("C:\\Users\\Systech\\Desktop\\Data\\Partyprofiledata.xls",0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return testData;
		
	}
	


}
