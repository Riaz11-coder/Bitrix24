package btx24.crm.step_definitions;

import btx24.crm.pages.Bitrix24Page;
import btx24.crm.utilities.ConfigurationReader;
import btx24.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;

public class bitrix24LoginStepDefs {

    Bitrix24Page bitrix24Page = new Bitrix24Page();


    @Given("User is on the login page")
    public void user_is_on_the_login_page() {

        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
        System.out.println("User is on the login page");
    }

    @Then("User types in username")
    public void user_types_in_username() {

        String username = ConfigurationReader.getProperty("helpDeskUsername5");
        bitrix24Page.userNameInput.sendKeys(username);

    }
    @Then("User types in password")
    public void user_types_in_password() {
        String password = ConfigurationReader.getProperty("password");

        bitrix24Page.passwordInput.sendKeys(password+ Keys.ENTER);
    }
    @Then("User is logged in as a helpDesk")
    public void user_is_logged_in_as_a_help_desk() {

    }
}
