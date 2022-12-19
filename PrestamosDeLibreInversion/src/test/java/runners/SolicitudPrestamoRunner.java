package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

 features = "C:/Users/HEYLER/Desktop/training QA/Automatizacion/RetoBDDConGherkin/PrestamosDeLibreInversion/src/test/resources/feactures/SolicitudPrestamo.feature"
         , glue = {"stepdefinitions"}
         , plugin = {"pretty", "html:target/cucumber/reporteSolicitudPrestamo.html", "json:target/SolicitudPrestamoRunner.json"})
public class SolicitudPrestamoRunner {
}
