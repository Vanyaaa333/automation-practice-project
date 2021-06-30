package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsUtil {

    public static WebElement createById(WebDriver driver, String idLocatorValue) {
        return driver.findElement(By.id(idLocatorValue));
    }

    public static WebElement createByXpath(WebDriver driver, String xpathLocatorValue) {
        return driver.findElement(By.xpath(xpathLocatorValue));
    }

}
