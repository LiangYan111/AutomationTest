import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {

    @BeforeTest
    public void demo3(){
        System.out.println("这是BeforeTest的注释");
    }

    @Test
    public void demo1(){
        System.out.println("这是Test的注释1");
    }

    @Test
    public void demo2(){
        System.out.println("这是Test的注释2");
    }

    @Test
    public void assertEquals(){
      String a = "qqqq";
      String b = "aaaa";
        Assert.assertEquals(a,b);
    }
}
