package Customer;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class CustomerBook {
public static void main(String[] args) throws InterruptedException, IOException {
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability("deviceName", "OnePlus 7T");
	cap.setCapability("platformName","Android");
	cap.setCapability("platformVersion", "12");
	cap.setCapability("appPackage", "com.moniic.customer.pp");
	cap.setCapability("appActivity", "com.moniic.customer.MainActivity");
	cap.setCapability("deviceID", "a36a1285 ");
	AppiumDriver driver = new AppiumDriver(new URL("http://localhost:4723/wd/hub"), cap);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	System.out.println("Application Started");
	
	WebElement skipbtn=driver.findElement(By.className("android.widget.Button"));
	skipbtn.click();
	Thread.sleep(3000);
	WebElement cDropDownBtn= driver.findElement(By.xpath("//android.widget.TextView[@bounds=\"[251,495][296,540]\"]"));
	cDropDownBtn.click();
	Thread.sleep(3000);
	WebElement searchBtn = driver.findElement(By.className("android.widget.EditText"));
	searchBtn.sendKeys("india");
	WebElement indiaBtn = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView\r\n" ));
	indiaBtn.click();
	WebElement numWidget= driver.findElement(By.className("android.widget.EditText"));
	numWidget.sendKeys("9443527443");
	Thread.sleep(5000);

	WebElement cnBtn1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button"));
	cnBtn1.click();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
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
	WebElement devicemapWidget=driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
	devicemapWidget.click();
	Thread.sleep(3000);
	WebElement locBtn= driver.findElement(By.xpath("//android.view.ViewGroup[@bounds=\"[927,1154][970,1197]\"]"));
	locBtn.click();
	Thread.sleep(6000);
	WebElement ridenowBtn= driver.findElement(By.xpath("//android.widget.TextView[@bounds=\"[111,1631][306,1695]\"]"));
	ridenowBtn.click();
	Thread.sleep(6000);
	WebElement destiBox=driver.findElement(By.xpath("//android.widget.TextView[@bounds=\"[223,2069][966,2133]\"]"));
	destiBox.click();
	Thread.sleep(3000);
	WebElement searchdrplLoc=driver.findElement(By.xpath("//android.widget.EditText[@bounds=\"[183,338][856,457]\"]"));
	searchdrplLoc.sendKeys("AI twar centre");
	WebElement drplLoc=driver.findElement(By.xpath("//android.view.ViewGroup[@bounds=\"[0,663][1080,897]\"]"));
	drplLoc.click();
	Thread.sleep(3000);
	WebElement gpsWidget= driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[927,1458][970,1501]']"));
	gpsWidget.click();
	Thread.sleep(3000);
	WebElement conpkp=driver.findElement(By.xpath("//android.widget.TextView[@text='CONFIRM']"));
	conpkp.click();
	Thread.sleep(3000);
	WebElement conpkpPoint=driver.findElement(By.xpath("//android.widget.TextView[@bounds='[424,2147][655,2208]']"));
	conpkpPoint.click();
	Thread.sleep(8000);
	WebElement apuNotes=driver.findElement(By.xpath("//android.widget.Button[@bounds=\"[69,1410][1011,1548]\"]"));
	apuNotes.click();
	Thread.sleep(3000);
	WebElement flNum=driver.findElement(By.xpath("//android.widget.EditText[@text='Enter your flight number']"));
	flNum.sendKeys("Airbus 737");
	WebElement traName=driver.findElement(By.xpath("//android.widget.EditText[@text='Enter the traveler name']"));
	traName.sendKeys("Mohammed ali");
	WebElement othrNotes=driver.findElement(By.xpath("//android.widget.EditText[contains(@text, 'Eg: I need a child seat, I need help with my bags...')]"));
	othrNotes.sendKeys("I need a chidseat");
	WebElement chfcnBtn=driver.findElement(By.xpath("//android.widget.Button[@index='1' and @clickable='true' and @enabled='true']"));
	chfcnBtn.click();
	Thread.sleep(3000);
	WebElement proceedBtn=driver.findElement(By.xpath("//android.widget.Button[@class='android.widget.Button' and @clickable='true' and @enabled='true' and @index='2']"));
	proceedBtn.click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement carChoose=driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[87,764][1035,1141]']"));
	carChoose.click();
	Thread.sleep(3000);
	WebElement bookclassBtn=driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[87,2171][993,2208]']"));
	bookclassBtn.click();
	Thread.sleep(3000);
	WebElement cCashWdt=driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[83,1798][166,1881]']"));
	cCashWdt.click();
	Thread.sleep(1000);
	WebElement cnfrmCashBtn=driver.findElement(By.xpath("//android.widget.TextView[@text='CONFIRM']"));
	cnfrmCashBtn.click();
	Thread.sleep(3000);
	WebElement bookclassBtn2=driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[87,2171][993,2208]']"));
	bookclassBtn2.click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
				
	WebElement skipBtn= driver.findElement(By.xpath("//android.widget.TextView[@bounds='[929,335][1011,390]']"));
	skipBtn.click();
}


private static void executeADBCommand(String adbCommand) throws IOException, InterruptedException {
	Process process = Runtime.getRuntime().exec(adbCommand);
	process.waitFor();
	
}
}
