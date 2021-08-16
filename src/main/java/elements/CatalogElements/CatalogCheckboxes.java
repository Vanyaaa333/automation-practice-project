package elements.CatalogElements;

import elements.AbstractElement;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.LocatorsUtil;

@Log4j2
public class CatalogCheckboxes extends AbstractElement {

    private static final String CHECKBOX_PATTERN = "//form[@id='layered_form']//a[contains(.,'%s')]/ancestor::li//input";
    private final WebElement element;

    public CatalogCheckboxes(WebDriver driver, String label) {
        super(driver,5);
        this.element = LocatorsUtil.createByXpath(driver, CHECKBOX_PATTERN, label);
    }

    @Override
    public boolean isComponentDisplayed() {
        return element.isDisplayed();
    }

    public void selectCheckbox() {
        log.info("Select checkbox");
        element.click();
    }

}
