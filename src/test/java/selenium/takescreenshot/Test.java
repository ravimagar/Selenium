package selenium.takescreenshot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.time.Duration;

public class Test {
    public static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\Repo\\SeleniumProject2.0\\src\\test\\java\\selenium\\browser\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(screenShot, new File("C:\\Users\\ganesh.jadhav\\Desktop\\BackSide.jpeg"));
        }catch (Exception e){
            System.out.println(e);
        }
        driver.close();
    }
}
