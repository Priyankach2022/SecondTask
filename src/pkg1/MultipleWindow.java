package pkg1;

import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {
	
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "../SeleniumProject/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
	}

}
