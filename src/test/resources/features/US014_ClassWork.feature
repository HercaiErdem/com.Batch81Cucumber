@webPage
Feature: US14 Class Work

  Scenario: Kullanici ve Url Testi
    Given kullanici "webUrl" sayfasina gider
    When kullanici 3 saniye bekler
    Then kullanici Login Portala kadar asagi iner
    And kullanici Login Portala tiklar
    When kullanici 3 saniye bekler
    And kullanici diger windowa gecer
    And kullanici "username" kutusuna bilgileri girer
    When kullanici 3 saniye bekler
    And kullanici "password" bolumune bilgileri girer
    When kullanici 3 saniye bekler
    And kullanici login butonuna basar
    And kullanici Popup'ta cikan yazinin validation failed oldugunu test eder
    When kullanici 3 saniye bekler
    And kullanici Ok diyerek Popup'i kapatir
    And kullanici ilk sayfaya geri doner
    When kullanici 3 saniye bekler
    And kullanici ilk sayfaya donuldugunu test eder
    When kullanici 3 saniye bekler
