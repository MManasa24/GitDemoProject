import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class actiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webDriver.driver.chromedriver",
				"C:\\Users\\kalapati\\Desktop\\Eclipse\\eclipse-java-2019-09-R-win32-x86_64\\eclipse\\chromedriver.exe");

	//	System.setProperty("webDriver.gecko.driver",
		//		"C:\\Users\\kalapati\\Desktop\\Eclipse\\eclipse-java-2019-09-R-win32-x86_64\\eclipse\\geckodriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);

		// Actions are manily used for Mouse hover concepts
		Actions a = new Actions(driver);
		WebElement element = driver.findElement(By.id("nav-link-accountList"));
		a.moveToElement(element).build().perform();
		WebElement text = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

		// Printing the text in Capital letters by Pressing the Shift button down
		// doule click is to select the content
		a.moveToElement(text).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		// contextclick is used to right click
		a.moveToElement(element).contextClick(element).build().perform();
		
	System.out.println("GitHub");	
	}

}
