package APP;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
public class ChaufferTestngRedmi {
	private AppiumDriver<AndroidElement> driver;

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

        driver = new AppiumDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("CHAUFFER APP LAUNCHED SUCCESSFULLY");
        
    }

    @Test
    public void ChaufferLogin() throws InterruptedException, IOException {
        Thread.sleep(1000);
             

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

        WebElement skipBtn = driver.findElement(By.xpath("//android.widget.TextView[@text='SKIP']"));
        skipBtn.click();
        Thread.sleep(1000);

        WebElement numWidget = driver.findElement(By.xpath("//android.widget.EditText[@text='Enter your Phone Number']"));
        numWidget.click();
        Thread.sleep(1000);

        numWidget.sendKeys("700555555");
        Thread.sleep(3000);
        System.out.println("LOGIN AND REGISTRATION IS DONE");

        WebElement prcdBtn = driver.findElement(By.xpath("//android.widget.TextView[@text='PROCEED']"));
        prcdBtn.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
    
        WebElement accptTrip = driver.findElement(By.xpath("//android.widget.TextView[@text='ACCEPT']"));
        accptTrip.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("CHAUFFER ACCEPTS THE TRIP");

        WebElement notifyRider = driver.findElement(By.xpath("//android.widget.TextView[@text='NOTIFY RIDER']"));
        notifyRider.click();
        Thread.sleep(1000);
    

        WebElement oK = driver.findElement(By.xpath("//android.view.ViewGroup[@index='3']"));
        oK.click();
        Thread.sleep(1000);
    
        WebElement enterOTP = driver.findElement(By.xpath("//android.widget.TextView[@class='android.widget.TextView' and @text='ENTER OTP']"));
        enterOTP.click();
        System.out.println("OTP ENTERED");

        Thread.sleep(1000);
   
        WebElement startTrip = driver.findElement(By.xpath("//android.widget.TextView[@class='android.widget.TextView' and @text='START TRIP']"));
        startTrip.click();
        System.out.println("TRIP STARTED");

        Thread.sleep(140000);

        new TouchAction<>(driver)
            .press(PointOption.point(120, 2068))
            .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(4)))
            .moveTo(PointOption.point(960, 2061))
            .release()
            .perform();

        Thread.sleep(1000);
    
        WebElement doneBtn = driver.findElement(By.xpath("//android.widget.TextView[@bounds='[469,2050][612,2105]']"));
        doneBtn.click();
        System.out.println("TRIP COMPLETED");

        Thread.sleep(1000);
        WebElement skipBtn2 = driver.findElement(By.xpath("//android.widget.TextView[@bounds='[241,2050][354,2105]']"));
        skipBtn2.click();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    private static synchronized void executeADBCommand(String adbCommand) throws IOException, InterruptedException {
        Process start = Runtime.getRuntime().exec(adbCommand);
        start.waitFor();
    }
}
