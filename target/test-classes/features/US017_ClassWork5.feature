Feature: US017 Class Work

  Scenario: explicity wait

    Given kullanici "demoqaUrl" sayfasina gider
    Then kullanici Will enable bes seconds butonunun enable olmasini bekler
    And kullanici Will enable bes seconds butonunun enable oldugunu test eder

