package org.manager;

import org.base.BaseClass;
import org.page.AddCartPage;
import org.page.CheckOutPage;
import org.page.FinishPage;
import org.page.InformationPage;
import org.page.LoginPage;
import org.page.OverviewPage;

public class PageManager {

	private LoginPage loginpage;

	private AddCartPage addCartPage;

	private CheckOutPage checkOutPage;

	private InformationPage informationPage;

	private OverviewPage overviewPage;

	private FinishPage finishPage;


	public LoginPage getLoginpage() {
		return (loginpage == null) ? loginpage = new LoginPage() : loginpage;
	}

	public AddCartPage getAddCartPage() {
		return (addCartPage == null) ? addCartPage = new AddCartPage() : addCartPage;
	}

	public CheckOutPage getCheckOutPage() {
		return (checkOutPage == null) ? checkOutPage = new CheckOutPage() : checkOutPage;
	}

	public InformationPage getInformationPage() {
		return (informationPage == null) ? informationPage = new InformationPage() : informationPage;
	}

	public OverviewPage getOverviewPage() {
		return (overviewPage == null) ? overviewPage = new OverviewPage() : overviewPage;
	}

	public FinishPage getFinishPage() {
		return(finishPage==null) ? finishPage=new FinishPage() : finishPage;
	}

}
