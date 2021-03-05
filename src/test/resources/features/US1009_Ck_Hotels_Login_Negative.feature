Feature: US1009_Ck_Hotels_Login_Negative


  Scenario: TC11_kullanici_gecersiz_bilgilerle_giris_yapar
    Given kullanici "ck_Hotel_url" sayfasina gider
    Then Log in yazisina tiklar
    And gecersiz username girer
    And  gecersiz password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And kullanici sayfayi kapatir