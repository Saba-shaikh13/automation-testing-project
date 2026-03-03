package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class gmaillogin {
@Given("user should create the account on gmail")
  public void create_ac() {
	System.out.println("Precondition: user created account");
}
@When("launch the website,enter email and password,click on login button")
 public void login_step() {
	System.out.println("Test steps: user performed all steps");
}
@Then("gmail login should be sucessfull")
 public void login_button() {
	System.out.println("Expected result:login successful");
}
}
