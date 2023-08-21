package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utils;
import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".rt-tr-group")
    List<WebElement> booksList;

    @FindBy(css = ".action-buttons")
    List<WebElement> booksTitles;

    @FindBy(css = ".rt-td")
    List<WebElement> booksInfo;

    @FindBy(xpath = "//a[contains(text(), 'Git Pocket Guide')]")
    WebElement firstBook;

     @FindBy(xpath = "(//button[@class='btn btn-primary'])[3]")
     WebElement addToYourCollectionButton;

     @FindBy(xpath = "(//li[@id='item-3'])[5]")
     WebElement profileButton;

     @FindBy(xpath = "//*[@id='app']/header/a/img")
     WebElement pageTitle;

    public void printAllBooks() {
        for (WebElement element : booksList) {
            if (!element.getText().isBlank()) {
                System.out.println(element.getText());
                System.out.println("------------");
            }
        }
    }

    public void getAllBooksTitles() {
        for (WebElement element : booksTitles) {
            System.out.println(element.getText());
        }
    }

    public void getAllBooksAuthors() {
        for (int i = 2; i < booksInfo.size(); i += 4) {
            if (!booksInfo.get(i).getText().isBlank()) {
                System.out.println(booksInfo.get(i).getText());
            }
        }
    }

    public void getAllBooksPublishers() {
        for (int i = 3; i < booksInfo.size(); i += 4) {
            if (!booksInfo.get(i).getText().isBlank()) {
                System.out.println(booksInfo.get(i).getText());
            }
        }
    }

    public void clickOnFirstBook() {
        firstBook.click();
    }

    public void clickAddToYourCollection() {
        addToYourCollectionButton.click();
    }

    public void scrollToElement() {
        Utils.scrollToElement(addToYourCollectionButton, this.driver);
    }

    public void scrollToProfile() {
        Utils.scrollToElement(profileButton, this.driver);
    }

    public void clickOnProfileButton() {
        profileButton.click();
    }

    public boolean isPageTitlePresent() {
        return pageTitle.isDisplayed();
    }
}
