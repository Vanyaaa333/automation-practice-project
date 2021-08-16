package pages.ProductBuyingPages;

import constants.PagesConstants;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

@Log4j2
public class ShippingPage extends BasePage {

    private static final By SHIPPING_PAGE_LABEL = By.xpath("//h1[contains(.,'Shipping')]");
    public static final By PROCEED_TO_CHECKOUT_BUTTON = By.xpath("//button[@name='processCarrier']//span[contains(.,'Proceed to checkout')]");
    public static final By AGREE_TO_THE_TERMS_CHECKBOX = By.xpath("//p[@class='checkbox']//input");

    public ShippingPage(WebDriver driver, int timeOutInSeconds) {
        super(driver, timeOutInSeconds);
    }

    @Override
    public void isPageLoadedWaiter() {
        log.info("Checking that the Shipping page was opened");
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(SHIPPING_PAGE_LABEL));
    }

    @Override
    public BasePage openPage() {
        log.info("Open Shipping Page {}", PagesConstants.SHIPPING_PAGE_URL);
        driver.get(PagesConstants.SHIPPING_PAGE_URL);
        return this;
    }

  }



