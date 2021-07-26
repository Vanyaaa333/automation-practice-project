package elements.NewUserFormElements;

import elements.AbstractElement;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.LocatorsUtil;

@Log4j2
public class RegisterFormSelectElements extends AbstractElement {

    private static final String SELECT_ELEMENT_PATTERN = "%s";
    private final WebElement element;

    public RegisterFormSelectElements(WebDriver driver, String label) {
        super(driver,5);
        this.element = LocatorsUtil.createById(driver, SELECT_ELEMENT_PATTERN, label);
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

