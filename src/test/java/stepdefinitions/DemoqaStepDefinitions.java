package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoqaPage;
import utilities.Driver;

public class DemoqaStepDefinitions {
    Actions actions =new Actions(Driver.getDriver());
    DemoqaPage demoqaPage=new DemoqaPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),20);

    @Then("alert yazisina tiklar")
    public void alert_yazisina_tiklar() {
       actions.sendKeys(Keys.PAGE_DOWN).perform();
        demoqaPage.alert.click();
    }

    @Then("2. Click Me butonuna tiklar")
    public void click_me_butonuna_tiklar() {
      demoqaPage.clickMe.click();
    }

    @Then("Alert'in gorunur olmasini bekler")
    public void alert_in_gorunur_olmasini_bekler() {
        wait.until(ExpectedConditions.alertIsPresent());
    }



    @Then("Ok diyerek alerti kapatin")
    public void ok_diyerek_alerti_kapatin() {
     Driver.getDriver().switchTo().alert().accept();
    }


    @Then("Alert uzerindeki yazinin This alert appeared after 5 seconds oldugunu test edin")
    public void alertUzerindekiYazininThisAlertAppearedAfterSecondsOldugunuTestEdin() {
        String expextedYazi="This alert appeared after 5 seconds";
        String actualYazi=Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(expextedYazi,actualYazi);
    }


}
