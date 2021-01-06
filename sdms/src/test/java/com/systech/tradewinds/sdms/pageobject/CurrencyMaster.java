package com.systech.tradewinds.sdms.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.systech.tradewinds.sdms.common.BasePage;

public class CurrencyMaster extends BasePage{

	public CurrencyMaster() {
		PageFactory.initElements(driver, this);
	}

	// Url
	private String pageUrl = "http://localhost:8081/SDMS/pages/masters/currencymaster.xhtml ";

	
	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:currencyid']")
	private WebElement currencycode;
	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:currencynameid']")
	private WebElement currencyname;
	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:fractionid']")
	private WebElement fractnunit;
	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:fractionnoid_input']")
	private WebElement Nooffractn;
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

	
	public String getPageUrl() {
		return pageUrl;
	}

	public WebElement getcurrencyname() {
		return currencyname;
	}

	public WebElement getfractnunit() {
		return fractnunit;
	}

	public WebElement getNooffractn() {
		return Nooffractn;
	}
	public WebElement getcurrencycode() {
		return currencycode;
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

