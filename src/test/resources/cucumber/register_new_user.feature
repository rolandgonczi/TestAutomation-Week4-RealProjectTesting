Feature: Register new user
  Can I register new user?

  Scenario: Register new user
    Given eeeasy in running on localhost:3000
    When I click the Register button
    And I enter the "<username>"
    And I enter the "<email>"
    And I enter the "<password>"
    And I click the Register button
    Then The registration box disappeared