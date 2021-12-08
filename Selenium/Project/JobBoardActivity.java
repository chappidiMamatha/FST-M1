package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.junit.Assert;

public class JobBoardActivity {
    WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the chrome driver
        driver = new ChromeDriver();
        
        //Open browser
        driver.get("https://alchemy.hguy.co/jobs/");
        
        driver.manage().window().maximize();
    }

	@Test(priority =0)
    public void verifyPageTitle() {
        // Check the title of the page
        String title = driver.getTitle();
            
        //Print the title of the page
        System.out.println("Page title is: " + title);
            
            //Assertion for page title
        Assert.assertEquals("Alchemy Jobs – Job Board Application", title);
                    
    } 
    
    @Test(priority = 1)
    public void verifyPageHeader() {

        String header = driver.findElement(By.xpath("//h1[@class = 'entry-title']")).getText();
                  
        System.out.println("Page header is: " + header);
            
            //Assertion for page title
        Assert.assertEquals("Welcome to Alchemy Jobs", header);
                    
    } 
    
    @Test(priority = 2)
    public void verifyImageURL() {

        WebElement image = driver.findElement(By.xpath("//img[@class = 'attachment-large size-large wp-post-image']"));
        
                  
        System.out.println("src of image is: " +image.getAttribute("src"));          
                    
    } 
    
    @Test(priority = 3 ,enabled = false)
    public void verifySecondHeader() {

        String secondHeader = driver.findElement(By.xpath("//div[@class='entry-content clear']/h2")).getText();
                  
        System.out.println("secondheader is: " + secondHeader);  
        
        Assert.assertEquals("Quia quis non", secondHeader);
                    
    } 
    
    @Test(priority = 4,enabled = false)
    public void navigateToJobsPage() {

        WebElement jobs = driver.findElement(By.xpath("//div[@class='main-navigation']/ul/li//a[contains(text(),'Jobs')]"));
        
        jobs.click();
        
        String currentPageTitle = driver.getTitle();
        
        System.out.println("page title is: " +currentPageTitle );  
        
        Assert.assertEquals("Jobs – Alchemy Jobs", currentPageTitle);
                    
    } 
    
    @Test(priority = 5)
   
    public void applyForJob() throws InterruptedException {
    	
    	Thread.sleep(2000);

        WebElement jobs = driver.findElement(By.xpath("//div[@class='main-navigation']/ul/li//a[contains(text(),'Jobs')]"));
        
        jobs.click();
        
       System.out.println("clicked on jobs");
        
        WebElement jobSearch = driver.findElement(By.xpath("//input[@id='search_keywords']"));
         jobSearch.sendKeys("Banking");
         
         Thread.sleep(5000);
         WebElement searchJobs = driver.findElement(By.xpath("//input[@value='Search Jobs']"));
         
         searchJobs.click();
         
         Thread.sleep(10000);
         
         WebElement joblisting = driver.findElement(By.xpath("//ul[@class='job_listings']/li[1]/a"));
          joblisting.click();
          
          WebElement applyForJob = driver.findElement(By.xpath("//input[@value='Apply for job']"));
               
            applyForJob.click();
            
           System.out.println("Applied for job");
           Thread.sleep(2000);
           
          String getEmail = driver.findElement(By.xpath("//div[@class='application_details']/p/a")).getText();
          
          
          System.out.println("Email is: "+getEmail);
          
          }
    
    @Test(priority = 6)
    public void postJob() throws InterruptedException {

    	 WebElement postJob = driver.findElement(By.xpath("//div[@class='main-navigation']/ul/li//a[contains(text(),'Post a Job')]"));
    	 
    	 postJob.click();
    	 
    	 WebElement yourEmail = driver.findElement(By.xpath("//input[@id='create_account_email']"));
    	 yourEmail.sendKeys("mamatha6.C@ibm.com");
    	 
    	 Thread.sleep(5000);
    	 WebElement jobTitle = driver.findElement(By.id("job_title"));
    	 jobTitle.sendKeys("Automation Test Engineer");
    	 
    	 Thread.sleep(5000);
    	 
    	 driver.switchTo().frame("job_description_ifr");
    	 
    	 
    	 
    	 WebElement jobDescription = driver.findElement(By.xpath("//*[@id='tinymce']"));
    	 jobDescription.sendKeys("Need a job");
    	 
    	 
    	 driver.switchTo().defaultContent();
    	 
    	 Thread.sleep(5000);
    	 WebElement applicationEmail = driver.findElement(By.id("application"));
    	 applicationEmail.sendKeys("mamatha6.c@ibm.com");
    	 
    	 Thread.sleep(5000);
    	 
    	 WebElement companyName = driver.findElement(By.id("company_name"));
    	 companyName.sendKeys("IBM");
    	 
    	 Thread.sleep(5000);
    	 
    	 
    	 WebElement preview = driver.findElement(By.name("submit_job"));
    	 preview.click();
    	 
    	 Thread.sleep(5000);
    	 
    	 WebElement submitListing = driver.findElement(By.id("job_preview_submit_button"));
    	 submitListing.click();
    	 
    	 driver.findElement(By.xpath("//div[@class='main-navigation']/ul/li//a[contains(text(),'Jobs')]")).click();
    	 
    	 System.out.println("clicked on Jobs");
    	 
    	 Thread.sleep(5000);
    	 
    	String createdJob = driver.findElement(By.xpath("//ul[@class='job_listings']/li[1]/a/div/h3")).getText();
    	
    	System.out.println("created job is "+createdJob);
    	 
    	Assert.assertEquals("Automation Test Engineer", createdJob);
    	 
    	 
    } 
    @Test(priority = 7)
    public void signIn() {

     driver.get("https://alchemy.hguy.co/jobs/wp-admin");
     
     driver.findElement(By.id("user_login")).sendKeys("root");
     driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
     driver.findElement(By.id("wp-submit")).click();
     
     String pageTitle= driver.getTitle();
     
     System.out.println(pageTitle);
     
     Assert.assertEquals("Dashboard ‹ Alchemy Jobs — WordPress", pageTitle);
     
    }
    
    @Test(priority = 8)
    public void jobListing() throws InterruptedException {
    	
    	driver.get("https://alchemy.hguy.co/jobs/wp-admin");
        
        driver.findElement(By.id("user_login")).sendKeys("root");
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("wp-submit")).click();
         Thread.sleep(5000);
    	
    	WebElement jobListing=driver.findElement(By.xpath("//li[@id='menu-posts-job_listing']/a//div[2]/following-sibling::div"));
    	jobListing.click();
    	
    	WebElement addNew=driver.findElement(By.xpath("//div[@class='wrap']/a[contains(text(),'Add New')]"));
    	addNew.click();
    	
    	Thread.sleep(5000);
    	
    	driver.findElement(By.id("post-title-0")).sendKeys("Test Specialist");
  
    	
    	driver.findElement(By.id("_company_website")).sendKeys("https://IBM.com");
 
    	driver.findElement(By.id("_company_twitter")).sendKeys("IBM@");
    	driver.findElement(By.id("_company_name")).sendKeys("IBM");
    	
    	driver.findElement(By.id("_company_tagline")).sendKeys("We grow");
    	
    	driver.findElement(By.xpath("//button[contains(text(),'Publish')]")).click();
    	
    	Thread.sleep(3000);
    	
    	driver.findElement(By.xpath("//div[@class='editor-post-publish-panel__header-publish-button']/button[contains(text(),'Publish')]")).click();
    	 Thread.sleep(5000);
    	
    	driver.findElement(By.xpath("//a[contains(.,'View Job')]")).click();
    	
       Thread.sleep(3000);
       
       WebElement jobs = driver.findElement(By.xpath("//div[@class='main-navigation']/ul/li//a[contains(text(),'Jobs')]"));
       
       jobs.click();
       
       Thread.sleep(2000);
       
    	
        String createdJob = driver.findElement(By.xpath("//ul[@class='job_listings']/li[1]/a/div/h3")).getText();
    	
    	System.out.println("created job is "+createdJob);
    	 
    	Assert.assertEquals("Test Specialist", createdJob);
    	
    }
  

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}