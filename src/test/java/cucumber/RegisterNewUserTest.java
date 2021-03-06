package cucumber;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.After;;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;

public class RegisterNewUserTest {

    private final WebDriver driver = new ChromeDriver();

    @Given("^eeeasy is running on localhost:3000$")
    public void eeeasyIsRunning() {
        driver.get("localhost:3000");
    }

    @When("^I click the Register button$")
    public void clickRegisterButton() {
        WebElement registerButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/button"));
        registerButton.click();
    }

    @And("^I enter the \"<username>\"$")
    public void enterTheUsername() {
        WebElement usernameInputField = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/input[1]"));
        usernameInputField.click();
        usernameInputField.sendKeys("username");
    }

    @And("^I enter the \"<email>\"$")
    public void enterTheEmail(String email) {
        WebElement emailInputField = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/input[2]"));
        emailInputField.click();
        emailInputField.sendKeys(email);
    }

    @And("^I enter the \"<password>\"$")
    public void enterThePassword() {
        WebElement passwordInputField = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/input[3]"));
        passwordInputField.click();
        passwordInputField.sendKeys("password");
    }

    @And("^I submit my Registration$")
    public void clickRegisterButtonAgain() {
        WebElement registerButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/button"));
        registerButton.click();
    }

    @Then("^The registration box disappeared$")
    public void checkTheRegistrationBox() {
        WebElement registerBox = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]"));
        assertNull(registerBox);
    }

    @After()
    public void closeBrowser() {
        driver.quit();
    }

}
