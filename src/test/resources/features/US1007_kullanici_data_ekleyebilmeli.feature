
Feature: US1007_kullanici_data_ekleyebilmeli
  #Yeni bir feature file olusturun: US1007_kullanici_data_ekleyebilmeli
  #DataTableStepDefinition dosyasi ve gerekli step definition’lari olusturun
  #        When kullanici https://editor.datatables.net/ adresine gider
  #        Then new butonuna basar
  #        And tum bilgileri girer
  #        And Create tusuna basar
  #        When kullanici ilk isim ile arama yapar
  #        Then isim bolumunde isminin oldugunu dogrular



  Scenario Outline: TC09_5_farkli_kisi_ile_farkli_kombinasyonlari_calismali
    When kullanici "dataTable_Url" sayfasina gider
    Then new butonuna basar
    And first name girer "<firstName>"
    And Last name girer "<lastName>"
    And kullanici "1" saniye bekler
    And Postion girer "<position>"
    And Office girer "<office>"
    And Extention girer "<extension>"
    And Start date girer "<date>"
    And Salary girer "<salary>"
    And Create tusuna basar
    When kullanici "<firstName>" ile arama yapar
    Then isim bolumunde "<firstName>" oldugunu dogrular
    Examples:
      | firstName | lastName | position | office  | extension | date      | salary |
      |mehmet     |bulut     |teacher   |ankara   |---        |12-30-2020 |1000    |
      |yasin      |kaya      |manager   |ankara   |--         |12-12-2020 |10000   |
      |cevat      |fehmi     |tester    |istanbul |Dr         |11/10/2020 |12500000|
      |adnan      |calis     |QA lead   |berlin   |Master     |10-10-2020 |-25000  |
      |selin      |gul       |Manuel tester|munih |--         |5/5/2020   |1256125 |
    