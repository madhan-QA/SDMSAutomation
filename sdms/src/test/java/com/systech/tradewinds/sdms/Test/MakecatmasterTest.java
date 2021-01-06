package com.systech.tradewinds.sdms.Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.common.BasePage;
import com.systech.tradewinds.sdms.pageobject.MakecatMaster;

import jxl.read.biff.BiffException;


	
	public class MakecatmasterTest extends BasePage {
		
		
		MakecatMaster makecatMaster;
		@Test(groups= {"Makecatmaster"},dependsOnGroups= {"login"},dataProvider="MakecatData")
		public void insertMakecatMaster(String MakecatName,String Remarks )  {
			makecatMaster = new MakecatMaster();
			impWait(5000);
			loadUrl(makecatMaster.getPageUrl());
			
			txtData(makecatMaster.getMakecatname(),MakecatName);
			try {
				sleep();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			txtData(makecatMaster.getRemarks(),Remarks);
			try {
				sleep();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			btnClick(makecatMaster.getSubmit());
			try {
				sleep();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//btnClick(makecatMaster.getReset());
			btnClick(makecatMaster.getYes());
			try {
				sleep();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			navigateTo(makecatMaster.getPageUrl());
			

	}
		@DataProvider(name="MakecatData")	
		public Object[][] MakecatData() throws BiffException, IOException{
			 Object[][] testData = null;
			try {
				testData = getExcel("C:\\Users\\Systech\\Desktop\\Data\\MakecatData.xls",0);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return testData;
			

		
		
		
	



}}