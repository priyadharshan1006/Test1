package wee3.day5assesment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class tamilmatrimony {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.tamilmatrimony.in/");
		driver.manage().window().maximize();
		
		WebElement selectyourself = driver.findElement(By.id("REGISTERED_BY"));
		Select selectyourselfDropDown = new Select(selectyourself);
		selectyourselfDropDown.selectByValue("8");
		
		driver.findElement(By.id("NAME")).sendKeys("dharshan");
		
		driver.findElement(By.id("gendermale")).click();
		
		WebElement data = driver.findElement(By.id("DOBDAY"));
		Select dataDropDown = new Select(data);
		dataDropDown.selectByValue("10");
		
		WebElement month = driver.findElement(By.id("DOBMONTH"));
		Select monthDropDown = new Select(month);
		monthDropDown.selectByValue("6");
		
		WebElement year = driver.findElement(By.id("DOBYEAR"));
	    Select yearDropDown = new Select(year);
	    yearDropDown.selectByValue("2000");
	    
	    WebElement religion = driver.findElement(By.id("RELIGION"));
	    Select religionDropDown = new Select(religion);
	    religionDropDown.selectByVisibleText("Hindu");
	    
	    WebElement mothertongue = driver.findElement(By.id("MOTHERTONGUE"));
	    Select mothertongueDropDown = new Select(mothertongue);
        mothertongueDropDown.selectByVisibleText("Tamil");
	    
	    WebElement country = driver.findElement(By.id("COUNTRY"));
	    Select countryDropDown = new Select(country);
	    countryDropDown.selectByVisibleText("United States of America");
	    
	    driver.findElement(By.id("MOBILENO")).sendKeys("8056221601");
	    driver.findElement(By.id("EMAIL")).sendKeys("priyadharshan@1006");
//	    driver.close();
		
	}

}
