package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class BrowserCreator {

    public String browser;
    public String URL;
    public WebDriver driver;

    public WebDriver getBrowser(){
        browser=TestConfig.getBrowser();
        

        switch(browser){
            case "Firefox":{
                driver=getFirefoxBrowser(true);
                break;
            }
            case "IE":{
                driver=getIEBrowser(true);
                break;
            }
            case "Chrome":{
                driver=getChromeBrowser(true);
                break;
            }
            default:System.out.println("Browser not valid.");
        }

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(URL);
        return driver;
    }

    private WebDriver getIEBrowser(boolean b) {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ File.separator+"config/IEDriverServer.exe");
        return new InternetExplorerDriver();
    }

    private WebDriver getChromeBrowser(boolean javascriptEnabled) {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ File.separator+"config/chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-extensions");
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--incognito");
        return new ChromeDriver(options);

    }

    private WebDriver getFirefoxBrowser(boolean javascriptEnabled) {
        System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ File.separator+"config/geckodriver.exe");
        return new FirefoxDriver();
    }
}
