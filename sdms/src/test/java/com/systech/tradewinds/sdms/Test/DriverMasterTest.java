package com.systech.tradewinds.sdms.Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.common.BasePage;
import com.systech.tradewinds.sdms.pageobject.DriverMaster;

import jxl.read.biff.BiffException;

public class DriverMasterTest extends BasePage {

	/*Unable to automate
	 * 
	 */
	DriverMaster driver;

	@Test(groups = { "DriverMaster" }, dependsOnGroups = { "login" }, dataProvider = "DriverData")
	public void insertDriverMaster(String driverName, String resAddress, String ContactPerson1, String ContactPerson2,
			String licenseNo, String licenseDate, String batchDate, String remarks) {
		try { DriverMaster driver = new DriverMaster();

			//impWait(1000);
			loadUrl(driver.getPageUrl());
			txtData(driver.getdriverName(),driverName);
			txtData(driver.getresAddress(),resAddress);
			txtData(driver.getcontactPerson1(),ContactPerson1);
			txtData(driver.getcontactPerson2(),ContactPerson2);
			txtData(driver.getlicenseNo(), licenseNo);
			// txtData(driver.getlicenseValupto(), value);
			// txtData(driver.getbatchValupto(), value);
			txtData(driver.getRemarks(), remarks);
			btnClick(driver.getSubmit());
			screenshot(remarks);
			sleep();
			if (driver.getYes().isEnabled()) {
				btnClick(driver.getYes());
			}
			if (driver.getok().isEnabled()) {

				btnClick(driver.getok());
			}
			refresh();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@DataProvider(name = "DriverData")
	public Object[][] TaxData() throws BiffException, IOException {
		Object[][] testData = null;
		testData = getExcel("C:\\Users\\Systech\\Desktop\\Data\\DriverData.xls", 0);

		return testData;

	}
}
