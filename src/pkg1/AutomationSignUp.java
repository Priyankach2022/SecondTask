package pkg1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationSignUp {
	ChromeDriver driver;
	
	@Before
	public void launch()
	
	{
		System.setProperty("webdriver.chrome.driver","../SeleniumProject/chromedriver.exe");
     driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
     //Options op=driver.manage();
   // Window w=op.window();
  //  w.maximize();
}
    @Test
	public void singup() throws InterruptedException
	{
		WebElement createnewaccount=driver.findElementByLinkText("Create New Account");
		createnewaccount.click();
		Thread.sleep(3000);

		WebElement firstname=driver.findElementByCssSelector("input[placeholder='First name']");
		firstname.sendKeys("priyanka");

		WebElement surname=driver.findElement(By.name("lastname"));
		surname.sendKeys("Choudhary");

		WebElement mobile=driver.findElement(By.name("reg_email__"));
		mobile.sendKeys("9627563077");

		WebElement password=driver.findElement(By.cssSelector("input#password_step_input"));
		password.sendKeys("priyanka@123");

		WebElement drop=driver.findElementById("day");
        Select s=new Select(drop);
		//s.selectByVisibleText("15");
		s.selectByIndex(14);


		WebElement drop1=driver.findElementById("month");
		Select s1=new Select(drop1);

		s1.selectByValue("8");

		WebElement drop3=driver.findElementById("year");
		Select s2=new Select(drop3);
		s2.selectByVisibleText("2000");

		WebElement radio=driver.findElement(By.xpath("//input[@value='2']"));
		radio.click();

		WebElement signup=driver.findElement(By.name("websubmit"));
		signup.click();
		}
    
	@After
	public void Close() throws InterruptedException
	{ 
		Thread.sleep(3000);
		driver.close();
	}
	
	}
	
