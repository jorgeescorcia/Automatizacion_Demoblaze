package com.co.enlace.task.front;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;

import static com.co.enlace.userinterface.demozable.Registro.*;
import static com.co.enlace.utils.front.Diccionario.*;

public class Registrarse implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.wasAbleTo(
                Click.on(BTN_SIGN_UP),
                Enter.theValue(USER_REGISTRO).into(BTN_USERNAME_REGISTRO),
                Enter.theValue(PASSWORD_REGISTRO).into(BTN_PASSWORD_REGISTRO),
                Click.on(BTN_REGISTRO),
                Switch.toAlert().andAccept()
        );


    }

    public static Registrarse registrarse(){
        return Tasks.instrumented(Registrarse.class);
    }
}
