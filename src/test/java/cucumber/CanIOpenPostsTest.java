package cucumber;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;
import com.codecool.projectTestingBDD.Utility.Util;

public class CanIOpenPostsTest {

    private final WebDriver driver = new ChromeDriver();
    private static Util utility = new Util(new ChromeDriver());

    @Given("^the main page loaded")
    public void verifyMainPage() {
        utility.waitForElementClickable(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/h1/a")));
    }

    @When("^I click the title of the post")
    public void clickPost() {
        WebElement title = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/h1/a"));
        title.click();
    }

    @Then("^I should see the post details")
    public void confirmNotMainPage() {
        WebElement button = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/button"));
        assertNull(button);
    }

    @After()
    public void closeBrowser() {
        driver.quit();
    }
}
