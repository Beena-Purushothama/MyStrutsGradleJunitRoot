package com.beena.struts.forms;

import org.apache.struts.action.ActionForm;

public class LoginForm extends ActionForm {

	private String userName = null;
	private String passWord = null;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String password) {
		this.passWord = password;
	}

}
