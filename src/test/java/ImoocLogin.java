import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImoocLogin {


    WebDriver driver = new ChromeDriver();

    public void inputUsenameAndPwd() throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\55403\\IdeaProjects\\maventest\\drivers\\chromedriver.exe");
        driver.get("https://www.imooc.com/");
        driver.manage().window().maximize();
        WebElement logonButton=driver.findElement(By.id("js-signin-btn"));
        logonButton.click();
        Thread.sleep(3000);
        WebElement logonInput=driver.findElement(By.name("email"));
        logonInput.sendKeys("18240898401");
        WebElement pwdInput=driver.findElement(By.name("password"));
        pwdInput.sendKeys("199119990919a");
        //Thread.sleep(3000);
        pwdInput.submit();
        Thread.sleep(5000);
        driver.navigate().refresh();
       driver.quit();

    }

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\55403\\IdeaProjects\\maventest\\drivers\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();

        ImoocLogin login=new ImoocLogin();
        login.inputUsenameAndPwd();
    }
}
