package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.WallmartPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.awt.image.Kernel;

public class WallmartStepDefinitions {

    WallmartPage wallmartPage =new WallmartPage();

    @When("kullanici wallmart sayfasina gider")
    public void kullaniciWallmartSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("wallmart_url"));
    }

    @And("wallmart sayfasinda {string} icin arama yapar")
    public void wallmartSayfasindaIcinAramaYapar(String arananKelime) {
        wallmartPage.wallmartSearchBox.sendKeys(arananKelime+ Keys.ENTER);
    }


    @Then("wallmartta sayfa basliginin {string} icerdigini test eder")
    public void wallmarttaSayfaBasligininIcerdiginiTestEder(String arananKelime) {
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(arananKelime));
    }



}
