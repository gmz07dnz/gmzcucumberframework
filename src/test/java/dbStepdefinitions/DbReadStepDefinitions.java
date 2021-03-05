package dbStepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import java.sql.*;

public class DbReadStepDefinitions {
    String url="jdbc:sqlserver://184.168.194.58:1433;databaseName=crystalkeyhotels2; user=Ahmet_User;password=Ahmet123!";
    String username="Ahmet_User";
    String password="Ahmet123!";

    Connection connection; // Database baglantisi icin
    Statement statement; // Query calistirmak icin
    ResultSet resultSet; // Sorgu sonucunda gelen sonuc tablosundan istedigimiz dataya ulasmak icin


    @Given("kullanici CK_Hotels veritabanina baglanir")
    public void kullanici_ck_hotels_veritabanina_baglanir() throws SQLException {
    connection= DriverManager.getConnection(url,username,password);
    statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
    }


    @And("kullanici {string} tablosundaki {string} verilerini alir")
    public void kullaniciTablosundakiVerileriniAlir(String table, String field) throws SQLException {
        String query= "SELECT "+field+" FROM dbo."+table;
        resultSet= statement.executeQuery(query);

    }
    @Given("kullanici {string} sutunundaki verileri okur")
    public void kullanici_sutunundaki_verileri_okur(String field) throws SQLException {
        // resultSet.first() bizi ilk kayida goturur, eger gecerli bir kayda gitmeden
        // data ile ilgili islem yapmaya calisirsak
        //   "The result set has no current row."      hatasi aliriz

    resultSet.first();      //gelecek deger bir objedir
        Object ilkSatirdakiObje = resultSet.getObject(field);
        System.out.println(ilkSatirdakiObje.toString());

        //2. degeri yazdiralim
        resultSet.next();
        Object ikinciSatirdakiObje =resultSet.getObject(field);
        System.out.println(ikinciSatirdakiObje.toString());

        // 7.satirdaki degeri yazdiralim
        resultSet.absolute(7);
        Object yedinciSatirdakiObje=resultSet.getObject(field);
        System.out.println(yedinciSatirdakiObje.toString());
        // buraya kadar yazdigimiz kodlarla resultSet 7.satira geldi

        // bu satirdan sonra tum listeyi yazdirmak icin bir dongu kullanirsam
        // resultSet 7.satirda oldugu icin
        // bize 7.satirdan sonrasini yazdirir
        // Eger ilk satirdan itibaren yazdirmak istiyorsak once ilk satira gitmemiz gerekir

        System.out.println("===========");
        resultSet.absolute(0);
        // 0.satira gitmemizin sebebi while sorgusu icerisinde bulunan resultSet.next() in bizi
        // birinci kayda goturmesi icindir. Eger 1.satira gidecek olsak while icindeki kod yuzunden yazdirmaya
        //2.satirdan baslar, tum listeyi alamayiz

        // tum listeyi yazdiralim
        while (resultSet.next()){
            Object satirdakiObje= resultSet.getObject(field);
            System.out.println(satirdakiObje.toString());
        }
    }


}
