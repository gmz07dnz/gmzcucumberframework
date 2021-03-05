Feature: US1016_DBUtils ile yapilan sorgular
Scenario: TC23_kullanici tHotel tablosundan mail fieldini okur

    Given kullanici DBUtils ile CK_Hotels veritabanina baglanir
    Then kullanici DbUtils ile "tHotel" tablosundan "Email" verilerini alir
    And  IDHotel degeri 8 olan kaydin kaydin Email bilgisinin "new@email" oldugunu test eder


    Scenario: TC_24 Kullanici tHOTEL tablosundan istedigi Emaili update eder
        Given kullanici DBUtils ile CK_Hotels veritabanina baglanir
        When IDHotel degeri 8 olan kaydin kaydin Email degerini "batch11@theend.com" yapar


    Scenario: TC_25 Kullanici tHotel tablosunda update yapar
        Given kullanici DBUtils ile CK_Hotels veritabanina baglanir
        When IDHotel degeri 11 olan kaydin kaydin Email degerini buisbukadar@gmail.com yapar

    Scenario: TC_26 Kullanici uygun degerlerle tHOTEL tablosuna yeni kayit ekler
        Given kullanici DBUtils ile CK_Hotels veritabanina baglanir
        And uygun degerlerle tabloya yeni kayit ekler
