package pages;

import lib.WebDriverLib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageSearch {
    WebDriver driver;
    WebDriverLib lib;
    public HomePageSearch(WebDriver driver){
        this.driver=driver;
        lib=new WebDriverLib(this.driver);
    }

    @FindBy(id = "searchTerm")
    public WebElement searchText;

    @FindBy(xpath = "//span[@class='zrSearchTerm']")
    public WebElement searchResult;

    public void enterSearch(){
        lib.elementSendValue(searchText,"123-xyz");
    }

    public void searchResult(){
        lib.waitForElementVisible(searchResult);
    }
}
