package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utils;

public class ProfilePage extends BasePage{

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".text-right.button.di")
    WebElement deleteButton;

    @FindBy(css = "#closeSmallModal-ok")
    WebElement acceptDeleteBox;

    @FindBy(xpath = "(//button[@id='submit'])[1]")
    WebElement logOutButton;

    public void clickDeleteButton() {
        deleteButton.click();
    }

    public void clickOkToDeleteBookAlert() {
        acceptDeleteBox.click();
    }

    public void scrollToElement() {
        Utils.scrollToElement(deleteButton, this.driver);
    }

    public void clickLogOutButton() {
        logOutButton.click();
    }
}
