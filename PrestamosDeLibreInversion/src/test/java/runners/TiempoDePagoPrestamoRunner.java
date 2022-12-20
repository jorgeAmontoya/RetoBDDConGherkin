package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features/TiempoDePagoPrestamo.feature"
        , glue = {"stepdefinitions"}
        , plugin = {"pretty", "html:target/cucumber/TiempoDePagoPrestamo.html", "json:target/TiempoDePagoPrestamo.json"})

public class TiempoDePagoPrestamoRunner {

}
