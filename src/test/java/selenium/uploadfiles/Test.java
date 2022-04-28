package selenium.uploadfiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test {
        public static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\OneDrive - Emtec Inc\\Ganesh_Automation\\Study\\AutomationLearningLab\\SeleniumProject\\src\\main\\resources\\browser\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/upload");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement upload = driver.findElement(By.id("file-upload"));
        upload.sendKeys("C:\\Users\\ganesh.jadhav\\Downloads\\1-63.jpg");

        driver.findElement(By.id("file-submit")).click();
        String fileUploadMessage = driver.findElement(By.xpath("//h3[text()='File Uploaded!']")).getText();
        if(fileUploadMessage.equals("File Uploaded!")){
            System.out.println("yes your file is uploaded successfully");
        }else {
            System.out.println("your file is not able upload successfully");
        }
        driver.close();

    }
}
