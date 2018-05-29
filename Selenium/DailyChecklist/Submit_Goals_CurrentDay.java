package DailyChecklist;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit_Goals_CurrentDay {

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
		driver.findElement(By.xpath("//input[@name='addGoal[1]']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@name='addGoal[2]']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@name='addGoal[3]']")).sendKeys("3");
		driver.findElement(By.xpath("//button[@name='btnSubmit']")).click();
//		System.out.println(driver.get("Your Daily Checklist Submitted Successfully! ")); 
		System.out.println("Success! Your program goals submitted successfully.");
		driver.close();
	}

}
