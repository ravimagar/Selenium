package testng.parameterized.parameterpassing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WithoutParameterizedExample {

    public static WebDriver driver;

    @BeforeMethod
    void beforeMethod() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\OneDrive - Emtec Inc\\Ganesh_Automation\\Study\\AutomationLearningLab\\SeleniumProject\\src\\main\\resources\\browser\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void noParameter() {
        String name = "shirt";
        driver.get("https://www.amazon.in/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(name);
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    @AfterMethod
    void afterMethod() {
        driver.close();
    }
}
