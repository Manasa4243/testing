import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public static WebDriver driver;

    public static String baseUrl = "https://the-internet.herokuapp.com";

    public static void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void tearDown() {

        driver.quit();
    }
}
