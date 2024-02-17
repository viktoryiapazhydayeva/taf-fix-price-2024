import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CataloguePage {
    ChromeDriver driver;

    public CataloguePage(ChromeDriver driver) {
        this.driver = driver;
    }

    public void hoverOverCatalog() {
        WebElement catalogueIcon = driver.findElement(By.cssSelector(CataloguePageLocator.catalogueIconLocator));
        new Actions(driver)
                .moveToElement(catalogueIcon)
                .perform();
    }

    public void selectCatalogueCategory() {
        WebElement catalogueItem = driver.findElement(By.cssSelector(CataloguePageLocator.firstCatalogueItemLocator));
        catalogueItem.click();
    }

    public void selectProduct() {
        WebElement productInCategory = driver.findElement(By.cssSelector(CataloguePageLocator.firstProductInCategory));
        productInCategory.click();
    }

    public String getSelectedProductTitle() {
        WebElement productTitle = driver.findElement(By.cssSelector(CataloguePageLocator.productTitleLocator));
        String expectedProductTitle = productTitle.getText();
        return expectedProductTitle;
    }

    public void addToFavorites() {
        WebElement favoritesBtn = driver.findElement(By.cssSelector(CataloguePageLocator.favoritesBtnLocator));
        favoritesBtn.click();
    }

    public void navigateToFavorite() {
        WebElement favoriteIcon = driver.findElement(By.cssSelector(CataloguePageLocator.favoriteLinkLocator));
        favoriteIcon.click();
    }

    public String getFavoriteProductTitle() {
        WebElement actualFavoriteProductTitle = driver.findElement(By.cssSelector(CataloguePageLocator.productTitleLocator));
        String actualProductTitle = actualFavoriteProductTitle.getText();
        return actualProductTitle;
    }
}
