package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import steps.ComponentesStep;

public class ComponentesDefinition {

    @Steps
    ComponentesStep componentesStep;

    @Given("usuario del portal de pruebas")
    public void  given_usuario_del_portal_deprueba(){
        componentesStep.abriPortal();
    }

    @When("ingreso a la seccion iframes test")
    public void ingreso_a_la_seccion_iframes_test(){
        componentesStep.clic_en_elemento_iframes_test();
    }
}
