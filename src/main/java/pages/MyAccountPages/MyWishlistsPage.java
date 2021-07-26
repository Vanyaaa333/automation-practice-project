package pages.MyAccountPages;

import constants.PagesConstants;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

@Log4j2
public class MyWishlistsPage extends BasePage {

    private static final By MY_WISHLISTS_PAGE_LABEL = By.xpath("//h1[contains(.,'My wishlists')]");

    public MyWishlistsPage(WebDriver driver, int timeOutInSeconds) {
        super(driver, timeOutInSeconds);
    }

    @Override
    public void isPageLoadedWaiter() {
        log.info("Checking that the My wishlists page was opened");
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(MY_WISHLISTS_PAGE_LABEL));
    }

    @Override
    public BasePage openPage() {
        log.info("Open My wishlists Page {}", PagesConstants.MY_WISHLISTS_PAGE_URL);
        driver.get(PagesConstants.MY_WISHLISTS_PAGE_URL);
        return this;
    }

}


