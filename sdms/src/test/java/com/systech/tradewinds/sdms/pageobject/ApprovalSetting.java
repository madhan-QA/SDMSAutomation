package com.systech.tradewinds.sdms.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.systech.tradewinds.sdms.common.BasePage;

public class ApprovalSetting  extends BasePage{



	public ApprovalSetting() {
		PageFactory.initElements(driver, this);
	}

	// Url
	private String pageUrl = "http://localhost:8081/SDMS/pages/masters/approvalsetting.xhtml";


	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:parentnameid_label']")
	private WebElement parentName;
	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:transactionid_label']")
	private WebElement TransactionName;
	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:levelsid_label']")
	private WebElement level;
	@FindBy(xpath="/html/body/div[1]/div[3]/div[2]/form[1]/div/div/div/div[1]/div[2]/div/div/div[2]/span")
	private WebElement valueBased;

	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:approvaltableid:0:empnameid_input']")
	private WebElement approverName0;
	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:approvaltableid:0:value_input']")
	private WebElement value0;

	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:approvaltableid:1:empnameid_input']")
	private WebElement approverName1;
	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:approvaltableid:1:value_input']")
	private WebElement value1;

	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:approvaltableid:2:empnameid_input']")
	private WebElement approverName2;
	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:approvaltableid:2:value_input']")
	private WebElement value2;


	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:approvaltableid:3:empnameid_input']")
	private WebElement approverName3;
	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:approvaltableid:3:value_input']")
	private WebElement value3;


	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:approvaltableid:4:empnameid_input']")
	private WebElement approverName4;
	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:approvaltableid:4:value_input']")
	private WebElement value4;


	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:approvaltableid:5:empnameid_input']")
	private WebElement approverName5;
	@FindBy(xpath="//*[@id=\'chgtype:tabviewid:approvaltableid:5:value_input']")
	private WebElement value5;








	@FindBy(xpath= "//*[@id='chgtype:tabviewid:remarksid']")
	private WebElement remarks;
	@FindBy(xpath= "/html/body/div[1]/div[3]/div[2]/form[1]/div/div/div/div[2]/table/tbody/tr/td[2]/button")
	private WebElement reset;
	@FindBy(xpath= "/html/body/div[1]/div[3]/div[2]/form[1]/div/div/div/div[2]/table/tbody/tr/td[1]/button/span[1]")
	private WebElement submit;

	@FindBy(xpath="//*[@id='notifi:confirmyesbuttonid']")
	private WebElement yes;

	@FindBy(xpath="//*[@id='notifi:j_idt26']")
	private WebElement no;



	public String getPageUrl() {
		return pageUrl;
	}
	public WebElement getparentName() {
		return parentName;
	}

	public WebElement getTransactionName() {
		return TransactionName;
	}
	public WebElement getlevel() {
		return level;
	}

	public WebElement getvalueBased() {
		return valueBased;
	}

	public WebElement getapproverName0() {
		return approverName0;
	}
	public WebElement getValue0() {
		return value0;
	}

	public WebElement getapproverName1() {
		return approverName1;
	}
	public WebElement getValue1() {
		return value1;
	}

	public WebElement getapproverName2() {
		return approverName2;
	}
	public WebElement getValue2() {
		return value2;
	}

	public WebElement getapproverName3() {
		return approverName3;
	}
	public WebElement getValue3() {
		return value3;
	}

	public WebElement getapproverName4() {
		return approverName4;
	}
	public WebElement getValue4() {
		return value4;
	}

	public WebElement getapproverName5() {
		return approverName5;
	}
	public WebElement getValue5() {
		return value5;
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







