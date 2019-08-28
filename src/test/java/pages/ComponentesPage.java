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

    @FindBy(xpath = "/html/body/table/tbody/tr/td[3]/a[1]]")
    WebElementFacade btn_AlertTest_test;

    WebDriver webDriver;

    public ComponentesPage(WebDriver driver){
        super(driver);
        this.webDriver=driver;
    }

    public  void clic_btn_iframes_test(){
        btn_iframes_test.click();
    }


    public  void clic_btn_AlertTest_test(){
        btn_AlertTest_test.click();
    }

}

