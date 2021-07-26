package pages.MyAccountPages;

import constants.PagesConstants;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

@Log4j2
public class PersonalInformationPage extends BasePage {

    private static final By PERSONAL_INFORMATION_PAGE_LABEL = By.xpath("//h1[contains(.,'Your personal')]");

    public PersonalInformationPage(WebDriver driver, int timeOutInSeconds) {
        super(driver, timeOutInSeconds);
    }

    @Override
    public void isPageLoadedWaiter() {
        log.info("Checking that the Personal information page was opened");
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(PERSONAL_INFORMATION_PAGE_LABEL));
    }

    @Override
    public BasePage openPage() {
        log.info("Open Personal information Page {}", PagesConstants.PERSONAL_INFORMATION_PAGE_URL);
        driver.get(PagesConstants.PERSONAL_INFORMATION_PAGE_URL);
        return this;
    }

}


