package stepsdefinitions.front;

import com.co.enlace.questions.front.SumaCorrecta;
import com.co.enlace.task.front.AbrirWeb;
import com.co.enlace.task.front.EscogerProductos;
import com.co.enlace.task.front.Loguearse;
import com.co.enlace.task.front.Registrarse;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import stepsdefinitions.setup.front.SetupFront;

import static com.co.enlace.utils.front.Diccionario.VALOR_CORRECTO;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class AgregarProductosSteps extends SetupFront {

    @Dado("que estoy en la página principal de la tienda virtual")
    public void que_estoy_en_la_página_principal_de_la_tienda_virtual() {
        theActorInTheSpotlight().wasAbleTo(AbrirWeb.abrirWeb());
    }
    @Cuando("escojo y agrego los productos al carrito")
    public void escojo_y_agrego_los_productos_al_carrito() {
        theActorInTheSpotlight().wasAbleTo(Registrarse.registrarse());
        theActorInTheSpotlight().wasAbleTo(Loguearse.loguearse());
        theActorInTheSpotlight().wasAbleTo(EscogerProductos.escogerProductos());

    }
    @Entonces("veo una lista de los productos escogidos y el total")
    public void veo_una_lista_de_los_productos_escogidos_y_el_total() {
        theActorInTheSpotlight().should(seeThat("La suma correcta es",SumaCorrecta.valueMessage(),equalTo(VALOR_CORRECTO)));

    }
}
