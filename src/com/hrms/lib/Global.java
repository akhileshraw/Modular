//In this we will be maintaining all our Reusable Objects or data 
package com.hrms.lib;
import org.openqa.selenium.WebDriver;

public class Global {
	//-======Variable Info============
	public WebDriver driver;
	public String url="http://183.82.125.5/nareshit/login.php";
	public String un="nareshit";
	public String pw="nareshit";
	//=========Objects================that are present in the Application
	public String txt_loginname="txtUserName";
	public String txt_Password="txtPassword";
	public String btn_login="Submit";
	public String link_logout="Logout";
	
}
