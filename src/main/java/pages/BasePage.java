package pages;

import components.AbstractComponent;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Log4j2
public abstract class BasePage extends AbstractComponent {

    public BasePage(WebDriver driver, int timeOutInSeconds) {
        super(driver, timeOutInSeconds);
    }

    public boolean isPageLoaded() {
        try {
            isPageLoadedWaiter();
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    abstract public void isPageLoadedWaiter();

    abstract public BasePage openPage();

    public BasePage clickButton(BasePage page, By buttonLocator){
        driver.findElement(buttonLocator).click();
        return page;
    }

    public String getActualLocatorText(By locator) {
        log.info("Get the actual product name");
        WebElement element = driver.findElement(locator);
        return element.getText().trim();
    }

}
