package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTC {
	
	public static void main(String []arg) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http:www.google.com");
		WebElement el = driver.findElement(By.xpath("//iframe[@name='callout']"));
		driver.switchTo().frame(el);
		driver.findElement(By.xpath("//button[@aria-label='Stay signed out']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("MOHSIN");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);
		
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.close();
		driver.quit();
		
	}
	
}
	
		/*
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("MOHSIN");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("MOHSIN");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mohsinqa00@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("3216544987");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456abc");
		driver.findElement(By.xpath("//input[@name='confirm']")).sendKeys("123456abc");
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		
		list-group-item
		*/
		//driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		
		//btn btn-primary
		//input[@name='lastname']
		//driver.findElement(By.xpath("//button[@class='M6CB1c rr4y5c']")).click();
		//driver.close();
		
		
	


