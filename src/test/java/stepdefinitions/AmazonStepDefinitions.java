package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {

    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));

    }


    @And("iphone icin arama yapar")
    public void iphoneIcinAramaYapar() {
        amazonPage.searchbox.sendKeys("iphone"+ Keys.ENTER);
    }

    @Then("sonuclarin iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {
        Assert.assertTrue(amazonPage.sonucYaziElementi.getText().contains("iphone"));
    }

    @And("teapot icin arama yapar")
    public void teapotIcinAramaYapar() {
        amazonPage.searchbox.sendKeys("teapot"+ Keys.ENTER);
    }

    @Then("sonuclarin teapot icerdigini test eder")
    public void sonuclarinTeapotIcerdiginiTestEder() {
        Assert.assertTrue(amazonPage.sonucYaziElementi.getText().contains("teapot"));
    }

    @And("flower icin arama yapar")
    public void flowerIcinAramaYapar() {
        amazonPage.searchbox.sendKeys("flower"+ Keys.ENTER);
    }


    @Then("sonuclarin flower icerdigini test")
    public void sonuclarinFlowerIcerdiginiTest() {
        Assert.assertTrue(amazonPage.sonucYaziElementi.getText().contains("flower"));
    }

    @And("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }

    @Then("sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String arananKelime) {
        Assert.assertTrue(amazonPage.sonucYaziElementi.getText().contains(arananKelime));
    }

    @And("{string} icin arama yapar")
    public void icinAramaYapar(String arananKelime) {
        amazonPage.searchbox.sendKeys(arananKelime+Keys.ENTER);
    }


}
