package org.manager;

import org.base.BaseClass;
import org.page.AgainFictionBooksPage;
import org.page.AgainLoginPage;
import org.page.BiharDiariesPage;
import org.page.BrowserLaunch;
import org.page.CartPage;
import org.page.FictionBooksPage;
import org.page.LoginPage;
import org.page.ShipingPage;

public class PageManager {

	private BrowserLaunch browserLaunch;

	private LoginPage loginPage;
	
	private FictionBooksPage fictionBooksPage;
	
	private BiharDiariesPage biharDiariesPage;
	
	private AgainFictionBooksPage againFictionBooksPage;
	
	private CartPage cartPage;
	
	private ShipingPage shipingPage;
	
	private AgainLoginPage againLoginPage;

	
	public BrowserLaunch getBrowserLaunch() {
		return(browserLaunch==null) ? browserLaunch=new BrowserLaunch() :  browserLaunch;
	}

	public LoginPage getLoginPage() {
		return(loginPage==null) ? loginPage=new LoginPage() : loginPage;
	}

	public FictionBooksPage getFictionBooksPage() {
		return(fictionBooksPage==null) ?fictionBooksPage=new FictionBooksPage() : fictionBooksPage;
	}

	public BiharDiariesPage getBiharDiariesPage() {
		return(biharDiariesPage==null) ? biharDiariesPage=new BiharDiariesPage() : biharDiariesPage;
	}

	public AgainFictionBooksPage getAgainFictionBooksPage() {
		return(againFictionBooksPage==null) ? againFictionBooksPage=new AgainFictionBooksPage() : againFictionBooksPage;
	}

	public CartPage getCartpage() {
		return(cartPage==null) ? cartPage = new CartPage() : cartPage;
	}

	public ShipingPage getShipingPage() {
		return(shipingPage==null) ? shipingPage=new ShipingPage() : shipingPage;
	}

	public AgainLoginPage getAgainLoginPage() {
		return(againLoginPage==null) ? againLoginPage=new AgainLoginPage() : againLoginPage;
	}

	
}
