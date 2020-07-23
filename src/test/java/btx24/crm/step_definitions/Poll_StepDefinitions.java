package btx24.crm.step_definitions;

import btx24.crm.pages.Bitrix24Page;
import btx24.crm.pages.LoginPage;
import btx24.crm.pages.PollPage;
import btx24.crm.utilities.ConfigurationReader;
import btx24.crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Poll_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    PollPage pollPage = new PollPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("User should loged in and user is on the Portal page.")
    public void user_should_loged_in_and_user_is_on_the_portal_page() {
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
        System.out.println("User is on the login page");

        String username = ConfigurationReader.getProperty("helpDeskUsername5");
        loginPage.userNameInput.sendKeys(username);

        String password = ConfigurationReader.getProperty("password");
        loginPage.passwordInput.sendKeys(password, Keys.ENTER);

    }

    @Then("User clicks on Poll tab under Active Stream.")
    public void user_clicks_on_poll_tab_under_active_stream()  {
        pollPage.pollTab.click();


    }

    @Given("User should be able to click on Upload icon")
    public void user_should_be_able_to_click_on_upload_icon() {
        wait.until(ExpectedConditions.elementToBeClickable(pollPage.uploadFileIcon)).click();


    }


    @When("User should clicks Upload files and images")
    public void userShouldClicksUploadFilesAndImages() {
        pollPage.uploadFilesAndImg.click();

    }

    @Given("User should be able to click on Add more link")
    public void userShouldBeAbleToClickOnAddMoreLink() {
        wait.until(ExpectedConditions.elementToBeClickable(pollPage.AddMoreLink)).click();

    }

    @When("User should be able to click on E-mail users link")
    public void userShouldBeAbleToClickOnEMailUsersLink() {
        wait.until(ExpectedConditions.elementToBeClickable(pollPage.emailUsersLink)).click();
    }

    @Then("User should be able click on Employees and Departments")
    public void userShouldBeAbleClickOnEmployeesAndDepartments() {
        pollPage.employeesAndDepartmentsLink.click();
    }

    @And("User should be able click on one selected element \\(on email name)")
    public void userShouldBeAbleClickOnOneSelectedElementOnEmailName() {
    }
}
