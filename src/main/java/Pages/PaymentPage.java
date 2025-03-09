package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PaymentPage extends BaseTest {

    public PaymentPage goToPaymentPage() {
        driver.findElement(By.cssSelector("[class='a-button a-button-normal a-button-span12 a-button-primary']")).click();
        sleep(1000);
        return this;
    }

    public PaymentPage clickAddCart() {
        driver.findElement(By.cssSelector("[class='a-link-emphasis pmts-add-cc-default-trigger-link']")).click();
        sleep(7000);
        return this;
    }

    public PaymentPage switchFrame() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement iframeElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("iframe.apx-secure-iframe.pmts-portal-component")));
        driver.switchTo().frame(iframeElement);
        return this;
    }

    public PaymentPage addCartInfo() {
        driver.findElement(By.cssSelector("[class='a-input-text a-form-normal pmts-account-Number']")).sendKeys(cardNumber);
        driver.findElement(By.cssSelector("[class='a-input-text a-form-normal apx-add-credit-card-account-holder-name-input mcx-input-fields']")).sendKeys(onCardName);
        return this;
    }

    public PaymentPage clickAddButton() {
        driver.findElements(By.cssSelector("[class='a-radio']")).get(1).click();
        return this;
    }

    public PaymentPage chooseDate() {
        driver.findElements(By.cssSelector("[class='a-button-text a-declarative']")).get(1).click();
        sleep(2000);
        driver.findElements(By.cssSelector("[class='a-dropdown-item']")).get(indexOfList).click();
        return this;
    }

    public PaymentPage addCart() {
        driver.findElement(By.name("ppw-widgetEvent:AddCreditCardEvent")).click();
        driver.switchTo().defaultContent();
        sleep(2000);
        return this;
    }

}
