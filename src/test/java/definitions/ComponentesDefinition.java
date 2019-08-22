package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
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
    public void ingreso_a_la_seccion_iframes_test()  { componentesStep.clic_en_elemento_iframes_test();
    }

    @When("ingreso a la seccion Show Modal test")
    public void ingreso_a_la_seccion_Show_Modal_test(){ componentesStep.clic_en_elemento_Show_MOdal_test();
    }

    @When("ingreso a la seccion de form test")
    public void ingreso_a_la_seccion_form_test(){
        componentesStep.clic_en_elemento_form_test();
    }

    @Then("ver la informacion de la seccion form test")
    public void ver_informacion_seccion_form_test(){
        componentesStep.leer_elemento_form_test();
    }


    @When("ingreso a la seccion Alert Test")
    public void ingreso_a_la_seccion_AlertTest_test(){
        componentesStep.clic_en_elemento_AlertTest_test();
    }
}
