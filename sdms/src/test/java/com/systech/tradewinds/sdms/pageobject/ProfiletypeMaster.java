package com.systech.tradewinds.sdms.pageobject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.systech.tradewinds.sdms.common.BasePage;

public class ProfiletypeMaster  extends BasePage {

	public ProfiletypeMaster() {
		PageFactory.initElements(driver, this);
	}

	// Url
	private String pageUrl = "http://localhost:8081/SDMS/pages/masters/profiletypemaster.xhtml ";


	@FindBy(xpath="//*[@id=\'chgtype:tabViewId:profileName']")
	private WebElement profiletype;
	@FindBy(xpath="//*[@id=\'chgtype:tabViewId:profileType_input']")
	private WebElement type;

	@FindBy(xpath= "//*[@class=\'ui-selectonemenu-item ui-selectonemenu-list-item ui-corner-all ui-state-highlight\']")
	private List<WebElement> list;


	@FindBy(xpath= "//*[@id=\'chgtype:tabViewId:remarksId']")
	private WebElement remarks;
	@FindBy(xpath= "//*[@id='chgtype:tabViewId:j_idt28']")
	private WebElement reset;
	@FindBy(xpath= "//*[@id=chgtype:tabViewId:j_idt29']")
	private WebElement submit;
	@FindBy(xpath="//*[@id='notifi:confirmyesbuttonid']")
	private WebElement yes;

	@FindBy(xpath="//*[@id='notifi:j_idt26']")
	private WebElement no;
	@FindBy(xpath="//*[@id='notifi:alertbuttonid']")
	private WebElement Ok;


	public String getPageUrl() {
		return pageUrl;
	}

	public WebElement getprofiletype() {
		return profiletype;
	}

	public WebElement gettype() {
		return type;
	}
	public List<WebElement> getlist() {
		return list;
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

	public WebElement getOk() {
		return Ok;
	}






}

