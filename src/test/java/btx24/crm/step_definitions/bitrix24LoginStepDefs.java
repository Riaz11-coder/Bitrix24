package btx24.crm.step_definitions;

import btx24.crm.pages.Bitrix24Page;
import btx24.crm.utilities.ConfigurationReader;
import btx24.crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;

public class bitrix24LoginStepDefs {

    Bitrix24Page bitrix24Page = new Bitrix24Page();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get("https://login2.nextbasecrm.com/auth/?backurl=%2Fstream%2F");
        System.out.println("User is on the login page.");
    }

    @Then("User types in {string}")
    public void user_types_in(String username) {
        bitrix24Page.userNameInput.sendKeys(username);
        System.out.println("User types in \"" + username + "\" username.");
    }

    @And("User types in the {string}")
    public void userTypesInThe(String password) {
        bitrix24Page.passwordInput.sendKeys(password + Keys.ENTER);
        System.out.println("User types in \"" + password + "\" password.");
    }

    @Then("User is logged in as a {string}")
    public void userIsLoggedInAsA(String user) {
        System.out.println("User is logged in as \"" + user + "\".");
    }


    @When("User click on Message tap to send a message")
    public void userClickOnMessageTapToSendAMessage() {
        bitrix24Page.messageTab.click();
        System.out.println("User click on Message tap to send a message");
    }

    @Then("User click on upload link to be able to upload a file")
    public void userClickOnUploadLinkToBeAbleToUploadAFile() {
        wait.until(ExpectedConditions.visibilityOf(bitrix24Page.uploadBtn));
        bitrix24Page.uploadBtn.click();
        System.out.println("User clicks on upload link to be able to upload a file");
    }

/*
    @And("User clicks on Upload Files And Image link")
    public void userClicksOnUploadFilesAndImageLink() throws Exception {
      //  bitrix24Page.uploadFileAndImgLink.click();

    }

 */


  @Then("User clicks on Select Docs From Bitrix link")
    public void userClicksOnSelectDocsFromBitrixLink() {
        bitrix24Page.selectDocsFromBitrix.click();
        bitrix24Page.screenShotFile.click();
        bitrix24Page.selectDocBtn.click();
    }



  @When("User clicks on Download From External Drive link")
    public void userClicksOnDownloadFromExternalDriveLink() {
        bitrix24Page.downloadFromExternal.click();

      int externalSourcesNum = 6;
      int expectedExtSourceNum = bitrix24Page.allExternalSource.size();
      Assert.assertTrue(expectedExtSourceNum == externalSourcesNum);

      System.out.println("User can import from the following external sources:");
        for (WebElement eachSource: bitrix24Page.allExternalSource){
            System.out.print(eachSource.getText()+" ");
            System.out.println();
        }

      bitrix24Page.cancelBtnInsideExternal.click();

  }

    @When("User clicks on Create using Office")
    public void userClicksOnCreateUsingOffice() {
        bitrix24Page.createUsingOffice.click();

    }


}
