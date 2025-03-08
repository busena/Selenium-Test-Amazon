import Base.BaseTest;
import Pages.LoginPage;
import Pages.ProductAddPage;
import Pages.ProductListPage;
import org.testng.annotations.Test;

public class AddProductTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    ProductListPage productListPage = new ProductListPage();
    ProductAddPage productAddPage = new ProductAddPage();

    @Test
    public void addProduct() {
        loginPage.fillEmail(email)
                .clickContinueButton()
                .fillPassword(password)
                .clickLoginButton();

        productListPage.searchProduct();

        productAddPage.clickProduct()
                .addProductBasket()
                .goToBasket()
                .correctProduct();
    }
}
