package com.systech.tradewinds.sdms.Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.common.BasePage;
import com.systech.tradewinds.sdms.pageobject.PurchaseGroup;

import jxl.read.biff.BiffException;

public class PurchaseGroupTest  extends BasePage {
	
	PurchaseGroup PurchaseGrp;
	@Test(groups= {"PurchaseGroup"},dependsOnGroups= {"login"},dataProvider="PurchaseGroupData")
	public void insertPurchaseGroupData(String GrpName,String Remarks) {
		PurchaseGrp = new PurchaseGroup();
		loadUrl(PurchaseGrp.getPageUrl());
	
		txtData(PurchaseGrp.getPurchaseGrp(),GrpName);
	
		txtData(PurchaseGrp.getRemarks(),Remarks);
		try {
			sleep();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		btnClick(PurchaseGrp.getSubmit());
		try {
			sleep();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		btnClick(PurchaseGrp.getok());
		//btnClick(PurchaseGrp.getReset());
		refresh();
		

}
@DataProvider(name="PurchaseGroupData")	
public Object[][] PurchaseGroupData() throws BiffException, IOException{
	 Object[][] testData = null;
	try {
		testData = getExcel("C:\\Users\\Systech\\Desktop\\Data\\PurchaseGroupData.xls",0);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return testData;
	
}
}
