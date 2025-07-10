package org.manager;

import org.overallpage.LoginPage;

public class PageManager extends LoginPage {

	private  LoginPage loginpage;

	public LoginPage getLoginpage() {
		return(loginpage==null) ? loginpage = new LoginPage() : loginpage;
	
		
	
	}
}
