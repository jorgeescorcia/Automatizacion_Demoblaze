package com.co.enlace.userinterface.demozable;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Login extends PageObject {



    public static final Target BTN_LOGIN =
            Target.the("BTNLogin").locatedBy("//a[@id='login2']");

    public static final Target USERNAME =
            Target.the("BTNLogin").locatedBy("//input[@id='loginusername']");

    public static final Target PASSWORD =
            Target.the("BTNLogin").locatedBy("//input[@id='loginpassword']");

    public static final Target BOTON_LOGIN=
            Target.the("BTNLogin").locatedBy("//button[contains(text(),'Log in')]");




}
