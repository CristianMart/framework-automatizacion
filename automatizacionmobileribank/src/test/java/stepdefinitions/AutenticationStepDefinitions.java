package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import questions.BalanceHomePage;
import tasks.Logueo;

import java.util.List;

import static org.hamcrest.core.Is.is;

public class AutenticationStepDefinitions {

    @Managed(driver ="appium")
    private WebDriver hisBrowser;
    Actor joecalde = Actor.named("joecalde");

    @Before
    public void setup()
    {
        joecalde.can(BrowseTheWeb.with(hisBrowser));
    }

    @When("^I try to login myself using my data authentication$")
    public void i_try_to_login_myself_using_my_data_authentication(List<Usuario> data) {
        joecalde.attemptsTo(Logueo.inEribank(data));
    }


    @Then("^I should see the home balance page$")
    public void iShouldSeeTheHomeBalancePage() {
        joecalde.should(GivenWhenThen.seeThat(BalanceHomePage.isVisible()));
    }



}
