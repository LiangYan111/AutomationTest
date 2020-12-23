package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BaiduLoginPage;

public class LoginBaiduStep {

    BaiduLoginPage ll = new BaiduLoginPage();

    @Given("^User input baidu url$")
    public void goToBaiduHomePage() throws InterruptedException {
        ll.openBaiduPage();
    }

    @When("^User input \"(.*?)\"$")
    public void inputKeyWords(String keyword ){
        ll.inputKeyWords(keyword);
    }

    @And("^submit it$")
    public void submitAction()
    {
        ll.submit();
    }

    @Then("^user should be able to see related information$")
    public void seeResults(){
        ll.closeBrowser();
        System.out.println("脚本运行成功");
    }
}
