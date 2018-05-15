package stepDefinations;

import cucumber.api.java.en.Then;

public class HomePageSearchStep extends Pages{

    @Then("^user enter part numbers in the search text box$")
    public void user_enter_part_numbers_in_the_search_text_box() throws Throwable {
    hps.enterSearch();
    }

    @Then("^user is returned with relevant product$")
    public void user_is_returned_with_relevant_product() throws Throwable {
    hps.searchResult();
    }
}
