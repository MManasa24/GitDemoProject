import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Assignment1_Checkbox {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.setProperty("WebDriver.driver.chromedriver", "C:\\Users\\kalapati\\Desktop\\Eclipse\\eclipse-java-2019-09-R-win32-x86_64\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		/*
		WebElement chkbox = driver.findElement(By.xpath("//label[@for='bmw']"));
		Assert.assertFalse(chkbox.isSelected());
		chkbox.click();
		//Assert.assertTrue(driver.findElement(By.xpath("//label[@for='bmw']")).isSelected());
		Assert.assertEquals(chkbox.isSelected(), true);
		
		chkbox.click();
		
		Assert.assertEquals(chkbox.isSelected(), false);
		
		
		
				*/
	WebElement checkkbox = driver.findElement(By.id("checkBoxOption1"));

		checkkbox.click();

		Assert.assertTrue(checkkbox.isSelected());

		checkkbox.click();

		Assert.assertFalse(checkkbox.isSelected());

		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	}

}
