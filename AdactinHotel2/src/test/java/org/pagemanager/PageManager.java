package org.pagemanager;

import org.global.BaseClass;
import org.page.AgainLoginPage;
import org.page.BookHotelPage;
import org.page.BookingConfirmationPage;
import org.page.LoginPage;
import org.page.MyItineraryPage;
import org.page.SearchHotelPage;
import org.page.SelectHotelPage;

public class PageManager {

	private LoginPage loginpage;

	private SearchHotelPage searchhotelpage;

	private SelectHotelPage selecthotelpage;

	private BookHotelPage bookhotelpage;

	private BookingConfirmationPage bookingconfirmationpage;

	private MyItineraryPage myitinerarypage;

	private AgainLoginPage againloginpage;

	public LoginPage getLoginpage() {
		return(loginpage==null)? loginpage= new LoginPage(): loginpage;
	}

	public SearchHotelPage getSearchhotelpage() {
		return(searchhotelpage==null)? searchhotelpage=new SearchHotelPage(): searchhotelpage;
	}

	public SelectHotelPage getSelecthotelpage() {
		return(selecthotelpage==null)?selecthotelpage=new SelectHotelPage(): selecthotelpage;
	}

	public BookHotelPage getBookhotelpage() {
		return(bookhotelpage==null)? bookhotelpage=new BookHotelPage(): bookhotelpage;
	}

	public BookingConfirmationPage getBookingconfirmationpage() {
		return(bookingconfirmationpage==null)? bookingconfirmationpage=new BookingConfirmationPage(): bookingconfirmationpage;
	}

	public MyItineraryPage getMyitinerarypage() {
		return(myitinerarypage==null)? myitinerarypage=new MyItineraryPage(): myitinerarypage;
	}

	public AgainLoginPage getAgainloginpage() {
		return(againloginpage==null)? againloginpage =new AgainLoginPage(): againloginpage;
	}
}
