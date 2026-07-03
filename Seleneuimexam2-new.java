package maven1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleneuimexam2 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
	       driver.get("https://pharmeasy.in/");
	       Thread.sleep(3000);
	       driver.manage().window().maximize();
	       WebElement s1= driver.findElement(By.xpath("//div[@class='typeahead-lib-Typeahead-module_placeholderContent__8HePU']"));
	       s1.click();
	       WebElement s2= driver.findElement(By.xpath("//input[@placeholder='Search medicines/Healthcare products']"));
	       s2.sendKeys("PCM");
	       Thread.sleep(2000);
	       List <WebElement> s3 = driver.findElements(By.xpath("//div[@class='typeahead-lib-Typeahead-module_resultsWrapper__mWYqe typeahead-lib-MedicineSearch-module_resultsWrapper__9qkEq']/div/div"));
	       Thread.sleep(2000);
	       s3.get(3).click();
	       List <WebElement> s31 = driver.findElements(By.xpath("//div[@class='LHS_container__sXYjF Search_fullWidthLHS__LIkF0']/div"));
	       s31.get(2).click();
	       WebElement s4= driver.findElement(By.id("proceed"));
	       s4.click();
	       Thread.sleep(2000);
	       List <WebElement> s5 = driver.findElements(By.xpath(" //div[@role='listbox']/div"));
	       s5.get(1).click();
	       Thread.sleep(2000);
	      WebElement s6= driver.findElement(By.xpath("//a[@class='ViewCartButton_viewCart__f_aJH false']"));
	       s6.click();       
}
}