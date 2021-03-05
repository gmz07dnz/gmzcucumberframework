package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WallmartPage {

    public WallmartPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "global-search-input")
    public WebElement wallmartSearchBox;



}
