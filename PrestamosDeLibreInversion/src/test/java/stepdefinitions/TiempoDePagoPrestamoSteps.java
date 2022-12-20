package stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.junit.Assert;

public class TiempoDePagoPrestamoSteps {
    @Dado("que se aprueba un prestamo de libre inversion")
    public void queSeApruebaUnPrestamoDelibreInversion() {
    }
    @Cuando("se procede a establecer el tiempo de pago")
    public void seProcedeAEstablecerElDePago() {
    }
    @Entonces("el tiempo establecido debe de ser minimo de {int} meses")
    public void elTiempoEstablecidoDebeDeSerMinimoDeYearYMaximoDeYear(int tiempoMin) {
        Assert.assertEquals(true, tiempoMin>=48);
    }
}
