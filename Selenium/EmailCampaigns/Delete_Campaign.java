package EmailCampaign_AddCampaign_Delete;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class Delete_Campaign {
	WebDriver driver = new ChromeDriver(); //driver - Variable globally declared
	//public static void main(String[] args) throws InterruptedException 
	
		@Test
		public void delete_test() throws InterruptedException
		{
			WebDriver driver = new ChromeDriver();
			driver.get("https://successentellus.com/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.id("email")).sendKeys("pawan@bringmax.com");
			driver.findElement(By.name("pwd")).sendKeys("Jessi^123");
			driver.findElement(By.id("btn_add")).click();
			Thread.sleep(3000); //Wait for 3 seconds
			driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/aside/section/ul/li[10]/a")).click(); //link from left menu bar
			Thread.sleep(3000);	//Wait for 3 seconds
			driver.findElement(By.cssSelector("#iconsTemplate3242 > a:nth-child(5) > i")).click(); //Click on Email Campaign delete button. (Issue - Need to change CSS path every time after delete.)
			driver.switchTo().alert().accept(); //Click 'OK' on browser alert
			String actual_success = driver.findElement(By.xpath("//*[@id=\"successdiv\"]/div/div[2]/p")).getText(); //Line 32,33,34 - Verifies the success message.
			String expected_success = " Campaign is Deleted Successfully!";
			Assert.assertTrue(expected_success, actual_success.contains(" Campaign is Deleted Successfully!"));
			System.out.println(" Campaign is Deleted Successfully!");
			System.out.println("Test Completed");
	}
	
	@AfterTest
	public void quit_all_browser()
	{
		driver.quit();
	}

}
