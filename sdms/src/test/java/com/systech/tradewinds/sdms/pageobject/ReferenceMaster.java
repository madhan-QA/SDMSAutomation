package com.systech.tradewinds.sdms.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.systech.tradewinds.sdms.common.BasePage;

public class ReferenceMaster extends BasePage{

	public ReferenceMaster() {
	PageFactory.initElements(driver, this);
	}

	// Url
		private String pageUrl = "http://localhost:8081/SDMS/pages/masters/ReferenceMaster.xhtml";
		
		
		@FindBy(xpath="//*[@id=\'chgtype:tabviewid:Name']")
		private WebElement referencename;
		
		@FindBy(xpath="//*[@id=\'chgtype:tabviewid:mobile']")
		private WebElement mobile;
		@FindBy(xpath="//*[@id=\'chgtype:tabviewid:address']")
		private WebElement address;
		@FindBy(xpath="//*[@id=\'chgtype:tabviewid:emailId']")
		private WebElement email;
		@FindBy(xpath="//*[@id=\'chgtype:tabviewid:comCodeSugBox_input']")
		private WebElement commisioncode;
		
		
		
		
		@FindBy(xpath= "//*[@id='chgtype:tabviewid:remarksid']")
		private WebElement remarks;
		@FindBy(xpath= "//*[@id='chgtype:tabviewid:tab4backId']")
		private WebElement reset;
		@FindBy(xpath= "//*[@id='chgtype:tabviewid:submitActiveId']")
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
		public WebElement getReferencename() {
			return referencename;
		}
		public WebElement getMobile() {
			return mobile;
		}
		public WebElement getAddress() {
			return address;
		}
		public WebElement getEmail() {
			return email;
		}
		public WebElement getCommisioncode() {
			return commisioncode;
		}
		public WebElement getSubmit() {
			return submit;
		}
		public WebElement getReset() {
			return reset;
		}
public WebElement getYes() {
			return yes;
		}
		public WebElement getNo() {
			return no;
		}



}






