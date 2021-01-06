package com.systech.tradewinds.sdms.Test;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.common.BasePage;

import com.systech.tradewinds.sdms.pageobject.CustomercategryMaster;

import jxl.read.biff.BiffException;

public class CustCatMasterTest extends BasePage {
	
	CustomercategryMaster CustcatMaster;
	@Test(groups= {"CustcatMaster"},dependsOnGroups= {"login"},dataProvider="CustcatData")
	public void insertCustcatData(String catName,String Remarks)  {
		CustcatMaster = new CustomercategryMaster();
		loadUrl(CustcatMaster.getPageUrl());
	
		txtData(CustcatMaster.getcustcatgry(),catName);
	
		txtData(CustcatMaster.getRemarks(),Remarks);
		try {
			sleep();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		btnClick(CustcatMaster.getSubmit());
		try {
			sleep();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		btnClick(CustcatMaster.getok());
		//btnClick(divisionmaster.getReset());
		refresh();
		

}
@DataProvider(name="CustcatData")	
public Object[][] CustcatData() throws BiffException, IOException {
	 Object[][] testData = null;
	try {
		testData = getExcel("C:\\Users\\Systech\\Desktop\\Data\\CustcatData.xls",0);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return testData;
	
}
}
