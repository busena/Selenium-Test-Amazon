package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class MainPage extends BaseTest {

    public MainPage fillSearch(String text) {
        driver.findElement(By.cssSelector("[class='nav-search-field ']")).sendKeys(text, Keys.ENTER);
        return this;
    }

}
