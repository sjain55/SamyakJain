package org.test;

import org.testng.annotations.Test;

import Utils.GeneralFunctionsWeb;
import objectRepository.LoginPage;

public class LoginTest{
	GeneralFunctionsWeb gfw;
	LoginPage lp;
	LoginTest(){
		gfw = new GeneralFunctionsWeb();
		lp = new LoginPage();
	}

	@Test
	public void loginToAmazon() {
		System.out.println("BeforeTest");
		try {
			lp.loginToAmazon();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}




}
