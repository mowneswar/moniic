package CustomerAPP;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class CreatingAddonChauffer {
	private AndroidDriver<MobileElement> driver;
	@BeforeClass
	public void setUp() throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Redmi Note 12");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "13");
        caps.setCapability("appPackage", "com.moniic.chauffeur.pp");
        caps.setCapability("appActivity", "com.ourlane.driver.MainActivity");
        caps.setCapability("deviceID", "ef06a48c");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("newCommandTimeout", 300);

        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("CHAUFFER APP LAUNCHED SUCCESSFULLY");
        Thread.sleep(3000);
        
    }
	@Test
	public void testOnLocAccess() throws InterruptedException {
		WebElement locsharAlw = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]"));
        locsharAlw.click();
        Thread.sleep(3000);
        
        WebElement allowLoc = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
        allowLoc.click();
        Thread.sleep(1000);

        WebElement allowphyActi = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button"));
        allowphyActi.click();
        Thread.sleep(3000);
        
        WebElement notifAllow = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button"));
        notifAllow.click();
        Thread.sleep(3000);
	}
	@Test (dependsOnMethods= {"testOnLocAccess"})
	public void testOnSkipBtnPage() throws InterruptedException {
		WebElement skipBtn = driver.findElement(By.xpath("//android.widget.TextView[@text='SKIP']"));
        skipBtn.click();
        Thread.sleep(1000);

	}
	@Test (dependsOnMethods= {"testOnSkipBtnPage"})
	public void testOnLogin() throws InterruptedException {
		WebElement numWidget = driver.findElement(By.xpath("//android.widget.EditText[@text='Enter your Phone Number']"));
        numWidget.click();
        Thread.sleep(1000);

        numWidget.sendKeys("700555555");
        Thread.sleep(3000);
        System.out.println("LOGIN AND REGISTRATION IS DONE");

        WebElement prcdBtn = driver.findElement(By.xpath("//android.widget.TextView[@text='PROCEED']"));
        prcdBtn.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		
	}
	@Test (dependsOnMethods= {"testOnLogin"})
	public void testOnAccptTrip() {
		WebElement accptTrip = driver.findElement(By.xpath("//android.widget.TextView[@text='ACCEPT']"));
        accptTrip.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("CHAUFFER ACCEPTS THE TRIP");
	}
	@Test (dependsOnMethods= {"testOnAccptTrip"})
	public void testonNotifyRider() throws InterruptedException {
		WebElement notifyRider = driver.findElement(By.xpath("//android.widget.TextView[@text='NOTIFY RIDER']"));
        notifyRider.click();
        Thread.sleep(1000);
    
        WebElement oK = driver.findElement(By.xpath("//android.view.ViewGroup[@index='3']"));
        oK.click();
        Thread.sleep(1000);
	}
	@Test (dependsOnMethods= {"testonNotifyRider"})
	public void testOnenterOTP() throws InterruptedException {
		WebElement enterOTP = driver.findElement(By.xpath("//android.widget.TextView[@class='android.widget.TextView' and @text='ENTER OTP']"));
		enterOTP.click();
		System.out.println("OTP ENTERED");

		Thread.sleep(1000);
	}
	@Test (dependsOnMethods= {"testOnenterOTP"})
	public void testOnStratTrip() throws InterruptedException {
		WebElement startTrip = driver.findElement(By.xpath("//android.widget.TextView[@class='android.widget.TextView' and @text='START TRIP']"));
        startTrip.click();
        System.out.println("TRIP STARTED");
        Thread.sleep(1000);

        
	}
	@Test (dependsOnMethods= {"testOnStratTrip"})
	public void testOnSlideTOTrips() throws InterruptedException {
		new TouchAction<>(driver)
		.press(PointOption.point(120, 2068))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(4)))
		.moveTo(PointOption.point(960, 2061))
		.release()
		.perform();

		Thread.sleep(1000);
		
		WebElement stopCompletedOkBtn = driver.findElement(By.xpath("//android.widget.TextView[@text='OK']"));
		stopCompletedOkBtn.click();
		new TouchAction<>(driver)
		.press(PointOption.point(120, 2068))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(4)))
		.moveTo(PointOption.point(960, 2061))
		.release()
		.perform();

		Thread.sleep(1000);
		WebElement tripResumedOkBtn = driver.findElement(By.xpath("//android.widget.TextView[@text='OK']"));
		tripResumedOkBtn.click();
		new TouchAction<>(driver)
		.press(PointOption.point(120, 2068))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(4)))
		.moveTo(PointOption.point(960, 2061))
		.release()
		.perform();

		Thread.sleep(1000);
		WebElement stopCompletedOkBtn2 = driver.findElement(By.xpath("//android.widget.TextView[@text='OK']"));
		stopCompletedOkBtn2.click();
		new TouchAction<>(driver)
		.press(PointOption.point(120, 2068))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(4)))
		.moveTo(PointOption.point(960, 2061))
		.release()
		.perform();

		Thread.sleep(1000);
		WebElement tripResumedOkBtn2 = driver.findElement(By.xpath("//android.widget.TextView[@text='OK']"));
		tripResumedOkBtn2.click();
		new TouchAction<>(driver)
		.press(PointOption.point(120, 2068))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(4)))
		.moveTo(PointOption.point(960, 2061))
		.release()
		.perform();

		Thread.sleep(1000);
		WebElement stopCompletedOkBtn3 = driver.findElement(By.xpath("//android.widget.TextView[@text='OK']"));
		stopCompletedOkBtn3.click();
		new TouchAction<>(driver)
		.press(PointOption.point(120, 2068))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(4)))
		.moveTo(PointOption.point(960, 2061))
		.release()
		.perform();

		Thread.sleep(1000);
		WebElement tripResumedOkBtn3 = driver.findElement(By.xpath("//android.widget.TextView[@text='OK']"));
		tripResumedOkBtn3.click();
		Thread.sleep(120000);
		new TouchAction<>(driver)
		.press(PointOption.point(120, 2068))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(4)))
		.moveTo(PointOption.point(960, 2061))
		.release()
		.perform();

		Thread.sleep(1000);
		System.out.println("COMPlETED TRIP WITH CONSECUTIVE STOPS");
    
	}
	@Test (dependsOnMethods= {"testOnSlideTOTrips"})
	public void testOnFareSmry() throws InterruptedException {
		WebElement doneBtn = driver.findElement(By.xpath("//android.widget.TextView[@bounds='[469,2050][612,2105]']"));
        doneBtn.click();
        System.out.println("FARE SUMMARY CREATED");
        Thread.sleep(1000);
        WebElement skipBtn2 = driver.findElement(By.xpath("//android.widget.TextView[@bounds='[241,2050][354,2105]']"));
        skipBtn2.click();
		
	}
	@AfterClass
    public void tearDown() {
         
            driver.quit();
        
    }
	
	
}
