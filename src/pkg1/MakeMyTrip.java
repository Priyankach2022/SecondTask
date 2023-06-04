package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakeMyTrip {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "../SeleniumProject/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		//Thread.sleep(3000);
		driver.switchTo().frame("webklipper-publisher-widget-container-notification-close-div");
		WebElement image=driver.findElement(By.xpath("html/head/body/div/div/div/a/i"));
	//	driver.switchTo().frame(image);

		//driver.switchTo().defaultContent();
		image.click();
		//driver.switchTo().defaultContent();
     
		
	
	    WebElement first=driver.findElement(By.xpath("//div[@class='react-autosuggest__container react-autosuggest__container--open']/input[@aria-controls='react-autowhatever-1']"));
		Actions ac=new Actions(driver);
		//ac.sendKeys(Keys.DOWN).sendKeys(Keys.UP).click().build().perform();
		//ac.sendKeys(Keys.DOWN,Keys.RETURN).sendKeys(Keys.UP, Keys.RETURN).click().build().perform();
		ac.sendKeys(Keys.DOWN,Keys.RETURN);
		
	}

}
