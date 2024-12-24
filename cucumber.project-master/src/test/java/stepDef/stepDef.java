package stepDef;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageActions.homePage_Actions;
import utils.ConfigFileReader;
import utils.SeleniumDriver;

public class stepDef {

	homePage_Actions hA = new homePage_Actions();
	ConfigFileReader configFileReader=new ConfigFileReader();

	@Given("^I am on google main page$")
	public void i_am_on_google_main_page() {
		SeleniumDriver.openPage(configFileReader.getApplicationUrl());

	}

	@When("^I enter text in search text field and click on seach button$")
	public void i_enter_text_in_search_text_field_and_click_on_seach_button() {
		hA.enterText();
		hA.clickOnSearchButton();

	}

	@Then("^I should see search results$")
	public void i_should_see_search_results() {
		SeleniumDriver.getDriver().close();

	}

	@Given("^I am on google main page \"([^\"]*)\"$")
	public void i_am_on_google_main_page(String url) {
		SeleniumDriver.openPage(url);
	}

	@When("^I enter \"([^\"]*)\" in search text field and click on seach button$")
	public void i_enter_in_search_text_field_and_click_on_seach_button(String text) {

		hA.enterText(text);
	}
	
	@Then("I should able to click on link {string}")
	public void i_should_able_to_click_on_link(String string) {
		hA.clickOnGmailHomeLink();
		SeleniumDriver.getDriver().close();
	}
}
