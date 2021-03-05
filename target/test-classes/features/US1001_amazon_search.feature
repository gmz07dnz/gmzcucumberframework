@amazon
Feature: US1001 amazon page search


  Scenario: TC01 amazon arama testi

  #When kullanici amazon sayfasina gider
  #  And iPhone icin arama yapar
  # Then sonuclarin Iphone icerdigini test eder
  #  When kullanici amazon sayfasina gider
  # And teapot icin arama yapar
  #  Then sonuclarin tea pot icerdigini test eder
  # When kullanici amazon sayfasina gider
  # And flower icin arama yapar
  # Then sonuclarin flower icerdigini test eder

  Given kullanici amazon sayfasina gider
  And iphone icin arama yapar
  Then sonuclarin iphone icerdigini test eder

  Given kullanici amazon sayfasina gider
  And teapot icin arama yapar
  Then sonuclarin teapot icerdigini test eder


  Given kullanici amazon sayfasina gider
  And flower icin arama yapar
  Then sonuclarin flower icerdigini test
    And kullanici sayfayi kapatir