package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;

public class LoginPage extends BaseTest {

    public LoginPage fillEmail(String email){
        driver.findElement(By.id("nav-link-accountList")).sendKeys(email);
        return this;
    }

    public LoginPage fillPassword(String password){
        driv
    }
}
