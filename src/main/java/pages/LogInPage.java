package pages;
import constants.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage {

    public LogInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//div[@class='card-up'])[6]")
    protected WebElement bookStoreApplication;

    @FindBy(css = "#login")
    protected WebElement logInButton;

    @FindBy(css = "#userName")
    protected WebElement usernameField;

    @FindBy(css = "#password")
    protected WebElement passwordField;

    @FindBy(css = "#userName-value")
    protected WebElement usernameText;

    public void clickBookStoreButton() {
        bookStoreApplication.click();
    }

    public void clickLogInButton() {
        logInButton.click();
    }

    public void inputValidCredentials() {
        this.usernameField.sendKeys(Constants.USERNAME);
        this.passwordField.sendKeys(Constants.PASSWORD);
        logInButton.click();
    }

    public String getUsernameText() {
        return this.usernameText.getText();
    }

}
