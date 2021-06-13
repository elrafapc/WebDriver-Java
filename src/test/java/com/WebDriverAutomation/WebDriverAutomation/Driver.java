package com.WebDriverAutomation.WebDriverAutomation;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Driver {


	@Test
	void contextLoads() {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "D:\\workspace\\conf\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://gitlab.com/elrafapc/webdrivertest");
	}

}
