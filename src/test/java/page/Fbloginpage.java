package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbloginpage {
	WebDriver driver;
	//Locating Login button
	@FindBy(name="login")
	WebElement loginbutton;
	
    //Locating Email id Text box
	@FindBy(name="email")
	WebElement emailIdField;
    
    //Locating password Text box
	@FindBy(name="pass")
	WebElement pswd ;
 

    public Fbloginpage(WebDriver driver)

    {
               this.driver=driver;
               PageFactory.initElements(driver, this);
    }

//Clicking on Login button

    public void clickLoginBtn()

    {
    	 loginbutton.click();
    }

    //Specifiying email and psswd

    public void setvalues (String UN,String PWD)

    {

            emailIdField.sendKeys(UN);   
            pswd.sendKeys(PWD);
            
    }

    


}
