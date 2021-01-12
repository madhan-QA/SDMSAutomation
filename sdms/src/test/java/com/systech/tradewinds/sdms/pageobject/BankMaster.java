package com.systech.tradewinds.sdms.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.systech.tradewinds.sdms.common.BasePage;

public class BankMaster extends BasePage {
	public BankMaster() {
		PageFactory.initElements(driver, this);
	}
	 
	//Bankmaster Url
	private String pageUrl = "http://localhost:8081/SDMS/pages/masters/BankMaster.xhtml ";
	public String getPageUrl() {
		return pageUrl;
	}
	
	
	
	@FindBy(xpath = "//input[@id='chgtype:tabviewid:beneficiary']")
	private WebElement  benfiryname;
		@FindBy(xpath = "//input[@id='chgtype:tabviewid:accountno']")
	private WebElement accno;
	@FindBy(xpath= "//input[@id='chgtype:tabviewid:bankname']")
	private WebElement bankAlias;
	@FindBy(xpath= "//input[@id='chgtype:tabviewid:bankNameId_input']")
	private WebElement bankName;
	@FindBy(xpath = "//input[@id='chgtype:tabviewid:bankbranch']")
	private WebElement branch;
	@FindBy(xpath = "//input[@id='chgtype:tabviewid:ifsccode']")
	private WebElement ifsccode;
	@FindBy(xpath= "//input[@id='chgtype:tabviewid:swiftcode']")
	private WebElement swiftcode;
	@FindBy(xpath= "//input[@id='chgtype:tabviewid:j_idt21']")
	private WebElement remarks;
	@FindBy(xpath= "//*[@id='chgtype:tabviewid:reset']")
	private WebElement reset;
	@FindBy(xpath= "//*[@id='chgtype:tabviewid:submitId']")
	private WebElement submit;
	
	
	public WebElement getBenfiryname() {
		return benfiryname;
	}
	public WebElement getAccno() {
		return accno;
	}
	public WebElement getBankAlias() {
		return bankAlias;
	}
	
	public WebElement getBankName() {
		return bankName;
	}
	public WebElement getBranch() {
		return branch;
	}
	public WebElement getIfsccode() {
		return ifsccode;
	}
	public WebElement getSwiftcode() {
		return swiftcode;
	}
	public WebElement getRemarks() {
		return remarks;
	}
	public WebElement getReset() {
		return reset;
	}
	public WebElement getSubmit() {
		return submit;
	}


	
	
	
	
	
	


}
