import constants.Constants;
import constants.ErrorMessages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LogInPage;
import utils.Utils;

public class LogInTest extends BaseTest{

    @Test
    public void logInTest() {
        WebElement element = driver.findElement(By.xpath("(//div[@class='card-up'])[6]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Utils.waitInSeconds(1);
        LogInPage logInPage = new LogInPage(this.driver);
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
