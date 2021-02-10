
package com.systech.tradewinds.sdms.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.systech.tradewinds.sdms.common.BasePage;



public class LoginPage extends BasePage {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
    
	// Login page url.

	private  String pageUrl = "http://localhost:8081/SDMS/pages/admin/login.xhtml";

	//	This below elements belongs to Login Page and its Branch Page.


	@FindBy(xpath = "//input[@id='loginform:username']")
	private WebElement userName;
	@FindBy(xpath = "//input[@id='loginform:password']")
	private WebElement password;
	@FindBy(xpath= "//button[@id='loginform:submit_b']")
	private WebElement login;
	public String getPageUrl() {
		return pageUrl;
	}
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}

	//Branch Page elements are given below.

	@FindBy(xpath = "//select[@id='j_idt6:branch_select_input']")
	private WebElement compnay;
	@FindBy(xpath = "//select[@id='j_idt6:year_select_input']")
	private WebElement financeYear;
	@FindBy(xpath = "//button[@id='j_idt6:submit_id']")
	private WebElement submit;

	public WebElement getCompnay() {
		return compnay;
	}
	public WebElement getFinanceYear() {
		return financeYear;
	}
	public WebElement getSubmit() {
		return submit;
	}
	// This element is used to logout from ERP.
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/ul/li[1]/ul/li[5]/a")
	private WebElement logout;
	
	public WebElement getLogout() {
		return logout;
	}
	@FindBy(xpath = "//*[@id='j_idt19']")
	private WebElement empIcon;
	
	public WebElement getempIcon() {
		return empIcon;
	}
	
	
}
