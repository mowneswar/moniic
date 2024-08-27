package Customer;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
public class ChaufferAccept {
	public static void main(String[] args) throws InterruptedException, IOException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Nokia 8.1");
		caps.setCapability("platformName","Android");
		caps.setCapability("platformVersion", "11");
		caps.setCapability("appPackage", "com.moniic.chauffeur.pp");
		caps.setCapability("appActivity", "com.ourlane.driver.MainActivity");
		caps.setCapability("deviceID", "PNXID19051300665");
		caps.setCapability("automationName","UiAutomator2");
		caps.setCapability("newCommandTimeout", 300);
		

		AppiumDriver driver = new AppiumDriver(new URL("http://localhost:4723/wd/hub"), caps);
		Thread.sleep(1000);
		System.out.println("Application Started");
		Thread.sleep(6000);
		
		WebElement locsharAlw= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]"));
		locsharAlw.click();
		Thread.sleep(3000);
		
		WebElement allowLoc =driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
		allowLoc.click();
		Thread.sleep(1000);
		
		WebElement allowphyActi=driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button"));
		allowphyActi.click();
		Thread.sleep(3000);
		
		WebElement skipBtn= driver.findElement(By.xpath("//android.widget.TextView[@text='SKIP']"));
		skipBtn.click();
		Thread.sleep(1000);


		WebElement numWidget = driver.findElement(By.xpath("//android.widget.EditText[@bounds='[358,582][987,695]']"));
		numWidget.click();
		Thread.sleep(1000);
		numWidget.sendKeys("700555555");
		Thread.sleep(3000);

		WebElement prcdBtn =driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[66,749][1014,880]']"));
		prcdBtn.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);



		WebElement otpshell= driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[66,594][200,713]']"));
		otpshell.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

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
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebElement accptTrip= driver.findElement(By.xpath("//android.widget.TextView[@text='ACCEPT']"));
		accptTrip.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement notifyRider= driver.findElement(By.xpath("//android.widget.TextView[@text='NOTIFY RIDER']"));
		notifyRider.click();
		Thread.sleep(1000);
		
		WebElement oK= driver.findElement(By.xpath("//android.view.ViewGroup[@index='3']"));
		oK.click();
		Thread.sleep(1000);
		
		WebElement enterOTP = driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[66,1868][520,1999]']"));
		enterOTP.click();
		Thread.sleep(1000);
		
		WebElement startTrip=driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[66,944][1014,1075]']"));
		startTrip.click();
		
		Thread.sleep(140000);
		
		new TouchAction<>(driver)
		.press(PointOption.point(128, 1926))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(4)))
		.moveTo(PointOption.point(958, 1929))
		.release()
		.perform();
		
		Thread.sleep(1000);
		
		WebElement doneBtn=driver.findElement(By.xpath("//android.widget.TextView[@text='DONE']"));
		doneBtn.click();
		Thread.sleep(1000);
		WebElement doneBtn2= driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[66,1871][1014,2002]']"));
		doneBtn2.click();
		Thread.sleep(1000);
		WebElement skipBtn1=driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[66,1871][527,2002]']"));
		skipBtn1.click();
		Thread.sleep(1000);

		






	}

	
	private static void executeADBCommand(String adbcommand) throws IOException, InterruptedException {
		Process process = Runtime.getRuntime().exec(adbcommand);
		process.waitFor();


	}
}
