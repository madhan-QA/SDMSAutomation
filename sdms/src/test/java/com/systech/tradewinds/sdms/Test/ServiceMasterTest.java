package com.systech.tradewinds.sdms.Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.pageobject.ServiceMaster;

import jxl.read.biff.BiffException;

public class ServiceMasterTest extends ServiceMaster {

	ServiceMaster service;

	@Test(groups = { "serviceItem" }, dependsOnGroups = { "login" }, dataProvider = "ServiceItemData")
	public static void inserServiceItem(String groupName, String serviceName, String serviceCode, String des,
			String type, String categoery, String UOM, String TDS, String tdsCategoery, String HSNcode, String CGST,
			String SGST, String IGST, String Remarks) {
		try {
			impWait(5000);
			ServiceMaster service = new ServiceMaster();
			loadUrl(service.getPageUrl());
			selectBytext(service.getgroupName(), groupName);
			txtData(service.getserviceName(), serviceName);
			txtData(service.getserviceitmCode(), serviceCode);
			txtData(service.getdescription(), des);
			selectBytext(service.getType(), type);
			selectBytext(service.getCategoery(), categoery);
			selectBytext(service.getUOM(), UOM);
			if (TDS.equalsIgnoreCase("YES")) {
				btnClick(service.gettdsYes());
				selectBytext(service.gettdsCat(), tdsCategoery);
			}
			txtData(service.gethsnCode(), HSNcode);

			if (SGST != null && !SGST.isEmpty()) {

				txtData(service.gettaxSGST(), "S");

				autosuggest(service.getsgstSugg(), SGST);

			}
			sleep();
			tab(service.gettaxSGST());
			if (CGST != null && !CGST.isEmpty()) {
				txtData(service.gettaxCGST(), "C");

				autosuggest(service.getcgstSugg(), CGST);
			}
			sleep();
			tab(service.gettaxCGST());

			if (IGST != null && !IGST.isEmpty()) {

				txtData(service.gettaxIGST(), "I");

				autosuggest(service.getigstSugg(), IGST);
			}
			btnClick(service.getSubmit());
			if (service.getYes().isEnabled()) {
				btnClick(service.getYes());
			}
			if (service.getok().isEnabled()) {

				btnClick(service.getok());
			}
			refresh();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@DataProvider(name = "ServiceItemData")
	public Object[][] ServiceItemData() throws BiffException, IOException {
		Object[][] testData = null;
		testData = getExcel("C:\\Users\\Systech\\Desktop\\Data\\ServiceItemData.xls", 0);

		return testData;

	}

}
