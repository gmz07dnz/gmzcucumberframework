package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
//import sun.security.krb5.Config;
import utilities.ConfigReader;
import utilities.Driver;

public class BestBuyStepDefinions {

    @When("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Then("{string} de oldugunu test eder")
    public void deOldugunuTestEder(String arananUrl) {
        Assert.assertEquals(ConfigReader.getProperty(arananUrl),Driver.getDriver().getCurrentUrl());
    }
}
