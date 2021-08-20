package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		/* create object for a class
		 * classname obj=new classname()
		 * call a method in class
		 * obj.methodname(); */
		// import chromedriver
		//version of chrome driver and chome browser should match
		WebDriverManager.chromedriver().setup(); //boni garcia
		//WebDriverManager.firefoxdriver().setup();
		//for firefox use firefox word instead of chrome in chromederiver 
		//note:selenium do not allow to access already opened browser or manually opened browser
		// step 1: launch a chrome browser  (selenium)
		//call chromederiver class with any objectname here we used driver
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		//step 2: load a url (get method---objname.get(driver.get)
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
//driver.findElement(By.linkText("http://leaftaps.com/crmsfa/control/leadsMain")).click();
	}

}
