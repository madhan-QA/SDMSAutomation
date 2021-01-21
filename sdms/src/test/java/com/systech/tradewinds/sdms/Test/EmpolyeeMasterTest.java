package com.systech.tradewinds.sdms.Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.common.BasePage;
import com.systech.tradewinds.sdms.pageobject.EmployeeMaster;

import jxl.read.biff.BiffException;

public class EmpolyeeMasterTest extends BasePage {

	EmployeeMaster emp;

	@Test(groups = { "EmployeeMaster" }, dependsOnGroups = { "login" })
	public static void insertEmployeeMaster() throws InterruptedException {
		EmployeeMaster	emp = new EmployeeMaster();
		impWait(2000);
		loadUrl(emp.getPageUrl());
		try {
			txtData(emp.getempId(), "123456");

			txtData(emp.getempName(), " CR7");
			txtData(emp.getfatherName(), "shanmugasundaram");
			txtData(emp.getaddress1(), "address1");
			txtData(emp.getaddress2(), " address2");
			btnClick(emp.getstateLabel());
			txtData(emp.getStatefilter(),"Tamil Nadu");
			keyDown_Enter(emp.getStatefilter());
			moveToEle(emp.getstateLabel());

			sleep();
			btnClick(emp.getcityLabel());
			txtData(emp.getCityfilter(),"Chennai");
			keyDown_Enter(emp.getCityfilter());
			moveToEle(emp.getcityLabel());

			sleep();
			txtData(emp.getpinCode(),"638452");
			/*clkElement(emp.getDOB());
			eleSelectable(emp.getdobMonth(),1000);		
			selectBytext(emp.getdobMonth(),"April");
			selectBytext(emp.getdobYear(),"1995");	
			selectDay(emp.getdobDay(),"11");
			 */
			selectBytext(emp.getGender(),"Male");
			sleep();
			txtData(emp.getmobileNo(),"9500817492");
			sleep();
			txtData(emp.getphoneNo(),"8610492575");

			txtData(emp.getemail(),"smk@gmail.com");

			txtData(emp.getremark(),"test");
			selectBytext(emp.getdesigination(),"Branch Manager");
			selectBytext(emp.getcategroy(),"Trainee");

			chkBox(emp.getDivision1());


			txtData(emp.getemail1(), "smk@gmail.com");
			txtData(emp.getmobileNo1(), "8610492575");
			/*if(emp.getempStatus().isDisplayed()) {
				selectBytext(emp.getempStatus(), "Active"); }
			
			if(emp.getempGrp().isEnabled()) {
			selectBytext(emp.getempGrp(),"test"); }

			*/btnClick(emp.getnext1());

			sleep();


			btnClick(emp.getEmpImg());

			imageUplaod("C:\\Users\\Systech\\Desktop\\mine");
			sleep();


			btnClick(emp.gett2Next());
			expWait(emp.getSubmit(), 5000);
			if (emp.getSubmit().isEnabled()) {
				btnClick(emp.getSubmit());
			}

			if (emp.getYes().isEnabled()) {
				btnClick(emp.getYes());
			}
			if (emp.getok().isEnabled()) {
				btnClick(emp.getok());

			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	

	/*@DataProvider(name = "EmpData")
	public Object[][] EmpData()  throws BiffException, IOException {
		Object[][] testData = null;
		testData = getExcel("C:\\Users\\Systech\\Desktop\\Data\\EmpData.xls", 0);

		return testData;

	}

	 */  

}