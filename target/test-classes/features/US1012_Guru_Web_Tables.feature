Feature: US1012_Guru_Web_Tables

  #http://demo.guru99.com/test/web-table-element.php sayfasina gidelim
  #Cucumber framework’de US1012_Guru_Web_Tables olusturun
  #Scenario : TC_16_kullanici_liste_alabilmeli         asagidaki testi yapin
  #                Given user web sayfasinda
  #                Then Company listesini consola yazdirir
  #    And DCB Bank'in listede oldugunu test eder


  Scenario: TC_16_kullanici_liste_alabilmeli

    When kullanici "guru_url" sayfasina gider
    Then Company listesini consola yazdir
    Then "Bata India" Prev.Close degerini yazdirir
    And "Bata India" listede oldugunu test eder



   Scenario: TC_17_kullanici_satir_sütun_degeri_ile_yazi_alabilmeli
     When kullanici "guru_url" sayfasina gider
     And satir sayisi "5" sütun sayisi "3" olan elementi yazdirir




    #http://demo.guru99.com/test/web-table-element.php sayfasina gidelim
    #Cucumber framework’de US1012_Guru_Web_Tables altinda
    # Scenario : TC_18_kullanici_sutun_basligi_ile_liste_alabilmeli olusturun ve
    #  asagidaki testi yapin
    #  Given user web sayfasinda
    #  And “Istenen Baslik”, sutunundaki tum degerleri yazdirir



  Scenario:TC_18_kullanici_sutun_basligi_ile_liste_alabilmeli
    When kullanici "guru_url" sayfasina gider
    And "% Change" sutunundaki tum degerleri yazdirir


