import constants.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LogInPage;

public class BaseTest {

    protected WebDriver driver;
    protected LogInPage logInPage;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get(Constants.URL);
        driver.manage().window().maximize();
        logInPage = new LogInPage(driver);
    }

    @AfterMethod
    public void closeDriver() {
        driver.close();
    }
}
