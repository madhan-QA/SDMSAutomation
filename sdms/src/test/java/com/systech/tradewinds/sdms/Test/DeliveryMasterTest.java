package com.systech.tradewinds.sdms.Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.common.BasePage;

import com.systech.tradewinds.sdms.pageobject.DeliverythroughMaster;

import jxl.read.biff.BiffException;

public class DeliveryMasterTest extends BasePage {

	DeliverythroughMaster Delivery;

	@Test(groups = { "DeliveryMaster" }, dependsOnGroups = { "login" }, dataProvider = "DeliveryData")
	public void insertDeliveryMaster(String throughType, String Name, String address,String GST ,String remarks, String Service) {
		DeliverythroughMaster Delivery = new DeliverythroughMaster();
		try {
			impWait(1000);
			loadUrl(Delivery.getPageUrl());
			selectByvalue(Delivery.getthroughType(), throughType);

			sleep();
			txtData(Delivery.getName(), Name);

			txtData(Delivery.getaddress(), address);
			// txtData(Delivery.getRemarks(), remarks);
			txtData(Delivery.getGST(), GST);
			switch (Service) {
			case "road":
				chkBox(Delivery.getroad());
				break;
			case "train":
				chkBox(Delivery.gettrain());
				break;
			case "air":
				chkBox(Delivery.getair());
				break;
			case "sea":
				chkBox(Delivery.getseaway());
				break;

			}
			btnClick(Delivery.getSubmit());
			btnClick(Delivery.getYes());

			btnClick(Delivery.getok());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@DataProvider(name = "DeliveryData")
	public Object[][] DeliveryData() throws BiffException, IOException {
		Object[][] testData = null;
		try {
			testData = getExcel("C:\\Users\\Systech\\Desktop\\Data\\DeliveryThroughMasterData.xls", 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return testData;

	}

}
