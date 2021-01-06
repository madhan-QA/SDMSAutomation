package com.systech.tradewinds.sdms.Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.common.BasePage;
import com.systech.tradewinds.sdms.pageobject.MakeMaster;
import jxl.read.biff.BiffException;

public class MakeMasterTest extends BasePage {
	
	MakeMaster Make;
	@Test(groups= {"MakeMasterTest"},dependsOnGroups= {"login"},dataProvider="makedata")
	public void insertMake(String makeName,String manufName,String remarks)  {
		Make = new MakeMaster();
		loadUrl(Make.getPageUrl());
	
		txtData(Make.getMakename(),makeName);
	
		txtData(Make.getManufname(),manufName);
		try {
			sleep();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		chkBox(Make.getIsaffectcost());
		try {
			sleep();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		txtData(Make.getRemarks(),remarks);
		
	
		btnClick(Make.getSubmit());
		
		btnClick(Make.getok());
		
		//btnClick(PrintName.getok());
		//btnClick(divisionmaster.getReset());
		refresh();
		

}
@DataProvider(name="makedata")	
public Object[][] makedata() throws BiffException, IOException{
	 Object[][] testData = null;
	try {
		testData = getExcel("C:\\Users\\Systech\\Desktop\\Data\\MakeData.xls",0);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return testData;
	
}
}
 

