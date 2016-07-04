package com.crx.uitests;

import com.crx.uitests.core.jira.crxLogin.CrxUserSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.crx.uitests.requirements.Application;

@RunWith(ThucydidesRunner.class)
@Story(Application.Jira.IssueManagement.class)
public class IssueManagementTest {

	@Managed(driver = "firefox")
	public WebDriver webdriver;

	@Steps
	public CrxUserSteps CrxUser;

	@ManagedPages
	public Pages pages;

	@Before
	public void setUp() throws Exception {
		webdriver.manage().window().maximize();
	}

	@Test
	public void crxLoginTest() {
		CrxUser.openHomePage();
		CrxUser.inputUsername("admin@crx.lu");
		CrxUser.inputPassword("P@ssw0rd");
		CrxUser.clickSubmit();
	}

/*
	@Ignore
	@Test
	public void createNewTest() {
		GoogleUser.openHomePage();
		GoogleUser.makeSearchQuery("crx markets");
		GoogleUser.assertResultContainsValue("www.crxmarkets.com");

	}
	@Ignore
	@Test
	public void createNewIssue() {
		jiraUser.openHomePage();
		jiraUser.clickCreate();
		jiraUser.inputSummaryAndSubmit("Auto created issue");
		String issueId = jiraUser.assertIssueCreatedAndStoreId();
		jiraUser.viewJiraIssue(issueId);
	}
*/
}
