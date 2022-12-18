package StepDefinitions;

import Pages.AlertPage;
import Utilities.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class AlertPageSteps {
    WebDriver driver = DriverFactory.getDriver();
    AlertPage alertPage = new AlertPage(driver);
    @Given("user navigates to Alerts Page")
    public void user_navigates_to_Alerts_Page() {
        driver.get("https://demoqa.com/alerts");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("user clicks on regular alert on Alerts Page")
    public void user_clicks_on_regular_alert_on_Alerts_Page() throws InterruptedException {
        Thread.sleep(3000);
        alertPage.regularAlertButton.click();
    }

    @Then("user should be able to handle regular alert on Alerts Page")
    public void user_should_be_able_to_handle_regular_alert_on_Alerts_Page() {
        Alert myAlert = driver.switchTo().alert();
        myAlert.accept();
    }
}
