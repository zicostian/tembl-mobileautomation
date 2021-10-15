package stepDefinition;

import java.io.IOException;

import org.apache.commons.configuration.ConfigurationException;

import com.photon.UIconstants.HomeConstants_Android;
import com.photon.UIconstants.SignUpConstants_Android;
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
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUp_Login_StepDefinition extends CommonLibrary {
	
	public SignUp_Login_StepDefinition() throws ConfigurationException, IOException{
		super();
	}	
		
		
		@When ("^User tap Sign Up with Email button in Android$")
		public void user_tap_sign_up_with_email_button_in_Android() throws Throwable{
			Thread.sleep(2000);
			Assert(CommonLibrary.isElementPresentVerifyClick(SignUpConstants_Android.SIGN_UP_WITH_EMAIL_BUTTON), "sign up buttonis clicked");
			Thread.sleep(2000);	
		}
		
		@When ("^User tap sign up button in Android$")
		public void user_tap_sing_up_button_in_Android() throws Throwable{
			Thread.sleep(2000);
			Assert(CommonLibrary.isElementPresentVerifyClick(SignUpConstants_Android.SIGN_UP_BUTTON), "sign up button is clicked");
			Thread.sleep(2000);	
		}

		@And ("^User enter name \"([^\"]*)\"$")
		public void user_should_be_able_to_enter_name(String args1) throws Throwable{
			CommonLibrary.isElementPresentVerifyClick(HomeConstants_Android.NAME);
			Assert(CommonLibrary.clearAndEnterText(HomeConstants_Android.NAME, args1),"Name is entered");
//			driver.hideKeyboard();
			CommonLibrary.shortTime();
		}
		
		@And ("^User enter email \"([^\"]*)\"$")
		public void user_should_be_able_to_enter_email(String args1) throws Throwable{
			CommonLibrary.isElementPresentVerifyClick(HomeConstants_Android.EMAIL);
			Assert(CommonLibrary.clearAndEnterText(HomeConstants_Android.EMAIL, args1),"Email is entered");
//			driver.hideKeyboard();
			CommonLibrary.shortTime();
		}
		
		@And ("^User enter register password \"([^\"]*)\"$")
		public void user_should_be_able_to_enter_reg_password(String args1) throws Throwable{
			CommonLibrary.isElementPresentVerifyClick(HomeConstants_Android.REG_PASSWORD);
			Assert(CommonLibrary.clearAndEnterText(HomeConstants_Android.REG_PASSWORD, args1),"Password is entered");
			driver.hideKeyboard();
			CommonLibrary.shortTime();
		}
		
		@And ("^User enter confirm password \"([^\"]*)\"$")
		public void user_should_be_able_to_enter_confirm_password(String args1) throws Throwable{
			CommonLibrary.isElementPresentVerifyClick(HomeConstants_Android.REG_CONFIRMPASSWORD);
			Assert(CommonLibrary.clearAndEnterText(HomeConstants_Android.REG_CONFIRMPASSWORD, args1),"Password is entered");
			driver.hideKeyboard();
			CommonLibrary.shortTime();
		}
		
		
		@When ("^User tap Create Register button$")
		public void user_tap_register_button () throws Throwable{
			Thread.sleep(1000);
			CommonLibrary.mouseHover(HomeConstants_Android.REGISTER_BUTTON);
			Assert(CommonLibrary.isElementPresentVerifyClick(HomeConstants_Android.REGISTER_BUTTON),"Register button is tapped");
		}
		
		@Then("^User should stay in registration screen$")
		public void user_should_be_able_to_see_register_screen() throws Throwable {
			Thread.sleep(2000);
			CommonLibrary.longTime();
			Assert(CommonLibrary.isElementPresentVerification(HomeConstants_Android.REGISTER_BUTTON),
					"The register screen is Displayed");
		}
		
		@When ("^User tap Login link$")
		public void user_tap_login_link () throws Throwable{
			Thread.sleep(1000);
			CommonLibrary.mouseHover(HomeConstants_Android.LOGIN_LINK);
			Assert(CommonLibrary.isElementPresentVerifyClick(HomeConstants_Android.LOGIN_LINK),"Login link is tapped");
			CommonLibrary.scrollDown();
			Thread.sleep(2000);
		}
		
		@And ("^User enter username \"([^\"]*)\"$")
		public void user_should_be_able_to_enter_username(String args1) throws Throwable{
			CommonLibrary.isElementPresentVerifyClick(HomeConstants_Android.USERNAME);
			Assert(CommonLibrary.clearAndEnterText(HomeConstants_Android.USERNAME, args1),"Username is entered");
//			driver.hideKeyboard();
			CommonLibrary.shortTime();
		}
		
		@And ("^User enter password \"([^\"]*)\"$")
		public void user_should_be_able_to_enter_password(String args1) throws Throwable{
			CommonLibrary.isElementPresentVerifyClick(HomeConstants_Android.PASSWORD);
			Assert(CommonLibrary.clearAndEnterText(HomeConstants_Android.PASSWORD, args1),"Password is entered");
			driver.hideKeyboard();
			CommonLibrary.shortTime();
		}
		
		@Then ("^User should be navigated to account screen$")
		public void user_should_be_able_to_see_account_screen() throws Throwable{
			CommonLibrary.longTime();
			Assert(CommonLibrary.isElementPresentVerification(HomeConstants_Android.ACCOUNT_SCREEN),
					"Account screen is Displayed");
		}
		
		@Then ("^User should be able to see incorrect credential message$")
		public void user_should_be_able_to_see_incorrect_credential_message() throws Throwable{
			CommonLibrary.longTime();
			Assert(CommonLibrary.isElementPresentVerification(HomeConstants_Android.INCORRECT_CREDENTIAL_MESSAGE),
					"Incorrect credential message is Displayed");
		}
}
