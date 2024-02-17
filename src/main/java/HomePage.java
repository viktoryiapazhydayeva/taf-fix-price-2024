import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    ChromeDriver driver;

    public HomePage(ChromeDriver driver) {
        this.driver = driver;
    }

    public void confirmCity() {
        WebElement confirmCityBtn = driver.findElement(By.cssSelector(HomePageLocator.confirmCityBtnLocator));
        if (confirmCityBtn.isDisplayed())
            confirmCityBtn.click();
    }

    public void acceptCookies() {
        WebElement cookiesBtn = driver.findElement(By.cssSelector(HomePageLocator.acceptCookiesBtnLocator));
        if (cookiesBtn.isDisplayed())
            cookiesBtn.click();
    }

    public String getCopyRightText(){
        WebElement copyRight = driver.findElement(By.cssSelector(HomePageLocator.copyRightLocator));
        return copyRight.getText();
    }
}
