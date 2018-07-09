package com.globoforce.autotests.page.common.identity;

import org.openqa.selenium.WebDriver;

import com.globoforce.autotests.page.common.BasePage;

public abstract class LoginPageBase extends BasePage {
    public LoginPageBase(WebDriver driver) {
        super(driver);
    }
   
    public abstract void setUsername(String username);
    
    public abstract void setPassword(String password);

    public abstract void clickLoginButton();
    
}
