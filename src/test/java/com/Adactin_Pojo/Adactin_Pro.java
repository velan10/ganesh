package com.Adactin_Pojo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import com.Adactin_Baseclass.BaseClass;
import com.Adactin_Pojo.Home_Pojo;


public class Adactin_Pro extends BaseClass {
	public static void main(String[] args) throws Throwable {
		
	getBrowser("chrome");
implicitwait(30);
	url("https://adactinhotelapp.com/index.php");
Home_Pojo om1 = new Home_Pojo(driver);
inputvalues(om1.getUsername(), "velanvic");
inputvalues(om1.getPassword(), "Velan@1995");
clickOptions(om1.getLogin_button());
dropselect(om1.getLocation(), "byvisibletext", "New York");
dropselect(om1.getHotel(), "byvalue", "Hotel Hervey");
dropselect(om1.getRoom_type(), "byvisibletext", "Deluxe");
dropselect(om1.getRoom_nos(), "byvalue", "5");
delete(om1.getDatecheckin());
inputvalues(om1.getDatecheckin(), "25/12/2021");
delete(om1.getDatecheckout());
inputvalues(om1.getDatecheckout(), "30/12/2021");
dropselect(om1.getAdultroom(), "byvalue", "2");
dropselect(om1.getChildroom(), "by value", "1");
clickOptions(om1.getSubmit());
clickOptions(om1.getRadiobutton());
clickOptions(om1.getContinue_Button());
inputvalues(om1.getFirst_name(), "Velan");
inputvalues(om1.getLast_name(), "DG");
inputvalues(om1.getAddress(), "Veerapandian nagar ");
inputvalues(om1.getCc_num(), "5489456978962456");
dropselect(om1.getCc_type(), "byvalue", "VISA");
dropselect(om1.getCc_exp_month(), "byvisibletext", "December");
dropselect(om1.getCc_exp_year(), "byvalue", "2022");
inputvalues(om1.getCc_cvv(), "548");
clickOptions(om1.getBook_now());
clickOptions(om1.getMy_itinerary());
clickOptions(om1.getLogout());










































	}
	}