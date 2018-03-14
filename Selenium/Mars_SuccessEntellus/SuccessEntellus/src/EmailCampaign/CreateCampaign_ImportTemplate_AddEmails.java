
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateCampaignImportTemplateAddEmails {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://successentellus.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testCreateCampaignImportTemplateAddEmails() throws Exception {
    driver.get(baseUrl + "/home/display");
    driver.findElement(By.linkText("Log In")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("pawan@bringmax.com");
    driver.findElement(By.id("pwd")).clear();
    driver.findElement(By.id("pwd")).sendKeys("Bring");
    driver.findElement(By.id("btn_add")).click();
    driver.findElement(By.cssSelector("a[title=\"Campaign\"] > span")).click();
    driver.findElement(By.linkText("Create Campaign")).click();
    driver.findElement(By.cssSelector("#addCampaignModal > div.modal-dialog > div.modal-content > div.modal-body > #frm > div.form-group > div.col-sm-12 > div.input-group > #campaignTitle")).clear();
    driver.findElement(By.cssSelector("#addCampaignModal > div.modal-dialog > div.modal-content > div.modal-body > #frm > div.form-group > div.col-sm-12 > div.input-group > #campaignTitle")).sendKeys("Demo testing");
    driver.findElement(By.cssSelector("#addCampaignModal > div.modal-dialog > div.modal-content > div.modal-body > #frm > div.form-group > div.col-sm-12 > div.input-group > #campaignContent")).clear();
    driver.findElement(By.cssSelector("#addCampaignModal > div.modal-dialog > div.modal-content > div.modal-body > #frm > div.form-group > div.col-sm-12 > div.input-group > #campaignContent")).sendKeys("summary added for testing the campaign");
    driver.findElement(By.id("btnSave")).click();
    driver.findElement(By.id("btnSave")).click();
    driver.findElement(By.cssSelector("#createCampHead454 > div.cRtLink > ul.clearfix > li.dropdown > a > i.glyphicon.glyphicon-option-vertical")).click();
    driver.findElement(By.xpath("//div[@id='createCampHead454']/div[3]/ul/li/div/a[2]/span[2]")).click();
    new Select(driver.findElement(By.id("fetureCampainID454"))).selectByVisibleText("Customer");
    driver.findElement(By.id("contact0")).click();
    driver.findElement(By.id("btnUpdatefetureCampainID454")).click();
    driver.findElement(By.linkText("Add Email's")).click();
    driver.findElement(By.id("compaignFirstName")).clear();
    driver.findElement(By.id("compaignFirstName")).sendKeys("Pawan");
    driver.findElement(By.id("compaignLastName")).clear();
    driver.findElement(By.id("compaignLastName")).sendKeys("Sasane");
    new Select(driver.findElement(By.id("alredyEx"))).selectByVisibleText("Demo testing");
    driver.findElement(By.id("compaignPhone")).clear();
    driver.findElement(By.id("compaignPhone")).sendKeys("1234567890");
    driver.findElement(By.id("compaignEmails")).clear();
    driver.findElement(By.id("compaignEmails")).sendKeys("pawan@bringmax.com");
    driver.findElement(By.id("btnAdd")).click();
    driver.findElement(By.id("btn_addaddEmailsWpr")).click();
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
