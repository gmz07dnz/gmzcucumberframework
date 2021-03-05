@smoke
Feature: US1004_Walmart_parameter_arama


  Scenario Outline: TC07_aranan_kelime_title’da_olmali

    When kullanici wallmart sayfasina gider
    And  wallmart sayfasinda "<arananlar>" icin arama yapar
    Then wallmartta sayfa basliginin "<arananlar>" icerdigini test eder
    And kullanici sayfayi kapatir

    Examples:
      | arananlar |
      |Nutella    |
      |pencil     |
      |milk       |
      |tomatoes   |
      |popcorn    |
