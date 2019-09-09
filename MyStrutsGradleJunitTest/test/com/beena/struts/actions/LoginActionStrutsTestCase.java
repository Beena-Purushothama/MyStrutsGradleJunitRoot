package com.beena.struts.actions;

import java.io.File;

import servletunit.struts.MockStrutsTestCase;
import com.beena.struts.forms.LoginForm;

public class LoginActionStrutsTestCase extends MockStrutsTestCase {

	private LoginForm form;

	public LoginActionStrutsTestCase(String testName) {
		super(testName);
	}

	public void setUp() throws Exception {

		super.setUp();
		form = new LoginForm();
		form.setUserName("user");
		form.setPassWord("user");
		File currentDirectory = new File(System.getProperty("user.dir"));
		setContextDirectory(new File(currentDirectory.getParent() + "/MyStrutsGradleJunit/WebContent"));
	}

	public void tearDown() throws Exception {
		super.tearDown();
	}

	public void testLoginActionWhenSuccsess() throws Exception {

		setRequestPathInfo("/login");
		System.out.println("This test method should be run");
		setActionForm(form);
		// addRequestParameter("userName","user");
		// addRequestParameter("password","user");
		actionPerform();
		verifyForward("success");
	}
}
