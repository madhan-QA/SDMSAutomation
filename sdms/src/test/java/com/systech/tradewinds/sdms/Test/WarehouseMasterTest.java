package com.systech.tradewinds.sdms.Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.common.BasePage;
import com.systech.tradewinds.sdms.pageobject.WarehouseMaster;

import jxl.read.biff.BiffException;

public class WarehouseMasterTest extends BasePage {

	WarehouseMaster warehouse;

	@Test(groups = { "WarehouseMaster" }, dependsOnGroups = { "login" }, dataProvider = "warehouseData")
	public void insertWarehouseMaster(String wcode, String wName, String Type, String shortname, String noofRows,
			String noofShelevs, String noofRacks, String noofBins, String remarks) {

		warehouse = new WarehouseMaster();
		try {
			loadUrl(warehouse.getPageUrl());

			impWait(1000);
			txtData(warehouse.getwarehouseCode(), wcode);
			txtData(warehouse.getwarehouseName(), wName);

			if (Type.contentEquals("Bin")) {
				btnClick(warehouse.gettypeBin());

				sleep();

				// short name key filter//
				txtData(warehouse.getshortName(), shortname);

				sleep();

				txtData(warehouse.getnoofRows(), noofRows);

				sleep();

				tab(warehouse.getnoofRows());
				if (warehouse.getnoofshelevs().isEnabled()) {
					if (noofShelevs != null && !noofShelevs.isEmpty())

					{
						txtData(warehouse.getnoofshelevs(), noofShelevs);
						btnClick(warehouse.getnoofshelevs());
						tab(warehouse.getnoofshelevs());
						if (warehouse.getnoofRacks().isEnabled())

						{
							if (noofRacks != null && !noofRacks.isEmpty()) {
								txtData(warehouse.getnoofRacks(), noofRacks);
								btnClick(warehouse.getnoofRacks());
								tab(warehouse.getnoofRacks());

								sleep();

								if (warehouse.getnoofBins().isEnabled()) {
									if (noofBins != null && !noofBins.isEmpty())
										txtData(warehouse.getnoofBins(), noofBins);
									btnClick(warehouse.getnoofRacks());
								}

								sleep();

								btnClick(warehouse.getgenerate());
								sleep();

							}
						}
					}
				}
			}
			// txtData(warehouse.getRemarks(), remarks);
			btnClick(warehouse.getSubmit());
			// btnClick(service.getReset());

			sleep();

			btnClick(warehouse.getYes());
			btnClick(warehouse.getok());
			refresh();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@DataProvider(name = "warehouseData")
	public Object[][] warehouseData()  throws BiffException, IOException {
		Object[][] testData = null;
		testData = getExcel("C:\\Users\\Systech\\Desktop\\Data\\warehouseData.xls", 0);
		
		return testData;

	}

}

/*
 * if (isTemp.equalsIgnoreCase("yes")) { chkBox(warehouse.getisTemp());
 * 
 * }
 */