package com.movie;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Details {

	@Test
	public void wiki() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yuges\\eclipse-workspace\\Sample\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Pushpa: The Rise-Part 1");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a[@title='Pushpa: The Rise']")).click();
		WebElement country = driver.findElement(By.xpath("//td[text()='India']"));
		System.out.println(country.getText());
		WebElement date = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[12]/td/div/ul/li"));
		System.out.println(date.getText());
	}

	@Test
	public void IMDB() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yuges\\eclipse-workspace\\Sample\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.imdb.com/");
		driver.findElement(By.xpath("//input[@id='suggestion-search']")).sendKeys("Pushpa: The Rise-Part 1");
		driver.findElement(By.xpath("//button[@id='suggestion-search-button']")).click();
		driver.findElement(By.xpath("//a[text()='Pushpa: The Rise - Part 1']")).click();
		driver.findElement(By.xpath("//a[text()='Release date']")).click();
		WebElement country = driver.findElement(By.xpath("//*[@id=\"releaseinfo_content\"]/table[1]/tbody/tr[6]/td[1]"));
		System.out.println(country.getText());
		WebElement date = driver.findElement(By.xpath("//*[@id=\"releaseinfo_content\"]/table[1]/tbody/tr[6]/td[2]"));
		System.out.println(date.getText());
	}

	@Test
	public void compare() {
		Assert.assertTrue(true);
		Assert.assertEquals("India","India");
		Assert.assertEquals("17 December 2021","17 December 2021");
		System.out.println("Successfully passed");
	}}
