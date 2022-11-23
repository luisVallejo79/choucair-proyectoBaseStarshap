package co.com.starshap.stepdefinitions;

import co.com.starshap.tasks.OpenUp;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class LoginStepDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("Luis wants to log in to the starshap application")
    public void luisWantsToLogInToTheStarshapApplication() {
        OnStage.theActorCalled("Luis").wasAbleTo(OpenUp.thePage());

    }

    @When("he enters his credentials")
    public void heEntersHisCredentials() {

    }

    @Then("He can access the main page of the application")
    public void heCanAccessTheMainPageOfTheApplication() {

    }
}
