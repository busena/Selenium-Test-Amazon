package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;

public class CheckCouponPage extends BaseTest {

    public CheckCouponPage fillCouponInput() {
        driver.findElement(By.cssSelector("[class='a-input-text a-form-normal a-width-large a-span9 pmts-claim-code']")).sendKeys(couponName);
        driver.findElement(By.cssSelector("[class='a-input-text a-form-normal a-width-large a-span9 pmts-claim-code']")).click();
        return this;
    }

    public CheckCouponPage clickCouponButton() {
        driver.findElement(By.cssSelector("[class='a-button a-button-base pmts-claim-code-apply-button pmts-button-input']")).click();
        sleep(1000);
        return this;
    }
}
