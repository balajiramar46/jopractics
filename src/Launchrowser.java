import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
WebDriver driver=new ChromeDriver();


driver.get("http://leaftaps.com/opentaps/control/main");
driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
driver.findElement(By.xpath("//input[@value='Login']")).click();
driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("alaji");
driver.findElement(By.xpath("//input[@id='primaryPhoneNumber']")).sendKeys("9176545168");
driver.findElement(By.xpath("//input[@value='Create Account']")).click();
String display=driver.findElement(By.xpath("//span[text()='Account Name']/..//following-sibling::td/span[contains(text(),alaji)]")).getText();
System.out.println(""+display+"");

//

	}
	//a[text(),'Accounts']

}
//a[text(),'Create Account']
//input[@id='username']
//span[text()='Account Name']/..//following-sibling::td/span[contains(text(),alaji)]
//ul[@class="errorList"]/li