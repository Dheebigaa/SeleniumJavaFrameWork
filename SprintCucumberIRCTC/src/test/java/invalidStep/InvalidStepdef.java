package invalidStep;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import config.PropertiesFile;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

//@RunWith(Cucumber.class)

public class InvalidStepdef extends PropertiesFile{
	WebDriver driver;
	

@Given("^User is in IRCTC flight landing page$")
public void user_is_in_IRCTC_flight_landing_page() throws Throwable {
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.air.irctc.co.in/");
	driver.manage().window().maximize();}

@Given("^User Clicks on Ok button of informational alert$")
public void user_Clicks_on_Ok_button_of_informational_alert() throws Throwable {
	driver.findElement(By.xpath("//button[text()='Ok']")).click();

}

@Given("^User select one way trip$")
public void user_select_one_way_trip() throws Throwable {
	driver.findElement(By.xpath("//label[@class='form-check-label']")).click();
	Thread.sleep(1000);
}

@Given("^User selects From and To city$")
public void user_selects_From_and_To_city() throws Throwable {
	driver.findElement(By.id("stationFrom")).click();
	driver.findElement(By.id("stationFrom")).sendKeys("Mum");
	driver.findElement(By.xpath("//*[@id='ui-id-1']/li[1]")).click();
	//driver.findElement(By.id("ui-id-77")).click();
	//driver.findElement(By.xpath("//*[@id=\"ui-id-40\"]")).click();
	//driver.findElement(By.xpath("//*[@id='ui-id-1']/li[1],'"+prps.getProperty("FromCity")+"')]")).click();
	//driver.findElement(By.xpath("//*[@id='ui-id-1']/li[1][contains(text(),'"+prps.getProperty("FromCity")+"')]")).click();
	driver.findElement(By.id("stationTo")).click();
	driver.findElement(By.id("stationTo")).sendKeys("Del");
	driver.findElement(By.xpath("//*[@id=\"ui-id-2\"]/li[2]")).click();

	//driver.findElement(By.id("stationTo")).sendKeys("Luck");
	//driver.findElement(By.xpath("//*[@id=\"ui-id-64\"]")).click();
}

@Given("^User enter departure date to travel$")
public void user_enter_departure_date_to_travel() throws Throwable {
	driver.findElement(By.id("originDate")).click();
	
	driver.findElement(By.xpath("//div[contains(@class,'date-table-right')]//span[contains(text(),'"+prps.getProperty("Month")+"')]")).click();
	driver.findElement(By.xpath("//div[contains(@class,'datepicker-days')]//span[contains(text(),'"+prps.getProperty("Date")+"')]")).click();
}

@Given("^User clicks on traveller and economy to choose class and airlines to travel$")
public void user_clicks_on_traveller_and_economy_to_choose_class_and_airlines_to_travel() throws Throwable {
	driver.findElement(By.xpath("//*[@id='noOfpaxEtc']")).click();
	 driver.findElement(By.xpath("//strong[@class='d-block font-14']")).click();
	//  WebElement travelclass = driver.findElement(By.xpath("//strong[@class='d-block font-14']/following-sibling::select")); 
	//  new Select(travelclass).selectByVisibleText("Economy"); 
	  
	  WebElement travelclass = driver.findElement(By.xpath("//strong[text()='Choose class']/following-sibling::select")); 
	  new Select(travelclass).selectByVisibleText("Premium Economy"); 
	  driver.findElement(By.xpath("(//strong[@class='d-block font-14'])[2]")).click();
	  WebElement selectedAirline = driver.findElement(By.xpath("(//strong[@class='d-block font-14']/following-sibling::select)[2]")); 
	  new Select(selectedAirline).selectByVisibleText("Spice Jet");
	  } 
	  
	//  driver.findElement(By.xpath("(//strong[@class='d-block font-14'])[2]")).click();
	//  WebElement selectedAirline = driver.findElement(By.xpath("(//strong[@class='d-block font-14']/following-sibling::select)[2]")); 
	 // new Select(selectedAirline).selectByVisibleText("Air India"); }

@When("^User clicks on search button it is redirected to list of available flights page$")
public void user_clicks_on_search_button_it_is_redirected_to_list_of_available_flights_page() throws Throwable {
	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
}

@When("^a page with no flights is displayed$")
public void a_page_with_no_flights_is_displayed() throws Throwable {
	//Assert.assertFalse(false);
	Assert.fail("Spice Jet");
	System.out.println("Vistara Airlines is displayed instead of SpiceJet");
	
   }


}
