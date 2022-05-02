package selenium.iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Test {
    public static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\Repo\\SeleniumProject2.0\\src\\test\\java\\selenium\\browser\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView()", driver.findElement(By.id("frame1")));
        List<WebElement> elements = driver.findElements(By.tagName("iframe"));
        System.out.println(elements.size());
        driver.switchTo().frame(3);
        driver.switchTo().frame("frame1");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id = 'frame1']")));
        String headerText = driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(headerText);
        driver.close();
    }
}
