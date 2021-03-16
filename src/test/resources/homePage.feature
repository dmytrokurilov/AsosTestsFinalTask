Feature: Home
  As a user
  I want to test home page
  So that I can be sure that it works correctly

  Scenario Outline: Check search function
    Given User opens '<homePage>' page
    And User clicks search field
    When User makes search by keyword '<keyword>'
    And User clicks search button
    Then User checks that url field contains '<query>'

    Examples:
      | homePage         | keyword       | query         |
      | https://asos.com | seiko watches | seiko+watches |

  Scenario Outline: Check adding to wishlist (smoke)
    Given User opens '<homePage>' page
    When User clicks men menu item
    And User checks visibility Accessories menu item
    And User clicks Accessories menu item
    And User clicks brand casio menu item
    And User adds any item to wishlist
    And User clicks wishlist icon
    Then User checks that on wishlist page '<moveToBagButton>' is displayed

    Examples:
      | homePage         | moveToBagButton |
      | https://asos.com | MOVE TO BAG     |

  Scenario Outline: Check currency switching
    Given User opens '<homePage>' page
    When User clicks location button
    And User clicks Currency dropdown
    And User clicks Currency dropdown item USD
    And User clicks Update preferences button
    And User clicks location button second time
    And User clicks Currency dropdown second time
    Then user checks that selected currency text '<currencyText>'

    Examples:
      | homePage         | currencyText |
      | https://asos.com | $ USD        |

  Scenario Outline: Check voucher adding negative
    Given User opens '<homePage>' page
    When User clicks Gift vouchers link
    And User clicks Orange voucher button
    And User clicks Voucher twenty pounds button
    And User clicks Pay securely now button
    Then User checks that '<alert>' text is displayed

    Examples:
      | homePage         | alert                                                       |
      | https://asos.com | Oops, you need to enter an email address for the recipient. |

  Scenario Outline: Check Facebook link opens
    Given User opens '<homePage>' page
    When User clicks Facebook icon
    And User waits page loading
    Then User checks opened '<facebookUrl>'

    Examples:
      | homePage         | facebookUrl       |
      | https://asos.com | facebook.com/ASOS |