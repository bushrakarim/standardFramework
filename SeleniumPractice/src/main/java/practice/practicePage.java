package practice;

import common.CommonAPI;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class practicePage extends CommonAPI {

 private String url = "https://learn.letskodeit.com/p/practice/";


 @FindBy(id = "bmwradio")
 WebElement bmwRadioBtn;
 @FindBy(id = "benzradio")
 WebElement benzRadioBtn;
 @FindBy(id = "hondaradio")
 WebElement hondaRadioBtn;
 @FindBy(id = "openWindow")
 WebElement openWindowBtn;
 @FindBy(id = "opentab")
 WebElement opentabBtn;
 @FindBy(id = "alertbtn")
 WebElement alertBtn;
 @FindBy(id = "name")
 WebElement enterNamefield;
 @FindBy(id = "confirmbtn")
 WebElement confirmBtn;
 @FindBy(id = "show-textbox")
 WebElement showtextBtn;
 @FindBy(id = "displayed-text")
 WebElement displayedtextBtn;
 @FindBy(id = "mousehover")
 WebElement mouseHoverBtn;
 @FindBy(xpath = "//a[contains(text(),'Top')]")
 WebElement mouseHoverTopBtn;

 @FindBy(id = "carselect")
 WebElement dropdownBtn;

 // helper methods.....
 public void navigateToPracticePage() {
  driver.get(url);
 }

 //method which selects a car radio button depending on the argument....
 public void selectCarRadioBtn(String car) {
  if (car.equalsIgnoreCase("bmw")) {
   this.clickOnWebElement(bmwRadioBtn);

  } else if (car.equalsIgnoreCase("benz")) {
   this.clickOnWebElement(benzRadioBtn);

  } else if (car.equalsIgnoreCase("honda")) {
   this.clickOnWebElement(hondaRadioBtn);
  } else {
   System.out.println("Not a valid car, pls enter valid car!");
  }
 }

 public void okAlert(String name) throws InterruptedException {
  enterNamefield.sendKeys(name);
  Thread.sleep(2000);
  alertBtn.click();
  //Now to handle alert
  Alert alrt = driver.switchTo().alert();
  alrt.accept();
  Thread.sleep(4000);
 }

 public void okConfirm(String name) throws Exception {
  enterNamefield.sendKeys(name);
  confirmBtn.click();
  //Now to handle alert
  Alert alrt = driver.switchTo().alert();
  alrt.accept();
 }

 public void cancelConfirm(String name) throws Exception {
  enterNamefield.sendKeys(name);
  Thread.sleep(2000);
  confirmBtn.click();
  Alert alrt = driver.switchTo().alert();
  alrt.dismiss();
 }

 public void selectMouseHover() throws InterruptedException {
  Actions act = new Actions(driver);
  act.moveToElement(mouseHoverBtn).perform();
  Thread.sleep(3000);
  act.moveToElement(mouseHoverTopBtn).perform();
 }

 public void selectCarDropDownBtn(String car) throws InterruptedException {
  if (car.equalsIgnoreCase("bmw")) {
   Select cars = new Select(dropdownBtn);
   cars.selectByValue("bmw");
  // this.clickOnWebElement("dropdownBtn");
  } else if (car.equalsIgnoreCase("benz")) {
   Select cars = new Select((dropdownBtn));
   cars.selectByValue("benz");
  } else if (car.equalsIgnoreCase("honda")) {
   Select cars = new Select(dropdownBtn);
   cars.selectByValue("honda");
  } else {
   System.out.println("invalid car choice");
  }

 }


}

