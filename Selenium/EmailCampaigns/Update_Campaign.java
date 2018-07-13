package EmailCampaign_AddCampaign_Delete;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Update_Campaign {

	public static void main(String[] args) throws InterruptedException 
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
		driver.findElement(By.xpath("//a[@data-content='Edit Campaign']/a[5]")).click();
		driver.findElement(By.xpath("//*[@id=\"campaignTitle\"]")).sendKeys("Updated email Campaign name - Automation Script");
		driver.findElement(By.xpath("//*[@id=\"btnUpdate\"]")).click();
		driver.switchTo().alert().getText();
		
	}
}
