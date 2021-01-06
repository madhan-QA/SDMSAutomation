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
@FindBy(xpath = "//a[@href='#chgtype:tabviewid:tab1Id']")
private WebElement Tab1;
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

@FindBy(xpath = "//a[@href='#chgtype:tabviewid:tab2Id']")
private WebElement Tab2;

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

@FindBy(xpath = "//*[@id='chgtype:tabviewid:table:1:locationId']")
private WebElement BrchLocation1;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:table:1:addressId']")
private WebElement Brchaddress1;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:table:1:statenameId_input']")
private WebElement BrchState1;
@FindAll(@FindBy(xpath = "//*[@id='chgtype:tabviewid:table:1:statenameId_panel']"))
private List<WebElement> BrchStaeSugg1;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:table:1:custSuggest_input']")
private WebElement BrchCity1;
@FindAll(@FindBy(xpath = "//*[@id='chgtype:tabviewid:table:1:custSuggest_panel']"))

private List<WebElement> BrchCitySugg1;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:table:1:pincodeId']")
private WebElement BrchPincode1;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:table:1:contactPersonId']")
private WebElement  BrchCntPrsn1;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:table:1:mobileNoId']")
private WebElement BrchMobile1;

@FindBy(xpath = "//*[@id='id='chgtype:tabviewid:table:1:PhoneId']")
private WebElement BrchPhone1;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:table:1:faxId']")
private WebElement  BrchFax1;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:table:1:emailId']")
private WebElement BrchEmail1;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:table:2:locationId']")
private WebElement BrchLocation2;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:table:2:addressId']")
private WebElement Brchaddress2;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:table:2:statenameId_input']")
private WebElement BrchState2;
@FindAll(@FindBy(xpath = "//*[@id='chgtype:tabviewid:table:2:statenameId_panel']"))
private List<WebElement> BrchStaeSugg2;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:table:2:custSuggest_input']")
private WebElement BrchCity2;
@FindAll(@FindBy(xpath = "//*[@id='chgtype:tabviewid:table:2:custSuggest_panel']"))

private List<WebElement> BrchCitySugg2;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:table:2:pincodeId']")
private WebElement BrchPincode2;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:table:2:contactPersonId']")
private WebElement  BrchCntPrsn2;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:table:2:mobileNoId']")
private WebElement BrchMobile2;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:table:2:PhoneId']")
private WebElement BrchPhone2;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:table:2:faxId']")
private WebElement  BrchFax2;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:table:2:emailId']")
private WebElement BrchEmail2;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:j_idt148']")
private WebElement t2Next;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:j_idt150']")
private WebElement t2Prev;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:j_idt149']")
private WebElement t2Reset;

@FindBy(xpath = "//a[@href='#chgtype:tabviewid:tab3Id']")
private WebElement Tab3;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:j_idt161']")
private WebElement t3Next;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:tab3CommandBackId']")
private WebElement t3Prev;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:j_idt162']")
private WebElement t3Reset;

@FindBy(xpath = "//a[@href='#chgtype:tabviewid:tab4Id']")
private WebElement Tab4;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:j_idt290']")
private WebElement t4Next;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:j_idt290']")
private WebElement t4Prev;

@FindBy(xpath = "//a[@href='#chgtype:tabviewid:tab5Id']")
private WebElement Tab5;


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


@FindBy(xpath = "//*[@id='chgtype:tabviewid:itemTable:1:productCodeId']")
private WebElement CustPartno1;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:itemTable:1:itemSuggest_input']")
private WebElement  CusItem1;

@FindAll(@FindBy(xpath = "//*[@id='chgtype:tabviewid:itemTable:1:itemSuggest_panel']"))
private List<WebElement> CustItemSugg1;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:itemTable:1:partSuggest_input']")
private WebElement CustMakePartno1;
@FindAll(@FindBy(xpath = "//*[@id='chgtype:tabviewid:itemTable:1:makeSuggest_panel']"))
private List<WebElement> CustMakepartSugg1;


@FindBy(xpath = "//*[@id='chgtype:tabviewid:itemTable:1:makeSuggest_input']")
private WebElement CustMake1;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:itemTable:1:rateTableId_input']")
private WebElement  CustRate1;


@FindBy(xpath = "//*[@id='chgtype:tabviewid:itemTable:1:deletelink']")
private WebElement  CustDelete1;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:itemTable:2:productCodeId']")
private WebElement CustPartno2;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:itemTable:2:itemSuggest_input']")
private WebElement  CusItem2;

@FindAll(@FindBy(xpath = "//*[@id='chgtype:tabviewid:itemTable:2:itemSuggest_panel']"))
private List<WebElement> CustItemSugg2;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:itemTable:2:partSuggest_input']")
private WebElement CustMakePartno2;
@FindAll(@FindBy(xpath = "//*[@id='chgtype:tabviewid:itemTable:2:makeSuggest_panel']"))
private List<WebElement> CustMakepartSugg2;


@FindBy(xpath = "//*[@id='chgtype:tabviewid:itemTable:2:makeSuggest_input']")
private WebElement CustMake2;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:itemTable:2:rateTableId_input']")
private WebElement  CustRate2;


@FindBy(xpath = "//*[@id='chgtype:tabviewid:itemTable:2:deletelink']")
private WebElement  CustDelete2;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:j_idt323']")
private WebElement t5Next;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:j_idt325']")
private WebElement t5Prev;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:j_idt324']")
private WebElement t5Reset;

@FindBy(xpath = "//a[@href='#chgtype:tabviewid:tab6Id']")
private WebElement Tab6;

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

@FindBy(xpath = "//a[@href='#chgtype:tabviewid:tab7Id']")
private WebElement Tab7;

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

@FindBy(xpath = "//a[@href='#chgtype:tabviewid:tab8Id']")
private WebElement Tab8;

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

@FindBy(xpath = "//a[@href='#chgtype:tabviewid:tab9Id']")
private WebElement Tab9;

@FindBy(xpath = "////*[@id='chgtype:tabviewid:objectUploadnew_input']")
private WebElement CustDoc;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:removeDocId']")
private WebElement clrCustDoc;



@FindBy(xpath = "//*[@id='chgtype:tabviewid:j_idt409']")
private WebElement Submit;

@FindBy(xpath = "//*[@id='chgtype:tabviewid:j_idt408']")
private WebElement t9Prev;














}























