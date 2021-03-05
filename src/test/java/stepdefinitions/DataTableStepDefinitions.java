package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablePage;

public class DataTableStepDefinitions {

    DataTablePage dataTablePage =new DataTablePage();

    @Then("new butonuna basar")
    public void newButonunaBasar() {
        dataTablePage.newButonu.click();
    }

    @And("first name girer {string}")
    public void firstNameGirer(String firstName) {
        dataTablePage.isimKutusu.sendKeys(firstName);
    }

    @And("Last name girer {string}")
    public void lastNameGirer(String lastName) {
        dataTablePage.lastNameKutusu.sendKeys(lastName);
    }

    @And("Postion girer {string}")
    public void postionGirer(String position) {
        dataTablePage.positionKutusu.sendKeys(position);
    }

    @And("Office girer {string}")
    public void officeGirer(String office) {
        dataTablePage.ofisKutusu.sendKeys(office);
    }

    @And("Extention girer {string}")
    public void extentionGirer(String extension) {
        dataTablePage.extentionKutusu.sendKeys(extension);
    }

    @And("Start date girer {string}")
    public void startDateGirer(String date) {
        dataTablePage.dateKutusu.sendKeys(date);
    }

    @And("Salary girer {string}")
    public void salaryGirer(String salary) {
        dataTablePage.salaryKutusu.sendKeys(salary);
    }

    @And("Create tusuna basar")
    public void createTusunaBasar() {
        dataTablePage.createButonu.click();
    }


    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstName) {
      dataTablePage.searchBox.sendKeys(firstName);
    }

    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isimBolumundeOldugunuDogrular(String firstName) {
        Assert.assertTrue(dataTablePage.ilkAramaSonucu.getText().contains(firstName));
    }
}
