import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterTest {

    WebDriver driver;

    @BeforeMethod
    public void openWindow(){
      System.setProperty("webdriver.chrome.driver","C:\\Users\\55403\\IdeaProjects\\maventest\\drivers\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.manage().window().maximize();
    }

    @Test
    public void registerTest() throws InterruptedException {
        driver.get("https://mail.163.com/");
        driver.findElement(By.className("f-float-left")).click();
        String handle1 = driver.getWindowHandle();
        for(String handles: driver.getWindowHandles()){
           if(handles.equals(handle1)){
               continue;
           }
           else{
               driver.switchTo().window(handles);
           }
        }

        driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("Chinasoft123");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("qwertasdfg12@p");
        String time = String.valueOf(System.currentTimeMillis()/100);
        driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys(time);
       // driver.findElement(By.id("service")).click();
        driver.findElement(By.className("j-register")).click();
        Thread.sleep(4000);

        // String textValue = driver.findElement(By.xpath("//div[text()=\"请先同意服务条款\"]")).getText();
        String textValue = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[4]/div")).getText();

        System.out.println(textValue);
        Assert.assertEquals(textValue,"请先同意服务条款");
    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
