import org.testng.annotations.Test;
import pages.HomePage;
import pages.LogInPage;
import utils.Utils;

public class BooksTest extends BaseTest{

    @Test
    public void verifyBooksListTest() {
        LogInPage logInPage = new LogInPage(this.driver);
        logInPage.scrollToBookStore();
        Utils.waitInSeconds(1);
        logInPage.clickBookStoreButton();
        Utils.waitInSeconds(1);
        logInPage.clickLogInButton();
        Utils.waitInSeconds(1);
        logInPage.inputValidCredentials();
        Utils.waitInSeconds(1);
        HomePage homePage = new HomePage(this.driver);
        homePage.printAllBooks();
    }
}
