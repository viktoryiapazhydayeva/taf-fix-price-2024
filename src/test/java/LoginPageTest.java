import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoginPageTest extends BaseTest {

    public final String EXPECTED_LOGIN_FROM_TITLE = "Вход";
    public final String EXPECTED_LOGIN_ERROR_MESSAGE = "Неверный логин или пароль. Проверьте введённые данные и попробуйте снова. Осталось попыток: 4";

    @Test
    @DisplayName("Login form rendering")
    public void openLoginForm() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage =new HomePage(driver);
        Thread.sleep(2000);
        homePage.confirmCity();
        loginPage.openLoginForm();
        Thread.sleep(1000);
        Assertions.assertEquals(EXPECTED_LOGIN_FROM_TITLE, loginPage.getLoginFormTitle());
    }

    @Test
    public void loginByEmail() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage =new HomePage(driver);
        Thread.sleep(1000);
        homePage.confirmCity();
        loginPage.openLoginForm();
        Thread.sleep(1000);
        loginPage.switchLoginMethod();
        loginPage.enterEmail("test1020115@testemail.com"); // 4 ПОПЫТКИ, НАДО ОТРЕФАКТОРИТЬ МЕТОД, ЧТОБЫ УЧЕСТЬ !!
        loginPage.enterPassword("Test1020115");
        loginPage.confirmPersonalDataAgreement();
        loginPage.confirmLogin();
        Thread.sleep(1000);
        Assertions.assertTrue(loginPage.getLoginErrorText("Неверный логин или пароль. Проверьте введённые данные и попробуйте снова."));
    }
}
