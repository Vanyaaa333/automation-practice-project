package pages.MyAccountPages;

import constants.PagesConstants;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;
import utils.PropertiesUtil;

import java.io.File;
import java.util.List;

@Log4j2
public class OrderHistoryPage extends BasePage {

    private static final By ODER_HISTORY_PAGE_LABEL = By.xpath("//h1[text()='Order history']");
    protected final By DOWNLOAD_FILE_LOCATOR = By.xpath("//tr[@class='last_item alternate_item']//td[@class='history_invoice']//a");
    public static final By SORT_BY_DATE_BUTTON = By.xpath("//th[contains(.,'Date')]");
    public static final By REORDER_BUTTON = By.xpath("//a[@title='Reorder']");
    public static final By SEND_COMMENT_BUTTON = By.xpath("//button[@name='submitMessage']");
    public static final By SUCCESSFULLY_COMMENT_SENT_ALERT = By.xpath("//p[@class='alert alert-success']");
    public static final By ORDER_REFERENCE_BUTTON = By.xpath("//a[@class='color-myaccount']");
    public static final String SUCCESSFULLY_COMMENT_SENT_LABEL = "Message successfully sent";

    private final File file = new File(PropertiesUtil.getSystemProperty("download_dir")+"IN116826.pdf");

    public OrderHistoryPage(WebDriver driver, int timeOutInSeconds) {
        super(driver, timeOutInSeconds);
    }

    @Override
    public void isPageLoadedWaiter() {
        log.info("Checking that the Order history page was opened");
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(ODER_HISTORY_PAGE_LABEL));
    }

    @Override
    public BasePage openPage() {
        log.info("Open Order history Page {}", PagesConstants.ODER_HISTORY_PAGE_URL);
        driver.get(PagesConstants.ODER_HISTORY_PAGE_URL);
        return this;
    }

    public OrderHistoryPage loadFile() throws InterruptedException {
        driver.findElement(DOWNLOAD_FILE_LOCATOR).click();
        Thread.sleep(3000);
        return this;
    }

    public boolean  isCatalogEmpty(){
        boolean actualResult = true;
        if(file.exists()){
            actualResult = false;
        }
        return actualResult;
    }

    public boolean isFileLoaded(){
        boolean actualResult = false;
        if(file.exists()){
            actualResult = true;
        }
        return actualResult;
    }

    public boolean deleteLoadedFile(){
        boolean actualResult = false;
        if(file.delete()){
            actualResult = true;
        }
        return actualResult;
    }


}
