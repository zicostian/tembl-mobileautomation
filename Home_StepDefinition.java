package stepDefinition;

import java.io.IOException;

import org.apache.commons.configuration.ConfigurationException;

import com.photon.UIconstants.HomeConstants_Android;
import com.photon.library.CommonLibrary;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.commons.configuration.ConfigurationException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.photon.library.CommonLibrary;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Home_StepDefinition extends CommonLibrary {
	
	public Home_StepDefinition() throws ConfigurationException, IOException{
		super();
	}
	
	@Given("^Launch apk sample in Android$")
	public void user_Launches_the_apk_sample_in_Android() throws Throwable{
		CommonLibrary.App_Launch();
		CommonLibrary.mediumTime();
	}
	
	@Then("^User should be navigated to home screen$")
	public void user_should_be_able_to_see_home_screen() throws Throwable {
		Thread.sleep(2000);
		CommonLibrary.longTime();
		Assert(CommonLibrary.isElementPresentVerification(HomeConstants_Android.APP_LOGO),
				"The home screen is Displayed");
	}
	
	@Then("^User should be navigated to register screen$")
	public void user_should_be_able_to_see_register_screen() throws Throwable {
		Thread.sleep(2000);
		CommonLibrary.longTime();
		Assert(CommonLibrary.isElementPresentVerification(HomeConstants_Android.REGISTER_BUTTON),
				"The register screen is Displayed");
	}
	
	
	@When ("^User tap register link in home screen$")
	public void user_tap_login_link () throws Throwable{
		Thread.sleep(1000);
		CommonLibrary.mouseHover(HomeConstants_Android.REGISTER_LINK);
		Assert(CommonLibrary.isElementPresentVerifyClick(HomeConstants_Android.REGISTER_LINK),"Register link is tapped");
		CommonLibrary.scrollDown();
		Thread.sleep(2000);
	}
	
	@When ("^User tap login button$")
	public void user_tap_register_button () throws Throwable{
		Thread.sleep(1000);
		CommonLibrary.mouseHover(HomeConstants_Android.LOGIN_BUTTON);
		Assert(CommonLibrary.isElementPresentVerifyClick(HomeConstants_Android.LOGIN_BUTTON),"Login button is tapped");
		Thread.sleep(100);
	}

}

