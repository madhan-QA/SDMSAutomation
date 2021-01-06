package com.systech.tradewinds.sdms.Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.common.BasePage;
import com.systech.tradewinds.sdms.pageobject.CityMaster;

import jxl.read.biff.BiffException;

public class CityMasterTest extends BasePage{
	
	CityMaster CityMaster;
	@Test(groups= {"City"},dependsOnGroups= {"login"},dataProvider="CityData") 
	public void insertCity(String StateName,String CityName,String remarks)  {
		try {
		CityMaster = new CityMaster();
		loadUrl(CityMaster.getPageUrl());
		selectBytext(CityMaster.gestatename(),StateName);
		txtData(CityMaster.getcityname(),CityName);
		//txtData(CityMaster.getRemarks(),remarks);
		
			sleep();
		
		btnClick(CityMaster.getSubmit());
		
			sleep();
		
		btnClick(CityMaster.getYes());
		btnClick(CityMaster.getok());
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	}
	@DataProvider(name="CityData")	
	public Object[][] CityData() throws BiffException, IOException{
		 Object[][] testData = null;
		try {
			testData = getExcel("C:\\Users\\Systech\\Desktop\\Data\\CityData.xls",0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return testData;
		
	}
	




}

