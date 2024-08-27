package HourlyBookingLater;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class CustomerHourlyLaterNegativecase {
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
	public void testDropdownBtn() throws InterruptedException {
		WebElement cDropDownBtn= driver.findElement(By.xpath("//android.widget.TextView[@bounds='[251,495][296,540]']"));
		cDropDownBtn.click();
		Thread.sleep(3000);
	}
	@Test(dependsOnMethods= {"testDropdownBtn"})
	public void testSearchCountry() throws InterruptedException {
		WebElement searchBtn = driver.findElement(By.className("android.widget.EditText"));
		searchBtn.sendKeys("india");
		WebElement indiaBtn = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView\r\n" ));
		indiaBtn.click();
		WebElement numWidget= driver.findElement(By.className("android.widget.EditText"));
		numWidget.sendKeys("9443527443");
		Thread.sleep(5000);
		WebElement cnBtn1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.Button/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"));
		cnBtn1.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


	}
	@Test(dependsOnMethods= {"testSearchCountry"})
	public void testOnOTPlogin() throws InterruptedException, IOException {
		WebElement otpNumBox1=driver.findElement(By.xpath("//android.view.ViewGroup[@bounds=\"[68,521][193,646]\"]"));
		otpNumBox1.click();
		Thread.sleep(600);
		String adbCommand = "adb shell input text 2";
		executeADBCommand(adbCommand);
		String adbCommand1 = "adb shell input text 3";
		executeADBCommand(adbCommand1);
		String adbCommand2 = "adb shell input text 4";
		executeADBCommand(adbCommand2);
		String adbCommand3 = "adb shell input text 8";
		executeADBCommand(adbCommand3);
		String adbCommand4 = "adb shell input text 7";
		executeADBCommand(adbCommand4);
		String adbCommand5= "adb shell input text 6";
		executeADBCommand(adbCommand5);
		Thread.sleep(3000);
	}
	@Test (dependsOnMethods= {"testOnOTPlogin"})
	public void testHourlyBtn() throws InterruptedException {
		WebElement devicemapWidget = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
		devicemapWidget.click();
		Thread.sleep(3000);

		WebElement locBtn = driver.findElement(By.xpath("//android.view.ViewGroup[@bounds=\"[927,1154][970,1197]\"]"));
		locBtn.click();
		Thread.sleep(6000);

		WebElement hourlyBtn = driver.findElement(By.xpath("//android.widget.TextView[@text='Hourly']"));
		hourlyBtn.click();
		Thread.sleep(6000);
	}
	@Test (dependsOnMethods= {"testHourlyBtn"})
	public void testOnScheduleLater() throws InterruptedException {
		WebElement schForLaterBlc= driver.findElement(By.xpath("//android.widget.TextView[@text='SCHEDULE FOR LATER']"));
		schForLaterBlc.click();
		Thread.sleep(1000);
		
	}
	@Test (dependsOnMethods= {"testOnScheduleLater"})
	public void testOnScheduleRide() throws InterruptedException {
		new TouchAction<>(driver)
		.press(PointOption.point(475, 1893))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(4)))
		.moveTo(PointOption.point(605, 1753))
		.release()
		.perform();
		Thread.sleep(5000);
		
		new TouchAction<>(driver)
		.press(PointOption.point(595, 2167))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(4)))
		.moveTo(PointOption.point(605, 1921))
		.release()
		.perform();
		Thread.sleep(1000);
		WebElement conBtn=driver.findElement(By.xpath("//android.widget.TextView[@text='PROCEED']"));
		conBtn.click();
		Thread.sleep(1000);
	}
	@Test (dependsOnMethods= {"testOnScheduleRide"})
	public void testOnPicLoc() throws InterruptedException {
		WebElement conpkp=driver.findElement(By.xpath("//android.widget.TextView[@text='CONFIRM']"));
		conpkp.click();
		Thread.sleep(3000);
		WebElement conpkpPoint=driver.findElement(By.xpath("//android.widget.TextView[@bounds='[424,2147][655,2208]']"));
		conpkpPoint.click();
		Thread.sleep(3000);
	}
	@Test (dependsOnMethods= {"testOnPicLoc"})
	public void testAPUNote() throws InterruptedException {
		WebElement apuNotes = driver.findElement(By.xpath("//android.widget.TextView[@bounds='[291,1377][789,1441]' and @text='ADD PICK UP NOTES']"));
		apuNotes.click();
		Thread.sleep(3000);

		WebElement flNum = driver.findElement(By.xpath("//android.widget.EditText[@text='Enter your flight number']"));
		flNum.sendKeys("AIRINDIA 757");
		Thread.sleep(1000);

		WebElement traName = driver.findElement(By.xpath("//android.widget.EditText[@text='Enter the traveler name']"));
		traName.sendKeys("RAVEN");
		Thread.sleep(1000);

		WebElement othrNotes = driver.findElement(By.xpath("//android.widget.EditText[contains(@text, 'Eg: I need a child seat, I need help with my bags...')]"));
		othrNotes.sendKeys("I need a PET CARRIER");
		Thread.sleep(1000);


		WebElement chfcnBtn = driver.findElement(By.xpath("//android.widget.Button[@index='1' and @clickable='true' and @enabled='true']"));
		chfcnBtn.click();
		Thread.sleep(3000);

	}
	@Test (dependsOnMethods= {"testAPUNote"})
	public void testOnCarChoseandPayMode() throws InterruptedException {
		WebElement carChoose = driver.findElement(By.xpath("//android.widget.TextView[@text='First Class']"));
		carChoose.click();
		Thread.sleep(3000);


		WebElement bookclassBtn = driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[87,2157][993,2208]']"));
		bookclassBtn.click();
		Thread.sleep(3000);

		WebElement cCashWdt = driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[83,1798][166,1881]']"));
		cCashWdt.click();
		Thread.sleep(1000);

		WebElement cnfrmCashBtn = driver.findElement(By.xpath("//android.widget.TextView[@text='CONFIRM']"));
		cnfrmCashBtn.click();
		Thread.sleep(3000);

		WebElement bookclassBtn2 = driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[87,2157][993,2208]']"));
		bookclassBtn2.click();
		Thread.sleep(3000);



	}
	@Test (dependsOnMethods= {"testOnCarChoseandPayMode"})
	public void testSelectDuration() throws InterruptedException {
		WebElement hoursBlk = driver.findElement(By.xpath("(//android.widget.SeekBar[@content-desc=\"Bottom Sheet\"])[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[1]"));
		hoursBlk.click();
		Thread.sleep(3000);
		WebElement bookHr=driver.findElement(By.xpath("//android.widget.TextView[@bounds='[345,2147][734,2208]']"));
		bookHr.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		while (true) {
	        try {
	        	
	        	System.out.println("Element Text: Scheduling conflict!");
	            WebElement oK = driver.findElement(By.xpath("//android.widget.TextView[@text='OK']"));
	            oK.click();
	            System.out.println("The selected date and time are already booked.");
                System.out.println("Please select a different date and time.");
	            
	           
	        } catch (NoSuchElementException | StaleElementReferenceException e) {
	            
	            break;
	        }
	    }
		
		
			
			
	}
	private static void executeADBCommand(String adbCommand) throws IOException, InterruptedException {
		Process process = Runtime.getRuntime().exec(adbCommand);
		process.waitFor();
		
	}
}
