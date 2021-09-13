package stepdefintiuon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.MMT.pageobject.benefits;
import com.MMT.reusablecomponent.ReusableComponent;
import com.MMT.utility.Datadriven;
import com.MMT.utility.Log;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BenefitsStepDefinition {
	static WebDriver driver;
	@Given("navigate to the Marriot website")
	public void navigate_to_the_marriot_website() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	    driver=ReusableComponent.WebDriver();
		driver.get(Datadriven.datadriver("website"));
		driver.manage().window().maximize();
		Log.log.info("Screen maximize");
	
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		
	}
	@And("click on Member Benifits under Marriot Bonvoy")
	public void click_on_member_benifits_under_marriot_bonvoy() {
		driver.findElement(memeberbenefit).click();
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("address of first hotel as city name")
	public void address_of_first_hotel_as_city_name() {
		return driver.findElement(mobilecheckin);
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("verify Mobile Check-In and Mobile Key in the benefits page.")
	public void verify_mobile_check_in_and_mobile_key_in_the_benefits_page() {
	    // Write code here that turns the phrase above into concrete actions
		benefits h=new benefits(driver);
		//compare text from browser with actual value text -mismatch then error
		Assert.assertEquals(h.getTitleofmobile().getText(),"Mobile Check-In");
		Log.log.info("successfully validated text msg");
	
	    throw new io.cucumber.java.PendingException();
	}
}
