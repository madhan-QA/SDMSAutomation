package com.systech.tradewinds.sdms.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.systech.tradewinds.sdms.common.BasePage;

public class Usercreation  extends BasePage{
	
	public Usercreation() {
	PageFactory.initElements(driver, this);
	}

	// Url
		private String pageUrl = "http://localhost:8081/SDMS/pages/admin/usercreation.xhtml";
		
		
		@FindBy(xpath="//*[@id=\'chgtype:tabviewid:companyId_input']")
		private WebElement Company;
		@FindBy(xpath="//*[@id=\'chgtype:tabviewid:branchId_input']")
		private WebElement Branch;
		
		
		@FindBy(xpath= "//*[@id='chgtype:tabviewid:employeeId_input']")
		private WebElement Employee;
		
		@FindBy(xpath= "//*[@id='chgtype:tabviewid:userId']")
		private WebElement Userid;

		@FindBy(xpath= "//input[@id='chgtype:tabviewid:feedback']")
		private WebElement Password;

		
		@FindBy(xpath= "//*[@id='chgtype:tabviewid:resetId']")
		private WebElement reset;
		@FindBy(xpath= "//*[@id='chgtype:tabviewid:submitId']")
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
		public WebElement getUserid() {
			return Userid;
		}
		public WebElement getPassword() {
			return Password;
		}
		public WebElement getOk() {
			return ok;
		}
		public WebElement getCompany() {
			return Company;
		}
		public WebElement getBranch() {
			return Branch;
		}
		public WebElement getEmployee() {
			return Employee;
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
