package selenium.windowhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Test {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\Repo\\SeleniumProject2.0\\src\\test\\java\\selenium\\browser\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Windows.html");
        String parentWindow = driver.getWindowHandle();
        driver.findElement(By.xpath("//button[text()='    click   ']")).click();
        Set<String> windows = driver.getWindowHandles();
        for (String e : windows){
            if(!parentWindow.contentEquals(e)){
                driver.switchTo().window(e);
                driver.close();
            }
        }
        driver.switchTo().window(parentWindow);
        driver.close();
    }
}
