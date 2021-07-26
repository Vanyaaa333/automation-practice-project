package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsUtil {

    public static WebElement createById(WebDriver driver, String idLocatorValue, String label) {
        return driver.findElement(By.id(StringUtils.format(idLocatorValue, label)));
    }

    public static WebElement createByXpath(WebDriver driver, String xpathLocatorValue, String label) {
        return driver.findElement(By.xpath(StringUtils.format(xpathLocatorValue, label)));
    }

}
