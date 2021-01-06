package com.systech.tradewinds.sdms.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.systech.tradewinds.sdms.common.BasePage;

public class UomMaster extends BasePage {

	public UomMaster() {
		PageFactory.initElements(driver, this);
	}
	 
	// Url
	private String pageUrl = "http://localhost:8081/SDMS/pages/masters/UOMMaster.xhtml ";
	
	
	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:uomid']")
	private WebElement uomname;
	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:fractionid_input']")
	private WebElement acptfractn;
	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:nooffractionid_input']")
	private WebElement Nooffractn;
	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:uqcid_input']")
	private WebElement uqcode;
	
	
	
	
	
	
	@FindBy(xpath= "//*[@id=\'chgtype:tabviewid:remarksId']")
	private WebElement remarks;
	@FindBy(xpath= "//*[@id=\'chgtype:tabviewid:resetid']")
	private WebElement reset;
	@FindBy(xpath= "//*[@id=\'chgtype:tabviewid:submitId']")
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

	public WebElement getuomname() {
		return uomname;
	}

	public WebElement getacptfractn() {
		return acptfractn;
	}

	public WebElement getNooffractn() {
		return Nooffractn;
	}
	public WebElement getuqcode() {
		return uqcode;
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

