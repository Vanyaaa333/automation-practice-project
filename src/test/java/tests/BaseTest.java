package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import pages.MyAccountPages.MyAddressPage;
import steps.*;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@Log4j2
public class BaseTest {

    protected WebDriver driver;
    protected LoginSteps loginSteps;
    protected WomenCatalogSteps womenCatalogSteps;
    protected ActionsWithProductSteps actionsWithProductSteps;
    protected MainMenuComponentSteps mainMenuComponentSteps;
    protected AddToCartModalPageSteps addToCartModalPageSteps;
    protected ClickElementsSteps clickElementsSteps;
    protected CreatingNewUserSteps creatingNewUserSteps;
    protected OrderHistoryAndDetailsSteps orderHistoryAndDetailsSteps;
    protected MyAddressesSteps myAddressesSteps;

    @BeforeClass
    public void setup() {
        log.info("Initialization of the configuration");
        ChromeOptions options = new ChromeOptions();
        options.addArguments(
                "disable-infobars",
                //"--headless",
                "--disable-extensions",
                "--disable-dev-shm-usage",
                "--no-sandbox",
                "start-maximized"
        );

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        loginSteps = new LoginSteps(driver);
        womenCatalogSteps = new WomenCatalogSteps(driver);
        actionsWithProductSteps = new ActionsWithProductSteps(driver);
        mainMenuComponentSteps = new MainMenuComponentSteps(driver);
        addToCartModalPageSteps = new AddToCartModalPageSteps(driver);
        clickElementsSteps = new ClickElementsSteps(driver);
        creatingNewUserSteps = new CreatingNewUserSteps(driver);
        orderHistoryAndDetailsSteps = new OrderHistoryAndDetailsSteps(driver);
        myAddressesSteps = new MyAddressesSteps(driver);
    }

    public void createNewPage(){
        ((JavascriptExecutor) driver).executeScript("window.open('about:blank','_blank');");
    }

    public void switchToNewPage(){
        String currentPage = null;
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> iterator = handles.iterator();
        while (iterator.hasNext()) {
            currentPage = iterator.next();
        }
        driver.switchTo().window(currentPage);
    }


    @AfterMethod
    public void openNewPage(){
        createNewPage();
        driver.manage().deleteAllCookies();
        driver.close();
        switchToNewPage();
    }

    @AfterClass
    public void tearDown() {
        log.info("Closing the driver");
        driver.quit();
    }

}
