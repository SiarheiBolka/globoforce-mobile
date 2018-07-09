package com.globoforce.autotests.page.android.identity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.globoforce.autotests.page.common.identity.LoginPageBase;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = LoginPageBase.class)
public class LoginPage extends LoginPageBase {

    @FindBy(xpath = "//android.widget.EditText[@resource-id='" + PACKAGE_NAME + ":id/loginEditText']")
	private ExtendedWebElement loginEditText;
    
    @FindBy(xpath = "//android.widget.EditText[@resource-id='" + PACKAGE_NAME + ":id/passwordEditText']")
	private ExtendedWebElement passwordEditText;

	@FindBy(id = PACKAGE_NAME + ":id/loginButton")
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
