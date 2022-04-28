package selenium.datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Test123 {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\OneDrive - Emtec Inc\\Ganesh_Automation\\Study\\AutomationLearningLab\\SeleniumProject\\src\\main\\resources\\browser\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.abhibus.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();


        driver.findElement(By.id("source")).sendKeys("Pune");

        List<WebElement> allElement = driver.findElements(By.xpath("//ul[@id='ui-id-1']//child::li"));

        System.out.println(allElement);

        for(WebElement element : allElement){
            if(element.getText().equals("Pune")){
                element.click();
            }
        }

        driver.findElement(By.id("datepicker1")).click();

        String selDate = "28";
        String selMonth = "April";
        String selYear = "2022";

        String month_first = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]")).getText();

        String year_first = driver.findElement(By.xpath("(//span[@class='ui-datepicker-year'])[1]")).getText();

        if(month_first.equals(selMonth) && year_first.equals(selYear)){
            List<WebElement> allDates = driver.findElements(By.xpath("(//table[@class='ui-datepicker-calendar']//child::tbody/tr/td)"));
            for(WebElement date : allDates){
                if(date.getText().equals(selDate)){
                    date.click();
                    return;
                }
            }
        }
        driver.quit();
    }
}
