Feature: Is it eeeasy?
  Can I open the website?

Scenario: Website opens
  Given eeeasy in running on localhost:3000
  When I open localhost:3000
  Then I should see the main page