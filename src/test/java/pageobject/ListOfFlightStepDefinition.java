package pageobject;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.MMT.pageobject.*;
import com.MMT.reusablecomponent.ReusableComponent;
import com.MMT.utility.Datadriven;
import com.MMT.utility.Log;


public class ListOfFlightStepDefinition{
	//Given navigate to ourbrands
	//And select destination feild
	//Then select hotel

static WebDriver driver;
	@Given("navigate to the Marriot website")
	public void navigate_to_the_marriot_website() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		driver=ReusableComponent.WebDriver();
		driver.get(Datadriven.datadriver("website"));
		driver.manage().window().maximize();
		Log.log.info("Screen maximize");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		
	    throw new io.cucumber.java.PendingException();
	}
	
	
	@And("select destination")
	public void select_destination() {
		driver.findElement(dest).sendKeys("benagalore");
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@And("select hotel")
	public void select_hotel() {
		driver.findElement(findhotel).click();
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("address given")
	public void address_given() {
		return driver.findElement(firsthotel);
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Then("verify")
	public void verify() {
	    // Write code here that turns the phrase above into concrete actions
		ListOfFlight l=new ListOfFlight(driver);
		//compare text from browser with actual value text -mismatch then error
		Assert.assertEquals(l.getTitleofhotel().getText(),"bengalore");
		Log.log.info("successfully validated text msg");
	    throw new io.cucumber.java.PendingException();
	}
}

