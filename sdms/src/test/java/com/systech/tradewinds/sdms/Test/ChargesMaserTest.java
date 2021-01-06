package com.systech.tradewinds.sdms.Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.common.BasePage;
import com.systech.tradewinds.sdms.pageobject.ChargesMaster;

import jxl.read.biff.BiffException;

public class ChargesMaserTest extends BasePage {
	
	ChargesMaster chargesmaster;
	
	@Test(groups= {"ChargesMaster"},dependsOnGroups= {"login"},dataProvider="ChargesTest")
	public void insertChargesMaster(String ChargesName,String Remarks) {
		chargesmaster = new ChargesMaster();
		loadUrl(chargesmaster.getPageUrl());
		
		txtData(chargesmaster.getchargename(),ChargesName);
	
		txtData(chargesmaster.getRemarks(),Remarks);
		btnClick(chargesmaster.getSubmit());
	
		//btnClick(chargesmaster.getReset());
		btnClick(chargesmaster.getYes());
		refresh();
		

	}
	@DataProvider(name="ChargesTest")
	public Object[][] chargesData()throws BiffException, IOException{
		Object[][] testdata = null;
		try {
			testdata = getExcel("C:\\Users\\Systech\\Desktop\\Data\\ChargesData.xls", 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return testdata;
		
		
		
	}
	
	
	
	

	


}
