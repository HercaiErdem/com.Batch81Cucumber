Feature: Amazon Search

  Scenario: TC01 Kullanici amazonda Nutella aratir

    Given Kullanici amazon sayfasina gider
    Then Kullanici nutella aratir
    And sonuclarin Nutella icerdigini test eder
    And  sayfayi kapatir