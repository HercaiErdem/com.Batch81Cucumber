@auto
Feature: Kullanici giris testi

  Scenario: Kullanici sitede hesap olusturur

    # http://automationpractice.com/index.php sayfasina gidelim
    Given kullanici "autoUrl" sayfasina gider
    And kullanici sign in linkine tiklar
    And kullanici Create and account bolumune email adresi girer
    And kullanici Create an Account butonuna basar
    And kullanici kisisel bilgilerini ve iletisim bilgilerini girer
    And kullanici Register butonuna basar
    Then kullanicinin hesap olusturuldugunu dogrulayin
    And sayfayi kapatir
