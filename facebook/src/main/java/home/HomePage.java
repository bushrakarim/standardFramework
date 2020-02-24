package home;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {

//static String url="http://www.facebook.com";

    @FindBy(xpath = "//input[@name='email']")
    WebElement emailfield;
    @FindBy(id = "pass")
    WebElement passwordfield;
    @FindBy(xpath = "//input[@value='Log In']")
    WebElement logBtn;

    @FindBy(xpath = "//div[text()='The email or phone number you’ve entered doesn’t match any account. ']")
    WebElement loginemailerrormessage;
    @FindBy(xpath = "//div[text()='The password you’ve entered is incorrect. ']")
    WebElement loginpasswordErrormessage;

    public void navigatetofacebook() {
//      driver.navigate().to(url);}
        driver.get("https://www.facebook.com");
    }

        public void loginfacebook (String emails, String password){
            this.navigatetofacebook();
            emailfield.sendKeys(emailsgit status);
            passwordfield.sendKeys(password);
            logBtn.click();

        }


    }
