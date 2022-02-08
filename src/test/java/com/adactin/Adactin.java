package com.adactin;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import com.Adactin_Baseclass.BaseClass;


public class Adactin extends BaseClass {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\eclipse-workspace\\MavenProject\\Driver\\chromedriver.exe");	
	ChromeOptions ve = new ChromeOptions();
	ve.addArguments("incognito");
	WebDriver driver = new ChromeDriver(ve);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://adactinhotelapp.com/");
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
WebElement login_email = driver.findElement(By.id("username"));
login_email.sendKeys("velanvic");
WebElement login_password = driver.findElement(By.id("password"));
login_password.sendKeys("Velan@1995");
WebElement login_button = driver.findElement(By.name("login"));
login_button.click();
WebElement location = driver.findElement(By.name("location"));
Select s = new Select(location);
s.selectByVisibleText("New York");
WebElement hotel = driver.findElement(By.id("hotels"));
Select s1 = new Select(hotel);
s1.selectByIndex(2);
Thread.sleep(3000);
WebElement room = driver.findElement(By.xpath("//*[@id=\"room_type\"]"));
Select s2 = new Select(room);
s2.selectByIndex(3);
WebElement room_no = driver.findElement(By.id("room_nos"));
Select s3 = new Select(room_no);
s3.selectByValue("4");
WebElement from_date = driver.findElement(By.name("datepick_in"));
from_date.clear();
from_date.sendKeys("25/12/2021");
WebElement end_date = driver.findElement(By.name("datepick_out"));
end_date.clear();
end_date.sendKeys("30/12/2021");
WebElement adultPer_room= driver.findElement(By.id("adult_room"));
Select s4 = new Select(adultPer_room);
s4.selectByIndex(2);
WebElement childPer_room = driver.findElement(By.name("child_room"));
Select s5 = new Select(childPer_room);
s5.selectByValue("3");
WebElement submit_button = driver.findElement(By.name("Submit"));
submit_button.click();
WebElement click_box = driver.findElement(By.name("radiobutton_0"));
click_box.click();
WebElement Continue_button= driver.findElement(By.name("continue"));
Continue_button.click();
WebElement first_name = driver.findElement(By.name("first_name"));
first_name.sendKeys("Vellivelan");
WebElement last_name = driver.findElement(By.name("last_name"));
last_name.sendKeys("A");
WebElement address = driver.findElement(By.name("address"));
address.sendKeys("veerapandian nagar");
WebElement card_num = driver.findElement(By.name("cc_num"));
card_num.sendKeys("1234567891234567");
WebElement card_type = driver.findElement(By.name("cc_type"));
Select type = new Select(card_type);
type.selectByIndex(3);
WebElement card_expmonth = driver.findElement(By.name("cc_exp_month"));
Select month = new Select(card_expmonth);
month.selectByVisibleText("March");
WebElement card_year = driver.findElement(By.name("cc_exp_year"));
Select year = new Select(card_year);
year.selectByVisibleText("2022");
WebElement card_cvv = driver.findElement(By.name("cc_cvv"));
card_cvv.sendKeys("456");
WebElement booknow_button = driver.findElement(By.name("book_now"));
booknow_button.click();
WebElement mylitinerary = driver.findElement(By.name("my_itinerary"));
mylitinerary.click();
screenshot("C:\\Users\\Admin\\eclipse-workspace\\Adactin_Project\\Screenshot\\adactin-project.png");
//TakesScreenshot ts = (TakesScreenshot)driver;
//File source = ts.getScreenshotAs(OutputType.FILE);
//File destination = new File("C:\\Users\\Admin\\eclipse-workspace\\Adactin_Project\\Screenshot\\Mini-Project.png");
//FileUtils.copyFile(source, destination);
WebElement logout = driver.findElement(By.id("logout"));
logout.click();

}
}
