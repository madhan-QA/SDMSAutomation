package com.systech.tradewinds.sdms.Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.common.BasePage;
import com.systech.tradewinds.sdms.pageobject.ServicegroupMaster;

import jxl.read.biff.BiffException;

public class ServiceGroupMasterTest extends BasePage {

	ServicegroupMaster group;

	@Test(groups = { "GroupMaster" }, dependsOnGroups = { "login" }, dataProvider = "ServiceGroupData")
	public void insertGroupmaster(String grpName, String Primary, String underGroup, String Inspection, String Aql,
			String Remarks) {

		group = new ServicegroupMaster();
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
	@DataProvider(name = "ServiceGroupData")
	public Object[][] ServiceGroupData() throws BiffException, IOException {
		Object[][] testData = null;

		testData = getExcel("C:\\Users\\Systech\\Desktop\\Data\\ServiceGroupData.xls", 0);

		return testData;

	}

}