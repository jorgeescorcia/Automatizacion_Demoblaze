package stepsdefinitions.front;

import com.co.enlace.task.front.AbrirWeb;
import com.co.enlace.task.front.EscogerProductos;
import com.co.enlace.task.front.Loguearse;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import stepsdefinitions.setup.front.SetupFront;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AgregarProductosSteps extends SetupFront {

    @Dado("que estoy en la página principal de la tienda virtual")
    public void que_estoy_en_la_página_principal_de_la_tienda_virtual() {
        theActorInTheSpotlight().wasAbleTo(AbrirWeb.abrirWeb());
    }
    @Cuando("escojo y agrego los productos al carrito")
    public void escojo_y_agrego_los_productos_al_carrito() {
        theActorInTheSpotlight().wasAbleTo(Loguearse.loguearse());
        theActorInTheSpotlight().wasAbleTo(EscogerProductos.escogerProductos());

    }
    @Entonces("veo una lista de los productos escogidos")
    public void veo_una_lista_de_los_productos_escogidos() {

    }
}
