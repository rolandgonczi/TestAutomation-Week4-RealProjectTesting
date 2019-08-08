Feature: Login as a user
  Can I login as a user?

  Scenario Outline: Register new user
    Given eeeasy in running on localhost:3000
    When I click the Sign in button
    And I enter "<username>"
    And I enter "<password>"
    And I click the Login button
    Then I logged in


    Examples:
      |  username       |  password  |
      |  Friday         |  Friday    |
      |  Sunday         |  Sunday    |
      |  Almafa         |  Almafa    |