import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HomePageTest extends BaseTest {

    public final String EXPECTED_COPY_RIGHT_TEXT = "© Fix Price, 2024\n" + "Все права защищены";

    @Test
    @DisplayName("Home page rendering")
    public void openHomePage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        Thread.sleep(1000);
        Assertions.assertEquals(EXPECTED_COPY_RIGHT_TEXT, homePage.getCopyRightText());
    }
}
