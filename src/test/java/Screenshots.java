import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;


@Test
public class Screenshots {
    WebDriver driver;

    public void screenshotsTest() throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\55403\\IdeaProjects\\maventest\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.imooc.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot,new File("C:\\Users\\55403\\Desktop\\screenshotsTest.png"));
        driver.quit();
    }
}
