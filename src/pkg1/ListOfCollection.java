package pkg1;

//import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ListOfCollection {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","../SeleniumProject/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
	WebElement web=	driver.findElement(By.id("video-title"));
	Actions ac=new Actions(driver);
	
	 	
	 Set<String> allwindows= driver.getWindowHandles();
	 for(int i=0;i<3;i++)
		{
		ac.keyDown(Keys.CONTROL).click(web).keyUp(Keys.CONTROL).build().perform();
	
		}	
		
		
		
		System.out.println("total tabs....."+allwindows.size());
		 System.out.println("before url is........."+driver.getCurrentUrl());
  int vari=0;
		for(String s:allwindows)
		{    vari=vari+1;
			if(vari==3)
			{
			driver.switchTo().window(s);
			break;
		}
		}
		 System.out.println("after url is........."+driver.getCurrentUrl());
		 
		 
		/*Actions ac=new Actions(driver);
		for(int i=1;i<=6;i++)
		{
		ac.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		} */
		
   /*  List<WebElement> allvideos= driver.findElements(By.id("video-title"));
     System.out.println("total videos..............."+allvideos.size());
		//Thread.sleep(2000);
      for(WebElement video:allvideos)
      {
       video.click();
       Thread.sleep(5000);
       driver.navigate().back();
	}*/

}
}