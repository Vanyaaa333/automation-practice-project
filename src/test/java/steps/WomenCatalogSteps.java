package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.CatalogPages.WomenCatalogPage;

public class WomenCatalogSteps extends AbstractStep{

    protected WomenCatalogPage womenCatalog = new WomenCatalogPage(driver,3);

    public WomenCatalogSteps(WebDriver driver) {
        super(driver);
    }

    @Step("Open women catalog page with URL")
    public WomenCatalogSteps openWomenCatalogPageWithUrl() {
        womenCatalog.openPage();
        successfulLoadingPage(womenCatalog);
        return this;
    }



}
