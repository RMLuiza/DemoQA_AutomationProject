import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import utils.Utils;

public class HomePageTest extends BaseTest {

    @Test
    public void verifyPageElementsTest() {
        // 1. check if page title is present
        HomePage homePage = new HomePage(this.driver);
        logInPage.scrollToBookStore();
        Utils.waitInSeconds(1);
        logInPage.clickBookStoreButton();
        Utils.waitInSeconds(1);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(homePage.isPageTitlePresent(), "Error ...");
        // 2. check if bookstore title is present

        softAssert.assertAll();
        System.out.println("Hello");
    }
}
