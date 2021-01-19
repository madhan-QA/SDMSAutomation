package com.systech.tradewinds.sdms.pageobject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.systech.tradewinds.sdms.common.BasePage;

public class CompanyMaster extends  BasePage{



	public  CompanyMaster() {
		PageFactory.initElements(driver, this);
	}

	private String pageUrl = "http://localhost:8081/SDMS/pages/masters/companymaster.xhtml ";




	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:InfoTabid']")
	private WebElement InfoTab;
	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:companyName']")
	private WebElement CmpanyName;
	
	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:address1']")
	private WebElement address1;
	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:address2']")
	private WebElement address2;


	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:contactPerson']")
	private WebElement contactPerson;
	
	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:designation']")
	private WebElement Designation;
	

	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:mobileNo']")
	private WebElement mobileNo;


	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:offmobile']")
	private WebElement ofcmobileNo;
	
	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:emailId']")
	private WebElement email;




	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:state_input']")
	private WebElement state;


	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:city_input]")
	private WebElement city;

	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:fax']")
	private WebElement fax;

	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:pinCode']")
	private WebElement pinCode;

	
	@FindBy(xpath="//*[@id=\\'chgtype:tabviewchgtype:tabviewid:webid:currencyCode_input']")
	private WebElement Currency;


	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:web']")
	private WebElement WebSite;


	
	
	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:ph']")
	private WebElement phoneNo;

	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:web']")
	private WebElement cmpnyPrefix;
	
	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:remarks']")
	private WebElement Remarks;
		
	
	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:nxt2']")
	private WebElement t1Next;
	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:res1']")
	private WebElement t1Reset;

	//second tab details 
	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:StatutoryTabid']")
	private WebElement StatutoryTab;
	

	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:gstin']")
	private WebElement CompanyGST;


	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:CINno']")
	private WebElement CINno;


	@FindAll(@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:podate_input']"))
		private List<WebElement>  GSTeffcDate;
	
	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:igst']")
	private WebElement ADcode;

	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:ie']")
	private WebElement IEno;

	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:bin']")
	private WebElement BINno;

	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:ult']")
	private WebElement LUT;


	
	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:nxt3']")
	private WebElement t2Next;
	

	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:bck1']")
	private WebElement t2Prev;
	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:res2']")
	private WebElement t2Reset;


	//ThridTab 
	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:BranchInfoid']")
	private WebElement BranchInfo;
	
	//first branch details
	
	@FindBy(xpath="//*[@id='chgtype:tabviewid:table:0:deletelink']")
	private WebElement bClr1;
	
	
	@FindBy(xpath="//*[@id='chgtype:tabviewid:table:0:site_input']")
	private WebElement bSiteType;
	
	
	@FindBy(xpath="//*[@id='chgtype:tabviewid:table:0:siteId']")

	private WebElement bSiteName1;


	@FindBy(xpath="//*[@id='chgtype:tabviewid:table:0:gstnId']")

	private WebElement bGSTNO1;
	
	
	@FindBy(xpath="//*[@id='chgtype:tabviewid:table:0:branpreId']")

		private WebElement bPrefix1;
	
	
	@FindBy(xpath="//*[@id='chgtype:tabviewid:table:0:addr1]")

		private WebElement b1Addres1;
	
	@FindBy(xpath="//*[@id='chgtype:tabviewid:table:0:addr2]")
	private WebElement b1Address2;
	
	
	@FindBy(xpath="//*[@id='chgtype:tabviewid:table:0:staname_input']")
	private WebElement bState1;

	@FindBy(xpath="//*[@id=\\'chgtype:table:0:cityname_input']")
	private WebElement bCity1;
	
	@FindBy(xpath="//*[@id=\\'chgtype:table:0:j_idt105']")
	private WebElement bPincode1;

	@FindBy(xpath="//*[@id=\\'chgtype:table:0:contactId']")
	private WebElement bCntactpersn1;
	
	@FindBy(xpath="//*[@id=\\'chgtype:table:0:j_idt110']")
	private WebElement bTelephone1;
	
	@FindBy(xpath="//*[@id=\\'chgtype:table:0:j_idt112']")
	private WebElement bmobile1;
	
	@FindBy(xpath="//*[@id=\\'chgtype:table:0:emiId']")
	private WebElement bEmail1;
   
	@FindBy(xpath="//*[@id=\\'chgtype:table:0:j_idt118']")
	private WebElement bTallyName1;
	
	@FindBy(xpath="//*[@id='chgtype:tabviewid:table:0:j_idt120_input']")
	private WebElement bHedrLogo1;
	
	@FindBy(xpath="//*[@id='chgtype:tabviewid:table:0:removePhotoId']")
	private WebElement clrHedrLogo1;
	@FindBy(xpath="//*[@id='chgtype:tabviewid:table:0:removePhotoIdForFooter]")
	private WebElement clrFtrLogo1;
	
	@FindBy(xpath="//*[@id='chgtype:tabview:table:0:j_idt128_input']")
	private WebElement bFtrLogo1;
	
	//branch two detalis
	
	@FindBy(xpath="//*[@id='chgtype:tabviewid:table:1:deletelink']")
	private WebElement bClr2;
	
	
	
	@FindBy(xpath="//*[@id='chgtype:tabviewid:tallyserver]")
	private WebElement cmnyTallyIP;
	
	



	@FindBy(xpath="//*[@id='chgtype:tabviewid:nxt4:]")
	private WebElement t3Next;
	

	@FindBy(xpath="//*[@id='chgtype:tabviewid:nxt4]")
	private WebElement t3Prev;
	@FindBy(xpath="//*[@id='chgtype:tabviewid:res3]")
	private WebElement t3Reset;
	
	//Tab 4 

	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:AttchmentTabid']")
	private WebElement AttchmentTab;


	@FindBy(xpath="//*[@id='chgtype:tabviewid:upload_input']")
	private WebElement cmpnyLogo;
	
	@FindBy(xpath="//*[@id='chgtype:tabviewid:upload']/div[1]/button[1]']")
	private WebElement upldCmpnyLogo;
	
	
	@FindBy(xpath="//*[@id='chgtype:tabviewid:upload']/div[1]/button[2]']")
	private WebElement cancelCmpnyLogo;
	
	@FindBy(xpath="//*[@id='chgtype:tabviewid:upload1']/div[1]/button[1]']")
	private WebElement upldPrintLogo;
	
	
	@FindBy(xpath="//*[@id='chgtype:tabviewid:upload1']/div[1]/button[2]]")
	private WebElement cancelPrintLogo;
	
	
	@FindBy(xpath="//*[@id=\"chgtype:tabviewid:upload\']/div[2]/div[2]/div/div/div[5]/button")
	private WebElement clrcmpnyLogo;
	@FindBy(xpath="////*[@id='chgtype:tabviewid:upload1_input']")
	private WebElement prntLogo;

	@FindBy(xpath="//*[@id='chgtype:tabviewid:removeDocId']")
	private WebElement clrprntlogo;

	@FindBy(xpath="//*[@id='chgtype:tabviewid:j_idt146']")
	private WebElement t4Next;

	@FindBy(xpath="//*[@id='chgtype:tabviewid:j_idt148']")
	private WebElement t4Prev;

	@FindBy(xpath="//*[@id='chgtype:tabviewid:ViewCompanyid]")
	private WebElement ViewCompany;

	@FindBy(xpath="//*[@id='chgtype:tabviewid:j_idt228]")

	private WebElement t5Prev;

	@FindBy(xpath="//*[@id='chgtype:tabviewid:sub4]")
	private WebElement submit;
	
	@FindBy(xpath="//*[@id='chgtype:tabviewid:ViewCompanyid]")
	private WebElement yes;

	@FindBy(xpath="//*[@id='notifi:j_idt26']")
	private WebElement no;

	public String getPageUrl() {
		return pageUrl;
	}

	public WebElement getDesignation() {
		return Designation;
	}

	public WebElement getInfoTab() {
		return InfoTab;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getAddress2() {
		return address2;
	}

	public WebElement getContactPerson() {
		return contactPerson;
	}

	
	public WebElement getMobileNo() {
		return mobileNo;
	}

	public WebElement getOfcmobileNo() {
		return ofcmobileNo;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getFax() {
		return fax;
	}

	public WebElement getPinCode() {
		return pinCode;
	}

	

	public WebElement getCurrency() {
		return Currency;
	}

	public WebElement getWebSite() {
		return WebSite;
	}

	public WebElement getPhoneNo() {
		return phoneNo;
	}

	public WebElement getCmpnyPrefix() {
		return cmpnyPrefix;
	}

	
	public WebElement getRemarks() {
		return Remarks;
	}

	public WebElement getT1Next() {
		return t1Next;
	}

	public WebElement getT1Reset() {
		return t1Reset;
	}

	public WebElement getStatutoryTab() {
		return StatutoryTab;
	}
	public WebElement getCompanYGST() {
		return CompanyGST;
	}
	public List<WebElement> getGSTeffcDate() {
		return GSTeffcDate;
	}

	

	public WebElement getCINno() {
		return CINno;
	}

	
	public WebElement getADcode() {
		return ADcode;
	}

	public WebElement getIEno() {
		return IEno;
	}

	public WebElement getBINno() {
		return BINno;
	}

	public WebElement getLUT() {
		return LUT;
	}

	public WebElement getT2Next() {
		return t2Next;
	}

	public WebElement getT2Prev() {
		return t2Prev;
	}

	public WebElement getT2Reset() {
		return t2Reset;
	}

	public WebElement getBranchInfo() {
		return BranchInfo;
	}

	public WebElement getbClr1() {
		return bClr1;
	}

	public WebElement getbSiteType() {
		return bSiteType;
	}

	public WebElement getbSiteName1() {
		return bSiteName1;
	}

	public WebElement getbGSTNO1() {
		return bGSTNO1;
	}

	public WebElement getbPrefix1() {
		return bPrefix1;
	}

	public WebElement getB1Addres1() {
		return b1Addres1;
	}

	public WebElement getB1Address2() {
		return b1Address2;
	}

	public WebElement getbState1() {
		return bState1;
	}

	public WebElement getbCity1() {
		return bCity1;
	}

	public WebElement getbPincode1() {
		return bPincode1;
	}

	public WebElement getbCntactpersn1() {
		return bCntactpersn1;
	}

	public WebElement getbTelephone1() {
		return bTelephone1;
	}

	public WebElement getBmobile1() {
		return bmobile1;
	}

	public WebElement getbEmail1() {
		return bEmail1;
	}

	public WebElement getbTallyName1() {
		return bTallyName1;
	}

	public WebElement getbHedrLogo1() {
		return bHedrLogo1;
	}

	public WebElement getClrHedrLogo1() {
		return clrHedrLogo1;
	}

	public WebElement getClrFtrLogo1() {
		return clrFtrLogo1;
	}

	public WebElement getbFtrLogo1() {
		return bFtrLogo1;
	}

	public WebElement getbClr2() {
		return bClr2;
	}


	public WebElement getCmnyTallyIP() {
		return cmnyTallyIP;
	}

	public WebElement getT3Next() {
		return t3Next;
	}

	public WebElement getT3Prev() {
		return t3Prev;
	}

	public WebElement getT3Reset() {
		return t3Reset;
	}

	public WebElement getAttchmentTab() {
		return AttchmentTab;
	}

	public WebElement getCmpnyLogo() {
		return cmpnyLogo;
	}

	public WebElement getUpldCmpnyLogo() {
		return upldCmpnyLogo;
	}

	public WebElement getCancelCmpnyLogo() {
		return cancelCmpnyLogo;
	}

	public WebElement getUpldPrintLogo() {
		return upldPrintLogo;
	}

	public WebElement getCancelPrintLogo() {
		return cancelPrintLogo;
	}

	public WebElement getClrcmpnyLogo() {
		return clrcmpnyLogo;
	}

	public WebElement getPrntLogo() {
		return prntLogo;
	}

	public WebElement getClrprntlogo() {
		return clrprntlogo;
	}

	public WebElement getT4Next() {
		return t4Next;
	}

	public WebElement getT4Prev() {
		return t4Prev;
	}

	public WebElement getViewCompany() {
		return ViewCompany;
	}

	public WebElement getT5Prev() {
		return t5Prev;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getYes() {
		return yes;
	}

	public WebElement getNo() {
		return no;
	}


}

