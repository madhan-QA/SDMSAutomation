package com.systech.tradewinds.sdms.Test;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.common.BasePage;
import com.systech.tradewinds.sdms.pageobject.CompanyMaster;

public class CompanyMasterTest extends BasePage{

	CompanyMaster cm;

	@Test(groups = { "EmployeeMaster" }, dependsOnGroups = { "login" })
	public static void insertCompanyMaster() { 

		CompanyMaster cm  = new CompanyMaster();
		impWait(5000);
		loadUrl(cm.getPageUrl());
		txtData(cm.getCmpanyName(),"Makws");

		txtData(cm.getContactPerson(), "Madhan");
		txtData(cm.getAddress1(),"49 muthusa street");
		txtData(cm.getAddress2(),"Gobi");
		txtData(cm.getDesignation(),"QA");
		txtData(cm.getMobileNo(),"987654321");
		selectBytext(cm.getState(),"Delhi");
		selectBytext(cm.getCity(),"Delhi");
		txtData(cm.getOfcmobileNo(),"987654321");
		txtData(cm.getPhoneNo(),"987654321");
		txtData(cm.getPinCode(),"638452");
		txtData(cm.getFax(),"987654321");
		txtData(cm.getWebSite(),"www.makwc.com");
		txtData(cm.getRemarks(),"www.makwc.com");
		selectBytext(cm.getCurrency(),"INR");
		btnClick(cm.getT1Next());
		//keyfilter
		txtData(cm.getbGSTNO1(),"33AABCJ622");
		txtData((WebElement) cm.getGSTeffcDate(),"18");
		txtData(cm.getCINno(),"99999");
		txtData(cm.getIEno(),"3206000262");
		txtData(cm.getADcode(),"3206000262");
		txtData(cm.getBINno(),"3206000262");
		txtData(cm.getLUT(),"3206000262");

		btnClick(cm.getT2Next());
		selectBytext(cm.getbSiteType(), "Branch");
		txtData(cm.getbSiteName1(), "Coimatore");
		//branch St keyfilter
		txtData(cm.getbGSTNO1(), "33AABCJ622");
		txtData(cm.getbPrefix1(), "M");
		txtData(cm.getB1Addres1(), "14 hopes");

		txtData(cm.getB1Address2(), "Coimatore");
		autosuggest(cm.getbState1(), "Tamilnadu");	
		autosuggest(cm.getbCity1(), "Coimbatore");
		txtData(cm.getbCntactpersn1(),"madhan");
		txtData(cm.getbPincode1(),"99999");
		txtData(cm.getbTelephone1(),"3206000262");
		txtData(cm.getBmobile1(),"99999999");
		txtData(cm.getbEmail1(),"madhankwc@gmail.com");
		txtData(cm.getbTallyName1(),"test");
		txtData(cm.getCmnyTallyIP(), "19999123");
		btnClick(cm.getT3Next());
		btnClick(cm.getT4Next());
		btnClick(cm.getSubmit());

	}
}
