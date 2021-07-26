package components;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Log4j2
public class MainMenuComponent extends AbstractComponent{

    public static final By WOMEN_PAGE_BUTTON = By.xpath("//a[text()='Women']");
    public static final By DRESSES_PAGE_BUTTON = By.xpath("//a[text()='Dresses']");
    public static final By T_SHIRTS_PAGE_BUTTON = By.xpath("//a[text()='T-shirts']");
    public static final By HOPPING_CART = By.xpath("//a[@title='View my shopping cart']");
    public static final By SEARCH_LINE = By.cssSelector("#search_query_top");
    public static final By SIGN_OUT_BUTTON = By.xpath("//a[@title='Log me out']");
    public static final By CONTACT_US = By.xpath("//a[@title='Contact Us']");
    public static final By CUSTOMER_ACCOUNT_BUTTON = By.xpath("//a[@title='View my customer account']");
    public static final By ACTUAL_PRODUCT_NUMBER_IN_CART = By.xpath("//a[@title='View my shopping cart']//span[contains(@class,'ajax_cart_quantity')]");

    public MainMenuComponent(WebDriver driver, int timeOutInSeconds) {
        super(driver, timeOutInSeconds);
    }

    public void openPageOfMainMenu(By pageButton){
        driver.findElement(pageButton).click();
    }

    public String getActualProductNumberInCart() {
        log.info("Get the actual number of products");
        WebElement element = driver.findElement(ACTUAL_PRODUCT_NUMBER_IN_CART);
        return element.getText().trim();
    }


}
