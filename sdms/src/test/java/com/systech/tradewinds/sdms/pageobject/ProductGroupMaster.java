package com.systech.tradewinds.sdms.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.systech.tradewinds.sdms.common.BasePage;

public class ProductGroupMaster extends BasePage {
	public ProductGroupMaster() {

		PageFactory.initElements(driver, this);
	}

	// Url
	private String pageUrl = "http://localhost:8081/SDMS/pages/masters/primarygroupmaster.xhtml ";
	
	
	@FindBy(xpath="//input[@id=\'chgtype:tabviewid:groupName']")
	private WebElement groupName;
	@FindBy(xpath="//*[@id='chgtype:tabviewid:isprimaryId:0']/following::span[1]")
	 WebElement isPrimaryYes;	 
	@FindBy(xpath="//*[@id='chgtype:tabviewid:isprimaryId:1']/following::span[1]")
	private WebElement isPrimaryNo;
	@FindBy(xpath="//*[@id='chgtype:tabviewid:grpItems1_input']")
	private WebElement underGroup;

	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:needIns:0']/following::span[1]")
     private WebElement insYes;

	

	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:needIns:1']/following::span[1]")
	private WebElement insNo;


	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:selins:0']/following::span[1]")
	private WebElement aqlGeneral;

	
	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:selins:1']/following::span[1]")
	private WebElement aqlSpecial;

	
	
	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:needQc:0']/following::span[1]")
	private WebElement qcCriteriaYes;
	
	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:needQc:1']/following::span[1]")
	private WebElement qcCriteriaNo;


	@FindBy(xpath= "//*[@id=\'chgtype:tabviewid:rem']")
	private WebElement remarks;
	@FindBy(xpath= "//*[@id=\'chgtype:tabviewid:resetId']")
	private WebElement reset;
	@FindBy(xpath= "//*[@id=\'chgtype:tabviewid:submitActiveId']")
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

	public WebElement getgroupName() {
		return groupName;
	}

	public WebElement getisPrimaryYes() {
		return isPrimaryYes;
	}

	public WebElement getisPrimaryNo() {
		return isPrimaryNo;
	}

	public WebElement getunderGroup() {
		return underGroup;
	}

	public WebElement getinsYes() {
		return insYes;
	}

	public WebElement getinsNo() {
		return insNo;
	}

	
	public WebElement getaqlGeneral() {
		return aqlGeneral;
	}

	public WebElement getaqlSpecial() {
		return aqlSpecial;
	}

	public WebElement getqcCriteriaYes() {
		return qcCriteriaYes;
	}
	
	public WebElement getqcCriteriaNo() {
		return qcCriteriaNo;
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




