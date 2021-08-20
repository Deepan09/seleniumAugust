package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		// step 3: get the title  use gettitle method
		String title = driver.getTitle();
System.out.println(title);
//step 4: maximize the browser
driver.manage().window().maximize();
//to close the window
//driver.close();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
WebElement webUser = driver.findElement(By.id("username")); //locate id
webUser.sendKeys("demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa"); //locate id
driver.findElement(By.className("decorativeSubmit")).click();//locate classname
driver.findElement(By.linkText("CRM/SFA")).click();
//verify if correctly landed on home page
String frontTitle = "My Home | opentaps CRM";
String homeTitle = driver.getTitle();
if(frontTitle.equals(homeTitle)) {
	System.out.println("in the home page");
}
else
System.out.println("not in the home page"); 
driver.findElement(By.linkText("Leads")).click();   //fot link text look  for a tag and a title. enter title
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Deepan");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("P");
//for clearing text in countrycode
WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
countryCode.clear();
countryCode.sendKeys("5");
	
driver.findElement(By.name("submitButton")).click();

//dropdowns...locate webelement asususual..done as seperate class

String text = driver.findElement(By.id("createLeadForm_companyName")).getAttribute("value");
System.out.println(text);
}

}
	
		
	

