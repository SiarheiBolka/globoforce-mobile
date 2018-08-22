package com.globoforce.autotests.page.android.identity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.globoforce.autotests.page.common.identity.RegistrationPageBase;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = RegistrationPageBase.class)
public class RegistrationPage extends RegistrationPageBase {

    //@FindBy(xpath = "//android.widget.EditText[@resource-id='" + PACKAGE_NAME + ":id/emailOrCodeEdit']")
	@FindBy(id = PACKAGE_NAME + ":id/emailOrCodeEdit")
    private ExtendedWebElement emailOrCodeEditText;

    //@FindBy(xpath = "//android.widget.Button[@resource-id='" + PACKAGE_NAME + ":id/registerButton']")
	@FindBy(id = PACKAGE_NAME + ":id/registerButton")
    private ExtendedWebElement submitButton;
	
    @FindBy(xpath = "//android.widget.Button[@text='OK']")
    private ExtendedWebElement okPopupButton;

    public RegistrationPage(WebDriver driver) {
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

}
