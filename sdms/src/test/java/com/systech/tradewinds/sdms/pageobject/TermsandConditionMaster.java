package com.systech.tradewinds.sdms.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.systech.tradewinds.sdms.common.BasePage;

public class TermsandConditionMaster extends  BasePage {



	public  TermsandConditionMaster() {
		PageFactory.initElements(driver, this);
	}

	private String pageUrl = "http://localhost:8081/SDMS/pages/masters/TermsandConditionCustomMaster.xhtml ";
	
	
		@FindBy(xpath="//*[@id=\'chgtype:tabviewid:types_input']")
	private WebElement TC;
	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:titid']")
	private WebElement Title;
	@FindBy(xpath="//input[@id=\'chgtype:tabviewid:code']")
	private WebElement Code;
	@FindBy(xpath="[@id=\'chgtype:tabviewid:decid']")
	private WebElement Description;
	
	@FindBy(xpath="[@id=\\'chgtype:tabviewid:terms1:0:Process']")
	private WebElement title1;
	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:terms1:0:j_idt28']")
	private WebElement Des1;
	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:terms1:0:deletelink']")
	private WebElement Del1;
	
	@FindBy(xpath="[@id=\\'chgtype:tabviewid:terms1:1:Process']")
	private WebElement title2;
	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:terms1:1:j_idt28']")
	private WebElement Des2;
	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:terms1:1:deletelink']")
	private WebElement Del2;
	
	@FindBy(xpath="[@id=\\'chgtype:tabviewid:terms1:2:Process']")
	private WebElement title3;
	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:terms1:2:j_idt28']")
	private WebElement Des3;
	@FindBy(xpath="//*[@id=\\'chgtype:tabviewid:terms1:2:deletelink']")
	private WebElement Del3;
	
	@FindBy(xpath= "//*[@id=\'chgtype:tabviewid:resetTab2']")

	private WebElement reset;
	@FindBy(xpath="//*[@id='chgtype:tabviewid:submitId']")

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

	public WebElement getTC() {
		return TC;
	}

	public WebElement getTitle() {
		return Title;
	}

	public WebElement getCode() {
		return Code;
	}

	public WebElement getDescription() {
		return Description;
	}

	public WebElement getTitle1() {
		return title1;
	}

	public WebElement getDes1() {
		return Des1;
	}

	public WebElement getDel1() {
		return Del1;
	}

	public WebElement getTitle2() {
		return title2;
	}

	public WebElement getDes2() {
		return Des2;
	}

	public WebElement getDel2() {
		return Del2;
	}

	public WebElement getTitle3() {
		return title3;
	}

	public WebElement getDes3() {
		return Des3;
	}

	public WebElement getDel3() {
		return Del3;
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
		return ok;
	}



	
	
	
	
	
	
	

	
}