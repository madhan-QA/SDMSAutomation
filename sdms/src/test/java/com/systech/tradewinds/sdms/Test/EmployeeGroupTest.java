package com.systech.tradewinds.sdms.Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.common.BasePage;
import com.systech.tradewinds.sdms.pageobject.EmployeeGroup;

import jxl.read.biff.BiffException;

public class EmployeeGroupTest  extends BasePage {
	
	EmployeeGroup EmpGrp;
	@Test(groups= {"EmpGroup"},dependsOnGroups= {"login"},dataProvider="EmpGroupData")
	public void insertEmpGroupData(String GrpName,String Remarks)  {
		EmpGrp = new EmployeeGroup();
		loadUrl(EmpGrp.getPageUrl());
	
		txtData(EmpGrp.getEmpGrp(),GrpName);
	
		//txtData(EmpGrp.getRemarks(),Remarks);
		try {
			sleep();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		btnClick(EmpGrp.getSubmit());
		try {
			sleep();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		btnClick(EmpGrp.getok());
		//btnClick(EmpGrp.getReset());
		refresh();
		

}
@DataProvider(name="EmpGroupData")	
public Object[][] EmpGroupData() throws BiffException, IOException{
	 Object[][] testData = null;
	try {
		testData = getExcel("C:\\Users\\Systech\\Desktop\\Data\\EmpGroupData.xls",0);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return testData;
	
}
}
