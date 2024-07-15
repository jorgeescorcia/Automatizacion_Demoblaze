package com.co.enlace.userinterface.demozable;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Registro  extends PageObject {


    public static final Target BTN_SIGN_UP =
            Target.the("BTN_USERNAME").locatedBy("//a[@id='signin2']");

    public static final Target BTN_USERNAME_REGISTRO =
            Target.the("BTN_USERNAME").locatedBy("//input[@id='sign-username']");

    public static final Target BTN_PASSWORD_REGISTRO =
            Target.the("BTN_REGISTER").locatedBy("//input[@id='sign-password']");

    public static final Target BTN_REGISTRO =
            Target.the("BTN_REGISTER").locatedBy("//button[contains(text(),'Sign up')]");
}


////button[contains(text(),'Sign up')]