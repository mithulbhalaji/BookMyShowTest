package com.bookmyshow.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	WebDriver driver;
	WebDriverWait driverWait;
	Actions actions;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		this.driverWait = new WebDriverWait(driver, 5);
	}
	
	By chennaiLocation = By.xpath("//img[@alt='CHEN']");
	By currentLocation = By.xpath("//span[contains(text(),'Chennai')]");
	By searchClick = By.xpath("//span[@id='4']");
	By searchBar = By.xpath("//input[@placeholder='Search for Movies, Events, Plays, Sports and Activities']");
	
	public boolean clickChennaiLocation() {
		driver.findElement(chennaiLocation).click();
		String location = driver.findElement(currentLocation).getText();
		return location.equals("Chennai");
	}
	
	public String searchMovies(String movieName) {
		driver.findElement(searchClick).click();
		driver.findElement(searchBar).sendKeys(movieName);
		actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER);
		String movieTitle = driver.findElement(By.xpath("//h1[contains(text(),'"+movieName+"')]")).getText();
		return movieTitle;
	}
	
	
	
	
	
}
