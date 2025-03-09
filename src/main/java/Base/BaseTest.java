package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends BaseLibrary {

    @BeforeMethod
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com.tr/");
        driver.manage().window().maximize();
        sleep(1000);
        driver.findElement(By.id("nav-link-accountList")).click();
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}
