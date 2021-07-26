package elements.OrderHistoryAndDetailsElements;

import elements.AbstractElement;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.LocatorsUtil;

@Log4j2
public class SelectElement extends AbstractElement {

    private static final String SELECT_ELEMENT_PATTERN = "//select[@name='id_product']";
    private final WebElement element;

    public SelectElement(WebDriver driver) {
        super(driver,5);
        this.element = driver.findElement(By.xpath(SELECT_ELEMENT_PATTERN));
    }

    @Override
    public boolean isComponentDisplayed() {
        return element.isDisplayed();
    }

    public void chooseSelectedOption(int selectedOption) {
        log.info("Select chose option");
        new Select(element).selectByIndex(selectedOption);
    }

}

