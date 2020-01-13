package com.edurekaThirsPartyTools;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleSearch 
{
public WebDriver driver = null;
	@BeforeMethod
	public void launchApp() throws MalformedURLException
	{
String nodeUrl = "http://192.168.1.113:4444/Wd/hub";
DesiredCapabilities cap = DesiredCapabilities.chrome();
cap.setBrowserName("chrome");
cap.setPlatform(Platform.WIN10);
driver = new RemoteWebdriver(new URL(nodeUrl),cap);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://www.google.com");

}

@Test
public void search()
{
WebElement search = driver.findElement(By.name("q"));
search.sendKeys("Selenium");
search.submit();
System.out.println(driver.getTitle());


}

}