package CustomerAPP;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CreatingAddonStops {

    private AndroidDriver<MobileElement> driver;
    
	@BeforeClass
public void DeviceSetup() throws MalformedURLException, InterruptedException {
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("deviceName", "OnePlus 7T");
	capabilities.setCapability("platformName", "Android");
	capabilities.setCapability("platformVersion", "12");
	capabilities.setCapability("appPackage", "com.moniic.customer.pp");
	capabilities.setCapability("appActivity", "com.moniic.customer.MainActivity");
	capabilities.setCapability("deviceID", "a36a1285");
	
	driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), capabilities);
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    System.out.println("CUSTOMER APP LAUNCHED SUCCESSFULLY");
    
   }

	@Test
	public void testSkipBtn() throws InterruptedException {
		WebElement skipbtn=driver.findElement(By.className("android.widget.Button"));
		skipbtn.click();
		Thread.sleep(3000);
	}
	@Test(dependsOnMethods= {"testSkipBtn"})
	public void testDropdownBtn1() throws InterruptedException {
		WebElement cDropDownBtn= driver.findElement(By.xpath("//android.widget.TextView[@bounds=\"[251,495][296,540]\"]"));
		cDropDownBtn.click();
		Thread.sleep(3000);
	}
	@Test(dependsOnMethods= {"testDropdownBtn1"})
	public void testSearchCountry() throws InterruptedException {
		WebElement searchBtn = driver.findElement(By.className("android.widget.EditText"));
		searchBtn.sendKeys("india");
		WebElement indiaBtn = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView\r\n" ));
		indiaBtn.click();
		WebElement numWidget= driver.findElement(By.className("android.widget.EditText"));
		numWidget.sendKeys("9443527443");
		Thread.sleep(5000);
		WebElement cnBtn1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button"));
		cnBtn1.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

				
	}
	@Test (dependsOnMethods= {"testSearchCountry"})
	public void testRideNowBtn() throws InterruptedException {
		WebElement devicemapWidget = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
		devicemapWidget.click();
		Thread.sleep(3000);

		WebElement locBtn = driver.findElement(By.xpath("//android.view.ViewGroup[@bounds=\"[927,1154][970,1197]\"]"));
		locBtn.click();
		Thread.sleep(6000);

		WebElement ridenowBtn = driver.findElement(By.xpath("//android.widget.TextView[@bounds=\"[111,1631][306,1695]\"]"));
		ridenowBtn.click();
		Thread.sleep(6000);
	}
	@Test(dependsOnMethods= {"testRideNowBtn"})
	public void testSearchandLoc()throws InterruptedException {

		WebElement destiBox = driver.findElement(By.xpath("//android.widget.TextView[@bounds=\"[223,2069][966,2133]\"]"));
		destiBox.click();
		Thread.sleep(3000);
		WebElement searchdrplLoc1 = driver.findElement(By.xpath("//android.widget.EditText[@bounds=\"[183,338][856,457]\"]"));
		searchdrplLoc1.sendKeys("AI twar centre");
		WebElement drplLoc=driver.findElement(By.xpath("//android.view.ViewGroup[@bounds=\"[0,663][1080,897]\"]"));
		drplLoc.click();
		Thread.sleep(3000);
		WebElement conpkp=driver.findElement(By.xpath("//android.widget.TextView[@text='CONFIRM']"));
		conpkp.click();
		Thread.sleep(3000);
		WebElement conpkpPoint=driver.findElement(By.xpath("//android.widget.TextView[@bounds='[424,2147][655,2208]']"));
		conpkpPoint.click();
		Thread.sleep(3000);
		
	}
	@Test(dependsOnMethods= {"testSearchandLoc"})
	public void testAPUNote() throws InterruptedException {
		WebElement apuNotes = driver.findElement(By.xpath("//android.widget.Button[@bounds=\"[69,1410][1011,1548]\"]"));
		apuNotes.click();
		Thread.sleep(3000);

		WebElement flNum = driver.findElement(By.xpath("//android.widget.EditText[@text='Enter your flight number']"));
		flNum.sendKeys("Airbus 737");
		Thread.sleep(1000);

		WebElement traName = driver.findElement(By.xpath("//android.widget.EditText[@text='Enter the traveler name']"));
		traName.sendKeys("Mohammed ali");
		Thread.sleep(1000);

		WebElement othrNotes = driver.findElement(By.xpath("//android.widget.EditText[contains(@text, 'Eg: I need a child seat, I need help with my bags...')]"));
		othrNotes.sendKeys("I need a chidseat");
		Thread.sleep(1000);
		

		WebElement chfcnBtn = driver.findElement(By.xpath("//android.widget.Button[@index='1' and @clickable='true' and @enabled='true']"));
		chfcnBtn.click();
		Thread.sleep(3000);
		
	}
	@Test(dependsOnMethods= {"testAPUNote"})
	public void testAddOnStops() throws InterruptedException {
		WebElement addOnBtn = driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[69,1710][124,1821]']"));
		addOnBtn.click();
		Thread.sleep(3000);
		WebElement searLoc = driver.findElement(By.xpath("//android.widget.EditText[@text='Search for location']"));
		searLoc.sendKeys("Bhurj");
		Thread.sleep(1000);
		WebElement addOnStop1 = driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[0,655][1080,889]']"));
		addOnStop1.click();
		Thread.sleep(3000);
		WebElement addOnBtn2 = driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[69,1703][124,1814]']"));
		addOnBtn2.click();
		Thread.sleep(3000);
		WebElement searLoc2 = driver.findElement(By.xpath("//android.widget.EditText[@text='Search for location']"));
		searLoc2.sendKeys("Mall of the Emirates");
		Thread.sleep(1000);
		WebElement addOnStop2 = driver.findElement(By.xpath("//android.widget.TextView[@text='Mall of the Emirates']"));
		addOnStop2.click();
		Thread.sleep(3000);
		WebElement addOnBtn3 = driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[69,1699][124,1810]']"));
		addOnBtn3.click();
		Thread.sleep(3000);
		WebElement searLoc3= driver.findElement(By.xpath("//android.widget.EditText[@text='Search for location']"));
		searLoc3.sendKeys("Al Quoz");
		Thread.sleep(1000);
		WebElement addOnStop3 = driver.findElement(By.xpath("//android.widget.TextView[@text='Al Quoz']"));
		addOnStop3.click();
		Thread.sleep(3000);
		WebElement proceedBtn = driver.findElement(By.xpath("//android.widget.Button[@class='android.widget.Button' and @clickable='true' and @enabled='true' and @index='2']"));
		proceedBtn.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	@Test (dependsOnMethods= {"testAddOnStops"})
	public void testOnCarChose() throws InterruptedException {
		WebElement carChoose = driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[87,764][1035,1141]']"));
		carChoose.click();
		Thread.sleep(3000);
		

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
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.MINUTES);
			
		
		
	}
	@Test (dependsOnMethods= {"testOnCarChose"})
	public void testOnFeedBack() throws InterruptedException {
		
		WebElement skipBtn1 = driver.findElement(By.xpath("//android.widget.TextView[@bounds='[929,335][1011,390]']"));
		skipBtn1.click();
		System.out.println("CUSTOMER COMPLETES THE RIDE");
		Thread.sleep(1000);
	}
	@AfterClass
	public void tearDown() {
	
			driver.quit();
		
	}
}

