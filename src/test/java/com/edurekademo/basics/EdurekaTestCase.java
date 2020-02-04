package com.edurekademo.basics;



import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EdurekaTestCase {

	public static WebDriver driver = null;
	public static WebDriverWait wait = null;

	@BeforeTest
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kisa laptop\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

	}

	@Test
	public void Login() throws MalformedURLException {
		String nodeUrl ="http://192.168.255.26:4444/wd/hub";
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		driver = new RemoteWebDriver(new URL(nodeUrl),cap);
		driver.get("https://www.edureka.co/");
		driver.findElement(By.linkText("Log In")).click();
		driver.findElement(By.id("si_popup_email")).sendKeys("shagufta1214@gmail.com");
		driver.findElement(By.id("si_popup_passwd")).sendKeys("shagufta@82");
		driver.findElement(By.xpath("//button[@class='clik_btn_log btn-block']")).click();

	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}


