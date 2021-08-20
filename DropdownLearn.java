package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownLearn {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);



//locate dropdown web elemnt
WebElement dropD1 = driver.findElement(By.id("dropdown1"));
Select drop1 = new Select(dropD1);
drop1.selectByIndex(1);
//drop1.selectByValue(null);
//drop1.selectByVisibleText()

WebElement dropd2 = driver.findElement(By.name("dropdown2"));
Select drop2 = new Select(dropd2);
drop2.selectByVisibleText("Appium");

WebElement dropd3 = driver.findElement(By.id("dropdown3"));
Select drop3 = new Select(dropd3);
drop3.selectByValue("3");

//get the size of the dropdown
int dropDownSize = drop3.getOptions().size();
System.out.println("size of the third dropdown= " + dropDownSize);

	}

}
