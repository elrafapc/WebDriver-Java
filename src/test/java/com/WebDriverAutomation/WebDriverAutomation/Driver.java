package com.WebDriverAutomation.WebDriverAutomation;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Driver {
	@BeforeEach
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "D:\\workspace\\conf\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://gitlab.com/elrafapc/webdrivertest");
	}

	@Test
	void contextLoads() {

	}

}
