package selenium.actionclass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\Repo\\SeleniumProject2.0\\src\\test\\java\\selenium\\browser\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement doubleClick = driver.findElement(By.xpath("(//button[text()='Click me'])[1]"));
        doubleClick.click();
        Alert alert = driver.switchTo().alert();
        String s = alert.getText();
        System.out.println("Text " + s);
        alert.accept();
        driver.close();
    }
}
