package home;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends CommonAPI {

     @Test
    public void testUsercannotlogintofacebookwithinvalidcredentials() throws InterruptedException {
        // initialize homepage...
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.loginfacebook("kello@yahoo.com","faiz");
        boolean errormessageisdisplayed = homePage.loginpasswordErrormessage.isDisplayed();
        Assert.assertEquals(errormessageisdisplayed,true);

    }

}
