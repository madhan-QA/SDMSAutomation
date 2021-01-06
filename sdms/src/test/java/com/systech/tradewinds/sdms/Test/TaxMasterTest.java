package com.systech.tradewinds.sdms.Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.common.BasePage;
import com.systech.tradewinds.sdms.pageobject.TaxMaster;

import jxl.read.biff.BiffException;

public class TaxMasterTest extends BasePage {

	TaxMaster tax;

	@Test(groups = { "TaxMaster" }, dependsOnGroups = { "login" }, dataProvider = "TaxData")
	public void insertTaxMaster(String taxName, String Type, String taxType, String taxSubType, String Class,
			String taxPercentage) {
		try {
            impWait(1000);
			TaxMaster tax = new TaxMaster();
			loadUrl(tax.getPageUrl());
			txtData(tax.getTaxname(), taxName);
			if (Type.contentEquals("Service")) {
				btnClick(tax.getTypeService());
			}
			selectBytext(tax.getTypetax(), taxType);
			sleep();

			switch (taxType) {
			case "GST":

				if (tax.getTaxGSTsubtype().isEnabled()) {
					selectBytext(tax.getTaxGSTsubtype(), taxSubType);
				}

				break;
			case "VAT":
				if (tax.getTaxVATsubtype().isEnabled()) {
					selectBytext(tax.getTaxVATsubtype(), taxSubType);
					txtData(tax.getCstClass(), Class);
					
				}
				break;
			case "CST":
				if (tax.getCstClass().isEnabled()) {
					txtData(tax.getCstClass(), Class);
					
				}

				break;
			case "Service Tax":
				if (tax.getTaxHead().isEnabled()) {

					txtData(tax.getTaxHead(), Class);
				}
				
				break;
			case "Excise":
				if (tax.getTaxHead().isEnabled())
					txtData(tax.getTaxHead(), Class);
				
				break;

			}
			sleep(); 
			txtData(tax.getTaxPercentage(), taxPercentage);

			btnClick(tax.getSubmit());
			// btnClick(tax.getReset());

			sleep();
			if (tax.getYes().isEnabled()) {
				btnClick(tax.getYes());
			}
			if (tax.getok().isEnabled()) {

				btnClick(tax.getok());
			}
			refresh();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@DataProvider(name = "TaxData")
	public Object[][] TaxData() throws BiffException, IOException {
		Object[][] testData = null;
		testData = getExcel("C:\\Users\\Systech\\Desktop\\Data\\TaxData.xls", 0);

		return testData;

	}
}