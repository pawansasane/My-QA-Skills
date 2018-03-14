

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AddCampaignEditDelete {
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
  public void testAddCampaignEditDelete() throws Exception {
    driver.findElement(By.linkText("Log In")).click();
    driver.findElement(By.linkText("Log In")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("pawan@bringmax.com");
    driver.findElement(By.id("pwd")).clear();
    driver.findElement(By.id("pwd")).sendKeys("Bring");
    driver.findElement(By.id("btn_add")).click();
    driver.findElement(By.xpath("//div[@id='page-wrapper']/aside/section/ul/li[9]/a/span")).click();
    driver.findElement(By.linkText("Create Campaign")).click();
    driver.findElement(By.xpath("//div[2]/div/div/div[2]/form/div/div/div/input")).clear();
    driver.findElement(By.xpath("//div[2]/div/div/div[2]/form/div/div/div/input")).sendKeys("Add Campaign - Edit - Delete");
    driver.findElement(By.xpath("//div[2]/div/div/div[2]/form/div[2]/div/div/textarea")).clear();
    driver.findElement(By.xpath("//div[2]/div/div/div[2]/form/div[2]/div/div/textarea")).sendKeys("Add Campaign - Edit - Delete");
    driver.findElement(By.id("btnSave")).click();
    driver.findElement(By.xpath("//div[42]/div/div/div[3]/ul/li/a/i")).click();
    driver.findElement(By.xpath("//div[@id='createCampHead511']/div[3]/ul/li/div/a[4]/span[2]")).click();
    driver.findElement(By.xpath("//div[42]/div/div/div[3]/ul/li/div[3]/div/div/div[2]/form/div/div/div/input")).clear();
    driver.findElement(By.xpath("//div[42]/div/div/div[3]/ul/li/div[3]/div/div/div[2]/form/div/div/div/input")).sendKeys("Add Campaign - Edit - Delete2");
    driver.findElement(By.xpath("//div[42]/div/div/div[3]/ul/li/div[3]/div/div/div[2]/form/div[2]/div/div/textarea")).clear();
    driver.findElement(By.xpath("//div[42]/div/div/div[3]/ul/li/div[3]/div/div/div[2]/form/div[2]/div/div/textarea")).sendKeys("Add Campaign - Edit - Delete2");
    driver.findElement(By.xpath("(//button[@id='btnUpdate'])[42]")).click();
    driver.findElement(By.xpath("//div[42]/div/div/div[3]/ul/li/a/i")).click();
    driver.findElement(By.xpath("//div[@id='createCampHead511']/div[3]/ul/li/div/a[5]/span[2]")).click();
    assertTrue(closeAlertAndGetItsText().matches("^Are You Sure you want to delete[\\s\\S]$"));
    // ERROR: Caught exception [unknown command []]
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
