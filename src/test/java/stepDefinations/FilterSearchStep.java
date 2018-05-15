package stepDefinations;

import cucumber.api.java.en.Then;

public class FilterSearchStep extends Pages{

    @Then("^user clicks on All Products tab$")
    public void user_clicks_on_All_Products_tab() throws Throwable {
    fs.allProducts();
    }

    @Then("^user selects connectors from the dropdown list$")
    public void user_selects_connectors_from_the_dropdown_list() throws Throwable {
    fs.connectors();
    }

    @Then("^user clicks on Audio and Video connectors$")
    public void user_clicks_on_Audio_and_Video_connectors() throws Throwable {
    fs.avConnectors();
    }

    @Then("^user clicks on HDMI connectors from categories$")
    public void user_clicks_on_HDMI_connectors_from_categories() throws Throwable {
    fs.hdmiConnectors();
    }

    @Then("^user narrows search by applying filter based on brand$")
    public void user_narrows_search_by_applying_filter_based_on_brand() throws Throwable {
    fs.selectBrand();
    }

    @Then("^user selects Molex brand and click apply filters button$")
    public void user_selects_Molex_brand_and_click_apply_filters_button() throws Throwable {

    }

    @Then("^user should see products by the applied filters$")
    public void user_should_see_products_by_the_applied_filters() throws Throwable {
    }

}
