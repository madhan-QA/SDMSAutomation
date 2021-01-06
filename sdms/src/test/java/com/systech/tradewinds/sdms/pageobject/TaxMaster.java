package com.systech.tradewinds.sdms.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.systech.tradewinds.sdms.common.BasePage;

public class TaxMaster extends BasePage {
	public TaxMaster() {

		PageFactory.initElements(driver, this);
	}

	// Url
	private String pageUrl = "http://localhost:8081/SDMS/pages/masters/TaxMaster.xhtml";
	@FindBy(xpath = "//*[@id=\'chgtype:tabviewid:taxid']")
	private WebElement taxname;
	
	@FindBy(xpath = "//*[@id='chgtype:tabviewid:typeid:0']/following::span[1]")
	private WebElement typeProduct;
	@FindBy(xpath = "//*[@id='chgtype:tabviewid:typeid:1']/following::span[1]")
	private WebElement typeService;

	@FindBy(xpath = "//*[@id=\'chgtype:tabviewid:taxCategoryid_input']")
	private WebElement typetax;

	// if tax type is Gst

	@FindBy(xpath = "//*[@id=\'chgtype:tabviewid:gstsubtypeid_input']")
	private WebElement taxGSTsubtype;

	// if tax type is VAT
	@FindBy(xpath = "//select[@id=\'chgtype:tabviewid:vatsubtypeid_input']")
	private WebElement taxVATsubtype;
	@FindBy(xpath = "//*[@id=\'chgtype:tabviewid:vatcstid_input']")
	private WebElement vatClass;

	// if tax type is CST
	@FindBy(xpath = "//*[@id=\'chgtype:tabviewid:vatcstid_input']")
	private WebElement cstClass;

	// if tax type is Service
	@FindBy(xpath = "//*[@id=\'chgtype:tabviewid:vatcstid_input']")
	private WebElement taxHead;
	@FindBy(xpath = "//*[@id=\'chgtype:tabviewid:ordQty']")
	private WebElement taxPercentage;
	@FindBy(xpath = "//*[@id=\'chgtype:tabviewid:remarksId']")
	private WebElement remarks;
	private WebElement reset;
	@FindBy(xpath = "//*[@id=\'chgtype:tabviewid:submitId']")
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

	public WebElement getTaxname() {
		return taxname;
	}

	public WebElement getTaxPercentage() {
		return taxPercentage;
	}

	public WebElement getTypeProduct() {
		return typeProduct;
	}

	public WebElement getTypeService() {
		return typeService;
	}

	public WebElement getTypetax() {
		return typetax;
	}

	public WebElement getTaxGSTsubtype() {
		return taxGSTsubtype;
	}

	public WebElement getTaxVATsubtype() {
		return taxVATsubtype;
	}

	public WebElement getVatClass() {
		return vatClass;
	}

	public WebElement getCstClass() {
		return cstClass;
	}

	public WebElement getTaxHead() {
		return taxHead;
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

	public WebElement getYes() {
		return yes;
	}

	public WebElement getNo() {
		return no;
	}

}
