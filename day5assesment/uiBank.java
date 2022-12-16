package wee3.day5assesment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class uiBank {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://uibank.uipath.com/register-account");
		driver.manage().window().maximize();
		driver.findElement(By.id("firstName")).sendKeys("dharshan");
		
		WebElement title = driver.findElement(By.id("title"));
		Select titleDropDown = new Select(title);
		titleDropDown.selectByVisibleText("Mr");
		
		driver.findElement(By.id("middleName")).sendKeys("G");
		driver.findElement(By.id("lastName")).sendKeys("dharshan");
		
		WebElement gender = driver.findElement(By.id("sex"));
		Select  genderDropDown = new Select(gender);
		genderDropDown.selectByVisibleText("Male");
		
		WebElement employmentStatus = driver.findElement(By.id("employmentStatus"));
		Select employmentStatusDropDown = new Select(employmentStatus);
		employmentStatusDropDown.selectByVisibleText("Unemployed");
		
		driver.findElement(By.id("username")).sendKeys("dhar");
		driver.findElement(By.id("email")).sendKeys("priyadharshan@1006");
//		driver.close();
	}

}
