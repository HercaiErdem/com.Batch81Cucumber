
Feature: Amazon ve Morhipo Makas Search

  Scenario: TC01 Amazon'da makas search
    Given Kullanici trendyol sayfasina gider
    Then Arama kutusunda makas aratir
    And Toplam urun sayisini alir

    Scenario: TC02 Mothipo'da makas search
      Given Kullanici morhipo sayfasina gider
      Then Arama kutusunda makas aratir
      And Toplam urun sayisini alir