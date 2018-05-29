package Add_Or_Edit_Goals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exclusion_Critical_Zeros_or_Blank {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.successentellus.com/check/login");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("input#email.form-control")).sendKeys("minakshi@bringmax.com");
		driver.findElement(By.cssSelector("input#pwd.form-control")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id='btn_add']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.cssSelector("input#email.form-control")).sendKeys("minakshi@bringmax.com");
		driver.findElement(By.cssSelector("input#pwd.form-control")).sendKeys("123456");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='btn_add']")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@title='Edit Goals']")).click();
		
		/*Thread.sleep(5);
		driver.findElement(By.xpath("//a[@title='Edit Goals']")).click();*/
		
		//driver.findElement(By.xpath("//input[@name='buisness_start_date']")).sendKeys("05/29/2018");
		driver.findElement(By.xpath("//input[@name='goal1[3]']")).clear();
		driver.findElement(By.xpath("//input[@name='goal1[3]']")).sendKeys("0");
		driver.findElement(By.xpath("//input[@name='goal1[4]']")).clear();
		driver.findElement(By.xpath("//input[@name='goal1[4]']")).sendKeys("");
		driver.findElement(By.cssSelector("a.btn.bg-orange")).click();
		System.out.println("Error - Please enter valid numbers here. Exclusion for zero & empty textboxes");
	}

}
