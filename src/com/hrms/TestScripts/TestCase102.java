package com.hrms.TestScripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TestCase102 {
//public static void main(String args[]) {
	@Test
	public void tc002() {
	//Test case steps
	DOMConfigurator.configure("log4j.xml");
	General obj = new General();
	obj.openApplication();
	obj.login();
	obj.addEmp();
	obj.delEmp();
	obj.logout();
	obj.closeApplication();
}
}
