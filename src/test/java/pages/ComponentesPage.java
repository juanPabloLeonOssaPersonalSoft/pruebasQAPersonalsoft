package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@DefaultUrl("http://sahitest.com/demo/")
public class ComponentesPage extends PageObject {

    @FindBy(xpath = "/html/body/table/tbody/tr/td[1]/a[6]")
    WebElementFacade btn_iframes_test;
    @FindBy(xpath = "/html/body/table/tbody/tr/td[1]/a[2]")
    WebElementFacade btn_form_test;
    @FindBy(xpath = "/html/body/form/table/tbody/tr[2]/td[2]/input")
            WebElementFacade campo_form_test;
    WebDriver webDriver;

    @FindBy(xpath = "/html/body/table/tbody/tr/td[1]/a[10]")
    WebElementFacade btn_AlertTest_test;

    @FindBy(xpath = "/html/body/table/tbody/tr/td[1]/a[10]")
    WebElementFacade btn_Show_Modal_test;




    public ComponentesPage(WebDriver driver){
        super(driver);
        this.webDriver = driver;
    }

    public void clic_btn_iframes_test() {
        btn_iframes_test.click();
    }
    public  void clic_btn_AlertTest_test(){
        btn_AlertTest_test.click();
    }

    public void clic_btn_form_test(){
        btn_form_test.click();
    }

    public void encontrar_campo_form(){
        campo_form_test.findBy("/html/body/form/table/tbody/tr[2]/td[2]/input");
    }

    public void clic_btn_Show_Modal_test() { btn_Show_Modal_test.click();  }
}




