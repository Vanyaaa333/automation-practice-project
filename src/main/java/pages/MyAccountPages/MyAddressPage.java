package pages.MyAccountPages;

import constants.PagesConstants;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

@Log4j2
public class MyAddressPage extends BasePage {

    private static final By MY_ADDRESS_PAGE_LABEL = By.xpath("//h3[text()='My address']");
    public static final By ADD_NEW_ADDRESS_BUTTON = By.xpath("//span[contains(.,'Add a new address')]");

    public MyAddressPage(WebDriver driver, int timeOutInSeconds) {
        super(driver, timeOutInSeconds);
    }

    @Override
    public void isPageLoadedWaiter() {
        log.info("Checking that the My address page was opened");
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(MY_ADDRESS_PAGE_LABEL));
    }

    @Override
    public BasePage openPage() {
        log.info("Open My address Page {}", PagesConstants.MY_ADDRESS_PAGE_URL);
        driver.get(PagesConstants.MY_ADDRESS_PAGE_URL);
        return this;
    }

}


