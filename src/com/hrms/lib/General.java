package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import com.hrms.utility.Log;


public class General extends Global{
//Re-usable fun:
public void openApplication() {
System.setProperty("webdriver.gecko.driver", "E:\\Driver\\geckodriver.exe");
 driver = new FirefoxDriver();
driver.navigate().to(url);
System.out.println("Application opened");//java console
Reporter.log("Application opened"); //html report
Log.info("Application Opened"); // log file

}
public void closeApplication() {
	driver.close();
	System.out.println("Application closed");
	Log.info("Application closed");
}
public void login() {
driver.findElement(By.name(txt_loginname)).sendKeys(un);
driver.findElement(By.name(txt_Password)).sendKeys(pw);
driver.findElement(By.name(btn_login)).click();
System.out.println("Login completed");
Log.info("login completed");
}
public void logout() {
driver.findElement(By.linkText(link_logout)).click();
System.out.println("logout completed");
Log.info("Logout completed");
}
public void addEmp() {
	System.out.println("Adding new emp");
	Log.info("Add emp");
}
public void delEmp() {
	System.out.println("Delete an emp");
	Log.info("del emp");
}
}
