@web
Feature: Login

  Scenario: Verify that a user can login to sauce demo app
    Given that a user launch sauce demo website
    When a user enter userName "standard_user"
    And a user enter password "secret_sauce"
    And click login button
    Then the user should be login successfully