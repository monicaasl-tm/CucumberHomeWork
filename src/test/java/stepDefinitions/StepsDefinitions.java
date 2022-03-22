package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsDefinitions {
	
	//1
	@Given("User is in login page")
	public void user_is_in_login_page() {
	    System.out.println("Login page");
	}
	
	@When("User send an email")
	public void User_send_an_email() {
		System.out.println("Email: ");
		System.out.println("test1@example.com: ");
		
	}
	
	@When("User send a password")
	public void User_send_a_password() {
		System.out.println("Password: ");
		System.out.println("myPassword ");

	}
	
	@When("User click on log in sign in button")
	public void User_click_on_log_in_sign_in_button() {
		System.out.println("Login Succeded");
	}
	
	@Then("User should be in profile page")
	public void User_should_be_in_profile_page() {
		System.out.println("Welcome");
	}
	
	
	
	//2
	@Then("User should be in default page")
	public void User_should_be_in_default_page() {
		System.out.println("Welcome");
	}
	
	
	//3
	@Then("User should be in news page with access to all news")
	public void user_should_be_in_news_page_with_access_to_all_news() {
		System.out.println("All news premium ");
		System.out.println("Global news ");
		System.out.println("Local news");
	}


	//4
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


	//5
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
	
	
	//6
	@Then("User should see the entire article with at least five adds")
	public void user_should_see_the_entire_article_with_at_least_five_adds() {
		System.out.println("Full article with adds! :(");
	}
	
	
	//7
	@Then("User should see access denied")
	public void user_should_see_access_denied() {
		System.out.println("Access denied");
		System.out.println("Please register");
	}
	
	//8
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
