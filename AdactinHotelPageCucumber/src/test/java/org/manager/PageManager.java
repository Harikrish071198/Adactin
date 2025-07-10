 package org.manager;

import org.page.BookHotel;
import org.page.BookedItinerary;
import org.page.BookingConfirmation;
import org.page.LoginAgain;
import org.page.LoginPage;
import org.page.SearchHotelPage;
import org.page.SelectHotel;

public class PageManager {

	private LoginPage loginpage;

	private SearchHotelPage searchHotelPage;

	private BookedItinerary bookedItinerary;

	private BookHotel bookHotel;

	private LoginAgain loginagain;

	private SelectHotel selectHotel;

	private BookingConfirmation bookingConfirmation;

	public LoginPage getLoginpage() {
		return (loginpage == null) ? loginpage = new LoginPage() : loginpage;

	}

	public SearchHotelPage getSearchHotelPage() {
		return (searchHotelPage == null) ? searchHotelPage = new SearchHotelPage() : searchHotelPage;
	}

	public BookedItinerary getBookedItinerary() {
		return (bookedItinerary == null) ? bookedItinerary = new BookedItinerary() : bookedItinerary;
	}

	public BookHotel getBookHotel() {
		return (bookHotel == null) ? bookHotel = new BookHotel() : bookHotel;
	}

	public LoginAgain getLoginagain() {
		return (loginagain == null) ? loginagain = new LoginAgain() : loginagain;
	}

	public SelectHotel getSelectHotel() {
		return (selectHotel == null) ? selectHotel = new SelectHotel() : selectHotel;
	}

	public BookingConfirmation getBookingConfirmation() {
		return (bookingConfirmation == null) ? bookingConfirmation = new BookingConfirmation() : bookingConfirmation;
	}

}
