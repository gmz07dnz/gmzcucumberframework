Feature: US1010_Ck_Hotels_Farkli_Kullanici_kelime
  Scenario: TC12_farkli_kullanici_ismi_ve_sifre_ile

  #1.https://qa-environment.crystalkeyhotels.com/ sayfasina gidelim
  #    2.Cucumber parametre ,cucumber scenario outline ve TestNg framework
    #    @Dataprovider kullanarak asagidaki gorevi tamamlayin
  #      - Login tusuna basin
  #      - Asagidaki 5 kullanici adi ve sifreyi deneyin ve login olmadigini test edin
  #      - Manager – Manager
  #      - Manager1- Manager1
  #      - Manager2 - Manager2
  #      - Manager3 - Manager3
  #      - Manager4 – Manager4

  When kullanici "ck_Hotel_url" sayfasina gider
    Then Log in yazisina tiklar
    And userName olarak "Manager" girer
    And  password olarak "Manager" girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And kullanici sayfayi kapatir


  Scenario Outline: TC13_farkli_kullanici_ismi_ve_sifre_ile

    When kullanici "ck_Hotel_url" sayfasina gider
    Then Log in yazisina tiklar
    And userName olarak "<userName>" girer
    And  password olarak "<psw>" girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And kullanici sayfayi kapatir
    Examples:
      | userName | psw |
      |Manager   |Manager|
      |Manager1  |Manager1|
      |Manager2  |Manager2|
      |Manager3  |Manager3|

