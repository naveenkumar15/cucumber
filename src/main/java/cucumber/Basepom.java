package cucumber;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Basepom {
	static WebDriver driver;

	public static  WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Gomathi\\eclipse-workspace\\Baseclass\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		return driver;
	}

	// Get -01
	public static void loadurl(String url) {
	driver.get(url);

	}

	// sendKeys-02
	public static void type(WebElement element, String name) {
		element.sendKeys(name);
	}

	// click -03
	public static void btnclick(WebElement element) {
		element.click();
	}

	// quit-04
	public static void QuitBrowser() {
		driver.quit();
	}

	// getTitle-05
	public void title(String title) {
		driver.getTitle();

	}

	// maximize-06
	public void max() {
		driver.manage().window().maximize();

	}
	
	//getText-07
	public void gettxt(WebElement element) {
		element.getText();
	}	
	
	//rightClick-08
	public void rightclick(WebElement element) {
		Actions acc=new Actions(driver);
		acc.contextClick(element).perform();
		}
	
	//doubleClick-09
	public void doubleclick(WebElement element) {
		Actions acc=new Actions(driver);
		acc.doubleClick(element).perform();
	}
	
	//getAttribute-10
	public void getAttribute(WebElement element,String name) {
	String attribute = element.getAttribute(name);
	System.out.println(attribute);
	}
	
	//close-11
	public void closewindow() {
		driver.close();
	}
	
	//defaultContent-12
	public void parentwindow() {
		driver.switchTo().defaultContent();
		}
	
	//select - 13
	Select s;
	public Select select(WebElement element) {
		Select s=new Select(element);
		return s;
		
	}
	
	//selectByIndex-14
	public void selectByIndex(WebElement element,int index) {
		Select s=new Select(element);
		s.selectByIndex(index);
		}
	
	//selectByValue-15
	public void selectByValue(WebElement element,String name) {
		Select s=new Select(element);
		s.selectByValue(name);
	}
	
	//selectByVisibletext-16
	public void selectByVisibleText(WebElement element,String name) {
		Select s=new Select(element);
		s.selectByVisibleText(name);
		}
	
	//deselectAll-17
		public void deselectAll(WebElement element) {
			Select s=new Select(element);
			s.deselectAll();
		}
		
	//TakeScreenshot-18
		public void TakeScreenShot(String filepath) throws IOException {
			TakesScreenshot tk= (TakesScreenshot) driver;
			File source=tk.getScreenshotAs(OutputType.FILE);
			File destination=new File(filepath);
			//.copyFile(source, destination);
		}
		
	//Implicit Wait-19
		public void ImplicitWait(long milliseconds) {
			driver.manage().timeouts().implicitlyWait(milliseconds, TimeUnit.SECONDS);
			}
		
	//CurrentUrl -20
		public void CurrentUrl() {
			driver.getCurrentUrl();
		}
		
	//ThreadSleep-21
		public void threadSleep(long milliseconds) throws InterruptedException {
			Thread.sleep(milliseconds);
		}

		
	//Frames Using Index-22
		public void FrameIndex(int index) {
			driver.switchTo().frame(index);
		}
		
		
	//ParentFrame-23
		public void ParentFrame() {
		driver.switchTo().parentFrame();
		}
	
	//Parent Windows Id-24
		public void ParentWindow() {
			String parent = driver.getWindowHandle();
			System.out.println(parent);
		}
		
	//Move to Element-25
		public void MoveToElement(WebElement contactus) {
			Actions acc=new Actions(driver);
			acc.moveToElement(contactus).perform();
		}
	
	//Actions -26
		Actions a;
		public Actions actions() {
			Actions a=new Actions(driver);
			return a;
			}
		
	//DragandDrop -27
		public void DnD(WebElement source, WebElement dest) {
			Actions acc=new Actions(driver);
			acc.dragAndDrop(source, dest).perform();	
		}
		
	//Alert Accept -27
		public void Alertaccept() {
			Alert a= driver.switchTo().alert();
			a.accept();
		}
		
	//Alert Dismiss -28
		public void Alertdismiss() {
			Alert a=driver.switchTo().alert();
			a.dismiss();
		}
		
	//Alert sendKeys -29
		public void Alertsk(String name) {
			Alert a=driver.switchTo().alert();
			a.sendKeys(name);
		}
		
	//GetOptions - 31
		public void getOptions(WebElement element) {
			Select s=new Select(element);
			s.getOptions();	
		}
	
	//GetAllSelectOptions - 32
		public void GetAllSelectOptions(WebElement element) {
			Select s=new Select(element);
			s.getAllSelectedOptions();
		}
		
	//GetFirstSelectOption - 33
	public void GetFirstSelectOption() {
		s.getFirstSelectedOption();
		}	

	//isMultiple-34
	public void ismultiple(WebElement multiple) {
		Select s=new Select(multiple);
		boolean b = s.isMultiple();
		System.out.println(b);
	}
	
	//DeselectbyIndex -35
	public void DeselectbyIndex(int index) {
		s.deselectByIndex(index);
	}
	
	//DeselectbyValue -36
	public void DeselectbyValue(String name) {
		s.deselectByValue(name);
	}
	
	//DeselectByVisibleText -37
	public void DeselectByVisibleText(String name) {
		s.deselectByVisibleText(name);
	}

	//ExecuteScript JS -38
	public void ExecuteScript( WebElement element,String Value ) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript(Value, element);	
	}
	
}	

