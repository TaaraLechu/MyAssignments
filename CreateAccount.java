package homeAssignmentsWeek2Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/.");
		driver.manage().window().maximize();
		//Enter the username as ‘demosalesmanager’
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		// Enter the password as 'crmsfa'
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// Click on the Login button.
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on the CRM/SFA tab
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Accounts")).click();
		
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Tester");
		driver.findElement(By.xpath("//input[@id='numberEmployees']")).sendKeys("4");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("LeafTaps");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String Actualtitle= driver.getTitle();
		System.out.println(Actualtitle);
		String Expectedtitle="Create Account | opentaps CRM";
		if(Expectedtitle.equals(Actualtitle))
		{
			System.out.println("The title is correct");
		}
		else
		{
			System.out.println("The title is not correct");
		}
		driver.quit();
	}	

	}

