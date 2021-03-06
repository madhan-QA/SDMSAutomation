package com.systech.tradewinds.sdms.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.systech.tradewinds.sdms.common.BasePage;

public class StateMaster  extends BasePage {

	public StateMaster() {
		PageFactory.initElements(driver, this);
	}

	//Bankmaster Url
	private String pageUrl = "http://localhost:8081/SDMS/pages/masters/statemaster.xhtml ";


	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:countryid_input']")
	private WebElement countryname;
	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:stateid']")
	private WebElement statename;

	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:code']")
	private WebElement statecode;


	@FindBy(xpath= "//*[@id=\'chgtype:tabviewid:remarksId']")
	private WebElement remarks;
	@FindBy(xpath= "//*[@id=\'chgtype:tabviewid:reeset']")

	private WebElement reset;
	@FindBy(xpath= "//*[@id=\'chgtype:tabviewid:submit']")

	private WebElement submit;
	@FindBy(xpath="//*[@id='notifi:confirmyesbuttonid']")
	private WebElement yes;

	@FindBy(xpath="//*[@id='notifi:j_idt26']")
	private WebElement no;

	@FindBy(xpath="//*[@id='notifi:alertbuttonid']")
	private WebElement ok;

	public WebElement getok() {
		return ok;
	}




	public String getPageUrl() {
		return pageUrl;
	}
	public WebElement getcountryname() {
		return countryname;
	}
	public WebElement getstatename() {
		return statename;
	}

	public WebElement getstatecode() {
		return statecode;
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

