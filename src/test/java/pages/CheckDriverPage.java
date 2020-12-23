package pages;

import SeleniumDriver.DriverDetail;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckDriverPage {
    WebDriver driver;

    public void openBaiduPage() throws InterruptedException {
        DriverDetail.openBrowser("chrome");
        driver.get("https://www.baidu.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }


    public void inputKeyWords(String keyword) throws InterruptedException {
        WebElement inputBox = driver.findElement(By.id("kw"));
        inputBox.clear();
        inputBox.sendKeys(keyword);
    }

    public void submit() throws InterruptedException {
        WebElement inputBox = driver.findElement(By.id("kw"));
        inputBox.submit();
    }

    public void closeBrowser(){
        driver.quit();
    }
}


