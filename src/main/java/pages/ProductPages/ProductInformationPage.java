package pages.ProductPages;

import constants.PagesConstants;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

@Log4j2
public class ProductInformationPage extends BasePage {

    private static final By PRODUCT_INFORMATION_LABEL = By.xpath("//h3[contains(.,'Data sheet')]");

    public ProductInformationPage(WebDriver driver, int timeOutInSeconds) {
        super(driver, timeOutInSeconds);
    }

    @Override
    public void isPageLoadedWaiter() {
        log.info("Checking that the Product information page was opened");
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(PRODUCT_INFORMATION_LABEL));
    }

    @Override
    public BasePage openPage() {
        return this;
    }

}

