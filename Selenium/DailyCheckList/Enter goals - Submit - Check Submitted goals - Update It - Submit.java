
package dailyChecklist;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class EnterGoalsSubmitCheckSubmittedGoalsUpdateItSubmit {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception 
  {
    driver = new FirefoxDriver();
    baseUrl = "https://successentellus.com/home/display";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testEnterGoalsSubmitCheckSubmittedGoalsUpdateItSubmit() throws Exception {
    driver.get(baseUrl + "/home/display");
    driver.findElement(By.linkText("Log In")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("pawan@bringmax.com");
    driver.findElement(By.id("pwd")).clear();
    driver.findElement(By.id("pwd")).sendKeys("Bring");
    driver.findElement(By.id("btn_add")).click();
    driver.findElement(By.cssSelector("a[title=\"Dashboard\"] > span")).click();
    driver.findElement(By.id("addGoal[]")).clear();
    driver.findElement(By.id("addGoal[]")).sendKeys("1");
    driver.findElement(By.name("addGoal[3]")).clear();
    driver.findElement(By.name("addGoal[3]")).sendKeys("1");
    driver.findElement(By.name("addGoal[10]")).clear();
    driver.findElement(By.name("addGoal[10]")).sendKeys("1");
    driver.findElement(By.name("addGoal[18]")).clear();
    driver.findElement(By.name("addGoal[18]")).sendKeys("1");
    driver.findElement(By.name("addGoal[15]")).clear();
    driver.findElement(By.name("addGoal[15]")).sendKeys("1");
    driver.findElement(By.name("addGoal[11]")).clear();
    driver.findElement(By.name("addGoal[11]")).sendKeys("1");
    driver.findElement(By.name("addGoal[12]")).clear();
    driver.findElement(By.name("addGoal[12]")).sendKeys("1");
    driver.findElement(By.name("addGoal[13]")).clear();
    driver.findElement(By.name("addGoal[13]")).sendKeys("1");
    driver.findElement(By.name("addGoal[9]")).clear();
    driver.findElement(By.name("addGoal[9]")).sendKeys("1");
    driver.findElement(By.name("addGoal[6]")).clear();
    driver.findElement(By.name("addGoal[6]")).sendKeys("1");
    driver.findElement(By.name("addGoal[16]")).clear();
    driver.findElement(By.name("addGoal[16]")).sendKeys("1");
    driver.findElement(By.name("addGoal[7]")).clear();
    driver.findElement(By.name("addGoal[7]")).sendKeys("1");
    driver.findElement(By.name("addGoal[2]")).clear();
    driver.findElement(By.name("addGoal[2]")).sendKeys("1");
    driver.findElement(By.name("addGoal[14]")).clear();
    driver.findElement(By.name("addGoal[14]")).sendKeys("1");
    driver.findElement(By.name("addGoal[19]")).clear();
    driver.findElement(By.name("addGoal[19]")).sendKeys("1");
    driver.findElement(By.name("addGoal[17]")).clear();
    driver.findElement(By.name("addGoal[17]")).sendKeys("1");
    driver.findElement(By.name("addGoal[20]")).clear();
    driver.findElement(By.name("addGoal[20]")).sendKeys("1");
    driver.findElement(By.id("btnSubmit")).click();
    assertEquals("Your score will now be counted towards the score, if you missed adding a goal, you can still add it the next day. It will not jeopardize your score.", closeAlertAndGetItsText());
    new Select(driver.findElement(By.id("selChecklist"))).selectByVisibleText("Thu");
    driver.findElement(By.xpath("//option[@value='2018-03-15']")).click();
    driver.findElement(By.name("addGoal[]")).clear();
    driver.findElement(By.name("addGoal[]")).sendKeys("2");
    driver.findElement(By.xpath("(//input[@id='addGoal[]'])[19]")).clear();
    driver.findElement(By.xpath("(//input[@id='addGoal[]'])[19]")).sendKeys("2");
    driver.findElement(By.xpath("(//input[@id='addGoal[]'])[20]")).clear();
    driver.findElement(By.xpath("(//input[@id='addGoal[]'])[20]")).sendKeys("2");
    driver.findElement(By.xpath("(//input[@id='addGoal[]'])[21]")).clear();
    driver.findElement(By.xpath("(//input[@id='addGoal[]'])[21]")).sendKeys("2");
    driver.findElement(By.xpath("(//input[@id='addGoal[]'])[22]")).clear();
    driver.findElement(By.xpath("(//input[@id='addGoal[]'])[22]")).sendKeys("2");
    driver.findElement(By.xpath("(//input[@id='addGoal[]'])[23]")).clear();
    driver.findElement(By.xpath("(//input[@id='addGoal[]'])[23]")).sendKeys("2");
    driver.findElement(By.xpath("(//input[@id='addGoal[]'])[24]")).clear();
    driver.findElement(By.xpath("(//input[@id='addGoal[]'])[24]")).sendKeys("2");
    driver.findElement(By.xpath("(//input[@id='addGoal[]'])[25]")).clear();
    driver.findElement(By.xpath("(//input[@id='addGoal[]'])[25]")).sendKeys("2");
    driver.findElement(By.xpath("(//input[@id='addGoal[]'])[26]")).clear();
    driver.findElement(By.xpath("(//input[@id='addGoal[]'])[26]")).sendKeys("2");
    driver.findElement(By.xpath("(//input[@id='addGoal[]'])[27]")).clear();
    driver.findElement(By.xpath("(//input[@id='addGoal[]'])[27]")).sendKeys("2");
    driver.findElement(By.xpath("(//input[@id='addGoal[]'])[28]")).clear();
    driver.findElement(By.xpath("(//input[@id='addGoal[]'])[28]")).sendKeys("2");
    driver.findElement(By.xpath("(//input[@id='addGoal[]'])[29]")).clear();
    driver.findElement(By.xpath("(//input[@id='addGoal[]'])[29]")).sendKeys("2");
    driver.findElement(By.xpath("(//input[@id='addGoal[]'])[30]")).clear();
    driver.findElement(By.xpath("(//input[@id='addGoal[]'])[30]")).sendKeys("2");
    driver.findElement(By.xpath("(//input[@id='addGoal[]'])[31]")).clear();
    driver.findElement(By.xpath("(//input[@id='addGoal[]'])[31]")).sendKeys("2");
    driver.findElement(By.xpath("(//input[@id='addGoal[]'])[32]")).clear();
    driver.findElement(By.xpath("(//input[@id='addGoal[]'])[32]")).sendKeys("2");
    driver.findElement(By.xpath("(//input[@id='addGoal[]'])[33]")).clear();
    driver.findElement(By.xpath("(//input[@id='addGoal[]'])[33]")).sendKeys("2");
    driver.findElement(By.xpath("(//input[@id='addGoal[]'])[34]")).clear();
    driver.findElement(By.xpath("(//input[@id='addGoal[]'])[34]")).sendKeys("2");
    driver.findElement(By.id("btnEdit")).click();
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
