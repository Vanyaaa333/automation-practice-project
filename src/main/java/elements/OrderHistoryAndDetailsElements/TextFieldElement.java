package elements.OrderHistoryAndDetailsElements;

import elements.AbstractElement;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.LocatorsUtil;

@Log4j2
public class TextFieldElement extends AbstractElement {

    private static final String TEXT_FIELD_PATTERN = "textarea";
    private final WebElement element;

    public TextFieldElement(WebDriver driver) {
        super(driver, 5);
        this.element = driver.findElement(By.tagName(TEXT_FIELD_PATTERN));
    }

    @Override
    public boolean isComponentDisplayed() {
        return element.isDisplayed();
    }

    public void fillInputField(String someText) {
        log.info("Send some text to field");
        element.sendKeys(someText);
    }

}
