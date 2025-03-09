package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class RegisterPage extends BaseTest {

    public RegisterPage clickCreateAccount() {
        driver.findElement(By.id("createAccountSubmit")).click();
        return this;
    }

    public RegisterPage createAccount() {
        driver.findElement(By.name("customerName")).sendKeys("Buse");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("Test123,");
        driver.findElement(By.id("ap_password_check")).sendKeys("Test123,");
        return this;
    }

    public RegisterPage createClick() {
        driver.findElement(By.cssSelector("[class='a-button-input']")).click();
        sleep(1000);
        return this;
    }


}
