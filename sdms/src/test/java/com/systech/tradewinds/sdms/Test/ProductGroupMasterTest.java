package com.systech.tradewinds.sdms.Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.common.BasePage;
import com.systech.tradewinds.sdms.pageobject.ProductGroupMaster;

import jxl.read.biff.BiffException;

public class ProductGroupMasterTest extends BasePage {

	ProductGroupMaster group;

	@Test(groups = { "GroupMaster" }, dependsOnGroups = { "login" }, dataProvider = "ProductGroupData")
	public void insertGroupmaster(String grpName, String Primary, String underGroup, String Inspection, String Aql,
			String Remarks) {

		group = new ProductGroupMaster();
		try {
			loadUrl(group.getPageUrl());
			impWait(5000);
			txtData(group.getgroupName(), grpName);
			if (Primary.contentEquals("Yes")) {
				btnClick(group.getisPrimaryYes());

				if (group.getinsYes().isEnabled()) {

					if (Inspection.contentEquals("Yes")) {
						btnClick(group.getinsYes());
					} else {

						btnClick(group.getinsNo());
					}
				}

			} else {

				selectBytext(group.getunderGroup(), underGroup);
				if (group.getinsYes().isEnabled()) {

					if (Inspection.contentEquals("Yes")) {
						btnClick(group.getinsYes());
					} else {
						btnClick(group.getinsNo());

					}
				}

				sleep();

			}

			if (group.getinsYes().isSelected()) {

				if (Aql != null && !Aql.isEmpty()) {
					if (Aql.contentEquals("General")) {
						chkBox(group.getaqlGeneral());
					} else {
						chkBox(group.getaqlSpecial());
					}
				}
			}

			if (Remarks != null && !Remarks.isEmpty()) {
				txtData(group.getRemarks(), Remarks);
			}

			btnClick(group.getSubmit());
			sleep();
			if (group.getYes().isEnabled()) {
				btnClick(group.getYes());
			}

			if (group.getok().isEnabled()) {
				btnClick(group.getok());
			}
			refresh();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@DataProvider(name = "ProductGroupData")
	public Object[][] ProductGroupData() throws BiffException, IOException {
		Object[][] testData = null;

		testData = getExcel("C:\\Users\\Systech\\Desktop\\Data\\ProductGroupData.xls", 0);

		return testData;

	}

}