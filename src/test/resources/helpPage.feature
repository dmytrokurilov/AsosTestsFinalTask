Feature: Help page
  As a user I want to check the help page functionality, so the site user can get helped

  Scenario Outline: check user can get help on the help page
    Given User opens '<homePage>' page
    When User clicks Help link
    And User clicks contacts button
    Then User checks the '<chatNowLink>' link text

    Examples:
      | homePage         | chatNowLink                                             |
      | https://asos.com | Chat Now (Online) - Approximate wait time is 5 minutes. |