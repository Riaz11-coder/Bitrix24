package btx24.crm.pages;

import btx24.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement username;

    @FindBy(name = "USER_PASSWORD")
    public WebElement password;

    @FindBy(className = "login-btn")
    public WebElement loginButton;


    @FindBy(xpath = "//*[@id=\"bx-ilike-button-BLOG_POST_543-1596325789\"]/span/a")
    public WebElement likeButton;

    //*[@id='log_entry_follow_1402']/a
    @FindBy(xpath = "//*[@id=\"log_entry_follow_1477\"]")
    public WebElement unfollowButton;

    //*[@id="blog-post-addc-add-543"]
    @FindBy(xpath = "//*[@id='blog-post-addc-add-543']")
    public WebElement commentLine;

    @FindBy(xpath = "//button[@class='ui-btn ui-btn-sm ui-btn-primary']")
    public WebElement sendButton;
    //a[@id='bp_543']
    @FindBy(xpath = "//a[@id='bp_543']")
    public WebElement profileButton;

    @FindBy(xpath = "//div[@id='log_entry_favorites_1477']")
    public WebElement starButton;

    //*[@id="sonet_log_more_container_first"]/span
    @FindBy(xpath = "//*[@id=\"sonet_log_more_container_first\"]/span")
    public WebElement moreElementButton;
}
