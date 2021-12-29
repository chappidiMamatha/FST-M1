package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acyivity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   WebDriver driver = new ChromeDriver();
		     
		     driver.get("https://training-support.net/selenium/simple-form");
		     
		     String title = driver.getTitle();
		     System.out.println("Page title is: " + title);
		     
		     WebElement firstName = driver.findElement(By.id("firstName"));
		     firstName.sendKeys("Mamatha");
		     
		     WebElement lastName = driver.findElement(By.id("lastName"));
		     lastName.sendKeys("Chappidi");
		     
		   //Enter the email
		     driver.findElement(By.id("email")).sendKeys("test@example.com");
		     
		     //Enter the contact number
		     driver.findElement(By.id("number")).sendKeys("1234567890");
		     
		     //Click Submit
		     driver.findElement(By.cssSelector(".ui.green.button")).click();
		     driver.close();
			}

	}

