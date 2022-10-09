
Feature: Amazon ve Morhipo Makas Search

  Scenario: TC01 trendyol'da makas search
    Given Kullannici Google a gider
    Then trendyol'u aratir
    And Kullanici trendyol sayfasina gider
    Then Arama kutusunda makas aratir
    And Toplam urun sayisini alir


  Scenario: TC02 Mothipo'da makas search
  GivenKullanici morhipo sayfasina gider
    Then Arama kutusunda makas aratir
    And Toplam urun sayisini alir