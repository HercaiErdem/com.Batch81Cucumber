@All
Feature: Amazon Search

  @gp1
  Scenario: TC01 Kullanici amazonda Nutella aratir

    Given Kullanici amazon sayfasina gider
    Then Kullanici nutella aratir
    And sonuclarin Nutella icerdigini test eder

  @gp3
  Scenario: TC02 Kullanici amazonda Selenium aratir

    Given Kullanici amazon sayfasina gider
    Then Kullanici Selenium aratir
    And sonuclarin Selenium icerdigini test eder

  @gp2
  Scenario: TC03 Kullanici amazonda Iphone aratir

    Given Kullanici amazon sayfasina gider
    Then Kullanici Iphone aratir
    And sonuclarin Iphone icerdigini test eder
    And  sayfayi kapatir




