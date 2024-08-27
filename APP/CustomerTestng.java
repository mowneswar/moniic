package APP;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
public class CustomerTestng {
	public AppiumDriver<WebElement> driver;

	@BeforeClass
	public void setUp() throws MalformedURLException, InterruptedException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "OnePlus 7T");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "12");
		capabilities.setCapability("appPackage", "com.moniic.customer.pp");
		capabilities.setCapability("appActivity", "com.moniic.customer.MainActivity");
		capabilities.setCapability("deviceID", "a36a1285");

		driver = new AppiumDriver<>(new URL("http://localhost:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("CUSTOMER APP LAUNCHED SUCCESFULLY");
		Thread.sleep(1000);
		

	}

	@Test
	public void CustomerLoginandRegistration() throws InterruptedException, IOException {
		WebElement skipBtn = driver.findElement(By.className("android.widget.Button"));
		skipBtn.click();
		Thread.sleep(500);
		
	
		WebElement cDropDownBtn = driver.findElement(By.xpath("//android.widget.TextView[@bounds=\"[251,495][296,540]\"]"));
		cDropDownBtn.click();
		Thread.sleep(3000);

		WebElement searchBtn = driver.findElement(By.className("android.widget.EditText"));
		searchBtn.sendKeys("india");

		WebElement indiaBtn = driver.findElement(By.xpath("//android.widget.TextView[@class='android.widget.TextView' and @text='India']"));
		indiaBtn.click();
		Thread.sleep(3000);

		WebElement numWidget = driver.findElement(By.className("android.widget.EditText"));
		numWidget.sendKeys("9443527443");
		Thread.sleep(5000);
		System.out.println("LOGIN AND REGISTRATION IS DONE IN CUSTOMER APP");

		WebElement cnBtn1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button"));
		cnBtn1.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement devicemapWidget = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
		devicemapWidget.click();
		Thread.sleep(3000);

		WebElement locBtn = driver.findElement(By.xpath("//android.view.ViewGroup[@bounds=\"[927,1154][970,1197]\"]"));
		locBtn.click();
		Thread.sleep(6000);

		WebElement ridenowBtn = driver.findElement(By.xpath("//android.widget.TextView[@bounds=\"[111,1631][306,1695]\"]"));
		ridenowBtn.click();
		Thread.sleep(6000);

		WebElement destiBox = driver.findElement(By.xpath("//android.widget.TextView[@bounds=\"[223,2069][966,2133]\"]"));
		destiBox.click();
		Thread.sleep(3000);

		WebElement searchdrplLoc = driver.findElement(By.xpath("//android.widget.EditText[@bounds=\"[183,338][856,457]\"]"));
		searchdrplLoc.sendKeys("AI twar centre");

		WebElement drplLoc = driver.findElement(By.xpath("//android.view.ViewGroup[@bounds=\"[0,663][1080,897]\"]"));
		drplLoc.click();
		Thread.sleep(3000);
		System.out.println("CUSTOMER DROP LOCATION");
	
		WebElement gpsWidget = driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[927,1458][970,1501]']"));
		gpsWidget.click();
		Thread.sleep(3000);

		WebElement conpkp = driver.findElement(By.xpath("//android.widget.TextView[@text='CONFIRM']"));
		conpkp.click();
		Thread.sleep(3000);

		WebElement conpkpPoint = driver.findElement(By.xpath("//android.widget.TextView[@bounds='[424,2147][655,2208]']"));
		conpkpPoint.click();
		Thread.sleep(8000);
	
		WebElement apuNotes = driver.findElement(By.xpath("//android.widget.Button[@bounds=\"[69,1410][1011,1548]\"]"));
		apuNotes.click();
		Thread.sleep(3000);

		WebElement flNum = driver.findElement(By.xpath("//android.widget.EditText[@text='Enter your flight number']"));
		flNum.sendKeys("Airbus 737");

		WebElement traName = driver.findElement(By.xpath("//android.widget.EditText[@text='Enter the traveler name']"));
		traName.sendKeys("Mohammed ali");

		WebElement othrNotes = driver.findElement(By.xpath("//android.widget.EditText[contains(@text, 'Eg: I need a child seat, I need help with my bags...')]"));
		othrNotes.sendKeys("I need a chidseat");
		System.out.println("CUSTOMER APU NOTES");

		WebElement chfcnBtn = driver.findElement(By.xpath("//android.widget.Button[@index='1' and @clickable='true' and @enabled='true']"));
		chfcnBtn.click();
		Thread.sleep(3000);
	
		WebElement proceedBtn = driver.findElement(By.xpath("//android.widget.Button[@class='android.widget.Button' and @clickable='true' and @enabled='true' and @index='2']"));
		proceedBtn.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement carChoose = driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[87,764][1035,1141]']"));
		carChoose.click();
		Thread.sleep(3000);
		System.out.println("CUSTOMER BOOKED CLASS");

		WebElement bookclassBtn = driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[87,2171][993,2208]']"));
		bookclassBtn.click();
		Thread.sleep(3000);
	
		WebElement cCashWdt = driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[83,1798][166,1881]']"));
		cCashWdt.click();
		Thread.sleep(1000);

		WebElement cnfrmCashBtn = driver.findElement(By.xpath("//android.widget.TextView[@text='CONFIRM']"));
		cnfrmCashBtn.click();
		Thread.sleep(3000);

		WebElement bookclassBtn2 = driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[87,2171][993,2208]']"));
		bookclassBtn2.click();

			
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);

		WebElement skipBtn1 = driver.findElement(By.xpath("//android.widget.TextView[@bounds='[929,335][1011,390]']"));
		skipBtn1.click();
		System.out.println("CUSTOMER COMPLETES THE RIDE");
	}

	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

	






}
