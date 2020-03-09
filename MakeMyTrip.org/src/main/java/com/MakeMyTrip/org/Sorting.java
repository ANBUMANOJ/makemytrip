package com.MakeMyTrip.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sorting {
    public static void main( String[] args ) throws Throwable{
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ammu\\eclipse-workspace\\MakeMyTrip.org\\Drivers\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://www.makemytrip.com/flight/search?itinerary=DEL-BLR-10/03/2020&tripType=O&paxType=A-1_C-0_I-0&intl=true&cabinClass=E");
    	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    	driver.findElement(By.xpath("//span[@class='down sort-arrow']")).click();
    	List<WebElement> pricelist = driver.findElements(By.xpath("//span[@class='actual-price']"));
    	for (WebElement webElement : pricelist) {
			String text = webElement.getText();
			System.out.println(text);
		}
    	WebElement element=driver.findElement(By.xpath("//span[text()='₹ 11,881']"));
    	JavascriptExecutor js=(JavascriptExecutor)driver;
    	js.executeScript("arguments[0].scrollIntoView();",element);
    	List<WebElement> pricelist1=driver.findElements(By.xpath("//span[@class='actual-price']"));
    	for (WebElement webElement : pricelist1) {
			String text = webElement.getText();
			System.out.println(text);
		}
    }
}
