package com.systech.tradewinds.sdms.Test;

import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.common.BasePage;
import com.systech.tradewinds.sdms.pageobject.LoginPage;

public class LogoutTest extends BasePage{
	
	LoginPage logout;
	
	@Test(groups= {"logout"},dependsOnGroups= {"login"})
	public void logout() {
		logout = new LoginPage();
		btnClick(logout.getempIcon());
		btnClick(logout.getLogout());
		
		
	}
	

	
}
