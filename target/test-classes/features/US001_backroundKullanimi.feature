@Background
Feature: US001 Backround Kullanimi

  Background: Ortak adimlar
    Given Kullanici amazon sayfasina gider

  Scenario: TC01 Kullanici amazonda Nutella aratir

    Then Kullanici nutella aratir
    And sonuclarin Nutella icerdigini test eder

  Scenario: TC02 Kullanici amazonda Selenium aratir

    Then Kullanici Selenium aratir
    And sonuclarin Selenium icerdigini test eder

  Scenario: TC03 Kullanici amazonda Iphone aratir

    Then Kullanici Iphone aratir
    And sonuclarin Iphone icerdigini test eder
    And  sayfayi kapatir

