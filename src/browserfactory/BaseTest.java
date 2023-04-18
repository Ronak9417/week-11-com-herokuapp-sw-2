package browserfactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;

    public void openBrowser(String baseUrl) {
        driver = new ChromeDriver();

        //Launce the URL
        driver.get(baseUrl);
        //Maximise Windows
        driver.manage().window().maximize();
        //Implicit Timeout
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    public void sendTextToElements(By by, String text) {
        WebElement emailField = driver.findElement(by);
        emailField.sendKeys(text);
    }


    public void clickOnElement(By by) {
        WebElement loginLink = driver.findElement(by);
        loginLink.click();
    }


    public void closeBrowser(){
        driver.quit();

    }
}
