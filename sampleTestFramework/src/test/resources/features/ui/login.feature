Feature: Login

  @web
  Scenario: Verify that a user can login to sauce demo app
    Given that a user launch sauce demo website
    When a user enter userName "standard_user"
    And a user enter password "secret_sauce"
    And click login button
    Then the user should be login successfully

  @web
  Scenario: 01_Verify that a user can convert pounds to naira
#    Given that the exchange rate for rate calculator is set as below
#      | rate | fromCurrency | toCurrency |
#      | 2000 | gbp          | ngn        |
    Given that a user loads an application under test
#    When a user inputs 5 into GBP text field
#    Then a user sees 10000.00 value in NGN text field
#    When a user clicks on Send Now button
#    And a user selects Union Bank as the bank option
#    And a user inputs 1234567891 as the account number
#    And a user clicks on Send button
#    Then the text Transaction successful! message should appear

#  Scenario: 02_Verify that beneficiary date is upto 10 digits
#    Given that the exchange rate for rate calculator is set as below
#      | rate | fromCurrency | toCurrency |
#      | 2500 | gbp          | ngn        |
#    And that a user loads an application under test
#    When a user inputs 5 into GBP text field
#    Then a user sees 12500.00 value in NGN text field
#    When a user clicks on Send Now button
#    And a user selects Union Bank as the bank option
#    And a user inputs 123456789 as the account number
#    And a user clicks on Send button
#    Then the error message contains enter a valid 10 digit account number