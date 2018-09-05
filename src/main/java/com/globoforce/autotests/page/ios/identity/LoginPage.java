package com.globoforce.autotests.page.ios.identity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.globoforce.autotests.page.common.identity.LoginPageBase;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = LoginPageBase.class)
public class LoginPage extends LoginPageBase {

    @FindBy(xpath = "//XCUIElementTypeTextField[@name=\"LoginScreenUserNameField\"]")
    private ExtendedWebElement loginEditText;

    @FindBy(xpath = "//XCUIElementTypeSecureTextField[@name=\"LoginScreenPasswordField\"]")
    private ExtendedWebElement passwordEditText;
    
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"LoginScreenSignInButton\"]")
    private ExtendedWebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

	@Override
	public void setUsername(String username) {
		loginEditText.type(username);
		
	}

	@Override
	public void setPassword(String password) {
		passwordEditText.type(password);
		
	}

	@Override
	public void clickLoginButton() {
		loginButton.click();
		
	}
 
}
