package cucumber;

import com.codecool.projectTestingBDD.Utility.Util;
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

public class CanILoginTest {

    private final WebDriver driver = new ChromeDriver();
    private static Util utility = new Util(new ChromeDriver());

    @Given("^eeeasy in running on localhost:3000$")
    public void eeeasyRunning() {
        driver.get("localhost:3000");
    }

    @When("^I click the Sign in button$")
    public void clickSignInButton() {
        utility.waitForElementClickable(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/button")));
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/button")).click();
    }

    @And("I enter a {string}")
    public void enterUsername(String username) {
        WebElement usernameInputField = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/input[1]"));
        usernameInputField.click();
        usernameInputField.sendKeys(username);
    }

    @And("I enter {string}")
    public void enterPassword(String password) {
        WebElement passwordInputField = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/input[2]"));
        passwordInputField.click();
        passwordInputField.sendKeys(password);
    }

    @And("^I click the Login button$")
    public void clickLoginButtonAgain() {
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/button[1]"));
        loginButton.click();
    }

    @Then("^I logged in")
    public void amILoggedIn() {
        WebElement loginField = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]"));
        assertNull(loginField);
    }

    @After()
    public void closeBrowser() {
        driver.quit();
    }
}
