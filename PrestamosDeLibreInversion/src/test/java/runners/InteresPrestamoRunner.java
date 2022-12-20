package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features/InteresPrestamo.feature"
        , glue = {"stepdefinitions"}
        , plugin = {"pretty", "html:target/cucumber/InteresPrestamo.html", "json:target/InteresPrestamo.json"})

public class InteresPrestamoRunner {

}
