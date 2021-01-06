package com.systech.tradewinds.sdms.Test;


import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.common.BasePage;
import com.systech.tradewinds.sdms.pageobject.UomMaster;

import jxl.read.biff.BiffException;

public class UomMasterTest extends BasePage{
	
	UomMaster Uom;
	@Test(groups= {"Uom"},dependsOnGroups= {"login"},dataProvider="UomData") 
	public void insertUom(String UomName,String acptfract,String noofFrac,String remarks)  {
		
		Uom = new UomMaster();
		 try {
		loadUrl(Uom.getPageUrl());
		txtData(Uom.getuomname(),UomName);
		
		selectByvalue(Uom.getacptfractn(),acptfract);
		if (acptfract.contentEquals("Yes")) {
			if (Uom.getNooffractn().isEnabled()) {
				selectByvalue(Uom.getNooffractn(),noofFrac);
			} 
		}
		
		//txtData(Uom.getRemarks(),remarks);
					sleep();
		btnClick(Uom.getSubmit());
					if (Uom.getYes().isEnabled()) {
						btnClick(Uom.getYes());
					}
					if (Uom.getok().isEnabled()) {

						btnClick(Uom.getok());
					}
					refresh();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			
		
	}
	@DataProvider(name="UomData")	
	public Object[][] UomData()  throws BiffException, IOException{
		 Object[][] testData = null;
		
			testData = getExcel("C:\\Users\\Systech\\Desktop\\Data\\UomData.xls",0);
		
		return testData;
		
	}
	




}


