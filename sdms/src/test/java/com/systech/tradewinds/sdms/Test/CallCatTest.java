package com.systech.tradewinds.sdms.Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.common.BasePage;
import com.systech.tradewinds.sdms.pageobject.CallCatMaster;


import jxl.read.biff.BiffException;

public class CallCatTest extends BasePage {
	
	CallCatMaster Callcat;
	@Test(groups= {"CallCatMaster"},dependsOnGroups= {"login"},dataProvider="CallcatData")
	public void insertCallcatData(String catName,String Remarks)  {
		Callcat = new CallCatMaster();
		loadUrl(Callcat.getPageUrl());
	
		txtData(Callcat.getCallCate(),catName);
	
		txtData(Callcat.getRemarks(),Remarks);
		try {
			sleep();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		btnClick(Callcat.getSubmit());
		try {
			sleep();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		btnClick(Callcat.getok());
		//btnClick(Callcat.getReset());
		refresh();
		

}
@DataProvider(name="CallcatData")	
public Object[][] CallcatData()throws BiffException, IOException{
	 Object[][] testData = null;
	try {
		testData = getExcel("C:\\Users\\Systech\\Desktop\\Data\\CallcatData.xls",0);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return testData;
	
}
}
