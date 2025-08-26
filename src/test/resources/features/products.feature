Feature: Product Search on OpenCart Demo

  Scenario: Search multiple products
    Given User is on OpenCart Search Page
    When User searches for
      | Laptop |
      | Mobile |
      | Headset |
    Then Products should be displayed
