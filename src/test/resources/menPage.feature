Feature: Men Page
  As a user I want to make sure that men page opens (smoke test)

  Scenario Outline: check men page opens
    Given User opens '<homePage>' page
    When User clicks Men page
    And User waits men page opens
    Then User checks that element '<skinnyJeansButton>' is present on page


    Examples:
      | homePage         | skinnyJeansButton |
      | https://asos.com | SKINNY JEANS      |