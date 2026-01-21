import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FacebookLoginTest {

    public static void main(String[] args) {

        // Step 1: Launch Chrome Browser
        WebDriver driver = new ChromeDriver();

        // Step 2: Open Facebook Login Page
        driver.get("https://verify-getrestaurantapp-v1-0-0.d3bydizwdiwzbp.amplifyapp.com/login");
        driver.manage().window().maximize();

        // Step 3: Create Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        // Step 4: Wait for Email Textbox
        
        WebElement email = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.id("email"))
        );
        System.out.println("Email textbox is displayed");

        // Step 5: Wait for Password Textbox
        WebElement password = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.id("pass"))
        );
        System.out.println("Password textbox is displayed");

        // Step 6: Wait for Login Button
        WebElement loginButton = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.name("login"))
        );
        System.out.println("Login button is displayed");

        // Step 7: Enter dummy values
        email.sendKeys("testuser@gmail.com");
        password.sendKeys("dummyPassword");

        // Step 8: Wait at the end (to observe browser)
        try {
            Thread.sleep(3000); // only for demo purpose
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Step 9: Close browser
        driver.quit();
    }
}
