package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponent {

    protected WebDriver driver;
    protected WebDriverWait explicitlyWait;

    public AbstractComponent(WebDriver driver, int timeOutInSeconds) {
        this.driver = driver;
        this.explicitlyWait = new WebDriverWait(driver, timeOutInSeconds);
    }

}
