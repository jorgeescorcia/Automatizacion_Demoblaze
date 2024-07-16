package com.co.enlace.task.front;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import net.serenitybdd.screenplay.actions.Switch;

import static com.co.enlace.userinterface.demozable.Productos.*;

public class EscogerProductos implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Click.on(SMARTPHONE_ONE),
                Click.on(BTN_ADDTO_CART),
                Switch.toAlert().andAccept(),
                Click.on(BTN_HOME),
                Click.on(BTN_LAPTOPS),
                Click.on(LAPTOPS_ONE),
                Click.on(BTN_ADDTO_CART),
                Switch.toAlert().andAccept(),
                Click.on(BTN_CART)

        );



    }
    public static EscogerProductos escogerProductos(){
        return Tasks.instrumented(EscogerProductos.class);
    }
}
