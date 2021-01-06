package com.systech.tradewinds.sdms.Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.common.BasePage;
import com.systech.tradewinds.sdms.pageobject.BankMaster;

import jxl.read.biff.BiffException;

public class BankmasterTest extends BasePage {
	
	BankMaster bankmaster;
	
	@Test(dataProvider="BankTest",groups= {"BankMaster"},dependsOnGroups= {"login"})
	public void insertbankmstr(String Benificary,String accNo,String BankName,String Branch,String Ifsccode,String Swiftcode) {
		bankmaster = new BankMaster();
		loadUrl(bankmaster.getPageUrl());
		txtData(bankmaster.getBenfiryname(),Benificary);
		txtData(bankmaster.getAccno(),accNo);
		txtData(bankmaster.getBankname(),BankName);
		txtData(bankmaster.getBranch(),Branch);
		txtData(bankmaster.getIfsccode(),Ifsccode);
		txtData(bankmaster.getSwiftcode(),Swiftcode);
		
		btnClick(bankmaster.getSubmit());
		try {
			sleep();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		//btnClick(bankmaster.getReset());
		refresh();
	}
	
	@DataProvider(name="BankTest")
	public  Object[][] BankData() throws BiffException, IOException  {


	Object[][] testdata = null;
	try {
		testdata = getExcel("C:\\Users\\Systech\\Desktop\\Data\\BankData.xls",0);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return testdata ;


	}

		
	

}
