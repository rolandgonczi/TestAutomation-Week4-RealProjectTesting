Feature: Register new user
  Can I register new user?

  Scenario Outline: Register new user
    Given eeeasy in running on localhost:3000
    When I click the Register button
    And I enter the "<username>"
    And I enter the "<email>"
    And I enter the "<password>"
    And I submit my Registration
    Then The registration box disappeared

    Examples:
      |  username       |      email               |  password  |
      |  Friday         |    friday@friday.com     |  Friday    |
      |  Sunday         |    sunday@sunday.com     |  Sunday    |
      |  Almafa         |    almafa@almafa.com     |  Almafa    |