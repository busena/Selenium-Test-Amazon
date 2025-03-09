import Base.BaseTest;
import Pages.LoginPage;
import Pages.PaymentPage;
import Pages.ProductListPage;
import org.testng.annotations.Test;


public class PaymentTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    ProductListPage productListPage = new ProductListPage();
    PaymentPage paymentPage = new PaymentPage();

    @Test
    public void goToPayment() {
        loginPage.fillEmail(email)
                .clickContinueButton()
                .fillPassword(password)
                .clickLoginButton();

        productListPage.goToBasket();

        paymentPage.goToPaymentPage()
                .clickAddCart()
                .switchFrame()
                .addCartInfo()
                .chooseDate()
                .clickAddButton()
                .addCart();
    }
}
