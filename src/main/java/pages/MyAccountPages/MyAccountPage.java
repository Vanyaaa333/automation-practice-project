package pages.MyAccountPages;

import constants.PagesConstants;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

@Log4j2
public class MyAccountPage extends BasePage {

    private static final By MY_ACCOUNT_LABEL = By.xpath("//h1[text()='My account']");
    public static final By ORDER_HISTORY_AND_DETAILS_BUTTON = By.xpath("//a[@title='Orders']");
    public static final By MY_CREDIT_SLEEPS_BUTTON = By.xpath("//a[@title='Credit slips']");
    public static final By MY_ADDRESSES_BUTTON = By.xpath("//a[@title='Addresses']");
    public static final By MY_WISHLIST_BUTTON = By.xpath("//a[@title='My wishlists']");
    public static final By MY_PERSONAL_INFORMATION_BUTTON = By.xpath("//a[@title='Information']");
    public static final By HOME_BUTTON = By.xpath("//a[@title='Home']");

    public MyAccountPage(WebDriver driver, int timeOutInSeconds) {
        super(driver, timeOutInSeconds);
    }

    @Override
    public void isPageLoadedWaiter() {
        log.info("Checking that the MY ACCOUNT page was opened");
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(MY_ACCOUNT_LABEL));
    }

    @Override
    public BasePage openPage() {
        log.info("Open MY ACCOUNT Page {}", PagesConstants.MY_ACCOUNT_PAGE_URL);
        driver.get(PagesConstants.MY_ACCOUNT_PAGE_URL);
        return this;
    }
}
