package DailyChecklist;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Update_Goals_Weekdays {

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
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		WebElement Select_the_day= driver.findElement(By.id("selChecklist"));
		org.openqa.selenium.support.ui.Select weekday = new org.openqa.selenium.support.ui.Select(Select_the_day);
		weekday.selectByIndex(1); //We're selecting 'Monday' from the weekdays
		System.out.println("Selected weekday is Monday");
		
		driver.findElement(By.xpath("//input[@name='addGoal[]']")).sendKeys("2");
		//driver.findElement(By.xpath("//input[@name='addGoal[]']")).sendKeys(Keys.TAB);
		//driver.findElement(By.xpath("//input[@name='addGoal[]']")).sendKeys("4");
		//driver.findElement(By.xpath("//input[@name='addGoal[]']")).sendKeys(Keys.TAB);
		//driver.findElement(By.xpath("//input[@name='addGoal[]']")).sendKeys("6");
		driver.findElement(By.xpath("//button[@name='btnEdit']")).click();
//		System.out.println(driver.get("Your Daily Checklist for Monday is updated Successfully! ")); 
		System.out.println("Your daily checklist details updated successfully");
		driver.quit();

	}

}
