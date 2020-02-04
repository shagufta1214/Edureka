package com.edurekademo.basics;

import java.io.IOException;

import org.testng.TestNG;
import org.testng.annotations.Test;


public class Enroll_CourseInEdureka extends TestNG {


	private static final String driver = null;
	private static final String actualTitle = null;

	@Test(priority= 1)
	public void loginEdureka() throws InterruptedException, IOException {
		EdurekaHomePage objHomePage = new EdurekaHomePage(driver);

		objHomePage.clickLogIn();
		Thread.sleep(2000);
		objHomePage.enterPasswordModal1();
		Thread.sleep(3000);
		objHomePage.enterEmailModal();
		objHomePage.clickLoginBtnModal();
		objHomePage.goToBlogs();
		com.edurekademo.basics.EdurekaHomePage objBlogsPage = new com.edurekademo.basics.EdurekaHomePage();
	    
		objBlogsPage.clickInterviewQuestions();
		String expectedTitle = "Interview Questions Archive - Edureka";
		String actualTitle = driver();
		if (actualTitle.contentEquals(expectedTitle))
		{
			System.out.println("Test case successful!");
		
			
		}
		else {
			System.out.println("Test Failed");
			
		}
	}

	private String driver() {
		// TODO Auto-generated method stub
		return null;
	}
}
