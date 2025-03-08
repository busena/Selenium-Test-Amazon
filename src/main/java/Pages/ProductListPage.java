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

    public ProductListPage clickProduct() {
        driver.findElement(By.cssSelector("[class='sg-col-4-of-24 sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 sg-col s-widget-spacing-small sg-col-4-of-20']"))
                .click();
        return this;
    }

    public ProductListPage addProductBasket() {
        driver.findElement(By.cssSelector("[class='a-button a-spacing-small a-button-primary a-button-icon']")).click();
        return this;
    }

    public ProductListPage goToBasket() {
        driver.findElement(By.id("sw-gtc")).click();
        sleep(1000);
        return this;
    }

    public ProductListPage correctProduct() {
        WebElement productNameIs = driver.findElement(By.cssSelector("[class='a-link-normal sc-product-link sc-product-title aok-block']"));
        String actualName = productNameIs.getText();
        System.out.println(actualName);

        Assert.assertTrue(productName.equalsIgnoreCase(actualName), "Ürün Sepette Ekli Değil!");
        System.out.println("Ürün Sepete Eklidir!");
        return this;
    }
}
