package stepsdefinitions.front;


import com.co.enlace.task.front.AbrirWeb;


import com.co.enlace.task.front.Loguearse;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;

import io.cucumber.java.es.Entonces;
import stepsdefinitions.setup.front.SetupFront;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginSteps extends SetupFront {

    @Before
    public void prepararTest(){
        setUpTest();
    }



    @Dado("que el usuario se encuentra en la pagina de inicio de sesion")
    public void que_el_usuario_se_encuentra_en_la_pagina_de_inicio_de_sesion() {
        theActorInTheSpotlight().wasAbleTo(AbrirWeb.abrirWeb());
    }
    @Cuando("el usuario ingresa un nombre de usuario y una contrasena validos")
    public void el_usuario_ingresa_un_nombre_de_usuario_y_una_contrasena_validos() {
        theActorInTheSpotlight().wasAbleTo(Loguearse.loguearse());

    }







}
