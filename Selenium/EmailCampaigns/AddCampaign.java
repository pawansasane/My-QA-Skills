package EmailCampaign_AddCampaign_Delete;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AddCampaign {

	public static void main(String[] args) throws InterruptedException 
	
	/*@BeforeTest
	  public void beforeTest() throws InterruptedException*/
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://successentellus.com/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.id("email")).sendKeys("pawan@bringmax.com");
	driver.findElement(By.name("pwd")).sendKeys("Jessi^123");
	driver.findElement(By.id("btn_add")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/aside/section/ul/li[10]/a")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"page-content\"]/div/div[2]/div[2]/a")).click();
	driver.findElement(By.id("campaignTitleNew")).sendKeys("First Campaign - Automation script1");
	driver.findElement(By.xpath("//*[@id=\"frmAddCamaignNew\"]/div/div/div[2]/div/div[1]/div[3]/label")).click();
	driver.findElement(By.id("btnSaveCreateModel")).click();
	/*driver.findElement(By.xpath("//*[@id=\"iconsTemplate3223\"]/a[5]/i")).click();
	driver.findElement(By.xpath("//*[@id=\"campaignTitle\"]")).sendKeys("First Campaign - Automation script1 - Updated");
	driver.findElement(By.id("btnUpdate")).click();*/
	
	String expectedMessage = "Text Campaign added successfully!";
	String Message = driver.findElement(By.xpath("//*[@id=\"successdiv\"]/div/div[2]/p")).getText();
	Assert.assertEquals(Message.contains(expectedMessage), Message); //Verify success message text
	driver.close();
	}
}
