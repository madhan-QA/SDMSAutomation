package com.systech.tradewinds.sdms.Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.common.BasePage;
import com.systech.tradewinds.sdms.pageobject.SupplierCategoeryMaster;

import jxl.read.biff.BiffException;

public class SupplierCatMasterTest extends BasePage {
	
	SupplierCategoeryMaster SupcatMaster;
	@Test(groups= {"SupplierCatMaster"},dependsOnGroups= {"login"},dataProvider="SuppliercatData")
	public void insertSuppliercatData(String catName,String Remarks)  {
		SupcatMaster = new SupplierCategoeryMaster();
		loadUrl(SupcatMaster.getPageUrl());
	
		txtData(SupcatMaster.getcustcatgry(),catName);
	
		txtData(SupcatMaster.getRemarks(),Remarks);
		try {
			sleep();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		btnClick(SupcatMaster.getSubmit());
		try {
			sleep();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		btnClick(SupcatMaster.getok());
		//btnClick(SupcatMaster.getReset());
		refresh();
		

}
@DataProvider(name="SuppliercatData")	
public Object[][] SuppliercatData() throws BiffException, IOException{
	 Object[][] testData = null;
	try {
		testData = getExcel("C:\\Users\\Systech\\Desktop\\Data\\SuppliercatData.xls",0);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return testData;
	
}
}
