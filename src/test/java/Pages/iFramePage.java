package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class iFramePage {

        public iFramePage (WebDriver driver) {

            PageFactory.initElements(driver, this);
        }

        @FindBy(id = "mce_0_ifr")
        public WebElement iFrameMenu;

        @FindBy(id = "tinymce")
        public WebElement editorTextBox;


    }
