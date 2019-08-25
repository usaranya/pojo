package org.cts.samp.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo extends Base{
	
	public Pojo(){
	PageFactory.initElements(driver, this);
	}
public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getButton() {
		return button;
	}
@FindBy(id="email")
private WebElement username;

@FindBy(id="pass")
private WebElement password;

@FindBy(id="loginbutton")
private WebElement button;

	

}
