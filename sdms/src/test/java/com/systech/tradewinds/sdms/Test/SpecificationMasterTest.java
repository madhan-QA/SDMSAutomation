package com.systech.tradewinds.sdms.Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.common.BasePage;
import com.systech.tradewinds.sdms.pageobject.SpecificationMaster;

import jxl.read.biff.BiffException;

public class SpecificationMasterTest extends BasePage {
	
	SpecificationMaster specification;
	@Test(groups= {"SpecificationMaster"},dependsOnGroups= {"login"},dataProvider="SpecData")
	public void insertSpecificationMaster(String specificationName,String Remarks) {
		specification = new SpecificationMaster();
		loadUrl(specification.getPageUrl());
	
		txtData(specification.getspectname(),specificationName);
	
		txtData(specification.getRemarks(),Remarks);
	
		btnClick(specification.getSubmit());
		//btnClick(specification.getReset());
		refresh();
		btnClick(specification.getYes());
		btnClick(specification.getok());
		
		

}
@DataProvider(name="SpecData")	
public Object[][] SpecData() throws BiffException, IOException{
	 Object[][] testData = null;
	try {
		testData = getExcel("C:\\Users\\Systech\\Desktop\\Data\\SpecData.xls",0);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return testData;
	
}
}

