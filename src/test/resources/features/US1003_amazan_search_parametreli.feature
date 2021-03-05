@amazon
Feature: US1003_amazan_search_parametreli

  Scenario: TC05_parametre_kullanma
    When kullanici amazon sayfasina gider
    And "iphone" icin arama yapar
    Then sonuclarin "iphone" icerdigini test eder
    And kullanici sayfayi kapatir

