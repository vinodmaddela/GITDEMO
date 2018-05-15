package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


public class RSHomePageStep extends Pages{

    @Given("^user is on RS Components website landing page$")
    public void user_is_on_RS_Components_website_landing_page() throws Throwable {
        rshp.open();
        driver.manage().deleteAllCookies();
    }

    @When("^user clicks on brands menu tab$")
    public void user_clicks_on_brands_menu_tab() throws Throwable {
        rshp.brands();
    }

    @When("^selects siemens brand$")
    public void selects_siemens_brand() throws Throwable {
        rshp.selectBrand();
    }

    @Then("^user should be directed to the siemens products page$")
    public void user_should_be_directed_to_the_siemens_products_page() throws Throwable {
        rshp.brandTitle();

    }

    @Then("^user clicks on the product and clicks buy$")
    public void user_clicks_on_the_product_and_clicks_buy() throws Throwable {
        rshp.productClick();
        rshp.buyNow();

    }

    @Then("^user clicks on add to basket$")
    public void user_clicks_on_add_to_basket() throws Throwable {
        JavascriptExecutor js = (JavascriptExecutor) driver;
       WebElement addtocart=driver.findElement(By.xpath("//*[@class='add-to-basket-container']/div[1]/button"));

        js.executeScript("arguments[0].scrollIntoView();",addtocart);
        rshp.addToBasket();

    }
    @Then("^user clicks on view basket$")
    public void user_clicks_on_view_basket() throws Throwable {
        rshp.viewCart();

    }
    @Then("^clicks on checkout button for purchase$")
    public void clicks_on_checkout_button_for_purchase() throws Throwable {
        rshp.checkout();

    }

}
