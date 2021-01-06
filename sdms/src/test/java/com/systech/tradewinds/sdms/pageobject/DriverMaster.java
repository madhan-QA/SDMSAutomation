package com.systech.tradewinds.sdms.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.systech.tradewinds.sdms.common.BasePage;

public class DriverMaster extends BasePage {
	public DriverMaster() {

		PageFactory.initElements(driver, this);
	}

	// Url
	private String pageUrl = "http://localhost:8081/SDMS/pages/masters/DriverMaster.xhtml ";

	@FindBy(xpath = "//*[@id='inform:j_idt13:drivernamne']")
	private WebElement driverName;
	@FindBy(xpath = "//textarea[@id='inform:j_idt13:residentaddrsid']")
	private WebElement resAddress;
	@FindBy(xpath = "//*[@id='inform:j_idt13:contactnum1']")
	private WebElement contactPerson1;

	@FindBy(xpath = "//*[@id='inform:j_idt13:contactnum2']")
	private WebElement contactPerson2;

	@FindBy(xpath = "//*[@id='inform:j_idt13:licenseno']")
	private WebElement licenseNo;

	
	@FindBy(xpath = "//*[@id='inform:j_idt13:licenseValiduptoid_input']")
	private WebElement licenseValupto;
	@FindBy(xpath = "//*[@id='inform:j_idt13:batchvalidityuptoid_input'")

	private WebElement batchValupto;

	@FindBy(xpath = "//textarea[@id='inform:j_idt13:remarksid']")
	private WebElement Remarks;
	@FindBy(xpath = "//*[@id='inform:j_idt18:submit']")
	private WebElement reset;
	@FindBy(xpath = "//*[@id='inform:j_idt18:reset']")
	private WebElement submit;
	@FindBy(xpath = "//*[@id='notifi:confirmyesbuttonid']")
	private WebElement yes;

	@FindBy(xpath = "//*[@id='notifi:j_idt26']")
	private WebElement no;
	
	@FindBy(xpath = "//*[@id='notifi:alertbuttonid']")
	private WebElement ok;

	public WebElement getok() {
		return ok;
	}

	public String getPageUrl() {
		return pageUrl;
	}

	public WebElement getdriverName() {
		return driverName;
	}

	public WebElement getresAddress() {
		return resAddress;
	}

	public WebElement getcontactPerson1() {
		return contactPerson1;
	}

	public WebElement getcontactPerson2() {
		return contactPerson2;
	}

	public WebElement getlicenseNo() {
		return licenseNo;
	}

	public WebElement getlicenseValupto() {
		return licenseValupto;
	}

	public WebElement getbatchValupto() {
		return batchValupto;
	}

	public WebElement getRemarks() {
		return Remarks;
	}

	public WebElement getReset() {
		return reset;
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
