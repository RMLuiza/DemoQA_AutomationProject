import constants.Constants;
import constants.ErrorMessages;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LogInPage;
import utils.Utils;

public class LogInTest extends BaseTest{

    @Test
    public void logInTest() {
        LogInPage logInPage = new LogInPage(this.driver);
        logInPage.scrollToBookStore();
        Utils.waitInSeconds(1);
        logInPage.clickBookStoreButton();
        Utils.waitInSeconds(1);
        logInPage.clickLogInButton();
        Utils.waitInSeconds(1);
        logInPage.inputValidCredentials();
        Utils.waitInSeconds(1);
        String expectedMessage = Constants.USERNAME;
        String actualMessage = logInPage.getUsernameText();
        Assert.assertEquals(actualMessage, expectedMessage, ErrorMessages.MISSING_USERNAME_TEXT);
    }
}
