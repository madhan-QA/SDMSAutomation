package com.systech.tradewinds.sdms.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.systech.tradewinds.sdms.common.BasePage;

public class EmployeeGroup extends BasePage{
	

	public EmployeeGroup() {
		PageFactory.initElements(driver, this);
	}

	// Url
	private String pageUrl = "http://localhost:8081/SDMS/pages/masters/employeeGroupMaster.xhtml ";


	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:employeeGroupNameId']")
	private WebElement EmpGrp;
	
	
	@FindBy(xpath= "//*[@id=\'chgtype:tabviewid:remarksId']")
	private WebElement remarks;
	@FindBy(xpath= "//*[@id='chgtype:tabviewid:submitId']")
	private WebElement submit;
	@FindBy(xpath= "//*[@id='chgtype:tabviewid:resetId']")
	private WebElement reset;
	@FindBy(xpath="//*[@id='notifi:confirmyesbuttonid']")
	private WebElement yes;

	@FindBy(xpath="//*[@id='notifi:j_idt26']")
	private WebElement no;
	@FindBy(xpath="//*[@id='notifi:alertbuttonid']")
	private WebElement ok;
	
	

	public String getPageUrl() {
		return pageUrl;
	}

	public WebElement getEmpGrp() {
		return EmpGrp;
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
