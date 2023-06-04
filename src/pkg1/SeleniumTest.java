package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTest {
 public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "../SeleniumProject/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	
	//WebElement username=driver.findElement(By.xpath(" //input[@name='email']"));
	//username.sendKeys("priyanka221");
	
	WebElement creatwnewaccount=driver.findElement(By.linkText("Create New Account"));
	creatwnewaccount.click();
	Thread.sleep(3000);
	
	WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
	firstname.sendKeys("Priyanka");
	
	WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname'or @data-type='tt']"));
	lastname.sendKeys("choudhary");
	
	WebElement emailaddress=driver.findElement(By.xpath("(//input[contains(@id,'u_')])[3]"));
	emailaddress.sendKeys("9627563073");
	
	WebElement newpassword=driver.findElement(By.xpath("//*[@*='reg_passwd__']"));
	newpassword.sendKeys("priyankachoudhary");
	
	WebElement drop1=driver.findElement(By.xpath("//*[@*='_9407 _5dba _9hk6 _8esg']"));
    Select s1=new Select(drop1);
    s1.selectByValue("20");
    
	WebElement drop2=driver.findElement(By.xpath("//*[@*='month']"));
	Select s2=new Select(drop2);
	s2.selectByIndex(1);
	
	WebElement drop3=driver.findElement(By.xpath("//*[@id='year']"));
	Select s3=new Select(drop3);
	s3.selectByVisibleText("1991");
	
	WebElement radio1=driver.findElement(By.xpath("(//input[contains(@id,'u_')])[7]"));
	radio1.click();
	
	WebElement signup=driver.findElement(By.xpath("//*[@*='websubmit']"));
	signup.click();
	Thread.sleep(3000);
	
	driver.close();
}
}
