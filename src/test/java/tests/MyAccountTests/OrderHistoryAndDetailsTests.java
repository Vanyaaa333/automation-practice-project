package tests.MyAccountTests;


import io.qameta.allure.*;
import org.testng.annotations.Test;
import tests.PreconditionsForSomeTests;

@Owner("Kazak Ivan")
@Epic("Smoke test")
@Feature("OrderHistoryAndDetailsTests")
public class OrderHistoryAndDetailsTests extends PreconditionsForSomeTests {

    @Test(description = "Load order file")
    @Severity(value = SeverityLevel.NORMAL)
    public void loadOrderFileTest() throws InterruptedException {
        orderHistoryAndDetailsSteps
                .clickOrderHistoryAndDetailsButton()
                .sortOrdersByFirstDate()
                .loadOrderFile()
                .deleteLoadedFile();
    }

    @Test(description = "Reorder purchased product")
    @Severity(value = SeverityLevel.MINOR)
    public void reorderProductTest(){
        orderHistoryAndDetailsSteps
                .clickOrderHistoryAndDetailsButton();
        mainMenuComponentSteps
                .isCartEmpty();
        orderHistoryAndDetailsSteps
                .clickReorderButton();
        mainMenuComponentSteps
                .isProductNumberInCartRight("1");

    }

    @Test(description = "Leaving comment about order")
    @Severity(value = SeverityLevel.MINOR)
    public void leavingCommentAboutOrder(){
        orderHistoryAndDetailsSteps
                .clickOrderHistoryAndDetailsButton()
                .chooseAndClickToAnyOrder()
                .writingCommentToTextField()
                .clickSendCommentButton()
                .wasCommentSentSuccess();


    }

}
