package org.cts.samp.pojo;

import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoAdact extends BaseAdact {

	public PojoAdact(){
		PageFactory.initElements(driver, this);
	
}
	public List<WebElement> getUsername() {
		return username;
	}
	public List<WebElement> getPassword() {
		return password;
	}
	public List<WebElement> getRe_password() {
		return re_password;
	}
	public List<WebElement> getFull_name() {
		return full_name;
	}
	public List<WebElement> getEmail_add() {
		return email_add;
	}
	public List<WebElement> getCaptcha() {
		return captcha;
	}
	public WebElement getSubmit() {
		return Submit;
	}
	@FindBy(id="username")
	private List<WebElement> username;
	@FindBy(id="password")
	private List<WebElement> password;
	@FindBy(id="re_password")
	private List<WebElement> re_password;
	@FindBy(id="full_name")
	private List<WebElement> full_name;
	@FindBy(id="email_add")
	private List<WebElement> email_add;
	@FindBy(id="captcha-form")
	private List<WebElement> captcha;
	@FindBy(id="Submit")
	private WebElement Submit;
}
	
	
	
	
