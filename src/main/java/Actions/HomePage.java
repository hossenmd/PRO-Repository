package Actions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;



public class HomePage {

	WebDriver dr;
	
	public void access() throws IOException {
	FileInputStream  fs1 = new FileInputStream("C:\\Users\\sam\\Desktop\\BTC_180927E\\workspace 01292019\\Target.Towl\\locator.properties");
	Properties p = new Properties();
	p.load(fs1);
	
	
	}
	public void movetoCatagories() {
		
		Actions a = new Actions(dr);
		a.click();
		
	}
	
public void clicktoCatagories() {
		
	}
	
	
public void clickHome() {
		
	}
	
	
public void clickBath() {
	
}


public void clickBathtowl() {
	
}



	
	
	
	
}
