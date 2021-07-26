package elements.NewUserFormElements;

import elements.AbstractElement;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.LocatorsUtil;

@Log4j2
public class RegisterFormInputRadio extends AbstractElement {

    private static final String INPUT_RADIO_PATTERN = "%s";
    private final WebElement element;

    public RegisterFormInputRadio(WebDriver driver, String label) {
        super(driver,5);
        this.element = LocatorsUtil.createById(driver, INPUT_RADIO_PATTERN, label);
    }

    @Override
    public boolean isComponentDisplayed() {
        return element.isDisplayed();
    }

    public void clickSelectField() {
        log.info("Fill input radio field");
        element.click();
    }

}
