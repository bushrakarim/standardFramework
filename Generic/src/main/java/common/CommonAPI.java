package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class CommonAPI {
   // static String url = "http://www.facebook.com";

     public static WebDriver driver=null;
 //  public static String url = "http://www.facebook.com";


    @BeforeMethod
    public void setUp() {
        // seting up the chrome browser...
        System.setProperty("webdriver.chrome.driver", "/Users/faisalkarim/IdeaProjects/StandardFramework/Generic/src/main/driver/chromedriver");
        this.driver = new ChromeDriver();
       this.driver.manage().window().fullscreen();
        this.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);


      //  this.driver.get(url);
    }
       // driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);


public void clickOnWebElement(WebElement element){
        element.click();
}
@AfterMethod
    public void cleanUp(){
       //  close the chrome driver...
       driver.close();
    }
}
