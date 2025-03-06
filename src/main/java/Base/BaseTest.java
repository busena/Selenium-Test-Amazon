package Base;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends BaseLibrary{

    @BeforeMethod
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com.tr/");
        driver.manage().window().maximize();
        driver.findElement(By.id("ap_email")).click();
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}
