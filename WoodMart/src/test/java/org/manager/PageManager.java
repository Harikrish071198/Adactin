package org.manager;

import org.page.AgainShopPage;
import org.page.CheckOutPage;
import org.page.LoginPage;
import org.page.MyAccountPage;
import org.page.OrderConfirmation;
import org.page.ShopPage;
import org.page.SmartWatchPage;

public class PageManager {

	private LoginPage loginPage;

	private MyAccountPage myAccountPage;

	private ShopPage shopPage;

	private SmartWatchPage smartWatchPage;

	private AgainShopPage againShopPage;

	private CheckOutPage checkOutPage;
	
	private OrderConfirmation orderConfirmation;

	public LoginPage getLoginPage() {
		return (loginPage == null) ? loginPage = new LoginPage() : loginPage;
	}

	public MyAccountPage getMyAccountPage() {
		return (myAccountPage == null) ? myAccountPage = new MyAccountPage() : myAccountPage;
	}

	public ShopPage getShopPage() {
		return (shopPage == null) ? shopPage = new ShopPage() : shopPage;
	}

	public SmartWatchPage getSmartWatchPage() {
		return(smartWatchPage==null) ? smartWatchPage=new SmartWatchPage() : smartWatchPage;
	}

	public AgainShopPage getAgainShopPage() {
		return(againShopPage==null) ? againShopPage=new AgainShopPage() : againShopPage;
	}

	public CheckOutPage getCheckOutPage() {
		return(checkOutPage==null) ? checkOutPage =new CheckOutPage() : checkOutPage;
	}

	public OrderConfirmation getOrderConfirmation() {
		return(orderConfirmation==null) ? orderConfirmation=new OrderConfirmation() : orderConfirmation;
	}

}
