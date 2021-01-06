package com.systech.tradewinds.sdms.Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.common.BasePage;

import com.systech.tradewinds.sdms.pageobject.DivisionMaster;

public class DivisionmasterTest extends BasePage {
	
	DivisionMaster divisionmaster;
	@Test(groups= {"DivisonMaster"},dependsOnGroups= {"login"},dataProvider="DivisonData")
	public void insertDivisionMaster(String DivisonName,String Remarks)  {
		divisionmaster = new DivisionMaster();
		loadUrl(divisionmaster.getPageUrl());
	
		txtData(divisionmaster.getDivisionname(),DivisonName);
	
		//txtData(divisionmaster.getRemarks(),Remarks);
	
		btnClick(divisionmaster.getSubmit());
		try {
			sleep();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		//btnClick(divisionmaster.getReset());
		refresh();
		

}
@DataProvider(name="DivisonData")	
public Object[][] DivisonData() {
	 Object[][] testData=null;
	try {
		testData = getExcel("C:\\Users\\Systech\\Desktop\\Data\\DivisonData.xls",0);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return testData;
	
}
}
