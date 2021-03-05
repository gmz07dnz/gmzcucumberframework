Feature: US1008 Ck Hotels Login



  Scenario: TC10_kullanici_gecerli_bilgilerle_giris_yapar
    Given kullanici "ck_Hotel_url" sayfasina gider
    Then Log in yazisina tiklar
    And  gecerli username girer
    And  gecerli password girer
    And Login butonuna basar
    Then sayfaya giris yaptigini kontrol eder
    And kullanici "3" saniye bekler
    And kullanici sayfayi kapatir