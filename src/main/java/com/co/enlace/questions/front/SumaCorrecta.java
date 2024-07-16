package com.co.enlace.questions.front;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static com.co.enlace.userinterface.demozable.Productos.TOTAL_CART;

public class SumaCorrecta implements Question<Double> {


    @Override
    public Double answeredBy(Actor actor) {
        String textoElemento = BrowseTheWeb.as(actor).find(TOTAL_CART).getTextContent();
        double valorActual = Double.parseDouble(textoElemento.trim()); // Convertir el texto a un número

        return valorActual;
    }

    public static Question <Double> valueMessage(){
        return new SumaCorrecta();
    }
}
