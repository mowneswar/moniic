package Customer;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class ChaufferRedmi {
public static void main(String[] args)throws InterruptedException, IOException {
	DesiredCapabilities caps = new DesiredCapabilities();
	caps.setCapability("deviceName", "Redmi Note 12");
	caps.setCapability("platformName","Android");
	caps.setCapability("platformVersion", "13 ");
	caps.setCapability("appPackage", "com.moniic.chauffeur.pp");
	caps.setCapability("appActivity", "com.ourlane.driver.MainActivity");
	caps.setCapability("deviceID", "ef06a48c ");
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
	WebElement notifAllow=driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button"));
	notifAllow.click();
	Thread.sleep(3000);
	
	WebElement skipBtn= driver.findElement(By.xpath("//android.widget.TextView[@text='SKIP']"));
	skipBtn.click();
	Thread.sleep(1000);


	WebElement numWidget = driver.findElement(By.xpath("//android.widget.EditText[@text='Enter your Phone Number']"));
	numWidget.click();
	Thread.sleep(1000);
	
	numWidget.sendKeys("700555555");
	Thread.sleep(3000);

	WebElement prcdBtn =driver.findElement(By.xpath("//android.widget.TextView[@text='PROCEED']"));
	prcdBtn.click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);



	WebElement otpshell= driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[69,627][202,751]']"));
	otpshell.click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	

	String adbCommand0 = "adb shell input text 2";
	executeADBCommand(adbCommand0);
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
	
	WebElement enterOTP =  driver.findElement(By.xpath("//android.widget.TextView[@class='android.widget.TextView' and @text='ENTER OTP']"));
	enterOTP.click();
	
	Thread.sleep(1000);
	WebElement startTrip =  driver.findElement(By.xpath("//android.widget.TextView[@class='android.widget.TextView' and @text='START TRIP']"));
	startTrip.click();
			
	Thread.sleep(140000);
	
	new TouchAction<>(driver)
	.press(PointOption.point(120, 2068))
	.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(4)))
	.moveTo(PointOption.point(960, 2061))
	.release()
	.perform();
	
	Thread.sleep(1000);
	WebElement doneBtn =  driver.findElement(By.xpath("//android.widget.TextView[@bounds='[469,2050][612,2105]']"));
	doneBtn.click();
			
	Thread.sleep(1000);
	
	WebElement skipBtn2 =  driver.findElement(By.xpath("//android.widget.TextView[@bounds='[241,2050][354,2105]']"));
	skipBtn2.click();
			
	

	






}


private static void executeADBCommand(String adbcommand) throws IOException, InterruptedException {
	Process process = Runtime.getRuntime().exec(adbcommand);
	process.waitFor();


}
}

