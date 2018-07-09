/*
 * Copyright 2013-2017 QAPROSOFT (http://qaprosoft.com/).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.globoforce.autotest.registration;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.globoforce.autotest.BaseTest;
import com.globoforce.autotests.page.common.identity.LoginPageBase;
import com.globoforce.autotests.page.common.identity.RegistrationPageBase;
import com.qaprosoft.carina.core.foundation.utils.factory.CustomTypePageFactory;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;


/**
 * Initial login test
 *
 * @author sbolka
 */
public class RegistrationInTest extends BaseTest
{
	public static final Logger LOGGER = Logger.getLogger(RegistrationInTest.class);
	
	private static final String SERVER = "test-web1-06.corp.globoforce.com";
	private static final String GLOBOFORCE = "globoforce";
	private static final String USERNAME = "768604";
	private static final String PASSWORD = "7686041";
	
	@Test(description = "JIRA#MOB-xxx")
	@MethodOwner(owner = "sbolka")
	@Parameters
	public void registerAndLogin()
	{		
/*		List<String> list = null;
		List<String> list2 = null;
		Assert.assertEquals(true, list.equals(list2));
		LOGGER.info("End");*/
		
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
