package com.shaadi.automation.Page;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.jayway.jsonpath.JsonPath;
import com.shaadhi.automation.enums.CommunityDomainName;

public class ShaadiPage {
	WebDriver driver;
	String URL;
	String CommunityName;
	WebDriverWait wait;
	
	@FindBy(xpath="//div[contains(text(),'Marathi')]")
	WebElement CommunityNameElementMarathi;
	
	@FindBy(xpath="//div[contains(text(),'Gujarathi')]")
	WebElement CommunityNameElementGujarathi;
	
	@FindBy(xpath="//div[@class='form-group col-md-2 col-12 btnWrap']//button")
	WebElement elebtn;
	
	public ShaadiPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void verifyMotherTongue() {
		if (CommunityName.equals("Marathi"))
			Assert.assertEquals(CommunityNameElementMarathi.getText(),CommunityName);
		else if(CommunityName.equals("Marathi"))
			Assert.assertEquals(CommunityNameElementGujarathi.getText(),CommunityName);
	}
	
	public void navigateTo_HomePage() {
		driver.get(URL);
		wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(elebtn));
		driver.manage().window().maximize();
	}

	public void readJSON(String path) throws IOException
	{
		FileInputStream ip =new FileInputStream("C:/Users/KISHAN/Documents/workspace-sts-3.9.8.RELEASE/ShaadiAutomation/src/test/resources/dataJson.json");
		URL = JsonPath.read(ip,path);
		
		System.out.println(URL);
	}
	
	public void getUrl(CommunityDomainName domain) throws IOException
	{
		switch(domain)
		{
			case  MARATHI:
				CommunityName="Marathi";
				readJSON("$.urlMarathi");
			break;
			
			case GUJARATHI:
				CommunityName="Gujarathi";
				readJSON("$.urlGujarati");
		}
				
	}
}
