package pages.MyAccountPages;

import constants.PagesConstants;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

@Log4j2
public class YourAddressesPage extends BasePage {

    private static final By YOUR_ADDRESS_PAGE_LABEL = By.xpath("//h1[contains(.,'Your addresses')]");
    public static final By SAVE_BUTTON = By.xpath("//span[contains(.,'Save')]");

    public YourAddressesPage(WebDriver driver, int timeOutInSeconds) {
        super(driver, timeOutInSeconds);
    }

    @Override
    public void isPageLoadedWaiter() {
        log.info("Checking that the Your address page was opened");
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(YOUR_ADDRESS_PAGE_LABEL));
    }

    @Override
    public BasePage openPage() {
        log.info("Open Your address Page {}", PagesConstants.YOUR_ADDRESS_PAGE_URL);
        driver.get(PagesConstants.YOUR_ADDRESS_PAGE_URL);
        return this;
    }

}

