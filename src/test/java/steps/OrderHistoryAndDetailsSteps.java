package steps;

import elements.OrderHistoryAndDetailsElements.SelectElement;
import elements.OrderHistoryAndDetailsElements.TextFieldElement;
import io.qameta.allure.Step;
import models.NewUserModel.NewUserModel;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.MyAccountPages.MyAccountPage;
import pages.MyAccountPages.OrderHistoryPage;

import static pages.MyAccountPages.MyAccountPage.ORDER_HISTORY_AND_DETAILS_BUTTON;
import static pages.MyAccountPages.OrderHistoryPage.*;

public class OrderHistoryAndDetailsSteps extends AbstractStep{

    protected OrderHistoryPage orderHistoryPage = new OrderHistoryPage(driver,3);
    protected MyAccountPage myAccountPage = new MyAccountPage(driver,3);

    public OrderHistoryAndDetailsSteps(WebDriver driver) {
        super(driver);
    }

    @Step("Click to order history and details button, and check that opening right page")
    public OrderHistoryAndDetailsSteps clickOrderHistoryAndDetailsButton() {
        myAccountPage.clickButton(orderHistoryPage,ORDER_HISTORY_AND_DETAILS_BUTTON);
        successfulLoadingPage(orderHistoryPage);
        return this;
    }

    @Step("Sort orders by data")
    public OrderHistoryAndDetailsSteps sortOrdersByFirstDate() {
        orderHistoryPage.clickButton(orderHistoryPage,SORT_BY_DATE_BUTTON);
        return this;
    }

    @Step("Load order file")
    public OrderHistoryAndDetailsSteps loadOrderFile() throws InterruptedException {
        Assert.assertTrue(orderHistoryPage.isCatalogEmpty(),"Catalog isn't empty, delete files");
        Assert.assertTrue(orderHistoryPage
                .loadFile()
                .isFileLoaded()
                ,"File didn't load");
        return this;
    }

    @Step("Delete loaded file")
    public OrderHistoryAndDetailsSteps deleteLoadedFile() {
        Assert.assertTrue(orderHistoryPage.deleteLoadedFile(),"File didn't delete");
        return this;
    }

    @Step("Click reorder button and check that order was added to the cart")
    public OrderHistoryAndDetailsSteps clickReorderButton() {
        orderHistoryPage.clickButton(orderHistoryPage,REORDER_BUTTON);
        return this;
    }

    @Step("Click send comment about order button")
    public OrderHistoryAndDetailsSteps clickSendCommentButton() {
        orderHistoryPage.clickButton(orderHistoryPage,SEND_COMMENT_BUTTON);
        return this;
    }

    @Step("Write comment about order to text field")
    public OrderHistoryAndDetailsSteps writingCommentToTextField() {
        new SelectElement(driver).chooseSelectedOption(1);
        new TextFieldElement(driver).fillInputField("All well");
        return this;
    }

    @Step("Write comment about order to text field")
    public OrderHistoryAndDetailsSteps wasCommentSentSuccess() {
        Assert.assertEquals(orderHistoryPage.getActualLocatorText(SUCCESSFULLY_COMMENT_SENT_ALERT),SUCCESSFULLY_COMMENT_SENT_LABEL,
                "Comment didn't send");
        return this;
    }

    @Step("Chose and click to and order")
    public OrderHistoryAndDetailsSteps chooseAndClickToAnyOrder() {
       orderHistoryPage.clickButton(orderHistoryPage,ORDER_REFERENCE_BUTTON);
        return this;
    }


}
