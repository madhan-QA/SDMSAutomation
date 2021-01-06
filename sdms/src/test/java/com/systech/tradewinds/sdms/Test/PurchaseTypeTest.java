package com.systech.tradewinds.sdms.Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.common.BasePage;
import com.systech.tradewinds.sdms.pageobject.PurchasetypeMaster;

import jxl.read.biff.BiffException;

public class PurchaseTypeTest extends BasePage {
	
	PurchasetypeMaster PurchaseTypemaster;
	@Test(groups= {"PurchaseType"},dependsOnGroups= {"login"},dataProvider="PuchaseTypeData")
	public void insertPurchaseTypeMaster(String PurchaseTyepName,String Remarks) {
		PurchaseTypemaster = new PurchasetypeMaster();
		loadUrl(PurchaseTypemaster.getPageUrl());
	
		txtData(PurchaseTypemaster.getpurchasetypename(),PurchaseTyepName);
	
		txtData(PurchaseTypemaster.getRemarks(),Remarks);
	
		btnClick(PurchaseTypemaster.getSubmit());
		//btnClick(PurchaseTypemaster.getReset());
		refresh();
		btnClick(PurchaseTypemaster.getYes());
		btnClick(PurchaseTypemaster.getok());
		
		

}
@DataProvider(name="PuchaseTypeData")	
public Object[][] PuchaseTypeData() throws BiffException, IOException{
	 Object[][] testData = null;
	try {
		testData = getExcel("C:\\Users\\Systech\\Desktop\\Data\\PuchaseTypeData.xls",0);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return testData;
	
}
}
