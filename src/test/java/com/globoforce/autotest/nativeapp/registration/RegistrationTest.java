package com.globoforce.autotest.nativeapp.registration;

import org.apache.log4j.Logger;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.globoforce.autotests.page.common.identity.LoginPageBase;
import com.globoforce.autotests.page.common.identity.RegistrationPageBase;
import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.factory.CustomTypePageFactory;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;

/**
 * Initial login test
 *
 * @author sbolka
 */
public class RegistrationTest extends AbstractTest
{
	public static final Logger LOGGER = Logger.getLogger(RegistrationTest.class);
	
	private static final String SERVER = "test-web1-06.corp.globoforce.com";
	private static final String GLOBOFORCE = "globoforce";
	private static final String USERNAME = "768604";
	private static final String PASSWORD = "7686041";
	
	
	@Test(description = "JIRA#MOB-xxx")
	@MethodOwner(owner = "sbolka")
	@Parameters
	public void registerAndLogin()
	{		
		RegistrationPageBase registrationPage = CustomTypePageFactory.initPage(getDriver(), RegistrationPageBase.class);
		registrationPage.setEnvironment(SERVER);
		registrationPage.clickSubmitButton();
		registrationPage.acceptServerChanging();
		registrationPage.setCustormer(GLOBOFORCE);

		LoginPageBase loginPage = registrationPage.clickSubmitButtonAfterSetEnv();
		loginPage.setUsername(USERNAME);
		loginPage.setPassword(PASSWORD);
		loginPage.clickLoginButton();

		LOGGER.info("end" + registrationPage.toString());
		
	}

}
