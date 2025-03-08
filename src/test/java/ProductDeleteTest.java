import Base.BaseTest;
import Pages.LoginPage;
import Pages.ProductAddPage;
import Pages.ProductDeletePage;
import Pages.ProductListPage;
import org.testng.annotations.Test;

public class ProductDeleteTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    ProductListPage productListPage = new ProductListPage();
    ProductDeletePage productDeletePage = new ProductDeletePage();

    @Test
    public void deleteProduct() {
        loginPage.fillEmail(email)
                .clickContinueButton()
                .fillPassword(password)
                .clickLoginButton();

        productListPage.goToBasket();

        productDeletePage.clickDeleteButton();
    }
}
