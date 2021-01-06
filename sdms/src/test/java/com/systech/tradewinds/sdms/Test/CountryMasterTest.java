package com.systech.tradewinds.sdms.Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.common.BasePage;
import com.systech.tradewinds.sdms.pageobject.CountryMaster;

public class CountryMasterTest extends BasePage {

	CountryMaster Country;

	@Test(groups = { "Country" }, dependsOnGroups = { "login" }, dataProvider = "CountryData")
	public void insertCountry(String Continame, String countryName, String remarks) {
		Country = new CountryMaster();

		loadUrl(Country.getPageUrl());
		selectBytext(Country.getcontinentname(), Continame);
		impWait(50);

		txtData(Country.getcountryname(), countryName);
		// txtData(Country.getRemarks(),remarks);
		try {
			sleep();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		btnClick(Country.getSubmit());

		btnClick(Country.getYes());

		btnClick(Country.getok());

	}

	@DataProvider(name = "CountryData")
	public Object[][] CountryData() {
		Object[][] testData = null;
		try {
			testData = getExcel("C:\\Users\\Systech\\Desktop\\Data\\CountryData.xls", 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return testData;

	}

}
