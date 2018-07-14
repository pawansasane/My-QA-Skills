package EmailCampaign_AddCampaign_Delete;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddEmail_Template {
	WebDriver driver;
	@BeforeTest
	public void Login_SEntellus() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.successentellus.com/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("pawan@bringmax.com");
		driver.findElement(By.name("pwd")).sendKeys("Jessi^123");
		driver.findElement(By.id("btn_add")).click();
		Thread.sleep(3000);
		System.out.println("Logged In to SEntellus Successfully!");
	}
	
	@Test
	public void Blank_Template() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/aside/section/ul/li[10]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"page-content\"]/div/div[2]/div[2]/a")).click();
		driver.findElement(By.id("campaignTitleNew")).sendKeys("First Campaign - Automation script1");
		driver.findElement(By.xpath("//*[@id=\"frmAddCamaignNew\"]/div/div/div[2]/div/div[1]/div[3]/label")).click();
		driver.findElement(By.id("btnSaveCreateModel")).click();
		String expectedMessage = "Text Campaign added successfully!";
		String Message = driver.findElement(By.xpath("//*[@id=\"successdiv\"]/div/div[2]/p")).getText();
		Assert.assertEquals(Message.contains(expectedMessage), Message); //Verify success message text
		System.out.println("Campaign is added successfully.");
		driver.findElement(By.xpath("//*[@id=\"iconsTemplate3244\"]/a[1]/i")).click();
		driver.findElement(By.xpath("//*[@id=\"addCampaign\"]/div[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"campaignStepSubject\"]")).sendKeys("My Template Subject");
		driver.findElement(By.xpath("//*[@id=\"userTemplateTitle\"]")).sendKeys("My Template Heading");
		driver.findElement(By.xpath("/html")).sendKeys("My Email Content");
		driver.findElement(By.xpath("//*[@id=\"campaignStepSendInterval\"]")).sendKeys("0");
		
		Select sel = new Select(driver.findElement(By.xpath("//*[@id=\"type\"]"))); //Select's the drop-down list
		sel.selectByValue("days"); //Choose 'Days' option from the drop-down
		
		driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
		
		String actual_success = driver.findElement(By.xpath("//*[@id=\"successdiv\"]/div/div[2]")).getText(); //Line 55,56,57 - Verifies the success message.
		String expected_success = " Template Added Successfully";
		Assert.assertEquals(expected_success, actual_success.contains(" Template Added Successfully"));
		
		System.out.println(" Template added Successfully. & Test Completed"); // Print the Success Message
		}
	
	@AfterTest
	public void Close_Browser()
	{
		driver.close();
	}
}
