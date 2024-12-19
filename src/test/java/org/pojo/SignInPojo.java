package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPojo extends BaseClass  {
	public SignInPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='Create new account']")
	private WebElement CreateNewAccnt;
	
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement FirstNameTextBox;
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement SecondNameTextBox;
	@FindBy(xpath = "//input[@name='reg_email__']")
	private WebElement MoborEmailTexBox;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement NewPassword;
	public WebElement getCreateNewAccnt() {
		return CreateNewAccnt;
	}
	public WebElement getFirstNameTextBox() {
		return FirstNameTextBox;
	}
	public WebElement getSecondNameTextBox() {
		return SecondNameTextBox;
	}
	public WebElement getMoborEmailTexBox() {
		return MoborEmailTexBox;
	}
	public WebElement getNewPassword() {
		return NewPassword;
	}
	
	

}
