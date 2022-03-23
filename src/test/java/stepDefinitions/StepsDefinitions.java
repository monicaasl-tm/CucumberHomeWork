package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsDefinitions {
	

	@Given("User is in login page")
	public void user_is_in_login_page() {
	    System.out.println("Login page");
	}
	
	@When("User send an email {string}")
	public void user_send_an_email(String string) {
		System.out.println("User: " + string);
	}
	
	@Given("^.*logged in as \"(\\w+)\"$")
	public void user_is_logged_in(String user) {
		System.out.println("Welcome " + user);
	}

	@When("User send a password {string}")
	public void user_send_a_password(String string) {
		System.out.println("Pasword: " + string);
		if (string.equals("Hdbjvf! ")) {
			System.out.println("Invalid pasword");
		}
	}
	
	@When("User click on log in sign in button")
	public void User_click_on_log_in_sign_in_button() {
		System.out.println("Login Succeded");
	}
	
	@Then("User should be in profile page")
	public void User_should_be_in_profile_page() {
		System.out.println("Welcome");
	}
	
	

	@Then("User should be in default page")
	public void User_should_be_in_default_page() {
		System.out.println("Welcome");
	}
	
	

	
	@Then("User should be in news page with access to all news")
	public void user_should_be_in_news_page_with_access_to_all_news() {
		System.out.println("All news premium ");
		System.out.println("Global news ");
		System.out.println("Local news");
	}



	@Then("User should be in news page with limited access to local news")
	public void user_should_be_in_news_page_with_limited_access_to_local_news() {
		System.out.println("News free");
		System.out.println("Local news");
	}
	
	@Then("User should not have access to global news")
	public void user_should_not_have_access_to_global_news() {
		System.out.println("News free");
		System.out.println("Global news");
		System.out.println("Access denied");
	}



	@Given("User is in articles page")
	public void user_is_in_articles_page() {
		System.out.println("Articles");
	}

	@When("User opens an article")
	public void user_opens_an_article() {
		System.out.println("Article: COVID-19 new variant!");
	}

	@Then("User should see the full article with no ads")
	public void user_should_see_the_full_article_with_no_ads() {
		System.out.println("Full article with no adds! :D");
	}
	
	

	@Then("User should see the entire article with at least five adds")
	public void user_should_see_the_entire_article_with_at_least_five_adds() {
		System.out.println("Full article with adds! :(");
	}
	
	

	@Then("User should see access denied")
	public void user_should_see_access_denied() {
		System.out.println("Access denied");
		System.out.println("Please register");
	}
	

	@Given("User is membership page")
	public void user_is_membership_page() {
		System.out.println("Memberships");
	}

	@When("User selects a plan")
	public void user_selects_a_plan() {
		System.out.println("Select plan");
		System.out.println("1.Premium plan");
		System.out.println("2.Free plan");
	}

	@Then("User should be able to change to the plan selected")
	public void user_should_be_able_to_change_to_the_plan_selected() {
		System.out.println("Plan changed");
	}

	

}
