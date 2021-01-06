package com.systech.tradewinds.sdms.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.systech.tradewinds.sdms.common.BasePage;

public class CompanyMaster extends  BasePage{



	public  CompanyMaster() {
		PageFactory.initElements(driver, this);
	}

	private String pageUrl = "http://localhost:8081/SDMS/pages/masters/companymaster.xhtml ";




	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:employeeNameSugId_input']")
	private WebElement cmpnyName;
	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:tab1id']")
	private WebElement Tab1;
	@FindBy(xpath="[@id=\\'chgtype:tabviewid:eid']")
	private WebElement address1;
	@FindBy(xpath="[@id=\\'chgtype:tabviewid:employeeNameId']")
	private WebElement address2;


	@FindBy(xpath="[@id=\\'chgtype:tabviewid:contactPerson']")
	private WebElement contactPerson;
	
	@FindBy(xpath="[@id=\\'chgtype:tabviewid:centerlExceriseNo_label']")
	private WebElement centerlExceriseNo;


	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:mobileNo']")
	private WebElement mobileNo;


	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:mobileNo']")
	private WebElement ofcmobileNo;
	
	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:emailId']")
	private WebElement email;




	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:state_label']")
	private WebElement state;


	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:city_label']")
	private WebElement city;

	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:fax']")
	private WebElement fax;

	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:pinCode']")
	private WebElement pinCode;

	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:bd_input']")
	private WebElement GSTIN;

	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:sex_label']")
	private WebElement Currency;


	@FindBy(xpath="//*[@id=\\'chgtype:bg_label']")
	private WebElement WebSite1;


	
	
	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:pn']")
	private WebElement phoneNo;

	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:ren']")
	private WebElement cmpnyPrefix;
	@FindBy(xpath= "//*[@id=\'chgtype:tabviewid:reno']")
	private WebElement effecDate;
	
	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:join_input']")
	private WebElement Remarks;
		
	
	@FindBy(xpath="/html/body/div[1]/div[3]/div[2]/form[1]/div/div/div[1]/div/div[2]/table/tbody/tr/td[1]/button/span[1]")
	private WebElement t1Next;
	@FindBy(xpath= "/html/body/div[1]/div[3]/div[2]/form[1]/div/div/div[1]/div/div[2]/table/tbody/tr/td[2]/button/span[2]")
	private WebElement t1Reset;

	//second tab details 
	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:Tab2id']")
	private WebElement Tab2;
	@FindBy(xpath="[@id=\\'chgtype:tabviewid:bankAccountNo']")
	private WebElement VatNo;



	@FindBy(xpath="[@id=\\'chgtype:tabviewid:Range']")
	private WebElement Range;


	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:offmail']")
	private WebElement seviceTaxNo;
	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:CINno']")
	private WebElement CINno;


	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:offmn']")
	private WebElement CommisionRate;

	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:ADcode']")
	private WebElement ADcode;

	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:IEno']")
	private WebElement IEno;

	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:grossSalary']")
	private WebElement BINno;

	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:cate_label']")
	private WebElement LUT;


	
	@FindBy(xpath="/html/body/div[1]/div[3]/div[2]/form[1]/div/div/div[2]/div/div[2]/table/tbody/tr/td[1]/button/span[1]")
	private WebElement t2Next;
	

	@FindBy(xpath="/html/body/div[1]/div[3]/div[2]/form[1]/div/div/div[2]/div/div[2]/table/tbody/tr/td[2]/button/span[1]")
	private WebElement t2Prev;
	@FindBy(xpath="/html/body/div[1]/div[3]/div[2]/form[1]/div/div/div[2]/div/div[2]/table/tbody/tr/td[3]/button/span[1]")
	private WebElement t2Reset;


	//ThridTab 
	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:tab3id']")
	private WebElement Tab3;
	
	//first branch details
	
	@FindBy(xpath="//*[@id='chgtype:tabviewid:table:0:deletelink']")
	private WebElement bClr1;
	
	
	@FindBy(xpath="//*[@id='chgtype:tabviewid:table:0:site_label']")
	private WebElement bSite1;
	
	
	@FindBy(xpath="//*[@id='chgtype:tabviewid:table:0:siteId']")

	private WebElement bSite1Name1;


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
	
	@FindBy(xpath="//*[@id='chgtype:tabview:table:0:j_idt128_label']")
	private WebElement bFtrLogo1;
	
	//branch two detalis
	
	@FindBy(xpath="//*[@id='chgtype:tabviewid:table:1:deletelink']")
	private WebElement bClr2;
	
	
	@FindBy(xpath="//*[@id='chgtype:tabviewid:table:1:site_label']")
	private WebElement bSite2;
	
	
	@FindBy(xpath="//*[@id='chgtype:tabviewid:table:1:siteId']")

	private WebElement bSite2Name2;


	@FindBy(xpath="//*[@id='chgtype:tabviewid:table:1:gstnId']")

	private WebElement bGSTNO2;
	
	
	@FindBy(xpath="//*[@id='chgtype:tabviewid:table:1:branpreId']")

		private WebElement bPrefix2;
	
	
	@FindBy(xpath="//*[@id='chgtype:tabviewid:table:1:addr2]")

		private WebElement b2Addres1;
	
	@FindBy(xpath="//*[@id='chgtype:tabviewid:table:1:addr2]")
	private WebElement b2Address2;
	
	
	@FindBy(xpath="//*[@id='chgtype:tabviewid:table:1:staname_input']")
	private WebElement bState2;

	@FindBy(xpath="//*[@id=\\'chgtype:table:1:cityname_input']")
	private WebElement bCity2;
	
	@FindBy(xpath="//*[@id=\\'chgtype:table:1:j_idt205']")
	private WebElement bPincode2;

	@FindBy(xpath="//*[@id=\\'chgtype:table:1:contactId']")
	private WebElement bCntactpersn2;
	
	@FindBy(xpath="//*[@id=\\'chgtype:table:1:j_idt220']")
	private WebElement bTelephone2;
	
	@FindBy(xpath="//*[@id=\\'chgtype:table:1:j_idt222']")
	private WebElement bmobile2;
	
	@FindBy(xpath="//*[@id=\\'chgtype:table:1:emiId']")
	private WebElement bEmail2;
   
	@FindBy(xpath="//*[@id=\\'chgtype:table:1:j_idt228']")
	private WebElement bTallyName2;
	
	@FindBy(xpath="//*[@id='chgtype:tabviewid:table:1:j_idt220_input']")
	private WebElement bHedrLogo2;
	
	@FindBy(xpath="//*[@id='chgtype:tabviewid:table:1:removePhotoId']")
	private WebElement clrHedrLogo2;
	@FindBy(xpath="//*[@id='chgtype:tabviewid:table:1:removePhotoIdForFooter]")
	private WebElement clrFtrLogo2;
	
	@FindBy(xpath="//*[@id='chgtype:tabview:table:1:j_idt228_label']")
	private WebElement bFtrLogo2;
	
	//branch 3 details 

	@FindBy(xpath="//*[@id='chgtype:tabviewid:table:2:deletelink']")
	private WebElement bClr3;
	
	
	@FindBy(xpath="//*[@id='chgtype:tabviewid:table:2:site_label']")
	private WebElement bSite3;
	
	
	@FindBy(xpath="//*[@id='chgtype:tabviewid:table:2:siteId']")

	private WebElement bSite3Name3;


	@FindBy(xpath="//*[@id='chgtype:tabviewid:table:2:gstnId']")

	private WebElement bGSTNO3;
	
	
	@FindBy(xpath="//*[@id='chgtype:tabviewid:table:2:branpreId']")

		private WebElement bPrefix3;
	
	
	@FindBy(xpath="//*[@id='chgtype:tabviewid:table:2:addr3]")

		private WebElement b3Addres1;
	
	@FindBy(xpath="//*[@id='chgtype:tabviewid:table:2:addr3]")
	private WebElement b3Address2;
	
	
	@FindBy(xpath="//*[@id='chgtype:tabviewid:table:2:staname_input']")
	private WebElement bState3;

	@FindBy(xpath="//*[@id=\\'chgtype:table:2:cityname_input']")
	private WebElement bCity3;
	
	@FindBy(xpath="//*[@id=\\'chgtype:table:2:j_idt305']")
	private WebElement bPincode3;

	@FindBy(xpath="//*[@id=\\'chgtype:table:2:contactId']")
	private WebElement bCntactpersn3;
	
	@FindBy(xpath="//*[@id=\\'chgtype:table:2:j_idt330']")
	private WebElement bTelephone3;
	
	@FindBy(xpath="//*[@id=\\'chgtype:table:2:j_idt333']")
	private WebElement bmobile3;
	
	@FindBy(xpath="//*[@id=\\'chgtype:table:2:emiId']")
	private WebElement bEmail3;
   
	@FindBy(xpath="//*[@id=\\'chgtype:table:2:j_idt338']")
	private WebElement bTallyName3;
	
	@FindBy(xpath="//*[@id='chgtype:tabviewid:table:2:j_idt330_input']")
	private WebElement bHedrLogo3;
	
	@FindBy(xpath="//*[@id='chgtype:tabviewid:table:2:removePhotoId']")
	private WebElement clrHedrLogo3;
	@FindBy(xpath="//*[@id='chgtype:tabviewid:table:2:removePhotoIdForFooter]")
	private WebElement clrFtrLogo3;
	
	@FindBy(xpath="//*[@id='chgtype:tabview:table:2:j_idt338_label']")
	private WebElement bFtrLogo3;

	@FindBy(xpath="//*[@id='chgtype:tabviewid:tallyserver]")
	private WebElement cmnyTallyIP;
	
	



	@FindBy(xpath="/html/body/div[1]/div[3]/div[2]/form[1]/div/div/div[2]/div/div[2]/table/tbody/tr/td[1]/button/span[1]")
	private WebElement t3Next;
	

	@FindBy(xpath="/html/body/div[1]/div[3]/div[2]/form[1]/div/div/div[2]/div/div[2]/table/tbody/tr/td[2]/button/span[1]")
	private WebElement t3Prev;
	@FindBy(xpath="/html/body/div[1]/div[3]/div[2]/form[1]/div/div/div[2]/div/div[2]/table/tbody/tr/td[3]/button/span[1]")
	private WebElement t3Reset;
	
	//Tab 4 

	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:tab4id']")
	private WebElement Tab4;


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

	@FindBy(xpath="\"/html/body/div[1]/div[3]/div[2]/form[1]/div/div/div/div[2]/table/tbody/tr/td[1]button/span[1]")
	private WebElement t4Next;

	@FindBy(xpath="/html/body/div[1]/div[3]/div[2]/form[1]/div/div/div/div[2]/table/tbody/tr/td[2]button/span[1]")
	private WebElement t4Prev;

	@FindBy(xpath="//*[@id='chgtype:tabviewid:tab5id]")
	private WebElement Tab5;

	@FindBy(xpath= "/html/body/div[1]/div[3]/div[2]/form[1]/div/div/div/div[2]/table/tbody/tr/td[1]/button/span[1]")

	private WebElement t5Prev;

	@FindBy(xpath= "/html/body/div[1]/div[3]/div[2]/form[1]/div/div/div/div[2]/table/tbody/tr/td[2]button/span[1]")
	private WebElement submit;
	
	@FindBy(xpath="//*[@id='notifi:confirmyesbuttonid']")
	private WebElement yes;

	@FindBy(xpath="//*[@id='notifi:j_idt26']")
	private WebElement no;

	public String getPageUrl() {
		return pageUrl;
	}

	public WebElement getCmpnyName() {
		return cmpnyName;
	}

	public WebElement getTab1() {
		return Tab1;
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

	public WebElement getCenterlExceriseNo() {
		return centerlExceriseNo;
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

	public WebElement getGSTIN() {
		return GSTIN;
	}

	public WebElement getCurrency() {
		return Currency;
	}

	public WebElement getWebSite1() {
		return WebSite1;
	}

	public WebElement getPhoneNo() {
		return phoneNo;
	}

	public WebElement getCmpnyPrefix() {
		return cmpnyPrefix;
	}

	public WebElement getEffecDate() {
		return effecDate;
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

	public WebElement getTab2() {
		return Tab2;
	}

	public WebElement getVatNo() {
		return VatNo;
	}

	public WebElement getRange() {
		return Range;
	}

	public WebElement getSeviceTaxNo() {
		return seviceTaxNo;
	}

	public WebElement getCINno() {
		return CINno;
	}

	public WebElement getCommisionRate() {
		return CommisionRate;
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

	public WebElement getTab3() {
		return Tab3;
	}

	public WebElement getbClr1() {
		return bClr1;
	}

	public WebElement getbSite1() {
		return bSite1;
	}

	public WebElement getbSite1Name1() {
		return bSite1Name1;
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

	public WebElement getbSite2() {
		return bSite2;
	}

	public WebElement getbSite2Name2() {
		return bSite2Name2;
	}

	public WebElement getbGSTNO2() {
		return bGSTNO2;
	}

	public WebElement getbPrefix2() {
		return bPrefix2;
	}

	public WebElement getB2Addres1() {
		return b2Addres1;
	}

	public WebElement getB2Address2() {
		return b2Address2;
	}

	public WebElement getbState2() {
		return bState2;
	}

	public WebElement getbCity2() {
		return bCity2;
	}

	public WebElement getbPincode2() {
		return bPincode2;
	}

	public WebElement getbCntactpersn2() {
		return bCntactpersn2;
	}

	public WebElement getbTelephone2() {
		return bTelephone2;
	}

	public WebElement getBmobile2() {
		return bmobile2;
	}

	public WebElement getbEmail2() {
		return bEmail2;
	}

	public WebElement getbTallyName2() {
		return bTallyName2;
	}

	public WebElement getbHedrLogo2() {
		return bHedrLogo2;
	}

	public WebElement getClrHedrLogo2() {
		return clrHedrLogo2;
	}

	public WebElement getClrFtrLogo2() {
		return clrFtrLogo2;
	}

	public WebElement getbFtrLogo2() {
		return bFtrLogo2;
	}

	public WebElement getbClr3() {
		return bClr3;
	}

	public WebElement getbSite3() {
		return bSite3;
	}

	public WebElement getbSite3Name3() {
		return bSite3Name3;
	}

	public WebElement getbGSTNO3() {
		return bGSTNO3;
	}

	public WebElement getbPrefix3() {
		return bPrefix3;
	}

	public WebElement getB3Addres1() {
		return b3Addres1;
	}

	public WebElement getB3Address2() {
		return b3Address2;
	}

	public WebElement getbState3() {
		return bState3;
	}

	public WebElement getbCity3() {
		return bCity3;
	}

	public WebElement getbPincode3() {
		return bPincode3;
	}

	public WebElement getbCntactpersn3() {
		return bCntactpersn3;
	}

	public WebElement getbTelephone3() {
		return bTelephone3;
	}

	public WebElement getBmobile3() {
		return bmobile3;
	}

	public WebElement getbEmail3() {
		return bEmail3;
	}

	public WebElement getbTallyName3() {
		return bTallyName3;
	}

	public WebElement getbHedrLogo3() {
		return bHedrLogo3;
	}

	public WebElement getClrHedrLogo3() {
		return clrHedrLogo3;
	}

	public WebElement getClrFtrLogo3() {
		return clrFtrLogo3;
	}

	public WebElement getbFtrLogo3() {
		return bFtrLogo3;
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

	public WebElement getTab4() {
		return Tab4;
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

	public WebElement getTab5() {
		return Tab5;
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

