package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import pages.ComponentesPage;

public class ComponentesStep extends ScenarioSteps {

    ComponentesPage componentesPage = new ComponentesPage(getDriver());

    public ComponentesStep(Pages pages){
        super(pages);
    }


    @Step
    public  void abriPortal(){
        componentesPage.open();
    }


    @Step
    public void clic_en_elemento_iframes_test(){
        componentesPage.clic_btn_iframes_test();

    }
    @Step
    public void clic_en_elemento_AlertTest_test () {
        componentesPage.clic_btn_AlertTest_test();

    }
}
