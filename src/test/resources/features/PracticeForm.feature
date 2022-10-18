@PracticeForm
Feature: Form doldurma

  Scenario Outline: Practice form doldurma
    # Scenario Outline: ile Frame Workumuza hibrit(behavior and data) ozelligi kazandirmis oluyoruz

    Given Kullanici "https://testpages.herokuapp.com/styled/basic-html-form-test.html" adresine gider
    When username "<kullanici adi>" password "<sifre>" ve textarea "<metin alani>" kisimlarini doldurur
    And bir dosya yukler
    And checkbox_biri secer
    And radio_ikiyi secer
    And selection item_ucu secer
    And dropdown itmem_dortu secer
    And submite tiklar
    Then dosyanin yuklendigini dogrular

    Examples:
      | kullanici adi | sifre | metin alani |
      | kullanici adi | sifre | metin alani |
