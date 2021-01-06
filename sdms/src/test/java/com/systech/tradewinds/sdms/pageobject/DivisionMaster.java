package com.systech.tradewinds.sdms.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.systech.tradewinds.sdms.common.BasePage;

public class DivisionMaster extends BasePage {

	public DivisionMaster() {
		PageFactory.initElements(driver, this);
	}
	 
	//Bankmaster Url
	private String pageUrl = "http://localhost:8081/SDMS/pages/masters/divisionmaster.xhtml ";
	
	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:designationNameId']")
	private WebElement divisionname;
	@FindBy(xpath= "//*[@id=\'chgtype:tabviewid:remarksId']")
	private WebElement remarks;
	@FindBy(xpath= "/html/body/div[1]/div[3]/div[2]/form[1]/div/div/div/div[2]/table/tbody/tr/td[2]/button")
	private WebElement reset;
	@FindBy(xpath= "/html/body/div[1]/div[3]/div[2]/form[1]/div/div/div/div[2]/table/tbody/tr/td[1]/button/span[1]")
	private WebElement submit;
	
	
	public String getPageUrl() {
		return pageUrl;
	}
	public WebElement getDivisionname() {
		return divisionname;
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

}
