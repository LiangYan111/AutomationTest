package run;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features ="src/test/resources/features",//要执行的feature文件的目录
        format ={"pretty",
                "html:target/site/cucumber-pretty",
                "rerun:target/rerun.txt",
                "json:target/cucumber1.json"},
        tags = {"@test1"},      //执行标注此tag的case
        glue={"step"}         //step文件所在的包的名字
)

public class RunTest extends AbstractTestNGCucumberTests {        //必须继承AbstractTestNGCucumberTests类
}
