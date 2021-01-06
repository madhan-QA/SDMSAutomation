package com.systech.tradewinds.sdms.Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.common.BasePage;
import com.systech.tradewinds.sdms.pageobject.ContinentMaster;
import jxl.read.biff.BiffException;

public class ContinentMasterTest  extends BasePage{
	
	ContinentMaster Continent;
	@Test(groups= {"Continent"},dependsOnGroups= {"login"},dataProvider="ContinentData") 
	public void insertContinent(String Conname,String remarks) {
		Continent= new ContinentMaster();
		
		loadUrl(Continent.getPageUrl());
				
		txtData(Continent.getcontinentname(),Conname);
		//txtData(Continent.getRemarks(),remarks);
		try {
			sleep();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		btnClick(Continent.getSubmit());
		try {
			sleep();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		btnClick(Continent.getYes());
		btnClick(Continent.getok());
		
		
	}
	@DataProvider(name="ContinentData")	
	public Object[][] ContinentData() throws BiffException, IOException{
		 Object[][] testData = null;
		try {
			testData = getExcel("C:\\Users\\Systech\\Desktop\\Data\\ContinentData.xls",0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return testData;
		
	}
	



}
