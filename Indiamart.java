package hybrid;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import hybridapp.Indiamartcapabilities;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Indiamart extends Indiamartcapabilities {
	
	AndroidDriver<AndroidElement> driver;
	WebDriverWait wait;
	@BeforeTest
	public void generalstore() throws MalformedURLException {
		driver=capabilities();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

}
	@Test(enabled=true)
	public void method1() 
	{
		System.out.println("general store");
	}
	@Test(enabled=true)
	public void logintoindiamart() throws InterruptedException
	{
		driver.findElement(MobileBy.id("android:id/content")).click();
		Thread.sleep(5000);
		driver.findElement(MobileBy.id("com.truecaller:id/continueWithDifferentNumber")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='NONE OF THE ABOVE']")).click();
		driver.findElement(MobileBy.id("com.indiamart.m:id/etMobNo")).sendKeys("8088504709");
		Thread.sleep(4000);
		driver.findElement(MobileBy.className("android.widget.CheckBox")).click();
		driver.findElement(By.xpath("//*[@text='NEXT']")).click();
		driver.findElement(MobileBy.id("android:id/clParent")).sendKeys("1107");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@text='NEXT']")).click();
		driver.findElement(By.xpath("//*[@text='Contact Name']")).sendKeys("mutyalamma");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@text='Email']")).sendKeys("smutyalamma55@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@text='Enter Pincode']")).sendKeys("560076");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@text='NEXT']")).click();
		driver.findElement(MobileBy.id("android:id/tvNotSure")).click();
		Thread.sleep(4000);
		driver.findElement(MobileBy.id("android:id/action_bar_root")).click();
		Thread.sleep(4000);
		driver.findElement(MobileBy.id("android:id/settings")).click();
		Thread.sleep(4000);
		driver.findElement(MobileBy.id("android:id/action_bar_root")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@text='Logout']")).click();
		}
}
