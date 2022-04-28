package selenium.displaymethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\OneDrive - Emtec Inc\\Ganesh_Automation\\Study\\AutomationLearningLab\\SeleniumProject\\src\\main\\resources\\browser\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Windows.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//button[@class='btn btn-info'])[1]")).click();
        String parentWindowId = driver.getWindowHandle();
        Set<String> childWindowsId = driver.getWindowHandles();
        System.out.println(parentWindowId);
        System.out.println(childWindowsId);
        for (String s : childWindowsId)
            if (!parentWindowId.contentEquals(s)) {
                driver.switchTo().window(s);
                driver.close();
            }
        driver.switchTo().window(parentWindowId);
        driver.close();
    }
}
