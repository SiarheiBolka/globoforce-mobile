package com.globoforce.autotests.page.ios.identity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.globoforce.autotests.page.common.identity.LoginPageBase;
import com.globoforce.autotests.page.common.identity.RegistrationPageBase;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = RegistrationPageBase.class)
public class RegistrationPage extends RegistrationPageBase {

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='EMAIL']/following::XCUIElementTypeTextField")
    private ExtendedWebElement emailOrCodeEditText;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='PASSWORD']/following::XCUIElementTypeSecureTextField")
    private ExtendedWebElement submitButton;
    
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='PASSWORD']/following::XCUIElementTypeSecureTextField")
    private ExtendedWebElement okPopupButton;

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

	@Override
	public void setEnvironment(String server) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickSubmitButton() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acceptServerChanging() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCustormer(String customerName) {
		// TODO Auto-generated method stub
		
	}


}
