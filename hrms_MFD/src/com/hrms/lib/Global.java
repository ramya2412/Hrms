package com.hrms.lib;
import org.openqa.selenium.Alert;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Global  {
//variables
	WebDriver driver;
	String url="http://localhost/orangehrm/orangehrm-2.6/login.php";
	String txt_un="admin";
	String txt_pw="admin";
	String ln="ram";
	String fn="sai";
	String empid;
	WebElement e1;
	Select s1;
	Alert al;
	
	
	
	
	//objects
	String txt_loginname="txtUserName";
	String txt_password="//table[@id='Table_01']/tbody/tr[1]/td[2]/table/tbody/tr[3]/td[2]/input";
	String btn_Login="Submit";
	String Logoutlink="Logout";
	String add_btn="//form[@id='standardView']/div[3]/div[1]/input[1]";
	String empcode="txtEmployeeId";
	String lastname="txtEmpLastName";
	String firstname="txtEmpFirstName";
	String browse_btn="photofile";
	String checkbox="//form[@id='standardView']/table/tbody/tr[4]/td[1]/input";
	String del_btn="//form[@id='standardView']/div[3]/div[1]/input[2]"; 
	String select_drd="loc_code";
	String search_txt="loc_name";
	String searchbtn="//form[@id='standardView']/div[2]/input[2]";
	String delete_btn="/html/body/div/div[2]/form/div[3]/div[1]/input[2]";
	String chk_sel="/html/body/div/div[2]/form/table/tbody/tr/td[1]/input";
	String ver_title="//form[@id='standardView']/div[2]/span";
	

	
	
	

}
