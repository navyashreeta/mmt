package pageobject;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import com.MMT.uistore.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.MMT.pageobject.*;
import com.MMT.reusablecomponent.ReusableComponent;
import com.MMT.uistore.HomePageUI;
import com.MMT.utility.Datadriven;
import com.MMT.utility.ExcelReader;
import com.MMT.utility.Log;





public class benefits {
	static WebDriver driver;
	/*static int count=0;
	static ArrayList<String> arlist=new ArrayList<String>();
	static String searchurl=null;*/
	
	public static By memeberbenefit=By.xpath("//body/div[@id='page-container']/div[@id='main-body-wrapper']/div[1]/section[10]/div[1]/div[1]/div[1]/section[1]/div[1]/ul[1]/li[2]/a[1]");
	public static By mobilecheckin=By.xpath("//strong[contains(text(),'Mobile Check-In/Services')]");
	

	public benefits(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public static void navigatepage() throws IOException,InterruptedException{
		driver=ReusableComponent.WebDriver();
		driver.get(Datadriven.datadriver("website"));
		driver.manage().window().maximize();
		Log.log.info("Screen maximize");
	
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.findElement(memeberbenefit).click();
		
	}
	
	public WebElement getTitleofmobile() {
		return driver.findElement(mobilecheckin);
	}
	public static void check()throws IOException, InterruptedException{
		benefits h=new benefits(driver);
		//compare text from browser with actual value text -mismatch then error
		Assert.assertEquals(h.getTitleofmobile().getText(),"Mobile Check-In");
		Log.log.info("successfully validated text msg");
	}
	
}
