package stepDefinations;

import cucumber.api.java.en.Then;

public class QuickSearchStep extends Pages{
    @Then("^user enters RS Stock No in the quick order text box$")
    public void user_enters_RS_Stock_No_in_the_quick_order_text_box() throws Throwable {
        qsp.enter_rspart_no();
    }

    @Then("^user clicks on button Add to Basket$")
    public void user_clicks_on_button_Add_to_Basket() throws Throwable {
        qsp.place_quickorder();
    }



}
