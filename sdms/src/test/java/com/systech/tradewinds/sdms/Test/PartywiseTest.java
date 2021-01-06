package com.systech.tradewinds.sdms.Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.common.BasePage;
import com.systech.tradewinds.sdms.pageobject.PartygroupMaser;

import jxl.read.biff.BiffException;

public class PartywiseTest extends  BasePage{
			
		 PartygroupMaser Partywise;
			@Test(groups= {"Partywise"},dependsOnGroups= {"login"},dataProvider="Partywise") 
			public void insertPartywise(String type,String GroupName,String noofFrac,String Undergroup,String remarks)  {
				
				Partywise = new PartygroupMaser();
				
				
				
				selectByvalue(Partywise.gettype(),type);
				txtData(Partywise.getgroupname(),GroupName);
				selectByvalue(Partywise.getundergroup(),Undergroup);

				txtData(Partywise.getRemarks(),remarks);
				try {
					sleep();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				btnClick(Partywise.getSubmit());
				try {
					sleep();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				btnClick(Partywise.getYes());
				btnClick(Partywise.getok());
				

					
				
			}
			@DataProvider(name="Partywise")	
			public Object[][] UomData() throws BiffException, IOException {
				 Object[][] testData = null;
				try {
					testData = getExcel("C:\\Users\\Systech\\Desktop\\Data\\Partywise.xls",0);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return testData;
				
			}
			




		}


