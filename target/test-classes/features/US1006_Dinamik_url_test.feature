@smoke
Feature: US1006_Dinamik_url_test

  #Yeni bir feature file olusturalim: US1006_Dinamik_url_test.feature
  #Yeni bir Scenario olusturalim: TC08_yazilan_her_url’e_gitmeli
  #Configuration.properties dosyasinda tanimlanmis tum url’lerden key olarak
  #yazdigimda ilgili sayfaya gidecek sekilde bir
  #stepdefinition olusturun.
  #Bu stepdefinition’i amazon_url, bestbuy_url
  #ve ebay_url ile test edin


  Scenario Outline: TC08_yazilan_her_url’e_gitmeli
    When kullanici "<aranan_url>" sayfasina gider
    Then "<aranan_url>" de oldugunu test eder
    And kullanici sayfayi kapatir

    Examples:
      |aranan_url   |
      |bestbuy_url  |
      |amazon_url   |
      |ebay_url     |
      |chrome_url   |

