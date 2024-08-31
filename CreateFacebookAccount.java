package homeAssignmentsWeek2Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateFacebookAccount {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		WebElement createnewaccountbtn=driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		createnewaccountbtn.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("selvalakshmi");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Pillai");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("selvalakshmi@gmail.com");
	    driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Trtteb");
		Select birthday= new Select(driver.findElement(By.id("day")));
		birthday.selectByIndex(4);
		Thread.sleep(2000);
		Select birthmonth= new Select(driver.findElement(By.id("month")));
		birthmonth.selectByVisibleText("Aug");
		Select birthyear= new Select(driver.findElement(By.id("year")));
		birthyear.selectByValue("2023");
		WebElement gender= driver.findElement(By.xpath("//input[@value='1']"));
		gender.click();
        driver.close();
	}

}
