package com.EdurekaPhotoUpload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInEdurekaPortal {

	public WebDriver driver = null;
	@BeforeMethod
	public void launchApp()
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kisa laptop\\Downloads\\chromedriver_win32\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://www.edureka.co");
driver.findElement(By.xpath("LogInBtn"));
driver.findElement(By.xpath("//a[@class='signin top-signin giTrackElementHeader hidden-xs']"));
}

	@Test
	public void search()
	{
		
		    driver.findElement(By.xpath("LogInBtn"));
		    driver.findElement(By.xpath("//a[@class='signin top-signin giTrackElementHeader hidden-xs']"));
		    
		    WebElement email = driver.findElement(By.id("identifierId"));
		    email.sendKeys("shagufta1214@gmail.com");
		    driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		    
		    WebElement password = driver.findElement(By.name("identifierPassword"));
		    password.sendKeys("Test@2020");
		    driver.findElements(By.xpath("//span[text()='Next']"));
            
		    
		    driver.findElement(By.xpath("LogInBtn"));
		    driver.findElement(By.xpath("//button[@class='clik_btn_log btn"));
		    driver.findElement(By.xpath("MyProfile"));
		    driver.findElement(By.xpath("//a[@class='dropdown-toggle trackButton']"));
		    driver.findElement(By.xpath("EditProfile"));
		    driver.findElement(By.xpath("//a[@class='giTrackElementHeader']"));
		    driver.findElement(By.xpath("IdPersonalDetails"));
		    driver.findElement(By.id("//a[@id='personal_details']//i[@class='icon-pr-edit'] "));
		    driver.findElement(By.xpath("//img[@class='img-circle img-responsive']"));
		    
		    
		  
	
	}
	
	
}