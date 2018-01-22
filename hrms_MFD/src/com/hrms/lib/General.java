package com.hrms.lib;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;



import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class General extends Global{

public void openAppln(){
	driver =new FirefoxDriver();
	driver.navigate().to(url);
	System.out.println("applnopened");
	
		
	}
public void closeAppln(){
	driver.close();
	System.out.println("Appln closed");
}

public void login(){
	driver.findElement(By.name(txt_loginname)).sendKeys(txt_un);
	driver.findElement(By.xpath(txt_password)).sendKeys(txt_pw);
	driver.findElement(By.name(btn_Login)).click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	System.out.println("login completed");

	}
public void logout(){
	driver.findElement(By.linkText(Logoutlink)).click();
	System.out.println("logout completed");
}
public void addEmp(){
	driver.switchTo().frame("rightMenu");
	driver.findElement(By.xpath(add_btn)).click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.switchTo().defaultContent();
	driver.switchTo().frame("rightMenu");
	empid=driver.findElement(By.id(empcode)).getAttribute("value");
	System.out.println(empid);
	driver.findElement(By.id(lastname)).sendKeys(ln);
	driver.findElement(By.id(firstname)).sendKeys(fn);
	driver.findElement(By.id(browse_btn)).click();
	driver.switchTo().defaultContent();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	System.out.println("new employee added");
	
	
}
public void delEmp(){
	driver.switchTo().frame("rightMenu");
	driver.findElement(By.xpath(checkbox)).click();
	driver.findElement(By.xpath(del_btn)).click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	System.out.println("deleted employee successfully");
	
}
public void navigate_pim(){
	e1=driver.findElement(By.linkText("PIM"));
	Actions act=new Actions(driver);
	act.moveToElement(e1).build().perform();
	driver.findElement(By.linkText("Employee List")).click();
	System.out.println("navigation performed");
	
}
public void enter_frame(){
	driver.switchTo().frame("rightMenu");
	
}
public void exit_frame(){
	driver.switchTo().defaultContent();
}
public void search_btn(){
	s1=new Select(driver.findElement(By.id(select_drd)));
	s1.selectByIndex(1);
	driver.findElement(By.id(search_txt)).sendKeys("0008");
	driver.findElement(By.xpath(searchbtn)).click();
	
	

	
	
}
public void delete_emp(){
	driver.findElement(By.xpath(delete_btn)).click();
	al=driver.switchTo().alert();
	System.out.println(al.getText());
	al.accept();
	driver.findElement(By.xpath(chk_sel)).click();
	System.out.println("Checkbox checked");
	driver.findElement(By.xpath(delete_btn)).click();
}
public void verify_del_title(){
assertTrue(driver.findElement(By.xpath(ver_title)).getText().matches("Successfully Deleted"));
System.out.println("title verifed");
System.out.println(driver.findElement(By.xpath(ver_title)).getText());
}
}




