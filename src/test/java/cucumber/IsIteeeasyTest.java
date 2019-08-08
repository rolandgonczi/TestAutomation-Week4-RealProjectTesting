package cucumber;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;

public class IsIteeeasyTest {

    private final WebDriver driver = new ChromeDriver();

    @When("^I open localhost:3000$")
    public void eeeasyRunning() {
        driver.get("localhost:3000");
    }

    @Then("^I should see the main page$")
    public void verifyMainPage() {
        WebElement title = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/a"));
        assertNotNull(title);
    }

    @After()
    public void closeBrowser() {
        driver.quit();
    }

}
