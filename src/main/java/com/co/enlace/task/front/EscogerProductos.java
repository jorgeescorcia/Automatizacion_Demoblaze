package com.co.enlace.task.front;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.targets.Target;


import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static com.co.enlace.userinterface.demozable.Productos.*;

public class EscogerProductos implements Task {

    private List<Target> productos = Arrays.asList(
            SMARTPHONE_ONE,
            SMARTPHONE_TWO,
            LAPTOPS_ONE,
            LAPTOPS_TWO
    );

    @Override
    public <T extends Actor> void performAs(T actor) {

        Random random = new Random();
        Target randomProducto = productos.get(random.nextInt(productos.size()));

        actor.wasAbleTo(
                Click.on(randomProducto),
                Click.on(BTN_ADDTO_CART),
                Switch.toAlert().andAccept(),
                Click.on(BTN_HOME),
                Click.on(BTN_LAPTOPS),
                Click.on(randomProducto),
                Click.on(BTN_ADDTO_CART),
                Switch.toAlert().andAccept(),
                Click.on(BTN_CART)

        );

    }
    public static EscogerProductos escogerProductos(){
        return Tasks.instrumented(EscogerProductos.class);
    }
}
