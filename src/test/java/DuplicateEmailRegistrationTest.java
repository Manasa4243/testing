import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateEmailRegistrationTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demowebshop.tricentis.com/register");

        driver.findElement(By.id("gender-male")).click();

        driver.findElement(By.id("FirstName")).sendKeys("Manasa");

        driver.findElement(By.id("LastName")).sendKeys("User");

        // Email that was already registered earlier
        driver.findElement(By.id("Email")).sendKeys("manasa@test.com");

        driver.findElement(By.id("Password")).sendKeys("Password123");

        driver.findElement(By.id("ConfirmPassword")).sendKeys("Password123");

        driver.findElement(By.id("register-button")).click();

        Thread.sleep(3000);

        // Check error message
        String errorMessage =
                driver.findElement(By.className("message-error")).getText();

        System.out.println("Error Message: " + errorMessage);

        driver.quit();
    }
}
