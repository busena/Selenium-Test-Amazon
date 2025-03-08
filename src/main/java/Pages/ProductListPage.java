package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ProductListPage extends BaseTest {

    public ProductListPage searchProduct() {
        driver.findElement(By.cssSelector("[class='nav-input nav-progressive-attribute']")).sendKeys(productName, Keys.ENTER);
        return this;
    }

    public ProductListPage goToBasket() {
        driver.findElement(By.cssSelector("[class='nav-a nav-a-2 nav-progressive-attribute']")).click();
        return this;
    }

}
