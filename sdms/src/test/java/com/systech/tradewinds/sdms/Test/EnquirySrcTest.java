package com.systech.tradewinds.sdms.Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.common.BasePage;
import com.systech.tradewinds.sdms.pageobject.EnquirySourceMaster;

import jxl.read.biff.BiffException;

public class EnquirySrcTest extends BasePage {
	
	EnquirySourceMaster EnqSrc;
	@Test(groups= {"EnqSrcMaster"},dependsOnGroups= {"login"},dataProvider="EnqSrcMasterData")
	public void insertEnqSrcMasterData(String srcName,String Remarks)  {
		EnqSrc = new EnquirySourceMaster();
		loadUrl(EnqSrc.getPageUrl());
	
		txtData(EnqSrc.getEnquirySrc(),srcName);
	
		txtData(EnqSrc.getRemarks(),Remarks);
		try {
			sleep();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		btnClick(EnqSrc.getSubmit());
		try {
			sleep();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		btnClick(EnqSrc.getok());
		//btnClick(EnqSrc.getReset());
		refresh();
		

}
@DataProvider(name="EnqSrcMasterData")	
public Object[][] EnqSrcMasterData() throws BiffException, IOException {
	 Object[][] testData = null;
	try {
		testData = getExcel("C:\\Users\\Systech\\Desktop\\Data\\EnqSrcMasterData.xls",0);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return testData;
	
}
}
