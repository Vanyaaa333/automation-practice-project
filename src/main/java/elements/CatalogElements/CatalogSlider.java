package elements.CatalogElements;

import elements.AbstractElement;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.LocatorsUtil;

import java.util.List;

@Log4j2
public class CatalogSlider extends AbstractElement {

    private static final String CHECKBOX_PATTERN = "%s";
    private static final String CHANGING_MINIMAL_COST_BUTTON = "//ul[@id='ul_layered_price_0']//a";
    private final WebElement element;
    private static Actions action;


    public CatalogSlider(WebDriver driver, String label, int changingCostNumb) {
        super(driver,5);
        this.element = LocatorsUtil.createByXpath(driver, CHECKBOX_PATTERN, label);
    }

    @Override
    public boolean isComponentDisplayed() {
        return element.isDisplayed();
    }

    public void increasingCost() {
        log.info("Increasing cost");
        action = new Actions(driver);
        List<WebElement> list = driver.findElements(By.xpath(CHANGING_MINIMAL_COST_BUTTON));
        action.click(list.get(1)).build().perform();
        for (int i = 0; i < 10; i++) {
            action.sendKeys(Keys.ARROW_LEFT).build().perform();
        }
    }

}
