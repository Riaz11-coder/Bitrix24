package btx24.crm.pages;

import btx24.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Appreciation_Module_Page {

    public Appreciation_Module_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public String File = "//Users/riazahmed/Pictures/purple_nebula_5k-5120x2880.jpeg";

    @FindBy(xpath = "//*[@id='disk-edit-attachn2387']/td[1]/span[1]/span[1]")
    public WebElement getPic;

    @FindBy(xpath = "")
    public WebElement ActivityStream;

    @FindBy(xpath = "//*[@id='feed-add-post-form-link-text']")
    public WebElement MoreTab;

    @FindBy(xpath = "//*[@id='popup-window-content-menu-popup-feed-add-post-form-popup']/div/div/span[2]/span[2]")
    public WebElement AppreciationTab;

    @FindBy(xpath = "//*[@id='bx-b-uploadfile-blogPostForm']")
    public WebElement Uploadfiles;

    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div/div[2]/div/div[1]/div/div/div[3]/div/div/form/div[1]/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[1]/div")
    public WebElement Uploader;

    @FindBy(xpath = "//img[@alt='purple_nebula_5k-5120x2880 (23).jpeg']")
    public WebElement UploadedPic;

    @FindBy(xpath = "//span[@title='Click to insert file']")
    public WebElement Uploaded;

    @FindBy(xpath = "//*[@id='blog-submit-button-save']")
    public WebElement Submit;


    public WebElement isElementLoaded(WebElement elementToBeLoaded){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),30);
        WebElement element = wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));

        return element;
    }






}
