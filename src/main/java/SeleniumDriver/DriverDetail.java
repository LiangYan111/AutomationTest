package SeleniumDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverDetail {
    public static WebDriver driver;
    public static WebDriver openBrowser(String browser){
        String path = System.getProperty("user.dir");         //工程的路径
        if(browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver",path+"/drivers/chromedriver.exe");
            driver=new ChromeDriver();
        }
       return driver;
    }
}
