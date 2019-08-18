package com.shaadi.automation.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.shaadhi.automation.enums.CommunityDomainName;
import com.shaadi.automation.Page.ShaadiPage;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ShaadiStepDefinition {
	CommunityDomainName domainName;
	ShaadiPage page;
	WebDriver driver;
	
	@Given("^Login into Shaadi.com page with \"([^\"]*)\"$")
    public void i_am_on_the_page_on_URL(String domain) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		page=new ShaadiPage(driver);
		page.getUrl(CommunityDomainName.valueOf(domain));
		page.navigateTo_HomePage();
	}

    @Then("^Verify that mother tongue matches the community$")
    public void verify_the_mother_tongue() throws Throwable {
		page.verifyMotherTongue();
    }
	
	/*
	 * @After public void quit_Driver() { driver.quit(); }
	 */
	
}
