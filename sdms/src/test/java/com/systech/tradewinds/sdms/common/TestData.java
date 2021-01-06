package com.systech.tradewinds.sdms.common;

import java.sql.ResultSet;

public class TestData extends BasePage {
        public static void main(String[] args) {
			ResultSet res = getQuery("jc2411","SELECT a.emp_id AS id ,a.employee_name AS empName,a.father_name AS fatherName,a.mobile_no AS mobileNo,a.gender AS gender,a.address1 AS address1,a.address2 AS address2,\r\n" + 
					"b.state_name AS State,c.city_name AS city ,a.phone_No AS phone,a.email_id AS email,a.remarks AS remarks,a.pincode AS pincode,a.date_of_birth AS DOB,a.date_of_join AS joiningDate,\r\n" + 
					"a.official_email_id AS ofcEmail,a.official_mobile_no AS ofcMobile,d.designation AS Designation,e.division_name  FROM employee_master AS a \r\n" + 
					"JOIN state_master AS b ON a.state_master_id = b.id \r\n" + 
					" JOIN city_master AS c ON a.city_master_id = c.id   \r\n" + 
					" JOIN tradewinds_jc2506.designation_master AS d ON a.designation_master_id = d.id \r\n" + 
					" JOIN tradewinds_jc2506.division_master AS e ON a.division = e.id");
			
			Object[][] empData=	writeExcel("C:\\Users\\Systech\\Desktop\\Data\\EmpData.xls", 0,"Sheet1", res);
		}}
