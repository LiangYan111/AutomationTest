package step;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BaiduLogin_Flow;

public class CheckDriverStep {
    BaiduLogin_Flow ll = new BaiduLogin_Flow();

    @Given("^I input baidu url$")
    public void goToBaiduHomePage() throws InterruptedException {
        ll.openBaiduPage();
    }

    @When("^I input \"(.*?)\"$")
    public void inputKeyWords(String keyword ) throws InterruptedException {
        ll.inputKeyWords(keyword);
        Thread.sleep(3000);
    }

    @And("^I submit it 1$")
    public void submitAction() throws InterruptedException {
        ll.submit();
        Thread.sleep(3000);
    }

    @Then("^I should be able to see related information 1$")
    public void seeResults(){
        ll.closeBrowser();
        System.out.println("Driver封装及调用成功");
    }
}


