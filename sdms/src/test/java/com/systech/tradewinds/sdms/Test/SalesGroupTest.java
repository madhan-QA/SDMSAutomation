package com.systech.tradewinds.sdms.Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.common.BasePage;
import com.systech.tradewinds.sdms.pageobject.SalesGroup;


import jxl.read.biff.BiffException;

public class SalesGroupTest extends BasePage {
	
	SalesGroup SalesGrp;
	@Test(groups= {"SalesGroup"},dependsOnGroups= {"login"},dataProvider="SalesGroupData")
	public void insertSalesGroupData(String GrpName,String Remarks)  {
		SalesGrp = new SalesGroup();
		loadUrl(SalesGrp.getPageUrl());
	
		txtData(SalesGrp.getSalesGrp(),GrpName);
	
		txtData(SalesGrp.getRemarks(),Remarks);
		try {
			sleep();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		btnClick(SalesGrp.getSubmit());
		try {
			sleep();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		btnClick(SalesGrp.getok());
		//btnClick(SalesGrp.getReset());
		refresh();
		

}
@DataProvider(name="SalesGroupData")	
public Object[][] SalesGroupData() throws BiffException, IOException{
	 Object[][] testData = null;
	try {
		testData = getExcel("C:\\Users\\Systech\\Desktop\\Data\\SalesGroupData.xls",0);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return testData;
	
}
}
