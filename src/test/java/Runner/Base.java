package Runner;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Base {
	public static WebDriver dr;
	public static Properties config = new Properties();
	public static FileInputStream fs;
	public static int implicitTimeout =30;
	
	
	@BeforeSuite
	
	public  static void openBrowser() throws IOException {
		fs = new FileInputStream("C:\\Users\\sam\\Desktop\\BTC_180927E\\workspace 01292019\\Target.Towl\\config.properties");
		config.load(fs);
		
		if(config.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\sam\\Downloads\\chromedriver_win32\\chromedriver.exe");
			dr = new ChromeDriver();
			dr.get(config.getProperty("url"));
			dr.manage().timeouts().implicitlyWait(implicitTimeout, TimeUnit.SECONDS);
			
		//}else if (config.getProperty("browser").equals("firefox")) {
		//	dr = new FirefoxDriver();
		
		
		}
		}
	
	
	
		@AfterSuite
		public void tearDown() throws InterruptedException {

			if (dr != null) {
				Thread.sleep(3000);
				dr.quit();

			}
		
	}
	
	

}
 