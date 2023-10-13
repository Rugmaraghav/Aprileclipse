package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightBookingPage {
WebDriver driver;
	
	@FindBy(name="origin") WebElement source;
	@FindBy(xpath="/html/body/div/div/div[2]/section/div[1]/form/div[2]/div[1]/div/div[2]/div/div/div/div/input")
	WebElement destination;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[2]/div[2]/div/div/input")
	WebElement date;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div/div/div[1]/div[1]/div[2]/div") 
	WebElement yrele;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div/div/div[2]/div/div/div[127]/button") 
	WebElement yrselected;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div/div/div[1]/div[1]/div[1]/div")
	WebElement mnth;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div/div/div[1]/div[2]/button[2]") 
	WebElement nxtbtn;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div/div/div/button") 
	List<WebElement> dates;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[3]/ul/li/div")
	WebElement travellers;
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[3]/ul/li/ul/li[1]/div/div/div[3]/p")
	WebElement adult;
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[3]/ul/li/ul/li[2]/div/div/div[3]/p")
	WebElement child;
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[3]/ul/li/ul/li[4]/div/div[1]/fieldset/div/label[2]/span[1]/span[1]/input")
	WebElement businesscls;
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[3]/ul/li/ul/li[4]/div/div[2]/span")
	WebElement donebtn;	
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[4]/input") 
	WebElement searchbtn;
	
	public FlightBookingPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void setValues(String src,String dst)
	{
		source.clear();
		source.click();
		source.sendKeys(src);
		
		destination.clear();
		destination.click();
		destination.sendKeys(dst);
		
	}
	
	
	public void datePicker(String yr,String mn,String dt)
	{
		date.click();
		String year=yrele.getText();
		if(year.equals(yr))
		{
			System.out.println("year is "+year);
		}
		else
		{
			yrele.click();
			yrselected.click();
			
		}
		
		while(true)
		{
			String month=mnth.getText();
			if(month.equalsIgnoreCase(mn))
			{
				System.out.println("month is "+month);
				break;
			}
			else
			{
				nxtbtn.click();
			}
			
		}
		
		List<WebElement> li=dates;
		for(WebElement dts:li)
		{
			String day=dts.getText();
			if(day.equals(dt))
			{
				dts.click();
				break;
			}
		}
		
		
	}
	
	public void passengersList()
	{		
		travellers.click();
		adult.click();
		child.click();
		child.click();
		businesscls.click();
		donebtn.click();
	
	}	
	
	public void buttonClick()
	{		
		searchbtn.click();
		
	}

}
