import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {

    @Test
    public void openWebsiteTest() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments(
            "--headless",
            "--no-sandbox",
            "--disable-dev-shm-usage"
        );

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://incognito-2024.pages.dev/#");

        String title = driver.getTitle();
        Assert.assertTrue(title.contains("INCOGNITO"));

        driver.quit();
    }
}
