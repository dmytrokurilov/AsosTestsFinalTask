Feature: Mobile apps page
  As a user I can open a Mobile apps page and download an app from Store

  Scenario Outline: check links on mobile apps page
    Given User opens '<homePage>' page
    When User clicks mobile apps link
    And User checks visibility of link for iphone
    And User checks visibility of link for iPad
    And User checks visibility of link for android
    Then User checks that current url contains '<partUrl>'

    Examples:
      | homePage         | partUrl   |
      | https://asos.com | our-apps/ |
