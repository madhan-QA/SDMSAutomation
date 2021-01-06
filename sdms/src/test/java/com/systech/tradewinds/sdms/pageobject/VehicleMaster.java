
package com.systech.tradewinds.sdms.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.systech.tradewinds.sdms.common.BasePage;

public class VehicleMaster extends BasePage {

	public VehicleMaster() {
		PageFactory.initElements(driver, this);
	}

	private String pageUrl = "http://localhost:8081/SDMS/pages/masters/VehicleMaster.xhtml ";

	@FindBy(xpath = "//*[@id=\'chgtype:tabviewid:registrationNumberId']")
	private WebElement regNo;
	@FindBy(xpath = "//*[@id=\'chgtype:tabviewid:addressid']")
	private WebElement address;
	@FindBy(xpath = "//*[@id='chgtype:tabviewid:makeManufactureId']")
	private WebElement make;

	@FindBy(xpath = "//*[@id='chgtype:tabviewid:dateOfPurchaseId_input']")
	private WebElement dateOfpurchase;
	@FindBy(xpath = "//a[@title='prev']")
	private WebElement calPrev;
	@FindBy(xpath = "//a[@title='Next']")
	private WebElement calNext;
	@FindBy(xpath = "//a[contains(text(),'10')]")
	private WebElement date;

	@FindBy(xpath = "//*[@id='chgtype:tabviewid:engineNumberId']")
	private WebElement engineNo;

	// service type
	@FindBy(xpath = "//*[@id='chgtype:tabviewid:ccPowerId']")
	private WebElement ccPower;
	@FindBy(xpath = "//*[@id='chgtype:tabviewid:modelYearId']")
	private WebElement modelAndyear;

	@FindBy(xpath = "//*[@id='chgtype:tabviewid:chassisNumberId']")
	private WebElement chassisNo;

	@FindBy(xpath = "//*[@id='chgtype:tabviewid:rtoId']")
	private WebElement rto;

	@FindBy(xpath = "//*[@id='chgtype:tabviewid:vehicleNumberId']")
	private WebElement vehicleNo;

	@FindBy(xpath = "//*[@id='chgtype:tabviewid:insuranceCompanyNameId']")
	private WebElement insName;

	@FindBy(xpath = "//*[@id='chgtype:tabviewid:insuranceTypeId']")
	private WebElement insType;

	@FindBy(xpath = "//*[@id='chgtype:tabviewid:driverid_input']")
	private WebElement empName;
	@FindBy(xpath = "//*[@id='chgtype:tabviewid:vehicleAllotedtoEmployeeDriverNameId']")
	private WebElement loadCapacity;

	@FindBy(xpath = "//*[@id='chgtype:tabviewid:seatingCapacityId']")
	private WebElement seatingCapacity;

	@FindBy(xpath = "//*[@id='chgtype:tabviewid:fuelModeId_input']")
	private WebElement fuelType;

	@FindBy(xpath = "//*[@id='chgtype:tabviewid:openingKilometreId']")
	private WebElement openingKm;

	@FindBy(xpath = "//*[@id='chgtype:tabviewid:fuelAllowanceMonthlyId']")
	private WebElement fuelAllowance;

	@FindBy(xpath = "//*[@id=\'chgtype:tabviewid:remarksid']")
	private WebElement remarks;
	@FindBy(xpath = "//*[@id=\'chgtype:tabviewid:reeset']")
	private WebElement reset;
	@FindBy(xpath = "//*[@id=\'chgtype:tabviewid:submit']")
	private WebElement submit;
	@FindBy(xpath = "//*[@id='notifi:confirmyesbuttonid']")
	private WebElement yes;

	@FindBy(xpath = "//*[@id='notifi:j_idt26']")
	private WebElement no;

	@FindBy(xpath = "//*[@id='notifi:alertbuttonid']")
	private WebElement ok;

	public WebElement getok() {
		return ok;
	}
	
	public WebElement getcalPrev() {
		return calPrev;
	}

	public WebElement getcalNext() {
		return calNext;
	}

	public WebElement getdate() {
		return date;
	}



	public String getPageUrl() {
		return pageUrl;
	}

	public WebElement getregNo() {
		return regNo;
	}

	public WebElement getaddress() {
		return address;
	}

	public WebElement getmake() {
		return make;
	}

	public WebElement getdateOfpurchase() {
		return dateOfpurchase;
	}

	public WebElement getengineNo() {
		return engineNo;
	}

	public WebElement getccPower() {
		return ccPower;
	}

	public WebElement getmodelAndyear() {
		return modelAndyear;
	}

	public WebElement getchassisNo() {
		return chassisNo;
	}

	public WebElement getvehicleNo() {
		return vehicleNo;
	}

	public WebElement getrto() {
		return rto;
	}

	public WebElement getinsName() {
		return insName;
	}

	public WebElement getinsType() {
		return insType;
	}

	public WebElement getempName() {
		return empName;
	}

	public WebElement getloadCapacity() {
		return loadCapacity;
	}

	public WebElement getseatingCapacity() {
		return seatingCapacity;
	}

	public WebElement getopeningKm() {
		return openingKm;
	}

	public WebElement getfuelType() {
		return fuelType;
	}

	public WebElement getfuelAllowance() {
		return fuelAllowance;
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
