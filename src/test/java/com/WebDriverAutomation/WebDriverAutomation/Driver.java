package com.WebDriverAutomation.WebDriverAutomation;

import com.google.common.base.Functions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

@SpringBootTest
class Driver {
	WebDriver driver;

	@BeforeEach
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\workspace\\conf\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(500);
	}

	@Test
	void signIn() throws InterruptedException {
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email_create")).sendKeys(generateRandomString(5)+ "@mail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Rafael Isaac");
		driver.findElement(By.id("customer_lastname")).sendKeys("Primavera Carneiro");
		driver.findElement(By.id("isPasswd")).sendKeys("1dois3quatro5");

		Select select = new Select(driver.findElement(By.id("uniform-days")));
		select.getFirstSelectedOption();
	}

	public static String generateRandomString(int len) {
		String chars = "abcdefghijklmnopqrstuvwxyz";
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(chars.charAt(rnd.nextInt(chars.length())));
		return sb.toString();
	}
}
