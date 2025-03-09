import Base.BaseTest;
import Pages.LoginPage;
import Pages.PasswordUpdatePage;
import org.testng.annotations.Test;

public class PasswordUpdateTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    PasswordUpdatePage passwordUpdatePage = new PasswordUpdatePage();

    @Test
    public void navigateToAccount() {
        loginPage.fillEmail(email)
                .clickContinueButton()
                .fillPassword(password)
                .clickLoginButton();

        passwordUpdatePage.navigateAccount()
                .goToLoginSettings()
                .goToPasswordSetting()
                .updatePassword()
                .savePasswordSettings();
    }

}
