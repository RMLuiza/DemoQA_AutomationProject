import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.Utils;

public class BooksTest extends BaseTest {

    private HomePage homePage;
    @BeforeMethod
    @Override
    public void setup() {
        super.setup();
        this.homePage = new HomePage(this.driver);
    }

    @Test(priority = 2)
    public void verifyBooksListTest() {
        logInPage.scrollToBookStore();
        Utils.waitInSeconds(1);
        logInPage.clickBookStoreButton();
        Utils.waitInSeconds(1);
        logInPage.clickLogInButton();
        Utils.waitInSeconds(1);
        logInPage.inputValidCredentials();
        Utils.waitInSeconds(1);
        homePage.printAllBooks();
    }

    @Test
    public void getBooksTitlesTest() {
        logInPage.scrollToBookStore();
        Utils.waitInSeconds(1);
        logInPage.clickBookStoreButton();
        Utils.waitInSeconds(1);
        homePage.getAllBooksTitles();
    }

    @Test
    public void getBooksAuthorsTest() {
        logInPage.scrollToBookStore();
        Utils.waitInSeconds(1);
        logInPage.clickBookStoreButton();
        Utils.waitInSeconds(1);
        homePage.getAllBooksAuthors();
    }

    @Test
    public void getBooksPublishersTest() {
        logInPage.scrollToBookStore();
        Utils.waitInSeconds(1);
        logInPage.clickBookStoreButton();
        Utils.waitInSeconds(1);
        homePage.getAllBooksPublishers();
    }
}




