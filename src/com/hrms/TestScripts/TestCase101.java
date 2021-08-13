package com.hrms.TestScripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TestCase101 {
//public static void main(String args[]) {
	@Test
	public void tc001() {
	//Test case Steps
	DOMConfigurator.configure("log4j.xml");
	General obj = new General();
	obj.openApplication();
	obj.login();
	obj.logout();
	obj.closeApplication();
}
}
