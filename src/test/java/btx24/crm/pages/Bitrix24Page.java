package btx24.crm.pages;

import btx24.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Bitrix24Page {


    public Bitrix24Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "(//input[@class='login-inp'])[1]")
    public WebElement userNameInput;

    @FindBy (xpath = "(//input[@class='login-inp'])[2]")
    public WebElement passwordInput;

    @FindBy (xpath = "//span[.='Send message …']")
    public WebElement messageTab;

    @FindBy (id = "bx-b-uploadfile-blogPostForm")
    public WebElement uploadBtn;

    @FindBy (xpath = "(//tbody//tr//td)[11]")
    public WebElement uploadFileAndImgLink;

    @FindBy (xpath = "(//tbody//tr//td)[13]/span")
    public WebElement selectDocsFromBitrix;

    @FindBy (xpath = "//a[.='Screenshot 2020-06-06 at 13.21.29.png']")
    public WebElement screenShotFile;

    @FindBy (xpath = "//*[@id=\"DiskFileDialog\"]/div[3]/span[1]")
    public WebElement selectDocBtn;


    @FindBy (xpath = "//*[.='Office 365']")
    public WebElement downloadFromExternal;

    @FindBy (xpath = "//div[@class=\"bx-file-dialog-tab-item\"]")
    public List<WebElement> allExternalSource;

    @FindBy (xpath = "//*[@id=\"DiskFileDialog\"]/div[3]/span[2]")
    public WebElement cancelBtnInsideExternal;

    @FindBy (xpath = "//span[@class='wd-fa-add-file-editor-text']")
    public WebElement createUsingOffice;







}
