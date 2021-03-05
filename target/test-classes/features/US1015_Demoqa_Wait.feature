Feature: US1015_Demoqa_Wait
  Scenario:TC20_kullanici alertin yazisini test edebilmeli
    When kullanici "demoqa_url" sayfasina gider
    Then alert yazisina tiklar
    And 2. Click Me butonuna tiklar
    And Alert'in gorunur olmasini bekler
    Then Alert uzerindeki yazinin This alert appeared after 5 seconds oldugunu test edin
    And Ok diyerek alerti kapatin