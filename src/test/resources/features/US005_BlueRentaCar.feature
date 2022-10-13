Feature: US005 Blue RentaCar Login

  Scenario: TC11 kullanici gecerli bilgilerle giris yapar

    Given kullanici "brcUrl" ana sayfasinda
    Then Login yazisina tiklar
    And gecersiz username girer
    And kullanici 2 saniye bekler
    And gecersiz password girer
    And Login butonuna basar
    And kullanici 2 saniye bekler
    Then sayfaya giris yapilamadigini kontrol eder
    And kullanici 2 saniye bekler
    And sayfayi kapatir