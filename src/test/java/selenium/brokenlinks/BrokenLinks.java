package selenium.brokenlinks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinks {
    @Test
    void verifyBrokenLinks() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\Repo\\SeleniumProject2.0\\src\\test\\java\\selenium\\browser\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();

    }
}
