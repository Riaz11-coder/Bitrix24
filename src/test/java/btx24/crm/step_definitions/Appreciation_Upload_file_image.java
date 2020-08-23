package btx24.crm.step_definitions;

import btx24.crm.pages.Appreciation_Module_Page;
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

public class Appreciation_Upload_file_image extends Appreciation_Module_Page {
    Appreciation_Module_Page AST = new Appreciation_Module_Page();
    Bitrix24Page BRT = new Bitrix24Page();

    @Override
    public WebElement isElementLoaded(WebElement elementToBeLoaded) {
        return super.isElementLoaded(elementToBeLoaded);
    }



    @Given("User is logged in and on Activity Stream Page")
    public void userIsLoggedInAndOnActivityStreamPage() {

        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
        System.out.println("User is on the login page");



        String username = ConfigurationReader.getProperty("helpDeskUsername5");
        isElementLoaded(BRT.userNameInput).sendKeys(username);



        String password = ConfigurationReader.getProperty("password");
        isElementLoaded(BRT.passwordInput).sendKeys(password+ Keys.ENTER);



    }

    @When("User clicks on more tab")
    public void userClicksOnMoreTab()   {
       isElementLoaded(AST.MoreTab).click();



    }

    @And("User clicks on Appreciation tab")
    public void userClicksOnAppreciationTab() {
        isElementLoaded(AST.AppreciationTab).click();


    }

    @Then("User is on Appreciation module")
    public void userIsOnAppreciationModule() {
       System.out.println("User is on Appreciation Module");
    }



    @When("User clicks on Upload files icon")
    public void userClicksOnUploadFilesIcon(){

        isElementLoaded(AST.Uploadfiles).click();


    }


    @Then("User should see Upload files and Images box")
    public void userShouldSeeUploadFilesAndImagesBox() {

        Assert.assertTrue("Upload box is displayed",isElementLoaded(AST.Uploader).isDisplayed());

        isElementLoaded(AST.Uploader).click();





    }

    @When("User Uploads file or image locally")
    public void userUploadsFileOrImageLocally() {

         UploadFile(File);

        isElementLoaded(AST.Uploaded).getText();

        isElementLoaded(AST.Uploaded).click();

        isElementLoaded(AST.Submit).click();

        System.out.println("File has been Uploaded");




    }


    @Then("User should be able to see it has been Uploaded")
    public void userShouldBeAbleToSeeItHasBeenUploaded() {


        Assert.assertTrue("Uploaded File is Displayed",AST.UploadedPic.isDisplayed());






    }
}
