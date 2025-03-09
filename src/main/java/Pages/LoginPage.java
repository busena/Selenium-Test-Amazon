package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;

public class LoginPage extends BaseTest {
    public LoginPage fillEmail(String email) {
        driver.findElement(By.id("ap_email")).sendKeys(email);
        return this;
    }

    public LoginPage clickContinueButton() {
        driver.findElement(By.cssSelector("[class='a-button a-button-span12 a-button-primary']")).click();
        return this;
    }

    public LoginPage fillPassword(String password) {
        driver.findElement(By.name("password")).sendKeys(password);
        return this;
    }

    public LoginPage clickLoginButton() {
        driver.findElement(By.cssSelector("[class='a-button-input']")).click();
        return this;
    }

    //hata mesajı kodu eklenecek
}
