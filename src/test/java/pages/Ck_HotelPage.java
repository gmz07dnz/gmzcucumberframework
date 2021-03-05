package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Ck_HotelPage {

    public Ck_HotelPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(linkText = "Log in")
    public WebElement ilkLogin_;


    @FindBy(id="UserName")
    public WebElement user_NameTextBox;


    @FindBy(id = "Password")
    public WebElement pswTextBox;

    @FindBy(id="btnSubmit")
    public WebElement ikinciLogin;

    @FindBy(xpath = "//*[.='Hotel Management']")
    public WebElement girisYapildi;

    @FindBy(xpath ="//*[.='Try again please']")
    public WebElement girisYapilmadi;


}
