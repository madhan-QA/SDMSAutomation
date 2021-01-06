package com.systech.tradewinds.sdms.Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.common.BasePage;
import com.systech.tradewinds.sdms.pageobject.DiscountMaster;

import jxl.read.biff.BiffException;





	public class DiscountMasterTest extends BasePage {
		
		DiscountMaster discuntmaster;
		
		@Test(groups= {"DiscountMaster"},dependsOnGroups= {"login"},dataProvider="DiscountData")
		public void insertDiscounntMaster(String DisCode,String DisName,String Remarks) {
			discuntmaster = new DiscountMaster();
			loadUrl(discuntmaster.getPageUrl());
		
			txtData(discuntmaster.getdiscountcode(),DisCode);
		
			txtData(discuntmaster.getdiscountname(),DisName);
			txtData(discuntmaster.getRemarks(),Remarks);
			try {
				sleep();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			btnClick(discuntmaster.getSubmit());
			btnClick(discuntmaster.getYes());
			//btnClick(divisionmaster.getReset());
			try {
				sleep();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			btnClick(discuntmaster.getOk());
			
			
			


		
			}
	@DataProvider(name="DiscountData")	
	public Object[][] DiscountData() throws BiffException, IOException {
		 Object[][] testData = null;
		try {
			testData = getExcel("C:\\Users\\Systech\\Desktop\\Data\\DiscountData.xls",0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return testData;
		
	}
	}



