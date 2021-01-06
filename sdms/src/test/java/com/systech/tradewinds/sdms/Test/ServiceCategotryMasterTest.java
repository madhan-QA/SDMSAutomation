package com.systech.tradewinds.sdms.Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.common.BasePage;
import com.systech.tradewinds.sdms.pageobject.ServicecatgryMaster;

public class ServiceCategotryMasterTest  extends BasePage {
	
	ServicecatgryMaster service;
	@Test(groups= {"ServicecatgryMaster"},dependsOnGroups= {"login"},dataProvider="ServicecatgryData")
	public void insertServiceCatMaster(String categoryName,String rate,String remarks) {
		
		service =new ServicecatgryMaster();
		loadUrl(service.getPageUrl());
		txtData(service.getservicename(), categoryName);
		txtData(service.getrate(),rate);
		txtData(service.getrate(), remarks);
		btnClick(service.getSubmit());
		//btnClick(service.getReset());
		refresh();
		btnClick(service.getYes());
		btnClick(service.getok());
		
		

}
@DataProvider(name="ServicecatgryData")	
public Object[][] ServicecatgryData() {
	 Object[][] testData = null;
	try {
		testData = getExcel("C:\\Users\\Systech\\Desktop\\Data\\ServicecatgryData.xls",0);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return testData;
	




	}

	
	

}
