Feature: US1011_AutomationPractice

  #http://automationpractice.com/index.php sayfasina gidelim
  #Cucumber ile asagidaki testi yapalim
  #        Given user web sayfasinda
  #        And user sign in linkine tiklar
  #        And user Create and account bölümüne email adresi girer
  #        And Create an Account butonuna basar
  #        And user kisisel bilgilerini ve iletisim bilgilerini girer
  #        And user Register butonuna basar
  #        Then hesap olustugunu dogrulayin

  Scenario: TC14_Kullanici_yeni_giris_olusturabilmeli

    Given kullanici "automation_url" sayfasina gider
    Then Ap sign_in tusuna tiklar
    And ap email kutusuna email bilgisi yazar
    And ap create an account tusuna basar
    And ap cinsiyet secer
    And ap isim girer
    And ap soyisim girer
    And ap password girer
    And pagedown tusuna basar
    And kullanici "1" saniye bekler
    And ap gun secer
    And ap ay secer
    And ap yil secer
    And ap adres isim yazar
    And ap adres soyisim yazar
    And ap sirket ismi yazar
    And ap adress yazar
    And ap adress2 yazar
    And ap adres sehir yazar
    And ap state dropdown secer
    And ap adres zip kod yazar
    And pagedown tusuna basar
    And kullanici "1" saniye bekler
    And ap country dropdown secer
    And bilgi ekleme yapar
    And home phone yazar
    And reference alanini temizler
    And reference yazar
    And ap register butonuna basar


  Scenario: TC_15_Yanlis_mail_ile_giris_yapilamaz
    When  kullanici "automation_url" sayfasina gider
    And Ap sign_in tusuna tiklar
    And email kutusuna gecersiz email yazar ve enter'a basar
    And hata mesajini dogrular
