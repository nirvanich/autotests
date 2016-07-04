package com.crx.uitests.core.jira.crxLogin;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;


public class CrxUserSteps extends ScenarioSteps {
    private CrxHomePage CrxHomePage = getPages().get(
            CrxHomePage.class);

    public CrxUserSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void openHomePage() {
        CrxHomePage.open();
        CrxHomePage.waitPageToLoad();
    }

    @Step
    public void inputUsername(String usr) {
        CrxHomePage.inputUsername(usr);
    }
    @Step
    public void inputPassword(String pwd) {
        CrxHomePage.inputPassword(pwd);

    }

    @Step
    public void clickSubmit() {
        CrxHomePage.clickLogin();
    }

}
