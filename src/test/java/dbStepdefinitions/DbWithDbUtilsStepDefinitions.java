package dbStepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.SQLException;

public class DbWithDbUtilsStepDefinitions {

    @Given("kullanici DBUtils ile CK_Hotels veritabanina baglanir")
    public void kullaniciDBUtilsIleCK_HotelsVeritabaninaBaglanir() {
        DBUtils.getConnection();
    }


    @And("kullanici DBUtils ile {string} tablosundaki {string} verilerini alir")
    public void kullaniciDBUtilsIleTablosundakiVerileriniAlir(String table, String field) {
        String query= "SELECT "+field+" FROM dbo."+table;
        DBUtils.executeQuery(query);
    }



    @And("kullanici DBUtils ile {string} sutunundaki verileri okur")
    public void kullaniciDBUtilsIleSutunundakiVerileriOkur(String field) throws SQLException {
        DBUtils.getResultset().first();
        Object ilkSatirdakiObje= DBUtils.getResultset().getObject(field);
        System.out.println(ilkSatirdakiObje.toString());

    }

    @Then("kullanici DbUtils ile {string} tablosundan {string} verilerini alir")
    public void kullaniciDbUtilsIleTablosundanVerileriniAlir(String table, String field) {
        String query = "SELECT "+field+" FROM dbo."+ table;
        DBUtils.executeQuery(query);  // tum datalar gelir

    }

    @And("IDHotel degeri {int} olan kaydin kaydin Email bilgisinin {string} oldugunu test eder")
    public void idhotelDegeriOlanKaydinKaydinEmailBilgisininOldugunuTestEder(int row, String testDegeri) throws Exception {
       // istenen satirdaki EMail verisini ouma ve yazdirma
        DBUtils.getResultset().absolute(row);
        Object istenenSatirdakiObje=DBUtils.getResultset().getObject("Email");
        System.out.println(istenenSatirdakiObje.toString());

        // EMail field'indaki tum eMail'leri satir no ile birlikte yazdiralim
        int satirSayisi=DBUtils.getRowCount(); // bu hazir method bize satir sayisini verir
        DBUtils.getResultset().absolute(1);
        int satirNumarasi=DBUtils.getResultset().getRow(); // bu da bize bulundugumuz satirin numarasini verir
        while(satirNumarasi<satirSayisi){
            // baslanan satirdan son satira kadar her bir satirdaki objeyi, sonrada obje uzerinden Email'i alacagim
            // ayrica bu email'in kacinci satirda oldugu gostermek icin satir sayisini da alacagim
            Object satirdakiEmailObjesi=DBUtils.getResultset().getObject("Email"); // satirdaki objeyi veriri
            satirNumarasi=DBUtils.getResultset().getRow(); // satirin numarasini verir
            System.out.println(satirNumarasi+". satirdaki email : "+satirdakiEmailObjesi.toString());
            DBUtils.getResultset().next(); // while loopun sona gitmesi icin degiskeni 1 artiriyoruz

        }
        // istenen satirdaki email degerini istenen email oldugunu test edin
        Assert.assertEquals(istenenSatirdakiObje.toString(),testDegeri);
    }

    @When("IDHotel degeri {int} olan kaydin kaydin Email degerini {string} yapar")
    public void idhotelDegeriOlanKaydinKaydinEmailDegeriniYapar(int row, String yeniEmail) {
        // IDHotel degeri 8 olan Email'i batch11@theend.com yapin
        // UPDATE dbo.tHOTEL
        // SET Email='batch11@theend.com'
        // WHERE IDHotel=8
        // Dinamik olanlari degistirelim

        String updateQuery ="UPDATE dbo.tHOTEL SET Email='"+yeniEmail+"' WHERE IDHotel="+row+1;
        DBUtils.executeQuery(updateQuery);

        /*
            Bilmemiz gereken 3 obje
         1- connection : baglanmamamiza yardim ediyor
            DBUtils.getConnection();
         2- statement : DBUtils kullanmazsak statement objesi ile query calistiriyoruz
            Biz DBUtils kullandigimiz icin query calistirmak istedigimizde once bir String degiskene query'i esitliyoruz
            SQL de tHOTEL tablosundan Name field'indaki tum Name'leri listeleyin desem
            sql sorgumuz : SELECT Name FROM tHOTEL
            ayni islemi Jdbc ile yapmak istiyorsak once bu sorguyu String bir degiskene atiyoruz
            String query="SELECT Name FROM tHOTEL";
            Sonra DBUtils i kullanip bu query'i EXECUTE ediyoruz
            DBUtils.executeQuery(query);
         */
    }

    @When("IDHotel degeri 11 olan kaydin kaydin Email degerini buisbukadar@gmail.com yapar")
    public void idhotelDegeriOlanKaydinKaydinEmailDegeriniBuisbukadarGmailComYapar() {
        String updateQuery ="UPDATE dbo.tHOTEL SET Email='buisbukadar@gmail.com' WHERE IDHotel=11";
        DBUtils.executeQuery(updateQuery);
    }

    @And("uygun degerlerle tabloya yeni kayit ekler")
    public void uygunDegerlerleTabloyaYeniKayitEkler() {
        /*tHotel tablosuna yeni ir kayit eklemek için yazmam gereken sql sorgusu
          INSERT INTO tHOTEL VALUES();
          fieLd isimleri ile tabloya data  eklemek istersek
          INSERT INTO thotel (fields) VALUES();
         */

        String createQuery = "INSERT INTO dbo.tHOTEL (Code, Name, Address,) VALUES ('144', 'BATCH 11 GMZ', 'abc SK.')";
        DBUtils.executeQuery(createQuery);
    }
}
