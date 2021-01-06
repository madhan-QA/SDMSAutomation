package com.systech.tradewinds.sdms.Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.common.BasePage;
import com.systech.tradewinds.sdms.pageobject.BoxsizeMaster;
import jxl.read.biff.BiffException;

public class BoxsizeMasterTest  extends BasePage{
	BoxsizeMaster boxsizeMaster;
	@Test(groups= {"BoxsizeMaster"},dependsOnGroups= {"login"},dataProvider="BoxsizeData")
	public void insertBoxsizeMaster(String width,String height,String length) {
		boxsizeMaster = new BoxsizeMaster();
		loadUrl(boxsizeMaster.getPageUrl());
	
		txtData(boxsizeMaster.getwidth(),width);
		
		txtData(boxsizeMaster.getlength(),length);
		
		txtData(boxsizeMaster.getheight(),height);
		
		
		btnClick(boxsizeMaster.getSubmit());
		try {
			sleep();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		btnClick(boxsizeMaster.getok());
		try {
			sleep();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				

		
	
		//txtData(boxsizeMaster.getRemarks(),Remarks);
	
		btnClick(boxsizeMaster.getSubmit());
		//btnClick(divisionmaster.getReset());
		refresh();
		

}
@DataProvider(name="BoxsizeData")	
public Object[][] BoxsizeData()throws BiffException, IOException {
	 Object[][] testData = null;
	try {
		testData = getExcel("C:\\Users\\Systech\\Desktop\\Data\\BoxsizeData.xls",0);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return testData;
	
}

}
