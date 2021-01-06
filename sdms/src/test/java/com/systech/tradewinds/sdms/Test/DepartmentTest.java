package com.systech.tradewinds.sdms.Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.common.BasePage;
import com.systech.tradewinds.sdms.pageobject.DepartmentMaster;

import jxl.read.biff.BiffException;

public class DepartmentTest extends BasePage {
	
	DepartmentMaster depertment;
	@Test(groups= {"departmentMaster"},dependsOnGroups= {"login"},dataProvider="departmentData")
	public void insertDepartmentMaster(String departmentName,String departmentCode) {
		depertment = new DepartmentMaster();
		loadUrl(depertment.getPageUrl());
	
		txtData(depertment.getdepartmentname(),departmentName);
		txtData(depertment.getdepartmentcode(),departmentCode);

		//txtData(depertment.getRemarks(),Remarks);
	
		btnClick(depertment.getSubmit());
		try {
			sleep();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		//btnClick(depertment.getReset());
		btnClick(depertment.getYes());
		btnClick(depertment.getok());
		refresh();
		

}
@DataProvider(name="departmentData")	
public Object[][] departmentData() throws BiffException, IOException {
	 Object[][] testData = null;
	try {
		testData = getExcel("C:\\Users\\Systech\\Desktop\\Data\\DepartmentData.xls",0);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return testData;
	
}
}