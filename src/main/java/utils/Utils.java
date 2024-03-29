package utils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utils {

    public static void waitInSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static void scrollToElement(WebElement element, WebDriver driver) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void acceptAlert(WebDriver driver) {
        driver.switchTo().alert().accept();
    }

    public static String getAlertText(WebDriver driver) {
        return driver.switchTo().alert().getText();
    }
}
