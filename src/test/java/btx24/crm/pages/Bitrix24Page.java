package btx24.crm.pages;

import btx24.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bitrix24Page {


    public Bitrix24Page() {
        PageFactory.initElements(Driver.getDriver(), this);}



            @FindBy(xpath = "(//input[@class='login-inp'])[1]")
            public WebElement userNameInput;

            @FindBy(xpath = "(//input[@class='login-inp'])[2]")
            public WebElement passwordInput;


}
