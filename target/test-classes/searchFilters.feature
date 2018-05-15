@searchFilters
Feature:Multiple search based results

  Scenario: invalid search
    Given user opens RS Components website landing page
    When user enters invalid text and clicks search
    Then user gets invalid search message with text box to search again

  Scenario: valid search
    Given user opens RS Components website landing page
    When user enter valid text and clicks search
    Then user is navigated to the products page
    Then user is displayed with prodcuts viewing page

  Scenario: search history
    Given user opens RS Components website landing page
    When user enters random text and clicks search
    Then user is displayed with recent searches
