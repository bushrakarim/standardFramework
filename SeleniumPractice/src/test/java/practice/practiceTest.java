package practice;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class practiceTest extends CommonAPI {
    public practicePage practicepage;
    @BeforeMethod
    public void setupPracticePage(){
        this.practicepage = PageFactory.initElements(driver,practicePage.class);
        practicepage.navigateToPracticePage();
    }
    @Test
    public void testselectHondaRadioBtn() throws InterruptedException{
        practicepage.selectCarRadioBtn("honda");
        Thread.sleep(2000);
    }
    @Test
    public void testokalert() throws Exception{
        practicepage.okAlert("john");
    }
    @Test
    public void testOkConfirm() throws Exception{
        practicepage.okConfirm("bushra");
    }
    @Test
    public void testCancelconfirm() throws Exception{
        practicepage.cancelConfirm("faiz");
    }
    @Test
    public void mouseHv() throws Exception {
        practicepage.selectMouseHover();
    }
@Test
    public void testSelectbmwBtn() throws Exception{
        practicepage.selectCarDropDownBtn("bmw");
        Thread.sleep(2000);
}



}
