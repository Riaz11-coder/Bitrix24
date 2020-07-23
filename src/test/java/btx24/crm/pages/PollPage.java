package btx24.crm.pages;

import btx24.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PollPage {

    public PollPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void waitUntilClickable(WebElement webElement){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    @FindBy(id = "feed-add-post-form-tab-vote")
    public WebElement pollTab;

    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    public WebElement uploadFileIcon;

    @FindBy(xpath = "(//tbody//tr//td)[11]")
    public WebElement uploadFilesAndImg;

    @FindBy(id = "bx-destination-tag")
    public WebElement AddMoreLink;

    @FindBy(id = "destEmailTab_destination7998289")
    public WebElement emailUsersLink;

    @FindBy(id = "destDepartmentTab_destination9360375")
    public WebElement employeesAndDepartmentsLink;

    @FindBy(xpath = "(//a[@href = '#U739'])[2]")
    public WebElement emailForAdding;
}
