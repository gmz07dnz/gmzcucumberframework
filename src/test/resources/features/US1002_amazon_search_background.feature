@amazon
Feature: US1002_amazon_search_background
Background:
  Given kullanici amazon sayfasina gider


  Scenario: TC02_amazon_iphone_arama_testi
    And iphone icin arama yapar
    Then sonuclarin iphone icerdigini test eder
    And kullanici sayfayi kapatir


  Scenario: TC03_amazon_teapot_arama_testi
    And  teapot icin arama yapar
    Then sonuclarin teapot icerdigini test eder
    And kullanici sayfayi kapatir


  Scenario: TC04_amazon_flower_arama_testi
    And flower icin arama yapar
    Then sonuclarin flower icerdigini test
    And kullanici sayfayi kapatir