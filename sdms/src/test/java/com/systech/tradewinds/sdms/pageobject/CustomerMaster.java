package com.systech.tradewinds.sdms.pageobject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.systech.tradewinds.sdms.common.BasePage;

public class CustomerMaster extends BasePage {

public CustomerMaster() {
	PageFactory.initElements(driver, this);
}

private final static String pageUrl = "http://localhost:8081/SDMS/pages/masters/customermaster.xhtml ";



@FindBy(xpath = "//*[@id='chgtype:tabviewid:customerNameId_input']")
private WebElement customerSearch;
@FindBy(xpath = "//a[@href='#chgtype:tabviewid:GeneralinfoId']")
private WebElement Generalinfo;
@FindBy(xpath = "//input[@id='chgtype:tabviewid:customerId']")
private WebElement cusName;
@FindBy(xpath = "//input[@id='chgtype:tabviewid:codeId']")
private WebElement cusCode;

@FindBy(xpath = "//input[@id='chgtype:tabviewid:printnameId']")
private WebElement printName;

@FindBy(xpath = "//select[@id='chgtype:tabviewid:custypeId_input']")
private WebElement company;
@FindBy(xpath = "//input[@id='chgtype:tabviewid:customerAliasId']")
private WebElement cusAlias;
@FindBy(xpath = "//select[@id='chgtype:tabviewid:typeId_input']")
private WebElement gstClass;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:underCustomerId_input']")
private WebElement underCustomer;
@FindBy(xpath = "//*[@id='chgtype:tabviewid:phoneId']")
private WebElement cusPhone;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:grpNameId_input']")
private WebElement cusGroup;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:address1Id']")
private WebElement address1;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:address2Id']")
private WebElement address2;
@FindBy(xpath = "//*[@id='chgtype:tabviewid:faxId']")
private WebElement fax;


@FindBy(xpath = "//*[id='chgtype:tabviewid:pannoId']")
private WebElement PAN;
@FindBy(xpath = "//*[id='chgtype:tabviewid:websiteId']")
private WebElement website;
@FindBy(xpath = "//input[@id='chgtype:tabviewid:gstinId']")
private WebElement GSTIN;
@FindBy(xpath = "//input[@id='chgtype:tabviewid:openbalId_input']")
private WebElement t1OB;

@FindBy(xpath = "//input[@id='chgtype:tabviewid:pincodeId2']")
private WebElement pinCode;

@FindBy(xpath = "//select[@id='chgtype:tabviewid:continentId_input']")
private WebElement continent;
@FindBy(xpath = "//select[@id='chgtype:tabviewid:countryId_input']")
private WebElement country;
@FindBy(xpath = "//select[@id='chgtype:tabviewid:stateId_input']")
private WebElement state;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:cityId_input']")
private WebElement city;
@FindBy(xpath = "//textarea[@id='chgtype:tabviewid:remarkId']")
private WebElement remarks;

@FindBy(xpath = "//select[@id='chgtype:tabviewid:paymentTermId_input']")
private WebElement t1PayTerm;

@FindBy(xpath = "//select[@id='chgtype:tabviewid:currencyId_input']")
private WebElement currency;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:creditValueId_input']")
private WebElement creditValue;
@FindBy(xpath = "//*[@id='chgtype:tabviewid:creditDaysId_input']")
private WebElement creditDays;


@FindBy(xpath = "//*[@id='chgtype:tabviewid:j_idt108']")
private WebElement t1Next;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:j_idt109']")

private WebElement t1Reset;

@FindBy(xpath = "//a[@href='#chgtype:tabviewid:BranchinfoId']")
private WebElement Branchinfo;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:contactPersonId']")
private WebElement CntPsn1;
@FindBy(xpath = "//*[@id='id='chgtype:tabviewid:desig1Id']")
private WebElement CpDes1;

@FindBy(xpath = "//input[@id='chgtype:tabviewid:mobileId1']")
private WebElement CpMob1;

@FindBy(xpath = "//*[@id='id='chgtype:tabviewid:emailId1']")
private WebElement CpMail1;
@FindBy(xpath = "//*[@id='chgtype:tabviewid:contactPersonId2']")
private WebElement CntPsn2;
@FindBy(xpath = "//*[@id='id='chgtype:tabviewid:desig2Id']")
private WebElement CpDes2;

@FindBy(xpath = "//input[@id='chgtype:tabviewid:mobileId2']")
private WebElement CpMob2;

@FindBy(xpath = "//*[@id='id='chgtype:tabviewid:emailId3']")
private WebElement CpMail2;
@FindBy(xpath = "//*[@id='chgtype:tabviewid:contactPersonId2']")
private WebElement CntPsn3;
@FindBy(xpath = "//*[@id='id='chgtype:tabviewid:desig3Id']")
private WebElement CpDes3;

@FindBy(xpath = "//input[@id='chgtype:tabviewid:mobileId2']")
private WebElement CpMob3;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:emailId3']")
private WebElement CpMail3;


@FindBy(xpath = "//*[@id='chgtype:tabviewid:table:0:locationId']")
private WebElement BrchLocation0;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:table:0:addressId']")
private WebElement Brchaddress0;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:table:0:statenameId_input']")
private WebElement BrchState0;
@FindAll(@FindBy(xpath = "//*[@id='chgtype:tabviewid:table:0:statenameId_panel']"))
private List<WebElement> BrchStaeSugg0;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:table:0:custSuggest_input']")
private WebElement BrchCity0;
@FindAll(@FindBy(xpath = "//*[@id='chgtype:tabviewid:table:0:custSuggest_panel']"))

private List<WebElement> BrchCitySugg0;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:table:0:pincodeId']")
private WebElement BrchPincode0;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:table:0:contactPersonId']")
private WebElement  BrchCntPrsn0;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:table:0:mobileNoId']")
private WebElement BrchMobile0;

@FindBy(xpath = "//*[@id='id='chgtype:tabviewid:table:0:PhoneId']")
private WebElement BrchPhone0;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:table:0:faxId']")
private WebElement  BrchFax0;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:table:0:emailId']")
private WebElement BrchEmail0;




@FindBy(xpath = "//*[@id='chgtype:tabviewid:table:1:gstinbranchId']")
private WebElement  BrchGST0;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:j_idt148']")
private WebElement t2Next;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:j_idt150']")
private WebElement t2Prev;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:j_idt149']")
private WebElement t2Reset;

@FindBy(xpath = "//a[@href='#chgtype:tabviewid:ProfileinfoId']")
private WebElement Profileinfo;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:j_idt161']")
private WebElement t3Next;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:ProfileinfoCommandBackId']")
private WebElement t3Prev;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:j_idt162']")
private WebElement t3Reset;

@FindBy(xpath = "//a[@href='#chgtype:tabviewid:ViewInfoId']")
private WebElement ViewInfo;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:j_idt290']")
private WebElement t4Next;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:j_idt290']")
private WebElement t4Prev;

@FindBy(xpath = "//a[@href='#chgtype:tabviewid:CustomerInfoId']")
private WebElement CustomerInfo;


@FindBy(xpath = "//*[@id='chgtype:tabviewid:itemTable:0:productCodeId']")
private WebElement CustPartno0;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:itemTable:0:itemSuggest_input']")
private WebElement  CusItem0;

@FindAll(@FindBy(xpath = "//*[@id='chgtype:tabviewid:itemTable:0:itemSuggest_panel']"))
private List<WebElement> CustItemSugg0;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:itemTable:0:partSuggest_input']")
private WebElement CustMakePartno0;
@FindAll(@FindBy(xpath = "//*[@id='chgtype:tabviewid:itemTable:0:makeSuggest_panel']"))
private List<WebElement> CustMakepartSugg0;


@FindBy(xpath = "//*[@id='chgtype:tabviewid:itemTable:0:makeSuggest_input']")
private WebElement CustMake0;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:itemTable:0:rateTableId_input']")
private WebElement  CustRate0;


@FindBy(xpath = "//*[@id='chgtype:tabviewid:itemTable:0:deletelink']")
private WebElement  CustDelete0;


@FindBy(xpath = "//*[@id='chgtype:tabviewid:j_idt323']")
private WebElement t5Next;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:j_idt325']")
private WebElement t5Prev;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:j_idt324']")
private WebElement t5Reset;

@FindBy(xpath = "//a[@href='#chgtype:tabviewid:CustwarehouseInfoId']")
private WebElement CustwarehouseInfo;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:customerWarehouseTable:0:deletelink']")
private WebElement CusWardelete0;


@FindBy(xpath = "//*[@id='chgtype:tabviewid:customerWarehouseTable:0:branchNameId_input']")
private WebElement CusWarBrch0;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:customerWarehouseTable:0:warehouseCodeId']")
private WebElement CustWarCode;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:customerWarehouseTable:0:warehouseCodeId']")
private WebElement CustWarName;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:customerWarehouseTable:0:warehouseRemarks']")
private WebElement CustWarRemark;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:j_idt354']")
private WebElement t6Next;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:j_idt356']")
private WebElement t6Prev;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:j_idt355']")
private WebElement t6Reset;

@FindBy(xpath = "//a[@href='#chgtype:tabviewid:SalesmanInfoId']")
private WebElement SalesmanInfo;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:customerAgentTable:0:branchNameAgentId_input']")
private WebElement CustAgentBrnch0;
@FindAll(@FindBy(xpath = "//*[@id='chgtype:tabviewid:customerAgentTable:0:branchNameAgentId_panel']"))
private List<WebElement> CustAgentBrchSugg0;
@FindBy(xpath = "//*[@id='chgtype:tabviewid:customerAgentTable:0:makeSuggestAgent_input']")
private WebElement CustAgentMake0;
@FindAll(@FindBy(xpath = "//*[@id='chgtype:tabviewid:customerAgentTable:0:makeSuggestAgent_panel']"))
private List<WebElement> CustAgentMakeSugg0;
@FindBy(xpath = "//*[@id='chgtype:tabviewid:customerAgentTable:0:makeSuggestAgent_hinput']")
private WebElement CustAgent0;
@FindAll(@FindBy(xpath = "//*[@id='chgtype:tabviewid:customerAgentTable:0:employeeSuggest_panel']"))
private List<WebElement> CustAgentSugg0;
@FindBy(xpath = "//*[@id='chgtype:tabviewid:customerAgentTable:0:paymentSuggest_input']")
private WebElement CustAgentPayterm0;
@FindAll(@FindBy(xpath = "//*[@id='chgtype:tabviewid:customerAgentTable:0:paymentSuggest_panel']"))
private List<WebElement> CustAgentPaytermSugg0;
@FindBy(xpath = "//*[@id='chgtype:tabviewid:customerAgentTable:0:paymentSuggest_input']")
private WebElement CustAgentIncentive0;
@FindBy(xpath = "//*[@id='chgtype:tabviewid:customerAgentTable:0:deletelink']")
private WebElement CusAgentdelete0;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:j_idt379']")
private WebElement t7Next;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:j_idt381']")
private WebElement t7Prev;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:j_idt380']")
private WebElement t7Reset;

@FindBy(xpath = "//a[@href='#chgtype:tabviewid:OpeningsInfoId']")
private WebElement OpeningsInfo;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:billWiseId_input']")
private WebElement TrackBill;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:openingBalanceId_input']")
private WebElement openingBalance;


@FindBy(xpath = "//*[@id='chgtype:tabviewid:customerOpeningTable:0:j_idt392_input']")
private WebElement CustOpnInvoiceNo0;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:customerOpeningTable:0:invoiceDateId_input']")
private WebElement CustOpnInvoiceDate0;
@FindAll(@FindBy(xpath = "//*[@id='chgtype:tabviewid:customerAgentTable:0:invoiceDateId_panel']"))
private List<WebElement> CustOpnInvoiceDateSugg0;
@FindBy(xpath = "//*[@id='chgtype:tabviewid:customerOpeningTable:0:j_idt394_input']")
private WebElement CustBillValue0;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:customerOpeningTable:0:j_idt396_input']")
private WebElement CustOutStandValue0;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:customerOpeningTable:0:dueDateId_input']")
private WebElement CustDueDate0;
@FindAll(@FindBy(xpath = "//*[@id='chgtype:tabviewid:customerAgentTable:0:dueDateId_panel']"))
private List<WebElement> CustDueDateSugg0;
@FindBy(xpath = "//*[@id='chgtype:tabviewid:j_idt400']")
private WebElement t8Reset;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:j_idt399']")
private WebElement t8Next;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:j_idt401']")
private WebElement t8Prev;

@FindBy(xpath = "//a[@href='#chgtype:tabviewid:AttchmentInfoId']")
private WebElement AttchmentInfo;

@FindBy(xpath = "////*[@id='chgtype:tabviewid:objectUploadnew_input']")
private WebElement CustDoc;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:removeDocId']")
private WebElement clrCustDoc;



@FindBy(xpath = "//*[@id='chgtype:tabviewid:j_idt409']")
private WebElement Submit;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:j_idt408']")
private WebElement t9Prev;

public static String getPageurl() {
	return pageUrl;
}

public WebElement getCustomerSearch() {
	return customerSearch;
}

public WebElement getGeneralinfo() {
	return Generalinfo;
}

public WebElement getCusName() {
	return cusName;
}

public WebElement getCusCode() {
	return cusCode;
}

public WebElement getPrintName() {
	return printName;
}

public WebElement getCompany() {
	return company;
}

public WebElement getCusAlias() {
	return cusAlias;
}

public WebElement getGstClass() {
	return gstClass;
}

public WebElement getUnderCustomer() {
	return underCustomer;
}

public WebElement getCusPhone() {
	return cusPhone;
}

public WebElement getCusGroup() {
	return cusGroup;
}

public WebElement getAddress1() {
	return address1;
}

public WebElement getAddress2() {
	return address2;
}

public WebElement getFax() {
	return fax;
}

public WebElement getPAN() {
	return PAN;
}

public WebElement getWebsite() {
	return website;
}

public WebElement getGSTIN() {
	return GSTIN;
}

public WebElement getT1OB() {
	return t1OB;
}

public WebElement getPinCode() {
	return pinCode;
}

public WebElement getContinent() {
	return continent;
}

public WebElement getCountry() {
	return country;
}

public WebElement getState() {
	return state;
}

public WebElement getCity() {
	return city;
}

public WebElement getRemarks() {
	return remarks;
}

public WebElement getT1PayTerm() {
	return t1PayTerm;
}

public WebElement getCurrency() {
	return currency;
}

public WebElement getCreditValue() {
	return creditValue;
}

public WebElement getCreditDays() {
	return creditDays;
}

public WebElement getT1Next() {
	return t1Next;
}

public WebElement getT1Reset() {
	return t1Reset;
}

public WebElement getBranchinfo() {
	return Branchinfo;
}

public WebElement getCntPsn1() {
	return CntPsn1;
}

public WebElement getCpDes1() {
	return CpDes1;
}

public WebElement getCpMob1() {
	return CpMob1;
}

public WebElement getCpMail1() {
	return CpMail1;
}

public WebElement getCntPsn2() {
	return CntPsn2;
}

public WebElement getCpDes2() {
	return CpDes2;
}

public WebElement getCpMob2() {
	return CpMob2;
}

public WebElement getCpMail2() {
	return CpMail2;
}

public WebElement getCntPsn3() {
	return CntPsn3;
}

public WebElement getCpDes3() {
	return CpDes3;
}

public WebElement getCpMob3() {
	return CpMob3;
}

public WebElement getCpMail3() {
	return CpMail3;
}

public WebElement getBrchLocation0() {
	return BrchLocation0;
}

public WebElement getBrchaddress0() {
	return Brchaddress0;
}

public WebElement getBrchState0() {
	return BrchState0;
}

public List<WebElement> getBrchStaeSugg0() {
	return BrchStaeSugg0;
}

public WebElement getBrchCity0() {
	return BrchCity0;
}

public List<WebElement> getBrchCitySugg0() {
	return BrchCitySugg0;
}

public WebElement getBrchPincode0() {
	return BrchPincode0;
}

public WebElement getBrchCntPrsn0() {
	return BrchCntPrsn0;
}

public WebElement getBrchMobile0() {
	return BrchMobile0;
}

public WebElement getBrchPhone0() {
	return BrchPhone0;
}

public WebElement getBrchFax0() {
	return BrchFax0;
}

public WebElement getBrchEmail0() {
	return BrchEmail0;
}

public WebElement getBrchGST0() {
	return BrchGST0;
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

public WebElement getProfileinfo() {
	return Profileinfo;
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

public WebElement getViewInfo() {
	return ViewInfo;
}

public WebElement getT4Next() {
	return t4Next;
}

public WebElement getT4Prev() {
	return t4Prev;
}

public WebElement getCustomerInfo() {
	return CustomerInfo;
}

public WebElement getCustPartno0() {
	return CustPartno0;
}

public WebElement getCusItem0() {
	return CusItem0;
}

public List<WebElement> getCustItemSugg0() {
	return CustItemSugg0;
}

public WebElement getCustMakePartno0() {
	return CustMakePartno0;
}

public List<WebElement> getCustMakepartSugg0() {
	return CustMakepartSugg0;
}

public WebElement getCustMake0() {
	return CustMake0;
}

public WebElement getCustRate0() {
	return CustRate0;
}

public WebElement getCustDelete0() {
	return CustDelete0;
}

public WebElement getT5Next() {
	return t5Next;
}

public WebElement getT5Prev() {
	return t5Prev;
}

public WebElement getT5Reset() {
	return t5Reset;
}

public WebElement getCustwarehouseInfo() {
	return CustwarehouseInfo;
}

public WebElement getCusWardelete0() {
	return CusWardelete0;
}

public WebElement getCusWarBrch0() {
	return CusWarBrch0;
}

public WebElement getCustWarCode() {
	return CustWarCode;
}

public WebElement getCustWarName() {
	return CustWarName;
}

public WebElement getCustWarRemark() {
	return CustWarRemark;
}

public WebElement getT6Next() {
	return t6Next;
}

public WebElement getT6Prev() {
	return t6Prev;
}

public WebElement getT6Reset() {
	return t6Reset;
}

public WebElement getSalesmanInfo() {
	return SalesmanInfo;
}

public WebElement getCustAgentBrnch0() {
	return CustAgentBrnch0;
}

public List<WebElement> getCustAgentBrchSugg0() {
	return CustAgentBrchSugg0;
}

public WebElement getCustAgentMake0() {
	return CustAgentMake0;
}

public List<WebElement> getCustAgentMakeSugg0() {
	return CustAgentMakeSugg0;
}

public WebElement getCustAgent0() {
	return CustAgent0;
}

public List<WebElement> getCustAgentSugg0() {
	return CustAgentSugg0;
}

public WebElement getCustAgentPayterm0() {
	return CustAgentPayterm0;
}

public List<WebElement> getCustAgentPaytermSugg0() {
	return CustAgentPaytermSugg0;
}

public WebElement getCustAgentIncentive0() {
	return CustAgentIncentive0;
}

public WebElement getCusAgentdelete0() {
	return CusAgentdelete0;
}

public WebElement getT7Next() {
	return t7Next;
}

public WebElement getT7Prev() {
	return t7Prev;
}

public WebElement getT7Reset() {
	return t7Reset;
}

public WebElement getOpeningsInfo() {
	return OpeningsInfo;
}

public WebElement getTrackBill() {
	return TrackBill;
}

public WebElement getOpeningBalance() {
	return openingBalance;
}

public WebElement getCustOpnInvoiceNo0() {
	return CustOpnInvoiceNo0;
}

public WebElement getCustOpnInvoiceDate0() {
	return CustOpnInvoiceDate0;
}

public List<WebElement> getCustOpnInvoiceDateSugg0() {
	return CustOpnInvoiceDateSugg0;
}

public WebElement getCustBillValue0() {
	return CustBillValue0;
}

public WebElement getCustOutStandValue0() {
	return CustOutStandValue0;
}

public WebElement getCustDueDate0() {
	return CustDueDate0;
}

public List<WebElement> getCustDueDateSugg0() {
	return CustDueDateSugg0;
}

public WebElement getT8Reset() {
	return t8Reset;
}

public WebElement getT8Next() {
	return t8Next;
}

public WebElement getT8Prev() {
	return t8Prev;
}

public WebElement getAttchmentInfo() {
	return AttchmentInfo;
}

public WebElement getCustDoc() {
	return CustDoc;
}

public WebElement getClrCustDoc() {
	return clrCustDoc;
}

public WebElement getSubmit() {
	return Submit;
}

public WebElement getT9Prev() {
	return t9Prev;
}














}























