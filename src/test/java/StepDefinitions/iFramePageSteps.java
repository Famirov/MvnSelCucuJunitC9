package StepDefinitions;

import Pages.AlertPage;
import Pages.iFramePage;
import Utilities.DriverFactory;
import org.openqa.selenium.WebDriver;

public class iFramePageSteps {
    WebDriver driver = DriverFactory.getDriver();
    iFramePage iFramePage = new iFramePage(driver);


}
