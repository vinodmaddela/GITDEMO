package stepDefinations;

import config.BrowserCreator;
import org.openqa.selenium.support.PageFactory;
import pages.FilterSearch;
import pages.HomePageSearch;
import pages.QuickSearch;
import pages.RSHomePage;

public class Pages extends BrowserCreator{

    public RSHomePage rshp;
    public QuickSearch qsp;
    public FilterSearch fs;
    public HomePageSearch hps;

    public Pages(){
        getBrowser();
        rshp= PageFactory.initElements(driver,RSHomePage.class);
        qsp=PageFactory.initElements(driver, QuickSearch.class);
        fs=PageFactory.initElements(driver,FilterSearch.class);
        hps=PageFactory.initElements(driver,HomePageSearch.class);
    }

}
