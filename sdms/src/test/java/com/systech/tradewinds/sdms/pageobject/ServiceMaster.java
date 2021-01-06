package com.systech.tradewinds.sdms.pageobject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.systech.tradewinds.sdms.common.BasePage;

public class ServiceMaster extends BasePage {
	public ServiceMaster() {

		PageFactory.initElements(driver, this);
	}

	// Url
	private String pageUrl = "http://localhost:8081/SDMS/pages/masters/serviceitemmaster.xhtml ";
	
	
	@FindBy(xpath="//*[@id='chgtype:tabviewid:grpItems_input']")
	private WebElement groupName;
	@FindBy(xpath="//*[@id='chgtype:tabviewid:serviceName']")
	private WebElement serviceName;
	@FindBy(xpath="//*[@id='chgtype:tabviewid:serviceCode']")
	private WebElement serviceitmCode;
	@FindBy(xpath="//*[@id='chgtype:tabviewid:description']")
	private WebElement description;

	@FindBy(xpath="//*[@id='chgtype:tabviewid:servicetypeid_input']")
	private WebElement Type;

	@FindBy(xpath="//*[@id='chgtype:tabviewid:categoryId_input']")
	private WebElement Categoery;



	@FindBy(xpath="//*[@id='chgtype:tabviewid:uomId_input']")
	private WebElement UOM;


	@FindBy(xpath="//*[@id='chgtype:tabviewid:istds:0']/following::span[1]")
	private WebElement tdsYes;

	@FindBy(xpath="//*[@id='chgtype:tabviewid:itemcat_input']")
	private WebElement tdsCat;

	@FindBy(xpath="//*[@id='chgtype:tabviewid:istds:1']/following::span[1]")
	private WebElement tdsNo;

	
	
	@FindBy(xpath="//*[@id='chgtype:tabviewid:hsncode']")
	private WebElement hsnCode;
	@FindBy(xpath="//*[@id='chgtype:tabviewid:sgstsuggid_input']")
	private WebElement taxSGST;
	
	@FindAll(@FindBy(xpath="//table[@class='ui-autocomplete-items ui-autocomplete-table ui-widget-content ui-widget ui-corner-all ui-helper-reset']"))
	private List<WebElement> sgstSugg;
	@FindBy(xpath="//*[@id='chgtype:tabviewid:cgstsuggid_input']")
	private WebElement taxCGST;
	@FindAll(@FindBy(xpath="//table[@class='ui-autocomplete-items ui-autocomplete-table ui-widget-content ui-widget ui-corner-all ui-helper-reset']"))
	private List<WebElement> cgstSugg;

	
	
	@FindBy(xpath="//*[@id='chgtype:tabviewid:igstsuggid_input']")
	private WebElement taxIGST;

	@FindAll(@FindBy(xpath="//table[@class='ui-autocomplete-items ui-autocomplete-table ui-widget-content ui-widget ui-corner-all ui-helper-reset']"))
	private List<WebElement> igstSugg;

	@FindBy(xpath= "//*[@id='chgtype:tabviewid:j_idt53']")
	private WebElement remarks;
	@FindBy(xpath= "//*[@id='chgtype:tabviewid:j_idt71']")
	private WebElement reset;
	@FindBy(xpath= "//*[@id='chgtype:tabviewid:j_idt69']")
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

	public List<WebElement>  getcgstSugg() {
		return cgstSugg;
	}

	public List<WebElement>  getsgstSugg() {
		return sgstSugg;
	}
	public List<WebElement>  getigstSugg() {
		return igstSugg;
	}


	public String getPageUrl() {
		return pageUrl;
	}

	public WebElement getgroupName() {
		return groupName;
	}

	public WebElement getserviceName() {
		return serviceName;
	}

	public WebElement getserviceitmCode() {
		return serviceitmCode;
	}

	public WebElement getdescription() {
		return description;
	}

	public WebElement getCategoery() {
		return Categoery;
	}
	public WebElement getType() {
		return Type;
	}

	public WebElement getUOM() {
		return UOM;
	}

	
	public WebElement gettdsYes() {
		return tdsYes;
	}
	public WebElement gettdsCat() {
		return tdsCat;
	}

	public WebElement gettdsNo() {
		return tdsNo;
	}

	public WebElement gethsnCode() {
		return hsnCode;
	}
	
	public WebElement gettaxCGST() {
		return taxCGST;
	}
	
	public WebElement gettaxSGST() {
		return taxSGST;
	}

	public WebElement gettaxIGST() {
		return taxIGST;
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





