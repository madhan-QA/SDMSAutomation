package com.systech.tradewinds.sdms.Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.systech.tradewinds.sdms.common.BasePage;
import com.systech.tradewinds.sdms.pageobject.VehicleMaster;

import jxl.read.biff.BiffException;

public class VehicleMasterTest extends BasePage {
	VehicleMaster vehicle;
   @Test(groups= {"vehicle"},dependsOnGroups= {"login"},dataProvider = "vehicleData")
	public static void insertVehicleMaster(String regNo,String address,String Make,String month,String Model,String ccPower,
			String engineNo,String chasisNo,	String vehicleNo,String rto,String insName,String insType,String EmpName,
			String LoadCapacity,String SeatingCapacity,String OpeningKm,String FuelType,String fuelAlowance ,String Remarks) {
		VehicleMaster vehicle = new VehicleMaster();
		try {impWait(10000);
			loadUrl(vehicle.getPageUrl());
			txtData(vehicle.getregNo(), regNo);

			txtData(vehicle.getaddress(), address);
			txtData(vehicle.getmake(), Make);
			btnClick(vehicle.getdateOfpurchase());
			if(month.contains("Next")) { 	
				btnClick(vehicle.getcalNext()); 
				}
			else if (month.contains("prev")) {
				btnClick(vehicle.getcalPrev());
			}
                 btnClick(vehicle.getdate());
				txtData(vehicle.getmodelAndyear(), Model);
			txtData(vehicle.getccPower(), ccPower);
			txtData(vehicle.getengineNo(), engineNo);
			txtData(vehicle.getchassisNo(), chasisNo);
			txtData(vehicle.getvehicleNo(), vehicleNo);
			txtData(vehicle.getrto(), rto);
			txtData(vehicle.getinsName(), insName);
			txtData(vehicle.getinsType(), insType);
			//txtData(vehicle.getempName(), EmpName);
			txtData(vehicle.getloadCapacity(), LoadCapacity);
			txtData(vehicle.getseatingCapacity(), SeatingCapacity);
			txtData(vehicle.getopeningKm(), OpeningKm);
			selectBytext(vehicle.getfuelType(),FuelType);
			txtData(vehicle.getfuelAllowance(),fuelAlowance);
			txtData(vehicle.getRemarks(), Remarks);
			btnClick(vehicle.getSubmit());
			Print(Remarks);
			if (vehicle.getYes().isEnabled()) {
				btnClick(vehicle.getYes());
			}
			if (vehicle.getok().isEnabled()) {

				btnClick(vehicle.getok());
			}
			refresh();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		}

		@DataProvider(name = "vehicleData")
		public Object[][] vehicleData() throws BiffException, IOException {
			Object[][] testData = getExcel("C:\\Users\\Systech\\Desktop\\Data\\vehicleData.xls", 0);

			return testData;

		}

	}
