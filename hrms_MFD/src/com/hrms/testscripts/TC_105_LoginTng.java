package com.hrms.testscripts;
import java.util.concurrent.TimeUnit;


import org.testng.Reporter;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_105_LoginTng {
	WebDriver driver;
	String url="http://localhost/orangehrm/orangehrm-2.6/login.php";
	String txt_un="admin";
	String txt_pw="admin";
	String txt_loginname="txtUserName";
	String txt_password="//table[@id='Table_01']/tbody/tr[1]/td[2]/table/tbody/tr[3]/td[2]/input";
	String btn_Login="Submit";
	String Logoutlink="Logout";
	@BeforeClass
	public void openAppln(){
		driver =new FirefoxDriver();
		driver.navigate().to(url);
		System.out.println("applnopened");
		
			
		}
	@Test()
public void login() throws Exception{
	driver.findElement(By.name(txt_loginname)).sendKeys(txt_un);
	driver.findElement(By.xpath(txt_password)).sendKeys(txt_pw);
	driver.findElement(By.name(btn_Login)).click();
	Thread.sleep(3000);
	System.out.println("login completed");
   driver.findElement(By.linkText(Logoutlink)).click();
	System.out.println("logout completed");
	Reporter.log("logout completed");
}
@AfterClass
public void closeAppln(){
	driver.close();
	System.out.println("Appln closed");
	Reporter.log("Appln closed");
}

}
