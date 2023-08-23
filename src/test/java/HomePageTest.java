import constants.ErrorMessages;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import utils.Utils;

public class HomePageTest extends BaseTest {

    @Test
    public void verifyPageElementsTest() {
        HomePage homePage = new HomePage(this.driver);
        logInPage.scrollToBookStore();
        Utils.waitInSeconds(1);
        logInPage.clickBookStoreButton();
        Utils.waitInSeconds(1);
        SoftAssert softAssert = new SoftAssert();
        // 1. check if page title is present
        softAssert.assertTrue(homePage.isPageTitlePresent(), ErrorMessages.TITLE_IS_MISSING);
        // 2. check if bookstore subtitle is present
        softAssert.assertTrue(homePage.isPageSubtitlePresent(), ErrorMessages.SUBTITLE_IS_MISSING);
        // 3. check if search bar is present
        softAssert.assertTrue(homePage.isSearchBarPresent(), ErrorMessages.SEARCHBAR_IS_MISSING);
        // 4. check if login button is present
        softAssert.assertTrue(homePage.isLoginButtonPresent(), ErrorMessages.LOGIN_BUTTON_IS_MISSING);
        softAssert.assertAll();
    }
}
