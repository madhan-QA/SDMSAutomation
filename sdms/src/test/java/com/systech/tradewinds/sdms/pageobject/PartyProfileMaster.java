package com.systech.tradewinds.sdms.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.systech.tradewinds.sdms.common.BasePage;

public class PartyProfileMaster extends BasePage {

	public PartyProfileMaster() {
		PageFactory.initElements(driver, this);
	}

	// Url
	private String pageUrl = "http://localhost:8081/SDMS/pages/masters/profilemaster.xhtml ";


	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:profile_label")
	private WebElement profiletype;
	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:profileTypeName_label']")
	private WebElement type;
	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:profileName']")
	private WebElement profilename;
	
	
	@FindBy(xpath= "//*[@id=\'chgtype:tabviewid:remarksId']")
	private WebElement remarks;
	@FindBy(xpath= "//*[@id=\'chgtype:tabViewId:j_idt27\']")
	private WebElement reset;
	@FindBy(xpath= "//*[@id=\'chgtype:tabViewId:j_idt27\']")
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

	public WebElement getprofiletype() {
		return profiletype;
	}

	public WebElement gettype() {
		return type;
	}
	public WebElement getprofilename() {
		return profilename;
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
	
	public WebElement getok() {
		return ok;
	}






}

