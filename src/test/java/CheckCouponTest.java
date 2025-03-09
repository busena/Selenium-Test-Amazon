import Base.BaseTest;
import Pages.CheckCouponPage;
import Pages.LoginPage;
import Pages.PaymentPage;
import Pages.ProductListPage;
import org.testng.annotations.Test;

public class CheckCouponTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    ProductListPage productListPage = new ProductListPage();
    PaymentPage paymentPage = new PaymentPage();
    CheckCouponPage checkCouponPage = new CheckCouponPage();

    @Test
    public void checkCoupon() {
        loginPage.fillEmail(email)
                .clickContinueButton()
                .fillPassword(password)
                .clickLoginButton();

        productListPage.goToBasket();

        paymentPage.goToPaymentPage();

        checkCouponPage.fillCouponInput()
                .clickCouponButton();
    }
}
