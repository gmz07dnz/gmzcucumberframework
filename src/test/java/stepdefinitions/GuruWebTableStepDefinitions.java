package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruWebTablePage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class GuruWebTableStepDefinitions {

    GuruWebTablePage guruWebTablePage =new GuruWebTablePage();

    @Then("Company listesini consola yazdir")
    public void company_listesini_consola_yazdir() {
        for (WebElement w:guruWebTablePage.companyList) {
            System.out.println(w.getText());
        }
    }

    @And("{string} listede oldugunu test eder")
    public void listedeOldugunuTestEder(String aranan) {
        int flag=0;
        for (WebElement w:guruWebTablePage.companyList) {
            if(w.getText().equals(aranan)){
                flag=1;
            }
        }
        Assert.assertTrue(flag==1);
    }


    @Then("{string} Prev.Close degerini yazdirir")
    public void prevCloseDegeriniYazdirir(String istenen) {
        List<String> list = new ArrayList<>();
        for(WebElement w: guruWebTablePage.companyList){
            list.add(w.getText());
        }
        if(list.contains(istenen)) {
            int satirSayisi = list.lastIndexOf(istenen) + 1;  //  satır sayısını verir
            String prevCloseDeger = Driver.getDriver().findElement(By.xpath("//tr["+satirSayisi+"]//td[3]")).getText();
            System.out.println( "deger:" +prevCloseDeger);
        }else {
            System.out.println("aradiginiz sirket tabloda yok");
        }

        //2.yol
        /*
        int sirketSatirNo =12
        int flag =0;

        for(int i =0;i<guruWebTablePage.companyList.size;i++){
        if(guruWebTablePage.companyList.get(i).getText.equals(istenen)){
        sirketSatirNo=i+1;
        flag=1;
        }

        if(flag==1){
        String prevCloseDeger = Driver.getDriver().findElement(By.xpath("//tr["+satirSayisi+"]//td[3]")).getText();
            System.out.println( "deger:" +prevCloseDeger);
            }
           else{
           System.out.println("aradiginiz sirket tabloda yok");=

         */


    }

    @And("satir sayisi {string} sütun sayisi {string} olan elementi yazdirir")
    public void satirSayisiSütunSayisiOlanElementiYazdirir(String satir, String sutun) {
        String path = "//tr["+satir+"]//td["+sutun+"]";
        String elementYazi= Driver.getDriver().findElement(By.xpath(path)).getText();
        System.out.println(satir+". satir "+sutun+". sütun: "+elementYazi);
    }

    @And("{string} sutunundaki tum degerleri yazdirir")
    public void sutunundakiTumDegerleriYazdirir(String baslik) {

        List<String> baslikListesi = new ArrayList<>();
        for(WebElement w: guruWebTablePage.baslikList ){
            baslikListesi.add(w.getText());
        }
        if(baslikListesi.contains(baslik)){
            int sutunSayisi= baslikListesi.indexOf(baslik)+1;
            List<WebElement>  tumDegerler = Driver.getDriver().findElements(By.xpath("//tr//td["+sutunSayisi+"]"));
            for (WebElement w: tumDegerler){
                System.out.println(w.getText());
            }
        }
    }
}
