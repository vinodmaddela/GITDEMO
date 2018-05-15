package pages;

import lib.WebDriverLib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuickSearch {

    WebDriver driver;
    WebDriverLib lib;
    public QuickSearch(WebDriver driver){
        this.driver=driver;
        lib=new WebDriverLib(this.driver);
    }

    @FindBy(xpath = "//input[@name='stocknum']")
    public WebElement rs_part_no;

    @FindBy(xpath = "//button[@id='quickOrderBtn']")
    public WebElement quickorder;

    @FindBy(xpath = "//span[contains(.,'241-7652')]")
    public WebElement myBasket;

    public void enter_rspart_no(){
        lib.elementSendValue(rs_part_no,"241-7652");
    }

    public void place_quickorder(){
        lib.elementClick(quickorder);
    }

    public void checkout_basket(){
        lib.waitForElementVisible(myBasket);
    }
}
