package config;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PropertiesFile {
	public static WebDriver driver;
	public static Properties prps;
	
		
	public PropertiesFile() {		
			try {
				prps = new Properties();
				FileInputStream ip = new FileInputStream("C:\\Users\\padhu\\eclipse-workspace\\IRCTC\\src\\test\\java\\config\\config.properties");
				prps.load(ip);
			} catch(FileNotFoundException e) {
				e.printStackTrace();
			}
			catch (IOException e) {
				e.printStackTrace();
			}	
	}
}




/*import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {
	
	public static void main(String[] args) {
		readPropertiesFile();
	}
	
	public static void readPropertiesFile() {
		Properties pro=new Properties();
		try {
			
			InputStream input= new FileInputStream("C:\\Users\\padhu\\eclipse-workspace\\IRCTC\\src\\test\\java\\config\\config.properties");
		pro.load(input);
		System.out.println(pro.getProperty("browser"));
		System.out.println(pro.getProperty("url"));
		System.out.println(pro.getProperty("FromCity"));
		System.out.println(pro.getProperty("ToCity"));
		System.out.println(pro.getProperty("DepartureDate"));
		
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
}
}*/
