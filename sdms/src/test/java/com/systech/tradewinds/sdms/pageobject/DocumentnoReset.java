package com.systech.tradewinds.sdms.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.systech.tradewinds.sdms.common.BasePage;

public class DocumentnoReset extends BasePage{

	public DocumentnoReset() {
		PageFactory.initElements(driver, this);
	}

	// Url
	private String pageUrl = "http://localhost:8081/SDMS/pages/masters/DocumentPrintResetMaster.xhtml ";


	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:documentnameid_label")
	private WebElement Dcumntname;
	
	
	@FindBy(xpath= "//*[@id=\'chgtype:tabviewid:documentsid']")
	private WebElement DcumntNo;
	@FindBy(xpath= "/html/body/div[1]/div[3]/div[2]/form[1]/div/div/div/div[2]/table/tbody/tr/td[1]/button")
	private WebElement submit;
	@FindBy(xpath="//*[@id='notifi:confirmyesbuttonid']")
	private WebElement yes;

	@FindBy(xpath="//*[@id='notifi:j_idt26']")
	private WebElement no;

	public String getPageUrl() {
		return pageUrl;
	}

	public WebElement getDcumntname() {
		return Dcumntname;
	}

	public WebElement getDcumntNo() {
		return DcumntNo;
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



