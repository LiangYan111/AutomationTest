package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public  class BaiduLogin_Flow {
    WebDriver driver;
@FindBy(id="kw")
    private WebElement inputBox;

    public BaiduLogin_Flow() {
    }


    public void openBaiduPage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\55403\\IdeaProjects\\maventest\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.baidu.com");
        driver.manage().window().maximize();
        Thread.sleep(6000);
    }


    public void inputKeyWords(String keyword){
      //  WebElement inputBox = driver.findElement(By.id("kw"));
        inputBox.clear();
        inputBox.clear();
        inputBox.sendKeys(keyword);
    }

    public void submit(){
        //WebElement inputBox = driver.findElement(By.id("kw"));
        inputBox.submit();
    }

    public void closeBrowser(){
        driver.quit();
    }
    }

