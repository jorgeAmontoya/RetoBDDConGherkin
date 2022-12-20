package stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.junit.Assert;

public class InteresPrestamoSteps {

    @Dado("que un usuario solicita un prestamo de libre inversion")
    public void queUnUsuarioSolicitaUnPrestamoDeLibreInversion() {
    }
    @Cuando("se diligencian sus condiciones")
    public void seDiligencianSusCondiciones() {
    }
    @Entonces("la tasa de interes debe ser del {int} porciento")
    public void laTasaDeInteresDebeSerDelPorciento(int interes) {
        Assert.assertEquals(20, interes);
    }
}
