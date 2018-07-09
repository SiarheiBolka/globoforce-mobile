package com.globoforce.autotests.page.common;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.gui.AbstractPage;

/**
 * Parent page for all pages for storing some common controls, like "OK" or
 * "Cancel" dialog buttons, etc.
 * Have to store OS-specific methods here as it's impossible to create
 * OS-specific base class in current setup (using
 * {@link com.qaprosoft.carina.core.foundation.utils.factory.CustomTypePageFactory})
 */
public abstract class BasePage extends AbstractPage {

    public static final String PACKAGE_NAME = "com.globoforce.android";

    public static final long DEFAULT_ELEMENT_PRESENCE_TIMEOUT = EXPLICIT_TIMEOUT / 10;

    public BasePage(WebDriver driver) {
        super(driver);
    }

}

