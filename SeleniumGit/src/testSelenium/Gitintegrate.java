package testSelenium;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gitintegrate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Logger log = Logger.getLogger("Google");
		PropertyConfigurator.configure("E:\\PPMSproject\\Log4jdemo\\log4j.properties");
		driver.manage().window().maximize();
		log.info("browser opened");
		driver.get("https://www.google.com/");
		log.info("Google page loaded");
		try {
			driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[1]/div/div[2]/input")).sendKeys("Selenium tutorial");
			log.info("text is given in Search field");
		} catch (Exception e) {
			log.error("Element is not locating in HTMl");
		}
				
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
		log.info("Google Search is done for content given");			
	}

}
