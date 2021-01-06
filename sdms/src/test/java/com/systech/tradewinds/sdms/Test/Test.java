package com.systech.tradewinds.sdms.Test;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Test {
	static WebDriver driver;
	static ChromeOptions options;
	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\sdms\\\\src\\Browser\\chromedriver.exe");
    options = new ChromeOptions();
	options.addArguments("--start-maximized");
	options.setAcceptInsecureCerts(true);
	driver = new ChromeDriver(options);
  
    driver.get("localhost:8081/SDMS");
    driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//input[@id='loginform:username']")).sendKeys("admin");
    driver.findElement(By.xpath("//input[@id='loginform:password']")).sendKeys("Admin@123");
    driver.findElement(By.xpath("//button[@id='loginform:submit_b']")).sendKeys(Keys.RETURN);
	driver.findElement(By.xpath( "//button[@id='j_idt6:submit_id']")).sendKeys(Keys.RETURN);
    driver.navigate().to("http://localhost:8081/SDMS/pages/masters/serviceitemmaster.xhtml");
   driver.findElement(By.xpath("//*[@id='chgtype:tabviewid:sgstsuggid_input']")).sendKeys("s");
    List <WebElement>  list =   driver.findElements(By.xpath("//*[@id='chgtype:tabviewid:sgstsuggid_panel']/following::td[]"));
    for (WebElement e : list) {
    	
		String values = e.getAttribute("innerHTML");
		if (values.contains("SGST@20%")) {
			 e.click(); 
			 System.out.println("the elements are " + e.getText());
			
			
		} break;
	}
    
}

}
