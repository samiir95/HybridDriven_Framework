package com.qa.hs.tests;

import java.util.Properties;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.hs.keyword.base.Base;
import com.qa.hs.keyword.engine.KeyWordEngine;
/**
 * 
 * @author NaveenKhunteta
 *
 */
public class LoginTest {
	
	public KeyWordEngine keyWordEngine;
	public Properties prop;
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		Base base = new Base();
		prop = base.init_properties();
	}
	
	@Test
	public void loginTest(){
		keyWordEngine = new KeyWordEngine();
		keyWordEngine.startExecution(prop.getProperty("testCaseSheet"));
	}
	
//	@Test
//	public void signUpTest(){
//		keyWordEngine = new KeyWordEngine();
//		keyWordEngine.startExecution("signup");
//	}
//	
	
	

}
