import org.openqa.selenium.By;

public class Login extends BaseTest {

    public static void main(String[] args) throws InterruptedException {

        setup();

        driver.get(baseUrl + "/login");

        driver.findElement(By.id("username")).sendKeys("tomsmith");

        driver.findElement(By.id("password"))
                .sendKeys("WrongPassword");

        driver.findElement(By.cssSelector("button[type='submit']"))
                .click();

        Thread.sleep(2000);

        System.out.println("Invalid Login Test Executed");

        tearDown();
    }
}
