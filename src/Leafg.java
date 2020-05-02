import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leafg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("http://leafground.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//h5[text()='Alert']")).click();
        driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
        Alert alert=driver.switchTo().alert();
        alert.accept();
        driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
        String ala= alert.getText();
        alert.accept();
        System.out.println(""+ala+"");
        driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
        alert.sendKeys("thala");
        alert.accept();
        
	}

}
