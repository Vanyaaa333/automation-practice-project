package pages;

import constants.PagesConstants;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Log4j2
public class CreateAnAccountPage extends BasePage{

    private static final By CREATE_AN_ACCOUNT_LABEL = By.xpath("//h1[text()='Create an account']");
    public static final By REGISTER_BUTTON_LABEL = By.id("submitAccount");

    public CreateAnAccountPage(WebDriver driver, int timeOutInSeconds) {
        super(driver, timeOutInSeconds);
    }

    @Override
    public void isPageLoadedWaiter() {
        log.info("Checking that the Create an account page was opened");
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(CREATE_AN_ACCOUNT_LABEL));
    }

    @Override
    public BasePage openPage() {
        log.info("Open Create an account {}", PagesConstants.CREATE_AN_ACCOUNT_PAGE_URL);
        driver.get(PagesConstants.CREATE_AN_ACCOUNT_PAGE_URL);
        return this;
    }

}
