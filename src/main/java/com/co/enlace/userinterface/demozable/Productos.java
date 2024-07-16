package com.co.enlace.userinterface.demozable;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Productos extends PageObject {

    public static final Target BTN_HOME =
            Target.the("BTN_Home").locatedBy("//a[@id='nava']");
    public static final Target BTN_CART =
            Target.the("BTNLogin").locatedBy("//a[contains(text(),'Cart')]");

    public static final Target BTN_ADDTO_CART =
            Target.the("BTNLogin").locatedBy("//a[contains(text(),'Add to cart')]");

    //Smartphones

    public static final Target SMARTPHONE_ONE =
            Target.the("BTNLogin").locatedBy("//body/div[@id='contcont']/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/img[1]");

    public static final Target SMARTPHONE_TWO =
            Target.the("BTNLogin").locatedBy("//body/div[@id='contcont']/div[1]/div[2]/div[1]/div[3]/div[1]/a[1]/img[1]");

    //Laptops

    public static final Target BTN_LAPTOPS =
            Target.the("lAPTOPS").locatedBy("//a[contains(text(),'Laptops')]");


    public static final Target LAPTOPS_ONE =
            Target.the("lAPTOPS").locatedBy("//body/div[@id='contcont']/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/img[1]");
    public static final Target LAPTOPS_TWO =
            Target.the("lAPTOPS").locatedBy("//body/div[@id='contcont']/div[1]/div[2]/div[1]/div[3]/div[1]/a[1]/img[1]");

}



