@purchase
Feature: User selects and purchases from RS Component website

  Scenario: user should be able to purchase the item
    Given user is on RS Components website landing page
    When user clicks on brands menu tab
    And selects siemens brand
    Then user should be directed to the siemens products page
    Then user clicks on the product and clicks buy
    Then user clicks on add to basket
    Then user clicks on view basket
    And clicks on checkout button for purchase