package com.systech.tradewinds.sdms.Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.common.BasePage;
import com.systech.tradewinds.sdms.pageobject.CurrencyMaster;

import jxl.read.biff.BiffException;

public class CurrencyMasterTest extends BasePage  {
	CurrencyMaster currencymaster;
	@Test(groups= {"currencymaster"},dependsOnGroups= {"login"},dataProvider="CurrencyData")
	public void insertCurrencyMaster(String CurrCode,String CurrName,String Fractunit)  {
		
		currencymaster =new CurrencyMaster(); 
		try {
		loadUrl(currencymaster.getPageUrl());
		txtData(currencymaster.getcurrencycode(),CurrCode);
		txtData(currencymaster.getcurrencyname(),CurrName);
		txtData(currencymaster.getfractnunit(),Fractunit);
		sleep();
		selectBytext(currencymaster.getNooffractn(),"0");
		btnClick(currencymaster.getSubmit());
		sleep();
		if (currencymaster.getYes().isEnabled()) {
			btnClick(currencymaster.getYes());
		}

		if (currencymaster.getok().isEnabled()) {
			btnClick(currencymaster.getok());
		}} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		refresh();
		
	
}	
	
	@DataProvider(name="CurrencyData")	
	public Object[][] CurrencyData() throws BiffException, IOException {
		 Object[][] testData = null;
		
			testData = getExcel("C:\\Users\\Systech\\Desktop\\Data\\CurrencyData.xls",0);
		
		return testData;

	}
}