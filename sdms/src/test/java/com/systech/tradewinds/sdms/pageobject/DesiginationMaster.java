package com.systech.tradewinds.sdms.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.systech.tradewinds.sdms.common.BasePage;

public class DesiginationMaster extends  BasePage{



	public  DesiginationMaster() {
		PageFactory.initElements(driver, this);
	}

	private String pageUrl = "http://localhost:8081/SDMS/pages/masters/menudesignationmaster.xhtml ";


	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:designationNameId_input']")
	private WebElement DesiginationName;
	@FindBy(xpath="/html/body/div[1]/div[3]/div[2]/form[1]/div/div/div/div[1]/table/tbody/tr/td/div/div[2]/table/tbody/tr[2]/td[1]/div/div[2]/span")
	private WebElement admin;
	@FindBy(xpath="/html/body/div[1]/div[3]/div[2]/form[1]/div/div/div/div[1]/table/tbody/tr/td/div/div[2]/table/tbody/tr[11]/td[1]/div/div[2]/span")
	private WebElement master;
	@FindBy(xpath="/html/body/div[1]/div[3]/div[2]/form[1]/div/div/div/div[1]/table/tbody/tr/td/div/div[2]/table/tbody/tr[72]/td[1]/div/div[2]/span")
	private WebElement preSales;



	@FindBy(xpath="/html/body/div[1]/div[3]/div[2]/form[1]/div/div/div/div[1]/table/tbody/tr/td/div/div[2]/table/tbody/tr[91]/td[1]/div/div[2]/span")
	private WebElement sales;

	@FindBy(xpath="/html/body/div[1]/div[3]/div[2]/form[1]/div/div/div/div[1]/table/tbody/tr/td/div/div[2]/table/tbody/tr[114]/td[1]/div/div[2]/span")
	private WebElement purchase;

	@FindBy(xpath="/html/body/div[1]/div[3]/div[2]/form[1]/div/div/div/div[1]/table/tbody/tr/td/div/div[2]/table/tbody/tr[159]/td[1]/div/div[2]/span")
	private WebElement gate;


	@FindBy(xpath="/html/body/div[1]/div[3]/div[2]/form[1]/div/div/div/div[1]/table/tbody/tr/td/div/div[2]/table/tbody/tr[174]/td[1]/div/div[2]/span")
	private WebElement inventory;

	@FindBy(xpath="/html/body/div[1]/div[3]/div[2]/form[1]/div/div/div/div[1]/table/tbody/tr/td/div/div[2]/table/tbody/tr[197]/td[1]/div/div[2]/span")
	private WebElement qc;


	@FindBy(xpath="/html/body/div[1]/div[3]/div[2]/form[1]/div/div/div/div[1]/table/tbody/tr/td/div/div[2]/table/tbody/tr[200]/td[1]/div/div[2]/span")
	private WebElement orderexe;

	@FindBy(xpath="/html/body/div[1]/div[3]/div[2]/form[1]/div/div/div/div[1]/table/tbody/tr/td/div/div[2]/table/tbody/tr[204]/td[1]/div/div[2]/span")
	private WebElement integration;





	@FindBy(xpath= "//*[@id=\'chgtype:tabviewid:remarksId']")
	private WebElement remarks;
	@FindBy(xpath= "//*[@id=\'chgtype:tabviewid:resetId']")

	private WebElement reset;

	@FindBy(xpath= "//*[@id=\'chgtype:tabviewid:submitId']")
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

	public WebElement getDesiginationName() {
		return DesiginationName;
	}

	public WebElement getadmin() {
		return admin;
	}

	public WebElement getmaster() {
		return master;
	}


	public WebElement getpreSales() {
		return preSales;
	}

	public WebElement getsales() {
		return sales;
	}

	public WebElement getpurchase() {
		return purchase;
	}

	public WebElement getinventory() {
		return inventory;
	}

	public WebElement getqc() {
		return qc;
	}

	public WebElement getorderexe() {
		return orderexe;
	}

	public WebElement getintegration() {
		return integration;
	}

	public WebElement getgate() {
		return gate;
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






