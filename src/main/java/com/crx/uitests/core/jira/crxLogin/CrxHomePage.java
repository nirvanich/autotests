package com.crx.uitests.core.jira.crxLogin;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://qa1.dev.crxmarkets.com/crx-web/login.xhtml")

public class CrxHomePage extends PageObject {

    @FindBy(id = "loginForm:username")
    private WebElement username;

    @FindBy(id = "loginForm:password")
    private WebElement password;

    @FindBy(id = "loginForm:login")
    private WebElement submit;

    public CrxHomePage(WebDriver driver) {
        super(driver);
    }

    @WhenPageOpens
    public void waitPageToLoad() {
        element(username).waitUntilVisible();
    }

    public void inputUsername(String usr) {
        element(username).type(usr);
    }

    public void inputPassword(String pwd) {
        element(password).type(pwd);
    }

    public void clickLogin() {
        element(submit).click();
    }
}
