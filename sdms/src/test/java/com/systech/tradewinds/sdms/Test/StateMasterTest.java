package com.systech.tradewinds.sdms.Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.common.BasePage;
import com.systech.tradewinds.sdms.pageobject.StateMaster;

public class StateMasterTest extends BasePage{
	
	StateMaster stateMaster;
	@Test(groups= {"State"},dependsOnGroups= {"login"},dataProvider="StateData") 
	public void insertState(String cuntryName,String StateName,String remarks,String statecode)  {
		
		stateMaster = new StateMaster();
		loadUrl(stateMaster.getPageUrl());
		selectBytext(stateMaster.getcountryname(),cuntryName);
		txtData(stateMaster.getstatename(),StateName);
		//txtData(stateMaster.getRemarks(),remarks);
		txtData(stateMaster.getstatecode(),statecode);
		try {
			sleep();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		btnClick(stateMaster.getSubmit());
		try {
			sleep();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		btnClick(stateMaster.getYes());
		btnClick(stateMaster.getok());
		

			
		
	}
	@DataProvider(name="StateData")	
	public Object[][] StateData(){
		 Object[][] testData = null;
		try {
			testData = getExcel("C:\\Users\\Systech\\Desktop\\Data\\StateData.xls",0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return testData;
		
	}
	




}
