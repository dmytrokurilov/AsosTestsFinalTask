Feature: Sign in
  As a user
  I want to test that I can not sign in to the site without any credentials

  Scenario Outline: Check sign in negative
    Given User opens '<homePage>' page
    When User clicks My account icon
    And User checks visibility Sign In button
    And User clicks Sign In button
    And User enters '<email>' email
    And User enters '<password>' password
    And User clicks second Sign In button
    Then User checks that Login error message '<errorMessage>' is displayed

    Examples:
      | homePage         | email             | password | errorMessage                          |
      | https://asos.com | email@example.com | 123456   | Sorry, we cannot log you in right now |

  Scenario Outline: Check join in negative
    Given User opens '<homePage>' page
    When User clicks My account icon
    And User checks visibility Sign In button
    And User clicks Sign In button
    And User clicks New to ASOS header button
    And User clicks Join ASOS button
    Then User checks that Email error message '<errorMessage>' is displayed

    Examples:
      | homePage         | errorMessage                           |
      | https://asos.com | Oops! You need to type your email here |