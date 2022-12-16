package wee3.day5assesment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class faceBook {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("dharshan");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("G");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8056221601");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("pass");
	     WebElement Day1= driver.findElement(By.id("day"));
		 Select dayDropDown = new Select(Day1);
		 dayDropDown.selectByValue("14");
		 
		 WebElement month = driver.findElement(By.id("month"));
		 Select monthDropDown= new Select(month);
		 monthDropDown.selectByValue("6");
		 
		 WebElement year = driver.findElement(By.id("year"));
		 Select yearDropDown = new Select(year);
		 yearDropDown.selectByValue("2014");
		 driver.findElement(By.xpath("//input[@value='2']")).click();
		 
		// -driver.close();
		
	}

}
