public class LoginPageLocator {

    public static String loginBtnLocator = "button.log-in.link";
    public static String loginFormTitleLocator = ".form-title[data-v-1e57b9c8]";
    //   "//*[@id=\"modal\"]/div/div/h1";
    //   "//h1[text()='Вход']";
    //   "//h1[@class='form-title']";

    public static String loginByEmailBtnLocator = "div.multi-toggle > button:nth-child(2)";

    public static String emailFieldLocator = "div.input-custom.phone-input.show-placeholder.email > div > input";
    //    "input-custom phone-input show-placeholder email";  class name- in focus

    public static String passwordFieldLocator = "div.input-custom.password-input.show-placeholder.toggle > div > input";
    //    "input-custom password-input show-placeholder toggle";   class name- in focus

    public static String personalDataAgreementCheckBoxLocator = "checkbox-field";  //class name

    public static String confirmationLoginBtnLocator = "button.button.enter-button.normal";

    public static String loginErrorMessageLocator = ".error[data-v-1e57b9c8]";
    // "//div[@class='error']";
    // "#modal > div > div:nth-child(3) > div.error";


}
