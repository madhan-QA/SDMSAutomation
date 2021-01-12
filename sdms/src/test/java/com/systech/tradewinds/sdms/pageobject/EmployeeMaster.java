package com.systech.tradewinds.sdms.pageobject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.systech.tradewinds.sdms.common.BasePage;

public class EmployeeMaster extends BasePage {

	public EmployeeMaster() {
		PageFactory.initElements(driver, this);
	}

	private String pageUrl = "http://localhost:8081/SDMS/pages/masters/employeemaster.xhtml ";

	@FindBy(xpath = "//*[@id='chgtype:tabviewid:employeeNameSugId_input']")
	private WebElement empSearch;
	@FindBy(xpath = "//*[@id='chgtype:tabviewid:EmpInfoid']")
	private WebElement EmpInfo;
	@FindBy(xpath = "//input[@id='chgtype:tabviewid:eid']")
	private WebElement empId;
	@FindBy(xpath = "//input[@id='chgtype:tabviewid:employeeNameId']")
	private WebElement empName;

	@FindBy(xpath = "//input[@id='chgtype:tabviewid:fatherName']")
	private WebElement fatherName;

	@FindBy(xpath = "//input[@id='chgtype:tabviewid:address1']")
	private WebElement address1;
	@FindBy(xpath = "//input[@id='chgtype:tabviewid:address2']")
	private WebElement address2;
	@FindBy(xpath = "//*[@id='chgtype:tabviewid:state_input']")
	private WebElement state;

	@FindBy(xpath = "//*[@id='chgtype:tabviewid:city_input']")
	private WebElement city;
	@FindBy(xpath = "//*[@id='chgtype:tabviewid:state_filter']")
	private WebElement statefilter;

	@FindBy(xpath = "//*[@id='chgtype:tabviewid:city_filter']")
	private WebElement cityfilter;

	@FindBy(xpath = "//*[@id='chgtype:tabviewid:graduation']")
	private WebElement graduation;

	@FindBy(xpath = "//*[@id='chgtype:tabviewid:pinCode']")
	private WebElement pinCode;
	@FindBy(xpath = "//*[@id='chgtype:tabviewid:bd_input']")
	private WebElement DOB;

	@FindAll(@FindBy(xpath = "//*[@class='ui-datepicker-calendar']"))
	private List<WebElement>  dobDay;
	@FindBy(xpath = "//div/select[@class='ui-datepicker-month']")
	private WebElement dobYear;
	@FindBy(xpath = "//div/select[@class='ui-datepicker-year']")
	private WebElement dobMonth;
	@FindBy(xpath = "//*[@id='chgtype:tabviewid:sex_input']")
	private WebElement Gender;

	@FindBy(xpath = "//input[@id='chgtype:tabviewid:mobileNo']")
	private WebElement mobileNo;

	@FindBy(xpath = "//*[@id='chgtype:tabviewid:emailId']")
	private WebElement email;

	@FindBy(xpath = "//*[@id='chgtype:tabviewid:pn']")
	private WebElement phoneNo;
	
	@FindBy(xpath = "//*[@id='chgtype:tabviewid:remark']")
	private WebElement remark;


	// officalinfo
	@FindAll(@FindBy(xpath = "//*[@id='chgtype:tabviewid:join_input']"))
	private List<WebElement> joinningDate;

	@FindBy(xpath = "//*[@id='chgtype:tabviewid:designation_input']")
	private WebElement desigination;

	@FindBy(xpath = "//*[@id='chgtype:tabviewid:offmail']")
	private WebElement email1;

	@FindBy(xpath = "//*[@id='chgtype:tabviewid:offmn']")
	private WebElement mobileNo1;

	@FindBy(xpath = "//*[@id='chgtype:tabviewid:cate_input']")
	private WebElement categroy;

	@FindBy(xpath = "//*[@id='chgtype:empst_input']")
	private WebElement  empStatus;

	@FindBy(xpath = "//*[@id='chgtype:empGroup_input']")
	private WebElement empGrp;

	@FindBy(xpath = "//*[@id='chgtype:tabviewid:division']/div[2]/ul/li[1]/div/div/span")
	private WebElement Division1;

	
	@FindBy(xpath = "//*[@id='chgtype:tabviewid:nextId']")
	private WebElement t1Next;

	@FindBy(xpath = "//*[@id='chgtype:tabviewid:resetId']")

	private WebElement t1Reset;

	@FindBy(xpath = "//*[@id='chgtype:tabviewid:Tab3id']")
	private WebElement Attchment;
	
	@FindAll(@FindBy(xpath = "//*[@id='chgtype:tabviewid:rd_input']"))
	private	 List<WebElement> RelivingDate;
	

	// ThridTab
	@FindBy(xpath = "//*[@id='chgtype:tabviewid:objectUpload_input']")
	private WebElement EmpImg;
	@FindBy(xpath = "//*[@id='chgtype:tabviewid:removePhotoId']")
	private WebElement clrEmpImg;
	@FindBy(xpath = "////*[@id='chgtype:tabviewid:objectUploadnew_input']")
	private WebElement EmpDoc;

	@FindBy(xpath = "//*[@id='chgtype:tabviewid:removeDocId']")
	private WebElement clrEmpDoc;

	@FindBy(xpath = "//*[@id='chgtype:tabviewid:tab3NextId']")
	private WebElement t2Next;

	@FindBy(xpath = "//*[@id='chgtype:tabviewid:tab3backId']")
	private WebElement t2Prev;

	@FindBy(xpath = "//*[@id='chgtype:tabviewid:tab4id]")
	private WebElement Tab3;

	@FindBy(xpath = "//*[@id='chgtype:tabviewid:tab4backId]")

	private WebElement t3Prev;

	@FindBy(xpath = "//*[@id='chgtype:tabviewid:submitActiveId']")
	private WebElement submit;
	@FindBy(xpath = "//*[@id='notifi:confirmyesbuttonid']")
	private WebElement yes;

	@FindBy(xpath = "//*[@id='notifi:j_idt26']")
	private WebElement no;  
	
	@FindBy(xpath="//*[@id='notifi:alertbuttonid']")
	private WebElement ok;

	public WebElement getok() {
		return ok;
	}


	public String getPageUrl() {
		return pageUrl;
	}

	public WebElement getempSearch() {
		return empSearch;
	}
	
	public WebElement getaddress1() {
		return address1;
	} 
	
	public WebElement getaddress2() {
		return address2;
	}
	public WebElement getdobMonth() {
		return dobMonth;
	}

	public WebElement getdobYear() {
		return dobYear;
	}



	public WebElement getEmpInfo() {
		return EmpInfo;
	}

	public WebElement getempId() {
		return empId;
	}

	public WebElement getempName() {
		return empName;
	}

	public WebElement getfatherName() {
		return fatherName;
	}

	public WebElement getstate() {
		return state;
	}

	public WebElement getcity() {
		return city;
	}

	public WebElement getStatefilter() {
		return statefilter;
	}

	public WebElement getDOB() {
		return DOB;
	}

	

	public WebElement getCityfilter() {
		return cityfilter;
	}


	


	public WebElement getpinCode() {
		return pinCode;
	}public WebElement getremark() {
		return remark;
	}


	public WebElement getempGrp() {
		return getempGrp();
	}

	public List<WebElement>  getRelivingDate() {
		return RelivingDate;
	}

	public WebElement getGender() {
		return Gender;
	}

	public WebElement getmobileNo() {
		return mobileNo;
	}

	public WebElement getphoneNo() {
		return phoneNo;
	}

	public WebElement getemail() {
		return email;
	}

	public WebElement gett1Next() {
		return t1Next;
	}

	public WebElement gett1Reset() {
		return t1Reset;
	}
	public List<WebElement>  getdobDay() {
		return dobDay;
	}


	public WebElement getAttchment() {
		return Attchment;
	}

	public List<WebElement> getjoinningDate() {
		return joinningDate;
	}

	public WebElement getdesigination() {
		return desigination;
	}

	public WebElement getemail1() {
		return email1;
	}

	public WebElement getmobileNo1() {
		return mobileNo1;
	}

	public WebElement getcategroy() {
		return categroy;
	}

	public WebElement getempStatus() {
		return empStatus;
	}

	public WebElement getDivision1() {
		return Division1;
	}

	

	public WebElement gett2Next() {
		return t2Next;
	}

	public WebElement gett2Prev() {
		return t2Prev;
	}

	public WebElement gett3Prev() {
		return t3Prev;
	}

	public WebElement getTab3() {
		return Tab3;
	}

	public WebElement getEmpImg() {
		return EmpImg;
	}

	public WebElement getclrEmpImg() {
		return clrEmpImg;
	}

	public WebElement getEmpDoc() {
		return EmpDoc;
	}

	public WebElement getclrEmpDoc() {
		return clrEmpDoc;
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
