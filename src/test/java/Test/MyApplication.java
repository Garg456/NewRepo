package Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyApplication {
	public static void main(String[] args) {
		flipcartAppliaction();
		
	}
	
	public static void flipcartAppliaction() {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("motorola 50 fusion",Keys.ENTER);
		
		
		
		
		List<WebElement> MotorolaList = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		
		WebElement myphone = driver.findElement(By.xpath("//div[text()='Motorola Edge 50 Fusion (Forest Blue, 128 GB)']"));
		for(WebElement motolist:MotorolaList) {
			if(motolist.getText().contains("Motorola Edge 50 Fusion")) {
				System.out.println(motolist.getText());
				break;
			}
			else {
				System.out.println(motolist.getText());
				
			}
			
			
			}
		
		myphone.click();
		
		String Parent_Window =driver.getWindowHandle();
		Set<String>All_Window =driver.getWindowHandles();
		
		for(String new_window:All_Window) {
			
			if(new_window!=Parent_Window) {
				
				WebDriverWait wt = new WebDriverWait(driver, 10);
				wt.until(null)
				
				driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
				
			}
		}
		
		
		
	
		
		
		
		
		
		//driver.quit();
		
		
	
		
	}

}
