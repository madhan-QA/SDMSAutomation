package com.systech.tradewinds.sdms.Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.common.BasePage;

import com.systech.tradewinds.sdms.pageobject.PrintnameMaster;

import jxl.read.biff.BiffException;

public class PrintNameMasterTest extends BasePage {
	
	PrintnameMaster PrintName;
	@Test(groups= {"Printnamemaster"},dependsOnGroups= {"login"},dataProvider="PrintNameData")
	public void insertPrintName(String prntName,String Remarks)  {
		PrintName = new PrintnameMaster();
		loadUrl(PrintName.getPageUrl());
	
		txtData(PrintName.getprintname(),prntName);
	
		txtData(PrintName.getRemarks(),Remarks);
		try {
			sleep();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		chkBox(PrintName.getDefaultcopy());
		try {
			sleep();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		btnClick(PrintName.getSubmit());
		
		//btnClick(PrintName.getok());
		//btnClick(divisionmaster.getReset());
		refresh();
		

}
@DataProvider(name="PrintNameData")	
public Object[][] PrintNameData() throws BiffException, IOException{
	 Object[][] testData = null;
	try {
		testData = getExcel("C:\\Users\\Systech\\Desktop\\Data\\PrintNameData.xls",0);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return testData;
	
}
}
 
