Feature: Find given number is even or odd

  Scenario: Checking for even number
    Given Execute CucumberService isEvenOrOdd
    When if i will enter 4
    Then we should get even

  Scenario: Checking for odd number
    Given Execute CucumberService isEvenOrOdd
    When if i will enter 7
    Then we should get odd

