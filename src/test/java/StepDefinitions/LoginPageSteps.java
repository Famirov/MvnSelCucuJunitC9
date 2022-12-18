package StepDefinitions;

import Pages.LoginPage;
import Utilities.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginPageSteps {
    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("user navigates to HRM Login Page")
    public void user_navigates_to_HRM_Login_Page() throws InterruptedException {
        driver.get("http://dev-hrm.yoll.io/index.php/auth/login");
        /**Version 1*/
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        /**Version 2*/
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @When("user enters {string} username")
    public void user_enters_username(String username) {
        loginPage.usernameField.sendKeys(username);
    }

    @Then("user enters {string} password")
    public void user_enters_password(String password) {
        loginPage.passwordField.sendKeys(password);
    }

    @Then("user clicks on login button")
    public void user_clicks_on_login_button() {
        Wait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(loginPage.loginBtn));
        loginPage.loginBtn.click();
    }

    @Then("user validates {string} error message")
    public void user_validates_error_message(String expectedErrorMessage) {
        String actualErrorMessage = loginPage.errorMessage.getText();
        Assert.assertEquals("Error message validation failed!",
                expectedErrorMessage, actualErrorMessage);
    }


}
