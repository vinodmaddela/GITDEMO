$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("search.feature");
formatter.feature({
  "line": 2,
  "name": "user searches for items",
  "description": "",
  "id": "user-searches-for-items",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@search"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "user searches products with RS Stock No",
  "description": "",
  "id": "user-searches-for-items;user-searches-products-with-rs-stock-no",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on RS Components website landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters RS Stock No in the quick order text box",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user clicks on button Add to Basket",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user should see his item in the basket summary page",
  "keyword": "Then "
});
formatter.match({
  "location": "RSHomePageStep.user_is_on_RS_Components_website_landing_page()"
});
formatter.result({
  "duration": 9075297562,
  "status": "passed"
});
formatter.match({
  "location": "QuickSearchStep.user_enters_RS_Stock_No_in_the_quick_order_text_box()"
});
formatter.result({
  "duration": 6011041976,
  "status": "passed"
});
formatter.match({
  "location": "QuickSearchStep.user_clicks_on_button_Add_to_Basket()"
});
formatter.result({
  "duration": 2219858565,
  "status": "passed"
});
formatter.match({
  "location": "QuickSearchStep.user_should_see_his_item_in_the_basket_summary_page()"
});
formatter.result({
  "duration": 162355637,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "user search for products by applying filters",
  "description": "",
  "id": "user-searches-for-items;user-search-for-products-by-applying-filters",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "user is on RS Components website landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "user clicks on All Products tab",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user selects connectors from the dropdown list",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user clicks on Audio and Video connectors",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user clicks on HDMI connectors from categories",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user narrows search by applying filter based on brand",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user selects Molex brand and click apply filters button",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user should see products by the applied filters",
  "keyword": "Then "
});
formatter.match({
  "location": "RSHomePageStep.user_is_on_RS_Components_website_landing_page()"
});
formatter.result({
  "duration": 7700416359,
  "status": "passed"
});
formatter.match({
  "location": "FilterSearchStep.user_clicks_on_All_Products_tab()"
});
formatter.result({
  "duration": 200873,
  "status": "passed"
});
formatter.match({
  "location": "FilterSearchStep.user_selects_connectors_from_the_dropdown_list()"
});
formatter.result({
  "duration": 34360,
  "status": "passed"
});
formatter.match({
  "location": "FilterSearchStep.user_clicks_on_Audio_and_Video_connectors()"
});
formatter.result({
  "duration": 31717,
  "status": "passed"
});
formatter.match({
  "location": "FilterSearchStep.user_clicks_on_HDMI_connectors_from_categories()"
});
formatter.result({
  "duration": 44555,
  "status": "passed"
});
formatter.match({
  "location": "FilterSearchStep.user_narrows_search_by_applying_filter_based_on_brand()"
});
formatter.result({
  "duration": 36625,
  "status": "passed"
});
formatter.match({
  "location": "FilterSearchStep.user_selects_Molex_brand_and_click_apply_filters_button()"
});
formatter.result({
  "duration": 35870,
  "status": "passed"
});
formatter.match({
  "location": "FilterSearchStep.user_should_see_products_by_the_applied_filters()"
});
formatter.result({
  "duration": 38514,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "user enter incorrect data or part numbers",
  "description": "",
  "id": "user-searches-for-items;user-enter-incorrect-data-or-part-numbers",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "user is on RS Components website landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "user enter part numbers in the search text box",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "user is returned with relevant product",
  "keyword": "Then "
});
formatter.match({
  "location": "RSHomePageStep.user_is_on_RS_Components_website_landing_page()"
});
formatter.result({
  "duration": 6932145313,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSearchStep.user_enter_part_numbers_in_the_search_text_box()"
});
formatter.result({
  "duration": 191056,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSearchStep.user_is_returned_with_relevant_product()"
});
formatter.result({
  "duration": 37758,
  "status": "passed"
});
});