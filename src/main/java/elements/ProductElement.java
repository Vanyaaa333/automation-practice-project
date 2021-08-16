package elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.LocatorsUtil;

@Log4j2
public class ProductElement extends AbstractElement{

    private static final String PRODUCT_PATTERN = "//ul[@class='product_list grid row']//a[contains(.,'%s')]";
    private static final String ADD_TO_CART_PRODUCT_PATTERN = "//ul[@class='product_list grid row']//a[contains(.,'%s')]/ancestor::div[@class='right-block']//span[text()='Add to cart']";
    private static final String MORE_PRODUCT_INFORMATION_PATTERN = "//ul[@class='product_list grid row']//a[contains(.,'%s')]/ancestor::div[@class='right-block']//span[text()='More']";
    private final WebElement productElement;
    private final WebElement addToCartElement;
    private final WebElement moreProductInformationElement;

    public ProductElement(WebDriver driver, String label) {
        super(driver,5);
        this.productElement = LocatorsUtil.createByXpath(driver, PRODUCT_PATTERN, label);
        this.addToCartElement = LocatorsUtil.createByXpath(driver, ADD_TO_CART_PRODUCT_PATTERN, label);
        this.moreProductInformationElement = LocatorsUtil.createByXpath(driver, MORE_PRODUCT_INFORMATION_PATTERN, label);
    }

    @Override
    public boolean isComponentDisplayed() {
        return productElement.isDisplayed();
    }

    public void addProductToCart() {
        log.info("Select product");
        Actions actions = new Actions(driver);
        actions.moveToElement(productElement).moveToElement(addToCartElement).click().build().perform();
    }

    public void getMoreProductInformationToCart() {
        log.info("Get product information");
        Actions actions = new Actions(driver);
        actions.moveToElement(productElement).moveToElement(moreProductInformationElement).click().build().perform();
    }

}
