import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteAmbiente {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\eduardo.matias\\Documents\\DRIVERS\\chromedriver2.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://srbarriga.herokuapp.com");
		
		
	}
	  
}
