import Base.BaseTest;
import Pages.LoginPage;
import Pages.ProductListPage;
import org.testng.annotations.Test;

public class InvalidSearchTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    ProductListPage productListPage = new ProductListPage();

    @Test
    public void searchInvalidCharacters() {
        loginPage.fillEmail(email)
                .clickContinueButton()
                .fillPassword(password)
                .clickLoginButton();

        productListPage.searchInvalidName();
    }
}
