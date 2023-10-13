package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.FlightBookingPage;

public class FlightBookingTest {
	WebDriver driver;
	String url="https://www.marinersforex.com/Flights-Booking";
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@Test
	public void flightBooking()
	{
		FlightBookingPage obj=new FlightBookingPage(driver);
		obj.setValues("Kolkata, India ", "London, United Kingdom");
		
		obj.datePicker("2026", "October", "29");
		
		obj.passengersList();
		
		obj.buttonClick();
		
	}	

}
