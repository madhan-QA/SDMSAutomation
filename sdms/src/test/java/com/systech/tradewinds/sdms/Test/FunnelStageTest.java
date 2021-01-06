package com.systech.tradewinds.sdms.Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.common.BasePage;
import com.systech.tradewinds.sdms.pageobject.FunnelStageMaster;

import jxl.read.biff.BiffException;

public class FunnelStageTest extends BasePage {
	
	FunnelStageMaster FunlStag;
	@Test(groups= {"FunlStagMaster"},dependsOnGroups= {"login"},dataProvider="FunlStagData")
	public void insertFunlStagData(String FunlStage,String Remarks)  {
		FunlStag = new FunnelStageMaster();
		loadUrl(FunlStag.getPageUrl());
	
		txtData(FunlStag.getFunlStage(),FunlStage);
	
		txtData(FunlStag.getRemarks(),Remarks);
		try {
			sleep();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		btnClick(FunlStag.getSubmit());
		try {
			sleep();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		btnClick(FunlStag.getok());
		//btnClick(FunlStag.getReset());
		refresh();
		

}
@DataProvider(name="FunlStagData")	
public Object[][] FunlStagData() throws BiffException, IOException{
	 Object[][] testData = null;
	try {
		testData = getExcel("C:\\Users\\Systech\\Desktop\\Data\\FunlStagData.xls",0);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return testData;
	
}
}
