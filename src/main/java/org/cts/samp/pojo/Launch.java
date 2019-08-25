package org.cts.samp.pojo;

public class Launch extends Base {

	public static void main(String[] args) {
		getDriver();
		loadUrl("https://www.facebook.com");
		Pojo p=new Pojo();
type(p.getUsername(),"usaranya230");
type(p.getPassword(),"udhayak7777");
btnClk(p.getButton());
	
	}
}
