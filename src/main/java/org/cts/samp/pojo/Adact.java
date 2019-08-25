package org.cts.samp.pojo;

public class Adact extends BaseAdact {

	public static void main(String[] args) {
		getDriver();
		loadUrl("https://adactin.com/HotelApp/Register.php");
		PojoAdact p=new PojoAdact();
		type(p.getUsername().get(0),"saranyapandi");
		type(p.getPassword().get(0),"pass123");
		type(p.getRe_password().get(0),"pass123");
		type(p.getFull_name().get(0),"usaranya");
		type(p.getEmail_add().get(0),"usaranya230@gmail.com");
		type(p.getCaptcha().get(0),"wheelery");
		btnClk(p.getSubmit());
		quitBrowser();
	}
	}

