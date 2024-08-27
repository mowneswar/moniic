package hourlyBookingLive;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class HourlyBookingchauffer {
	private AndroidDriver<MobileElement> driver;
	@BeforeClass
	public void setUp() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "OnePlus 7T");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "12");
		capabilities.setCapability("appPackage", "com.moniic.chauffeur.pp");
		capabilities.setCapability("appActivity", "com.ourlane.driver.MainActivity");
		capabilities.setCapability("deviceID", "a36a1285");

		driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("CHAUFFER APP LAUNCHED IN OnePlus 7T");
		Thread.sleep(3000);

	}
	@Test
	public void testOnLocAccess() throws InterruptedException {
		WebElement locsharAlw = driver.findElement(By.xpath("//android.widget.TextView[@text='ALLOW']"));
		locsharAlw.click();
		Thread.sleep(3000);

		WebElement allowLoc = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
		allowLoc.click();
		Thread.sleep(1000);

		WebElement allowphyActi = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button"));
		allowphyActi.click();
		Thread.sleep(500);
	}
	@Test 
	public void testOnSkipBtnPage() throws InterruptedException {
		WebElement skipBtn = driver.findElement(By.xpath("//android.widget.TextView[@text='SKIP']"));
		skipBtn.click();
		Thread.sleep(5000);

	}
	@Test 
	public void testOnLogin() throws InterruptedException {
		WebElement numBlk = driver.findElement(By.xpath("//android.widget.EditText[@text='Enter your Phone Number']"));
		numBlk.click();
		Thread.sleep(5000);
		numBlk.sendKeys("700555555");
		Thread.sleep(3000);

		WebElement prcdBtn = driver.findElement(By.xpath("//android.widget.TextView[@text='PROCEED']"));
		prcdBtn.click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);

	}
}
