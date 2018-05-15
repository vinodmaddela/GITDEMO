package pages;

import lib.WebDriverLib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilterSearch {

    WebDriver driver;
    WebDriverLib lib;
    public FilterSearch(WebDriver driver){
        this.driver=driver;
        lib=new WebDriverLib(this.driver);
    }

    @FindBy(xpath = "//a[@title='All Products']")
    public WebElement all_Products;

    @FindBy(xpath = "//a[@href='/web/c/connectors/']")
    public WebElement connectors;

    @FindBy(xpath = "//a[@title='Audio & Video Connectors']")
    public WebElement av_connectors;

    @FindBy(xpath = "//a[contains(.,'HDMI Connectors')]")
    public WebElement hdmiConnectors;

    @FindBy(xpath = "//*[@id='filters']/div/div/rs-facets/a[1]")
    public WebElement brand;

    public void allProducts(){
        lib.elementClick(all_Products);
    }

    public void connectors(){
        lib.elementClick(connectors);
    }

    public void avConnectors(){
        lib.elementClick(av_connectors);
    }

    public void hdmiConnectors(){
        lib.elementClick(hdmiConnectors);
    }

    public void selectBrand(){
        lib.selectByElementValue(brand,"Molex");
    }

}
