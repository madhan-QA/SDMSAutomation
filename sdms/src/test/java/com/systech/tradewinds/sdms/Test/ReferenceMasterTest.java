package com.systech.tradewinds.sdms.Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.common.BasePage;
import com.systech.tradewinds.sdms.pageobject.ReferenceMaster;

import jxl.read.biff.BiffException;

public class ReferenceMasterTest extends BasePage {
	
	ReferenceMaster reference;
	@Test(groups= {"ReferenceMaster"},dependsOnGroups= {"login"},dataProvider="ReferenceData")
	public void insertReferenceMaster(String referenceName,String address,String email,String commsioncode,String mobile) {
		reference = new ReferenceMaster();
		loadUrl(reference.getPageUrl());
	
		txtData(reference.getReferencename(),referenceName);
		txtData(reference.getMobile(),mobile);
		txtData(reference.getAddress(),address);
		txtData(reference.getEmail(),email);

		txtData(reference.getCommisioncode(),commsioncode);
	
		btnClick(reference.getSubmit());
		//btnClick(reference.getReset());
		refresh();
		btnClick(reference.getYes());
		btnClick(reference.getok());
		
		

}
@DataProvider(name="ReferenceData")	
public Object[][] ReferenceData() throws BiffException, IOException{
	 Object[][] testData = null;
	try {
		testData = getExcel("C:\\Users\\Systech\\Desktop\\Data\\ReferenceData.xls",0);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return testData;
	
}
}

