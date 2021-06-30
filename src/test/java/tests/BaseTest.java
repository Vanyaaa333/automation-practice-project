package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import steps.LoginSteps;

import java.util.concurrent.TimeUnit;

@Log4j2
public class BaseTest {

    protected WebDriver driver;
    protected LoginSteps loginSteps;

    @BeforeMethod
    public void setup() {
        log.info("Initialization of the configuration");
        ChromeOptions options = new ChromeOptions();
        options.addArguments(
                "disable-infobars",
                //"--headless",
                "--disable-extensions",
                "--disable-dev-shm-usage",
                "--no-sandbox",
                "--window-size=1920x1080"
        );

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        loginSteps = new LoginSteps(driver);
    }

    @AfterMethod
    public void tearDown() {
        log.info("Closing the driver");
        driver.quit();
    }

}
