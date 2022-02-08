package com.Adactin_Pom;

import org.openqa.selenium.WebElement;

import com.Adactin_Baseclass.BaseClass;
import com.Adactin_Pom.Adactin_LoginPage;
import com.Adactin_Pom.BookHotel_PersonalDetails;
import com.Adactin_Pom.Booking_Conform;
import com.Adactin_Pom.Finally_BookedItinerary;
import com.Adactin_Pom.Hotel_Searching;
import com.Adactin_Pom.Hotel_Selection;



public class Adactin_Separate_Method extends BaseClass {
	public static void main(String[] args) {
		getBrowser("chrome");
		implicitwait(30);
		url("https://adactinhotelapp.com/index.php");
		Adactin_LoginPage om1 = new Adactin_LoginPage(driver);
		Hotel_Searching om2 = new Hotel_Searching(driver);
		Hotel_Selection om3 = new Hotel_Selection(driver);
		BookHotel_PersonalDetails om4 = new BookHotel_PersonalDetails(driver);
		Booking_Conform om5 = new Booking_Conform(driver);
		Finally_BookedItinerary om6 = new Finally_BookedItinerary(driver);

		inputvalues(om1.getUsername(), "velanvic");
		inputvalues(om1.getPassword(), "Velan@1995");
		clickOptions(om1.getLogin_button());
		dropselect(om2.getLocation(), "byvisibletext", "New York");
		dropselect(om2.getHotel(), "byvalue", "Hotel Hervey");
		dropselect(om2.getRoom_type(), "byvisibletext", "Deluxe");
		dropselect(om2.getRoom_nos(), "byvalue", "5");
		delete(om2.getDatecheckin());
		inputvalues(om2.getDatecheckin(), "25/12/2021");
		delete(om2.getDatecheckout());
		inputvalues(om2.getDatecheckout(), "30/12/2021");
		dropselect(om2.getAdultroom(), "byvalue", "2");
		dropselect(om2.getChildroom(), "by value", "1");
		clickOptions(om2.getSubmit());
		clickOptions(om3.getRadiobutton());
		clickOptions(om3.getContinue_Button());
		inputvalues(om4.getFirst_name(), "Velan");
		inputvalues(om4.getLast_name(), "DG");
		inputvalues(om4.getAddress(), "Veerapandian nagar ");
		inputvalues(om4.getCc_num(), "5489456978962456");
		dropselect(om4.getCc_type(), "byvalue", "VISA");
		dropselect(om4.getCc_exp_month(), "byvisibletext", "December");
		dropselect(om4.getCc_exp_year(), "byvalue", "2022");
		inputvalues(om4.getCc_cvv(), "548");
		clickOptions(om4.getBook_now());
		clickOptions(om5.getMy_itinerary());
		clickOptions(om6.getLogout());

	}
}
