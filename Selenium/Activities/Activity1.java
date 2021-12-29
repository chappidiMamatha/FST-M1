package SeleniumActivities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
		
        // Open the browser
        driver.get("https://www.training-support.net");
		
        // Close the browser
        driver.close();
	}

}
