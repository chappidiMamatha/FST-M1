package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		 
	        //Open the browser
	        driver.get("https://www.training-support.net/selenium/dynamic-controls");
	        WebElement checkboxInput = driver.findElement(By.xpath("//input[@type='checkbox']"));
	        System.out.println("The checkbox Input is displayed: " + checkboxInput.isDisplayed());
	 
	        driver.findElement(By.id("toggleCheckbox")).click();
	 
	        System.out.println("The checkbox Input is displayed: " + checkboxInput.isDisplayed());
	 
	        //Close the browser
	        driver.close(); 
	}

}
