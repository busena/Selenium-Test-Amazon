import Base.BaseTest;
import Pages.LoginPage;
import Pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTests extends BaseTest {
    LoginPage loginPage = new LoginPage();

    @Test
    public void loginSuccessful() {
        loginPage.fillEmail(email)
                .clickContinueButton()
                .fillPassword(password)
                .clickLoginButton();
        sleep(2000);
    }

    @Test
    public void unSuccessful() {
        loginPage.fillEmail(email)
                .clickContinueButton()
                .fillPassword(wrongPassword)
                .clickLoginButton();
        sleep(2000);
    }
}
