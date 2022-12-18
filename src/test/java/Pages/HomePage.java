package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    public HomePage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "welcome")
    public WebElement usernameHeader;

    @FindBy(xpath = "//*[@class='menu']/ul/li")
    public List<WebElement> allMainTabs;


}