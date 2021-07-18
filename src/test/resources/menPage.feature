Feature: Men Page
  As a user I want to make sure that men page opens (smoke test)

  Scenario Outline: check men page opens
    Given User opens '<homePage>' page
    When User clicks Men page
    And User waits men page opens
    Then User checks that element '<freshFindsButton>' is present on page


    Examples:
      | homePage         | freshFindsButton |
      | https://asos.com | Fresh finds      |