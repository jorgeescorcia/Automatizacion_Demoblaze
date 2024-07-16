package com.co.enlace.task.front;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static com.co.enlace.userinterface.demozable.Login.*;
import static com.co.enlace.utils.front.Diccionario.EMAIL_LOGIN;
import static com.co.enlace.utils.front.Diccionario.PASSWORD_LOGIN;

public class Loguearse implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Click.on(BTN_LOGIN),
                Enter.theValue(EMAIL_LOGIN).into(USERNAME),
                Enter.theValue(PASSWORD_LOGIN).into(PASSWORD),
                Click.on(BOTON_LOGIN)
        );
    }

    public  static Loguearse loguearse(){
        return Tasks.instrumented(Loguearse.class);
    }
}
