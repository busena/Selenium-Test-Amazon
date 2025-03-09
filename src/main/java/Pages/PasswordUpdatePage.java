package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PasswordUpdatePage extends BaseTest {

    public PasswordUpdatePage navigateAccount() {
        driver.findElement(By.cssSelector("[class='nav-a nav-a-2 nav-truncate   nav-progressive-attribute']")).click();
        return this;
    }

    public PasswordUpdatePage goToLoginSettings() {
        List<WebElement> accountSettingsLists = driver.findElements(By.cssSelector("[class='a-unordered-list a-nostyle a-vertical ya-card-row']"));
        WebElement AccountSettings = accountSettingsLists.get(0);
        List<WebElement> innerElements = AccountSettings.findElements(By.cssSelector("[class='ya-card-cell']"));
        innerElements.get(1).click();
        return this;
    }

    public PasswordUpdatePage goToPasswordSetting() {
        List<WebElement> loginAndSecurityList = driver.findElements(By.cssSelector("[class='a-section a-padding-medium']"));
        WebElement passwordSettings = loginAndSecurityList.get(4);
        passwordSettings.findElement(By.cssSelector("[class='a-button-text']")).click();
        sleep(1000);
        return this;
    }

    public PasswordUpdatePage updatePassword() {
        List<WebElement> passwordInputList = driver.findElements(By.cssSelector("[class='a-input-text']"));

        for (WebElement passwordInput : passwordInputList) {
            passwordInput.sendKeys(password);
        }
        return this;
    }

    public PasswordUpdatePage savePasswordSettings() {
        driver.findElement(By.xpath("//*[@id=\"cnep_1D_submit_button\"]")).click();
        sleep(1000);
        return this;
    }
}
