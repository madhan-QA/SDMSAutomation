package com.systech.tradewinds.sdms.Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.common.BasePage;
import com.systech.tradewinds.sdms.pageobject.CommisionMaster;

import jxl.read.biff.BiffException;

public class CommisionMasterTest extends BasePage {
	
	CommisionMaster commision;
	@Test(groups= {"CommisionMaster"},dependsOnGroups= {"login"},dataProvider="commisionData")
	public void insertCommisionMaster(String commsionName,String percentage) {
		commision = new CommisionMaster();
		loadUrl(commision.getPageUrl());
	
		txtData(commision.getcommisionname(),commsionName);
	
		txtData(commision.getcommisioncode(),percentage);
	
		btnClick(commision.getsubmit());
		//btnClick(commision.getReset());
		refresh();
		btnClick(commision.getYes());
		btnClick(commision.getok());
		
		

}
@DataProvider(name="commisionData")	
public Object[][] commisionData()throws BiffException, IOException {
	 Object[][] testData = null;
	try {
		testData = getExcel("C:\\Users\\Systech\\Desktop\\Data\\commisionData.xls",0);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return testData;
	
}
}


