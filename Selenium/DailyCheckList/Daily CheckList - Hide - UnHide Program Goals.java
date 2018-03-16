

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DailyCheckListHideUnHideProgramGoals {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://successentellus.com/home/display";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testDailyCheckListHideUnHideProgramGoals() throws Exception {
    driver.get(baseUrl + "/home/display");
    driver.findElement(By.linkText("Log In")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("pawan@bringmax.com");
    driver.findElement(By.id("pwd")).clear();
    driver.findElement(By.id("pwd")).sendKeys("Bring");
    driver.findElement(By.id("btn_add")).click();
    driver.findElement(By.linkText("Show Hidden Goals")).click();
    driver.findElement(By.cssSelector("#addgoalModal > div.modal-dialog > div.modal-content > div.modal-header > button.close")).click();
    driver.findElement(By.cssSelector("span.hideImgWpr")).click();
    driver.findElement(By.cssSelector("span.hideImgWpr")).click();
    driver.findElement(By.linkText("Show Hidden Goals")).click();
    driver.findElement(By.id("checkGoal13")).click();
    driver.findElement(By.id("btn_add")).click();
    driver.findElement(By.linkText("Show Hidden Goals")).click();
    driver.findElement(By.id("checkGoal15")).click();
    driver.findElement(By.id("btn_add")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
