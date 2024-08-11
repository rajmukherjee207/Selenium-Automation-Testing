package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

// Test Case : Successful Login
public class SauceDemoTest {

    // Declare WebDriver as an instance variable
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Use WebDriverManager to automatically manage the ChromeDriver binary
        WebDriverManager.chromedriver().setup();

        // Set up the ChromeDriver path
    	//System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        //System.setProperty("webdriver.chrome.driver",System.setProperty("user.dir", null)+"/src/test/java/drivers/chromedriver.exe");

        // Initialize the ChromeDriver
        driver = new ChromeDriver();
        
     // Set implicit wait
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));

        // Maximize browser window
        driver.manage().window().maximize();

        // Open the SauceDemo website
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void testSuccessfulLogin() throws InterruptedException {
        // Locate username field and enter username
        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");

        // Locate password field and enter password
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        
     // Wait for 2 seconds 
        Thread.sleep(2000);

        // Locate and click the login button
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

     // Wait for 2 seconds to observe the login result
        Thread.sleep(2000);
        
        // Validate successful login by checking the URL or an element on the next page
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "Login was not successful.");
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
