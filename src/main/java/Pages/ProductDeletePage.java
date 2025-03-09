package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;

public class ProductDeletePage extends BaseTest {

    public ProductDeletePage clickDeleteButton() {
        driver.findElement(By.cssSelector("[class='a-size-small sc-action-delete']")).click();
        return this;
    }

}
