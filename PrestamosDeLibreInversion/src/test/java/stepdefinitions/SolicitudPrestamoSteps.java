package stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.Assert;

public class SolicitudPrestamoSteps {
    private int puntosCredito;
    @Dado("que existe un usuario que solicita un prestamo de libre inversion")
    public void queExisteUnUsuarioQueSolicitaUnPrestamoDeLibreInversion() {
    }

    @Cuando("el banco revisa su historial crediticio")
    public void elBancoRevisaSuHistorialCrediticio() {
    }

    //Prestamo de libre inversion  aprobado

    @Y("su puntaje es mayor a {int} puntos")
    public void suPuntajeEsMayorAPuntos(int puntos) {
    }

    @Entonces("el prestamo de libre inversion es exitoso")
    public void elPrestamoDeLibreInversionEsExitoso() {
    }

    //Prestamo de libre inversion no aprobado

    @Y("su puntaje es menor a {int} puntos")
    public void suPuntajeEsMenorAPuntos(int puntos) {

    }

    @Entonces("el prestamo de libre inversion no es exitoso")
    public void elPrestamoDeLibreInversionNoEsExitoso() {



    }
}
