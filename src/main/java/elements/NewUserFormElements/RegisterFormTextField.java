package elements.NewUserFormElements;

import elements.AbstractElement;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.LocatorsUtil;

@Log4j2
public class RegisterFormTextField extends AbstractElement {

    private static final String TEXT_FIELD_PATTERN = "%s";
    private final WebElement element;

    public RegisterFormTextField(WebDriver driver, String label) {
        super(driver, 5);
        this.element = LocatorsUtil.createById(driver, TEXT_FIELD_PATTERN, label);
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