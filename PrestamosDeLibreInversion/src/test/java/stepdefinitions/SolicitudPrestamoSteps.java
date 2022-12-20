package stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.Assert;

public class SolicitudPrestamoSteps {

    private int puntosCreditoRechazo;
    private int puntosCreditoAprobado;
    private int puntosEstablecidoBanco;

    @Dado("que existe un usuario que solicita un prestamo de libre inversion")
    public void queExisteUnUsuarioQueSolicitaUnPrestamoDeLibreInversion() {
    }
    @Cuando("el banco revisa su historial crediticio")
    public void elBancoRevisaSuHistorialCrediticio() {
    }
    //Prestamo de libre inversion  aprobado
    @Y("su puntaje de {int} puntos es mayor o igual al establecido de {int}")
    public void suPuntajeEsMayorAPuntos(int puntos, int puntosEstablecido) {
        puntosCreditoAprobado=puntos;
        puntosEstablecidoBanco =puntosEstablecido;
    }
    @Entonces("el prestamo de libre inversion es exitoso")
    public void elPrestamoDeLibreInversionEsExitoso() {
        Assert.assertEquals(true, puntosCreditoAprobado>=puntosEstablecidoBanco);
    }
    //Prestamo de libre inversion no aprobado
    @Y("su puntaje de {int} puntos es menor al establecido de {int}")
    public void suPuntajeEsMenorAPuntos(int puntosUsuario, int puntosEstablecido ) {
        puntosCreditoRechazo=puntosUsuario;
        puntosEstablecidoBanco =puntosEstablecido;
    }
    @Entonces("el prestamo de libre inversion no es exitoso")
    public void elPrestamoDeLibreInversionNoEsExitoso() {
        Assert.assertEquals(true, puntosCreditoRechazo<puntosEstablecidoBanco);
    }
}

