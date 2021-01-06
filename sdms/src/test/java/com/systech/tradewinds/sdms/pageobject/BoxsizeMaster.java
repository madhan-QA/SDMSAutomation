package com.systech.tradewinds.sdms.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.systech.tradewinds.sdms.common.BasePage;

public class BoxsizeMaster extends BasePage{



	public BoxsizeMaster() {
		PageFactory.initElements(driver, this);
	}

	// Url
	private String pageUrl = "http://localhost:8081/SDMS/pages/masters/BoxSizeMaster.xhtml";


	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:height']")
	private WebElement height;
	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:breadth']")
	private WebElement width;
	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:length']")
	private WebElement length;
	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:boxvalue']")
	private WebElement boxsize;



	@FindBy(xpath= "//*[@id='chgtype:tabviewid:remarksid']")
	private WebElement remarks;
	@FindBy(xpath= "//*[@id=\'chgtype:tabviewid:j_idt26']")
	private WebElement reset;
	@FindBy(xpath= "//*[@id=\'chgtype:tabviewid:j_idt25']")
	private WebElement submit;

	@FindBy(xpath="//*[@id='notifi:confirmyesbuttonid']")
	private WebElement yes;

	@FindBy(xpath="//*[@id='notifi:j_idt26']")
	private WebElement no;
	@FindBy(xpath="//*[@id='notifi:alertbuttonid']")
	private WebElement ok;





	public String getPageUrl() {
		return pageUrl;
	}
	public WebElement getheight() {
		return height;
	}

	public WebElement getwidth() {
		return width;
	}
	public WebElement getlength() {
		return length;
	}

	public WebElement getboxsize() {
		return boxsize;
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
	}public WebElement getok() {
		return ok;
	}

	

}




