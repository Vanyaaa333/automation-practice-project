package pages;

import components.AbstractComponent;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;

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


}
