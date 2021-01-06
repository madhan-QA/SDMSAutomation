package com.systech.tradewinds.sdms.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.systech.tradewinds.sdms.common.BasePage;




public class DeliverythroughMaster extends BasePage {
	public DeliverythroughMaster() {

		PageFactory.initElements(driver, this);
	}

	// Url
	private String pageUrl = "http://localhost:8081/SDMS/pages/masters/deliverythromaster.xhtml ";


	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:nameid']")
	private WebElement Name;
	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:deliveryid_input']")
	private WebElement throughType;
	@FindBy(xpath="//textarea[@id='chgtype:tabviewid:addresssid']")
	private WebElement address;

	
	// service type
	@FindBy(xpath="//*[@id='chgtype:tabviewid:serviceid:0']/following::span[1]")
	private WebElement Road;
	@FindBy(xpath="//*[@id='chgtype:tabviewid:serviceid:1']/following::span[1]")

	private WebElement Train;


	@FindBy(xpath="//*[@id='chgtype:tabviewid:serviceid:3']/following::span[1]")
	private WebElement Seaway;

	@FindBy(xpath="//*[@id='chgtype:tabviewid:serviceid:2']/following::span[1]")
	private WebElement Air;

	@FindBy(xpath= "//*[@id='chgtype:tabviewid:remarksId']")
	private WebElement remarks;
	@FindBy(xpath= "//*[@id='chgtype:tabviewid:reeset']")

	private WebElement reset;
	@FindBy(xpath= "//*[@id='chgtype:tabviewid:submit']")

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

	public WebElement getName() {
		return Name;
	}

	public WebElement getthroughType() {
		return throughType;
	}

	public WebElement getaddress() {
		return address;
	}



	public WebElement getroad() {
		return Road;
	}

	public WebElement gettrain() {
		return Train;
	}

	public WebElement getseaway() {
		return Seaway;
	}

	public WebElement getair() {
		return Air;
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



