Feature: Get a rate

  Scenario: Verify that a user can get a correct rate
    Given that a user make a Get request to get rate
    Then i should get a 200 status code
    And i should be able to get a correct rate
      | rate | fromCurrency | toCurrency |
      | 2000 | GBP          | NGN        |
