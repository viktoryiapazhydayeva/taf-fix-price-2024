import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    ChromeDriver driver;

    public LoginPage(ChromeDriver driver) {
        this.driver = driver;
    }

    public void openLoginForm() {
        WebElement loginIcon = driver.findElement(By.cssSelector(LoginPageLocator.loginBtnLocator));
        loginIcon.click();
    }

    public String getLoginFormTitle() {
        WebElement loginFormTitle = driver.findElement(By.cssSelector(LoginPageLocator.loginFormTitleLocator));
        return loginFormTitle.getText();
    }

    public void switchLoginMethod() {
        WebElement loginByEmailBtn = driver.findElement(By.cssSelector(LoginPageLocator.loginByEmailBtnLocator));
        loginByEmailBtn.click();
    }

    public void enterEmail(String email) {
        WebElement emailField = driver.findElement(By.cssSelector(LoginPageLocator.emailFieldLocator));
        emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        WebElement passordField = driver.findElement(By.cssSelector(LoginPageLocator.passwordFieldLocator));
        passordField.sendKeys(password);
    }

    public void confirmPersonalDataAgreement() {
        WebElement personalDataAgreementCheckBox = driver.findElement(By.className(LoginPageLocator.personalDataAgreementCheckBoxLocator));
        personalDataAgreementCheckBox.click();
    }

    public void confirmLogin() {
        WebElement confirmLoginBtn = driver.findElement(By.cssSelector(LoginPageLocator.confirmationLoginBtnLocator));
        confirmLoginBtn.click();
    }

    public boolean getLoginErrorText(String errorText) {  // НАДО УЧЕСТЬ КОЛ-ВО ПОПЫТОК ВВОДА НЕВЕРНЫХ ДАННЫХ
        //for (int count = 0; count <= 4; count++) {
        WebElement loginErrorText = driver.findElement(By.cssSelector(LoginPageLocator.loginErrorMessageLocator));
        String fullLoginErrorText = loginErrorText.getText();
        return fullLoginErrorText.contains(errorText);
    }
}

