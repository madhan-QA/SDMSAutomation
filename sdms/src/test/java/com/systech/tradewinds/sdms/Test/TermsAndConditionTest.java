package com.systech.tradewinds.sdms.Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.common.BasePage;
import com.systech.tradewinds.sdms.pageobject.TermsandConditionMaster;

import jxl.read.biff.BiffException;

public class TermsAndConditionTest extends BasePage {
	
	TermsandConditionMaster terms;
	
	
	@Test(groups= {"TermsMaster"},dependsOnGroups= {"login"},dataProvider="TermsData")
	public void insertTermsMaster(String Terms,String Title,String Code,String Des,String titie1,String Des1,String title2,String Des2,String title3,String Des3)  {

		terms = new TermsandConditionMaster();
		loadUrl(terms.getPageUrl());
		selectBytext(terms.getTC(),Terms);
		if(Terms.equalsIgnoreCase("Detail"))
		{
			txtData(terms.getTitle(),Title);
			txtData(terms.getCode(),Code);
			txtData(terms.getDescription(),Des);
			
			
			txtData(terms.getTitle1(),titie1);
			txtData(terms.getDes1(),Des1);
			if(terms.getTitle2().isEnabled())
			{
				txtData(terms.getTitle1(),title2);
				txtData(terms.getDes1(),Des2);
			if(terms.getTitle2().isEnabled())
			{
				txtData(terms.getTitle1(),title3);
				txtData(terms.getDes1(),Des3);
				
			}

			}
			
		}else {
		txtData(terms.getTitle(),Title);
		txtData(terms.getCode(),Code);
		txtData(terms.getDescription(),Des);
		}
		btnClick(terms.getSubmit());
		btnClick(terms.getYes());

		btnClick(terms.getOk());
		refresh();
}
	
	@DataProvider(name="TermsData")	
	public Object[][] TermsData() throws BiffException, IOException{
		 Object[][] testData = null;
		try {
			testData = getExcel("C:\\Users\\Systech\\Desktop\\Data\\TermsData.xls",0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return testData;
		
	}
	
	
	
	
	
}