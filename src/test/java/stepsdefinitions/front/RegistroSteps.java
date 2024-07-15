package stepsdefinitions.front;

import com.co.enlace.task.front.AbrirWeb;
import com.co.enlace.task.front.Registrarse;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import stepsdefinitions.setup.front.SetupFront;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistroSteps extends SetupFront {

    @Before
    public void prepararTest(){
        setUpTest();
    }

    @Dado("que el usuario se encuentra en la pagina de registro")
    public void que_el_usuario_se_encuentra_en_la_pagina_de_registro() {
        theActorInTheSpotlight().wasAbleTo(AbrirWeb.abrirWeb());
    }
    @Cuando("el usuario ingresa credenciales validas")
    public void el_usuario_ingresa_credenciales_validas() {
        theActorInTheSpotlight().wasAbleTo(Registrarse.registrarse());

    }
    @Entonces("el usuario debe registrase de forma exitosa")
    public void el_usuario_debe_registrase_de_forma_exitosa() {

    }

}
