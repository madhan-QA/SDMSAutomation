package com.systech.tradewinds.sdms.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.systech.tradewinds.sdms.common.BasePage;

public class WarehouseMaster  extends  BasePage{



	public  WarehouseMaster() {
		PageFactory.initElements(driver, this);
	}

	private String pageUrl = "http://localhost:8081/SDMS/pages/masters/warehousemaster.xhtml";


	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:nameid']")
	private WebElement warehouseName;
	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:codeid']")
	private WebElement warehouseCode;
	@FindBy(xpath="//div[@id='chgtype:tabviewid:j_idt18' and @class='ui-selectbooleancheckbox ui-chkbox ui-widget']")
	private WebElement isTemp;

	@FindBy(xpath="//*[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default']")
	private WebElement typeBin;



	@FindBy(xpath="//*[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default ui-state-active ui-state-hover']")
	private WebElement typePlain;

	
	@FindBy(xpath="//input[@id=\'chgtype:tabviewid:shortname']")
	private WebElement shortName;
	@FindBy(xpath="//input[@id=\'chgtype:tabviewid:rowsid']")
	private WebElement noofRows;


	@FindBy(xpath="//input[@id=\'chgtype:tabviewid:shelvesid']")
	private WebElement noofshelevs;

	@FindBy(xpath="//input[@id=\'chgtype:tabviewid:racksid']")
	private WebElement noofRacks;

	@FindBy(xpath="//input[@id=\'chgtype:tabviewid:binid']")
	private WebElement noofBins;

	@FindBy(xpath="//button[@id=\'chgtype:tabviewid:generate']")
	private WebElement generate;


	@FindBy(xpath= "//*[@id='chgtype:tabviewid:remarksId']")
	private WebElement remarks;
	@FindBy(xpath="//*[@id='chgtype:tabviewid:reeset']")
	private WebElement reset;
	@FindBy(xpath="//*[@id='chgtype:tabviewid:submit']")
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

	public WebElement getwarehouseName() {
		return warehouseName;
	}

	public WebElement getwarehouseCode() {
		return warehouseCode;
	}

	public WebElement getisTemp() {
		return isTemp;
	}


	public WebElement gettypePlain() {
		return typePlain;
	}

	public WebElement gettypeBin() {
		return typeBin;
	}

	public WebElement getshortName() {
		return shortName;
	}

	public WebElement getnoofRows() {
		return noofRows;
	}

	public WebElement getnoofshelevs() {
		return noofshelevs;
	}

	public WebElement getnoofBins() {
		return noofBins;
	}

	public WebElement getnoofRacks() {
		return noofRacks;
	}

	public WebElement getgenerate() {
		return generate;
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





