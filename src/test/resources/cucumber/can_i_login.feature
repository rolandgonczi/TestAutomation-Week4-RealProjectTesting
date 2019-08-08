Feature: Login as a user
  Can I login as a user?

  Scenario: Register new user
    Given eeeasy in running on localhost:3000
    When I click the Sign in button
    And I enter the "<username>"
    And I enter the "<password>"
    And I click the Login button
    Then I logged in