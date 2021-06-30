package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.BasePage;

public class AbstractStep {

    WebDriver driver;
    public final int POSITIVE_EXPECTED_RESULT = 1;
    public final int NEGATIVE_EXPECTED_RESULT = 0;

    public AbstractStep(WebDriver driver) {
        this.driver = driver;
    }

    protected void successfulLoadingPage(BasePage page) {
        Assert.assertTrue(page.isPageLoaded(), page.getClass().getSimpleName() + " isn't opened");
    }

    public void isResponseToSomeStepRight(By actualResult, int expectedResult, String stepName) {
        org.junit.Assert.assertEquals(String.format("Response to %s isn't right", stepName), expectedResult,
                driver.findElements(actualResult).size());
    }


}
