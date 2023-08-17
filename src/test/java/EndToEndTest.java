import constants.Constants;
import constants.ErrorMessages;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProfilePage;
import utils.Utils;

public class EndToEndTest extends BaseTest{

    private HomePage homePage;
    private ProfilePage profilePage;

    @BeforeMethod
    @Override
    public void setup() {
        super.setup();
        this.homePage = new HomePage(this.driver);
        this.profilePage = new ProfilePage(this.driver);
    }

    @Test
    public void endToEndTest() {
        logInPage.scrollToBookStore();
        Utils.waitInSeconds(1);
        logInPage.clickBookStoreButton();
        Utils.waitInSeconds(1);
        logInPage.clickLogInButton();
        logInPage.inputValidCredentials();
        Utils.waitInSeconds(2);
        homePage.clickOnFirstBook();
        Utils.waitInSeconds(2);
        homePage.scrollToElement();
        Utils.waitInSeconds(1);
        homePage.clickAddToYourCollection();
        Utils.waitInSeconds(1);
        String actualMessage = Utils.getAlertText(this.driver);
        String expectedMessage = Constants.ALLERTBOX_BOOK_ADDED;
        Assert.assertEquals(actualMessage, expectedMessage, ErrorMessages.BOOK_NOT_ADDED);
        Utils.acceptAlert(this.driver);
        homePage.scrollToProfile();
        homePage.clickOnProfileButton();
        Utils.waitInSeconds(2);
        profilePage.scrollToElement();
        profilePage.clickDeleteButton();
        Utils.waitInSeconds(1);
        profilePage.clickOkToDeleteBookAlert();
        Utils.waitInSeconds(1);
        String actualDeletedBookMessage = Utils.getAlertText(this.driver);
        String expectedDeletedBookMessage = Constants.ALLERTBOX_BOOK_DELETED;
        Assert.assertEquals(actualDeletedBookMessage, expectedDeletedBookMessage, ErrorMessages.BOOK_NOT_DELETED);
        Utils.acceptAlert(this.driver);
        Utils.waitInSeconds(1);
        profilePage.clickLogOutButton();
    }
}
