import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Printerr {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
WebDriver driver=new ChromeDriver();


driver.get("http://leaftaps.com/opentaps/control/main");
driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
driver.findElement(By.xpath("//input[@value='Login']")).click();
driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
driver.manage().window().maximize();
driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
driver.findElement(By.xpath("//input[@value='Create Account']")).click();
Thread.sleep(3000);
String display=driver.findElement(By.xpath("//ul[@class=\"errorList\"]/li")).getText();
System.out.println(""+display+"");

WebElement dd=driver.findElement(By.name("industryEnumId"));
dd.sendKeys("Aerospace");
WebElement dd4=driver.findElement(By.name("ownershipEnumId"));

Select ss=new Select(dd4);
ss.selectByValue("OWN_PARTNERSHIP");
WebElement dd5=driver.findElement(By.name("dataSourceId"));

Select ss4=new Select(dd5);
ss4.selectByIndex(3);




//

	}
	//a[text(),'Accounts']

}
//a[text(),'Create Account']
//input[@id='username']
//span[text()='Account Name']/..//following-sibling::td/span[contains(text(),alaji)]
//ul[@class="errorList"]/li


