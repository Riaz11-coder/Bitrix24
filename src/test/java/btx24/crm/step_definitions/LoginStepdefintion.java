package btx24.crm.step_definitions;

import btx24.crm.pages.LoginPage;
import btx24.crm.utilities.ConfigurationReader;
import btx24.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginStepdefintion {

    LoginPage loginPage = new LoginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

    @Given("User should be able to access url and be able see home page")
    public void userShouldBeAbleToAccessUrlAndBeAbleSeeHomePage() {
       Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        //Driver.getDriver().get("https://login2.nextbasecrm.com/");

        loginPage.username.sendKeys("helpdesk5@cybertekschool.com");
        loginPage.password.sendKeys("UserUser");
        loginPage.loginButton.click();
    }

    @Given("User should be able to make a comment, like, or unfollow on other employees' posts.")
    public void user_should_be_able_to_make_a_comment_like_or_unfollow_on_other_employees_posts() throws InterruptedException {

        JavascriptExecutor jse = (JavascriptExecutor)Driver.getDriver();
        Driver.getDriver().findElement(By.xpath("//*[@id=\"sonet_log_more_container_first\"]/span"));
        jse.executeScript("arguments[0].scrollIntoView(true)",Driver.getDriver().findElement(By.xpath("//*[@id=\"sonet_log_more_container_first\"]/span")));

//        /**
//         * Scrolls down to an element using JavaScript
//         *
//         * @param element
//         */
//        public static void scrollToElement(WebElement element) {
//            ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
//        }
        
        Thread.sleep(10);
        loginPage.commentLine.click();//iframe[@class='bx-editor-iframe']
        WebElement frame= Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']"));
        Driver.getDriver().switchTo().frame(frame);
        Driver.getDriver().findElement(By.xpath("/html/body")).sendKeys("DAY OF AUTOMATION");

        Thread.sleep(10);
        Driver.getDriver(). switchTo(). defaultContent();
        loginPage.commentLine.click();//iframe[@class='bx-editor-iframe']
        loginPage.sendButton.click();

        //Click like button
        loginPage.likeButton.click();
        // Click unfollow button
        loginPage.unfollowButton.click();


    }


    @When("User should be able to view, like, or make comments on all other reviewers's comments.")
    public void user_should_be_able_to_view_like_or_make_comments_on_all_other_reviewers_s_comments() {

        //Click like button
        loginPage.likeButton.click();
        // Click unfollow button
        loginPage.unfollowButton.click();

    }

    @Then("User should be able to click on reviewers' name and visit their profiles.")
    public void user_should_be_able_to_click_on_reviewers_name_and_visit_their_profiles() {

        loginPage.profileButton.click();

        String expectedTitle ="hr27@cybertekschool.com";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }

    @Then("User should be able to add others' posts to favorate by clicking on the Star icon.\"")
    public void user_should_be_able_to_add_others_posts_to_favorate_by_clicking_on_the_star_icon() throws InterruptedException {
            Thread.sleep(10);
            Driver.getDriver().navigate().back();
            loginPage.starButton.click();



    }


}
