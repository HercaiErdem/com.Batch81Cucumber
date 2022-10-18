Feature: US017 Class Work

  Scenario: explicity wait

    Given kullanici "demoqaUrl" sayfasina gider
    When kullanici Visible After bes seconds butonunun gorunur olmasini bekler
    And kullanici Visible After bes seconds butonunun gorunur oldugunu test eder