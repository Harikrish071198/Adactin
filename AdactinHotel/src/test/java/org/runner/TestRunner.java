package org.runner;

import org.execution.TC01_AdactinLoginPage;
import org.execution.TC02_AdactinSearchHotelPage;
import org.execution.TC03_AdactinSelectHotel;
import org.execution.TC04_AdactinBookHotel;
import org.execution.TC05_AdactinBookingConfirmation;
import org.execution.TC06_AdactinBookedItinerary;
import org.execution.TC07_AdactinLoginAgain;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	
	TC01_AdactinLoginPage.class,
	TC02_AdactinSearchHotelPage.class,
	TC03_AdactinSelectHotel.class,
	TC04_AdactinBookHotel.class,
	TC05_AdactinBookingConfirmation.class,
	TC06_AdactinBookedItinerary.class,
	TC07_AdactinLoginAgain.class
})
public class TestRunner {

}

