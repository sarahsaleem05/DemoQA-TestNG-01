//1. Login to Application. Check if Application is Logged in OR not.
//2. Login to Application. Click on My Info Tab. Check if page is displayed OR not.

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DemoQA {

	WebDriver driver = new ChromeDriver();
	Actions actions = new Actions(driver);

	
	@Test 
	public void LaunchWebDemoQA() throws InterruptedException{
	//	WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		Thread.sleep(5000);
	}
	 
	@Test 
	public void Scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 400)"); // Scroll down 400 pixels
	}
	
	@Test 
	public void NavigateToElements() {
		driver.findElement(By.xpath("//div[@class=\"card-up\"]")).click();
			
	}
	
	@Test 
	public void RadioButton() throws InterruptedException {
		 driver.findElement(By.xpath("//div[@class=\"element-list collapse show\"]//li[@id=\"item-2\"]")).click();
		 Thread.sleep(500);
	}	 
		 
	@Test 
	public void ScrollRadio() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 700)"); // Scroll down 700 pixels
		Thread.sleep(200);
	}
	
	@Test 
	public void ImpressiveRadioButton() {
		WebElement ImpRadioButton = driver.findElement(By.xpath("//div//input[@id=\"impressiveRadio\"]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ImpRadioButton);

//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	WebElement radioButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id=\"impressiveRadio\"]")));
//	radioButton.click();
 	}
	
	@Test
	public void Buttons() {
		 driver.findElement(By.xpath("//li[@id=\"item-4\"]")).click();
	}
	 
	
	@Test
	public void DoubleClick() {
		WebElement DoubleClickButton = driver.findElement(By.xpath("//button[@id=\"doubleClickBtn\"]"));
		actions.doubleClick(DoubleClickButton).build().perform();
	}
	
	 
	@Test 
	public void ScrollButtons() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollTo(0, 700)"); // Scroll down 700 pixels	
	}
	
	@Test
	public void RightClick() {
	//	WebElement RightClickButton = driver.findElement(By.xpath("//button[@id=\"rightClickBtn\"]"));
		WebElement RightClickButton = driver.findElement(By.xpath("//button[contains(text(),'Right Click Me')]"));
		actions.contextClick(RightClickButton).build().perform();
	}
	
	@Test
	public void Click() {
		WebElement ClickButton = driver.findElement(By.xpath("//button[text()='Click Me']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ClickButton);

	}
	
	
	/*
	
	@Test
	public void VerifyLogin(){
		WebElement element = driver.findElement(By.xpath("//div[@class=\"oxd-layout-container\"]"));
		System.out.println(element.isDisplayed());
		System.out.println(element.getText());
		driver.quit();
	}

	*/
}
