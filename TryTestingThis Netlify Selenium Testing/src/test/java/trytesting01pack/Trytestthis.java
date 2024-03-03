package trytesting01pack;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Trytestthis {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Initialization
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		//URL Open
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
		
		//Locator First Name
		driver.findElement(By.id("fname")).sendKeys("Ahnaf");
		//Locator Last Name
		driver.findElement(By.id("lname")).sendKeys("Rahman");
		
		//Gender Selection
		WebElement radiobutton= driver.findElement(By.id("male"));
		radiobutton.click();
		
//		Thread.sleep(3000);
//		
//		WebElement radiobutton1= driver.findElement(By.id("female"));
//		radiobutton1.click();
		
//		Thread.sleep(3000);
//		
//		WebElement radiobutton2= driver.findElement(By.id("other"));
//		radiobutton2.click();
		
		
		//Select Method 
		assert radiobutton.isSelected();
		System.out.println(radiobutton.isSelected());
		
		//Dropdown button
		WebElement testdropdown=driver.findElement(By.id("option"));
		Select dropdown=new Select(testdropdown);
		
//		dropdown.selectByIndex(2);
//		dropdown.selectByValue("option 2");
		dropdown.selectByVisibleText("Option 2");
		
		//Dropdown multiple select 
		
		WebElement testdropdownmultiple=driver.findElement(By.id("owc"));
		Select dropdownmultiple=new Select(testdropdownmultiple);
		if(dropdownmultiple.isMultiple()) {
//			dropdownmultiple.selectByIndex(1);
//			dropdownmultiple.selectByIndex(3);
//			dropdownmultiple.selectByValue("option 1");
//			dropdownmultiple.selectByValue("option 3");
			dropdownmultiple.selectByVisibleText("Option 1");
			dropdownmultiple.selectByVisibleText("Option 3");
			
		//Check box button
			WebElement checkboxlist=driver.findElement(By.name("option3"));
			checkboxlist.click();
			assert checkboxlist.isSelected();
			System.out.println(checkboxlist.isSelected());
			
			
			
		};
	}

}
