@search
Feature: user searches for items

  Scenario: user searches products with RS Stock No
    Given user is on RS Components website landing page
    Then user enters RS Stock No in the quick order text box
    Then user clicks on button Add to Basket
    Then user should see his item in the basket summary page

  Scenario: user search for products by applying filters
    Given user is on RS Components website landing page
    Then user clicks on All Products tab
    Then user selects connectors from the dropdown list
    Then user clicks on Audio and Video connectors
    Then user clicks on HDMI connectors from categories
    Then user narrows search by applying filter based on brand
    Then user selects Molex brand and click apply filters button
    Then user should see products by the applied filters

  Scenario: user enter incorrect data or part numbers
    Given user is on RS Components website landing page
    Then user enter part numbers in the search text box
    Then user is returned with relevant product

