package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Ck_HotelPage;
import utilities.ConfigReader;

public class Ck_HotelStepDefinitions {

    Ck_HotelPage ck_hotelPage =new Ck_HotelPage();

    @Then("Log in yazisina tiklar")
    public void log_in_yazisina_tiklar() {
    ck_hotelPage.ilkLogin_.click();
    }

    @Then("gecerli username girer")
    public void gecerli_username_girer() {
     ck_hotelPage.user_NameTextBox.sendKeys(ConfigReader.getProperty("ckHotel_validUserName"));
    }

    @Then("gecerli password girer")
    public void gecerli_password_girer() {
      ck_hotelPage.pswTextBox.sendKeys(ConfigReader.getProperty("ckHotel_validPsw"));
    }

    @Then("Login butonuna basar")
    public void login_butonuna_basar() {
    ck_hotelPage.ikinciLogin.click();
    }

    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfaya_giris_yaptigini_kontrol_eder() {
        Assert.assertTrue(ck_hotelPage.girisYapildi.isDisplayed());
    }


    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
        Assert.assertTrue(ck_hotelPage.girisYapilmadi.getText().contains("Try again please"));
    }


    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        ck_hotelPage.user_NameTextBox.sendKeys(ConfigReader.getProperty("ckHotel_invalidUserName"));
    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        ck_hotelPage.pswTextBox.sendKeys(ConfigReader.getProperty("ckHotel_invalidPsw"));
    }


    @And("kullanici {string} saniye bekler")
    public void kullaniciSaniyeBekler(String saniye) throws InterruptedException {
        Long sn = Long.parseLong(saniye);
        Thread.sleep(sn*1000);
    }

    @And("userName olarak {string} girer")
    public void usernameOlarakGirer(String arg0) {
        ck_hotelPage.user_NameTextBox.sendKeys(arg0);
    }

    @And("password olarak {string} girer")
    public void passwordOlarakGirer(String arg0) {
        ck_hotelPage.pswTextBox.sendKeys(arg0);
    }
}
