import Base.BaseTest;
import Pages.LoginPage;
import Pages.ProductListPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class SearchProductTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    ProductListPage productListPage = new ProductListPage();

    @Test
    public void clickProduct() {

        loginPage.fillEmail(email)
                .clickContinueButton()
                .fillPassword(password)
                .clickLoginButton();

        productListPage.searchProduct()
                .clickProduct()
                .addProductBasket()
                .goToBasket()
                .correctProduct();
    }
}
