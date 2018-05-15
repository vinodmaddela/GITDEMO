package pages;

import config.TestConfig;
import lib.WebDriverLib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RSHomePage {

    WebDriver driver;
    WebDriverLib lib;
    public RSHomePage(WebDriver driver){
        this.driver=driver;
        lib=new WebDriverLib(this.driver);
    }

    @FindBy(xpath = "//a[@class='menu brands-menu']")
    public WebElement brandsMenu;

    @FindBy(xpath = "//a[@href='/web/b/siemens/']")
    public WebElement siemensbrand;

    @FindBy(xpath = "//img[@title='Siemens']")
    public WebElement brandTitle;

    @FindBy(xpath = "//a[contains(.,'SIMATIC IOT2020 - The Industrial Gateway')]")
    public WebElement featuredProducts;

    @FindBy(xpath = ".//*[@id='campaign-page-wrap']/div[3]/div/div/div[5]/p/a")
    public WebElement buyProduct;

    @FindBy(xpath = "//*[@class='add-to-basket-container']/div[1]/button")
    public WebElement addToBasket;

    @FindBy(xpath = "//button[contains(.,'View Basket')]")
    public WebElement viewCart;

    @FindBy(xpath = ".//*[@id='checkoutSecurelyAndPuchBtn']")
    public WebElement productCheckout;

    public void open() {
        driver.get(TestConfig.url);
    }

    public void brands()
    {
        lib.elementClick(brandsMenu);
    }


    public void selectBrand()
    {
        lib.elementClick(siemensbrand);
    }

    public void brandTitle()
    {
        lib.waitForElementVisible(brandTitle);
    }
    public void productClick()
    {
        lib.elementClick(featuredProducts);
    }

    public void buyNow()
    {
        lib.elementClick(buyProduct);
    }

    public void addToBasket()
    {
        lib.elementClick(addToBasket);
    }

    public void viewCart()
    {
        lib.elementClick(viewCart);
    }

    public void checkout()
    {
        lib.elementClick(productCheckout);
    }

}
