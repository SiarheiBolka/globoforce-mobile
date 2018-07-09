package com.globoforce.autotests.page.common.identity;

import org.openqa.selenium.WebDriver;

import com.globoforce.autotests.page.common.BasePage;
import com.qaprosoft.carina.core.foundation.utils.factory.CustomTypePageFactory;

public abstract class RegistrationPageBase extends BasePage {
    
	public RegistrationPageBase(WebDriver driver) {
        super(driver);
    }
       
    public abstract void setEnvironment(String server);

    public abstract void clickSubmitButton();
    
	public LoginPageBase clickSubmitButtonAfterSetEnv() {
		clickSubmitButton();
		return CustomTypePageFactory.initPage(getDriver(), LoginPageBase.class);
	}
    
    public abstract void acceptServerChanging();

    public abstract void setCustormer(String customerName);
    
}
