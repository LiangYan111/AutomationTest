import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaiDuSearch {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\55403\\IdeaProjects\\maventest\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement inputBox = driver.findElement(By.id("kw"));
        inputBox.clear();
        inputBox.sendKeys("selemium");
        inputBox.submit();
        Thread.sleep(5000);
        driver.quit();
    }
}
