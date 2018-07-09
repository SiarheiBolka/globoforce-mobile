package com.globoforce.autotests.page.ios.identity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.globoforce.autotests.page.common.identity.LoginPageBase;
import com.globoforce.autotests.page.common.identity.RegistrationPageBase;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = RegistrationPageBase.class)
public class LoginPage extends RegistrationPageBase {

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='EMAIL']/following::XCUIElementTypeTextField")
    private ExtendedWebElement emailOrCodeEditText;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='PASSWORD']/following::XCUIElementTypeSecureTextField")
    private ExtendedWebElement submitButton;
    
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='PASSWORD']/following::XCUIElementTypeSecureTextField")
    private ExtendedWebElement okPopupButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

	@Override
	public void setEnvironment(String serverName) {
		emailOrCodeEditText.type(serverName);
		
	}

	@Override
	public void clickSubmitButton() {
		submitButton.click();
		
	}

	@Override
	public void acceptServerChanging() {
		okPopupButton.click();
		
	}
	
	@Override
	public void setCustormer(String customerName) {
		emailOrCodeEditText.type(customerName);
		
	}

	@Override
	public LoginPageBase clickSubmitButtonAfterSetEnv() {
		// TODO Auto-generated method stub
		return null;
	}
 
}
