Feature: Amazon Search

  Scenario: TC01 Kullanici amazonda Nutella aratir

    Given Kullanici amazon sayfasina gider
    Then Kullanici nutella aratir
    And sonuclarin Nutella icerdigini test eder
    And  sayfayi kapatir

  Scenario: TC02 Kullanici amazonda Nutella aratir

    Given Kullanici amazon sayfasina gider
    Then Kullanici Selenium aratir
    And sonuclarin Selenium icerdigini test eder
    And  sayfayi kapatir