Feature: Can I open the posts?
  Can I open the posts?

  Scenario: Post opens
    Given the main page loaded
    When I click the title of a post
    Then I should see the post details