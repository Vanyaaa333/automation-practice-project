package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractElement {

    protected WebDriver driver;
    protected WebDriverWait explicitlyWait;

    public AbstractElement(WebDriver driver, int timeOutInSeconds) {
        this.driver = driver;
        this.explicitlyWait = new WebDriverWait(driver, timeOutInSeconds);
    }

    abstract public boolean isComponentDisplayed();

}
