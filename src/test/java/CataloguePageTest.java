import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CataloguePageTest extends BaseTest {

    @Test
    public void addProductToFavorite() throws InterruptedException {
        CataloguePage cataloguePage = new CataloguePage(driver);
        HomePage homePage = new HomePage(driver);
        Thread.sleep(1000);                //TODO ADD NORMAL WAITS EVERYWHERE!!!!
        homePage.confirmCity();
        Thread.sleep(1000);
        homePage.acceptCookies();
        Thread.sleep(1000);
        cataloguePage.hoverOverCatalog();
        cataloguePage.selectCatalogueCategory();
        Thread.sleep(2000);
        cataloguePage.selectProduct();
        Thread.sleep(2000);
        cataloguePage.addToFavorites();
        cataloguePage.navigateToFavorite();
        Thread.sleep(2000);
        cataloguePage.selectProduct();
        Thread.sleep(1000);
        Assertions.assertEquals(cataloguePage.getSelectedProductTitle(), cataloguePage.getFavoriteProductTitle());
    }
}
