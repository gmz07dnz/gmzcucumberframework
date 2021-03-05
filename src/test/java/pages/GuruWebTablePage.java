package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class GuruWebTablePage {

    public GuruWebTablePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//tr//td[1]")
    public List<WebElement> companyList;

    @FindBy(xpath = "//thead//tr//th")
    public List<WebElement> baslikList;


}
