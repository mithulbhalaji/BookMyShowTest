package com.bookmyshow.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bookmyshow.pages.HomePage;

public class HomePageTest {

	WebDriver driver;
	HomePage homePage;
	
	public HomePageTest() {
		this.driver= new ChromeDriver();
	}

	
//	@Test
//	public void selectChennaiLocation() {
//		driver.get("https://in.bookmyshow.com/");
//		homePage = new HomePage(driver);
//		Assert.assertEquals(homePage.clickChennaiLocation(),true);
//		driver.close();
//	}
	
	@Test
	public void selectMovie() {
		driver.get("https://in.bookmyshow.com/explore/home/chennai");
		String movieName = "Leo";
		homePage = new HomePage(driver);
		String movieTitle = homePage.searchMovies(movieName);
		Assert.assertEquals(movieName, movieTitle);
		driver.close();
	}

}
