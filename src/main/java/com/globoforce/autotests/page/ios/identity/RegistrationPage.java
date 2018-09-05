package com.globoforce.autotests.page.ios.identity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.globoforce.autotests.page.common.identity.RegistrationPageBase;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = RegistrationPageBase.class)
public class RegistrationPage extends RegistrationPageBase {

    @FindBy(xpath = "//XCUIElementTypeTextField[@name=\"RegistrationCodeField\"]")
    private ExtendedWebElement emailOrCodeEditText;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"RegistrationCodeSubmit\"]")
    private ExtendedWebElement submitButton;
    
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"YES\"]")
    private ExtendedWebElement okPopupButton;

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }
    
	@Override
	public void setEnvironment(String serverName) {
		emailOrCodeEditText.click();
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


}
