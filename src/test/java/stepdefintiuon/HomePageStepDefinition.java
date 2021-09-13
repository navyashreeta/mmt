package stepdefintiuon;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import com.MMT.pageobject.HomePage;
import com.MMT.reusablecomponent.ReusableComponent;
import com.MMT.utility.Datadriven;
import com.MMT.utility.Log;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDefinition extends ReusableComponent{
//
	
@Given("navigate to the Marriot website")
public void navigate_to_the_marriot_website() {
	driver=ReusableComponent.WebDriver();
	driver.get(Datadriven.datadriver("website"));
	driver.manage().window().maximize();
	Log.log.info("Screen maximize");

	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@And("select ourbrands")
public void select_ourbrands() {
	driver.findElement(ourbrand).click();
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("jwmarriot click")
public void jwmarriot_click() {
	 driver.findElement(jwmarriot);
	
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("verify text")
public void verify_text() {
	HomePage h=new HomePage(driver);
	//compare text from browser with actual value text -mismatch then error
	Assert.assertEquals(h.getTitle().getText(),"JWMarriot");
	Log.log.info("successfully validated text msg");
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

}


